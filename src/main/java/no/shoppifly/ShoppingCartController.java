package no.shoppifly;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class ShoppingCartController implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private final CartService cartService;

    @Autowired
    private NaiveCartImpl naiveCart;

    @Autowired
    private MeterRegistry meterRegistry;

    public ShoppingCartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "/cart/{id}")
    public Cart getCart(@PathVariable String id) {
        return cartService.getCart(id);
    }

    /**
     * Checks out a shopping cart. Removes the cart, and returns an order ID
     *
     * @return an order ID
     */
    @Timed(value = "checkout_latency")
    @PostMapping(path = "/cart/checkout")
    public String checkout(@RequestBody Cart cart) {

        /*
        Jeg bruker @Timed her for å få checkout latency, og i stedet for å skrive "checkout_latency.value" i tf filen bruker jeg "checkout_latency.avg"
        Jeg bruker counter her fordi vi kun er ute etter hvor mange som har "checked out" ila hele løpet til applikasjonen, og dette tallet øker bare
        */

        meterRegistry.counter("checkouts_sum").increment();
        return cartService.checkout(cart);
    }

    /**
     * Updates a shopping cart, replacing it's contents if it already exists. If no cart exists (id is null)
     * a new cart is created.
     *
     * @return the updated cart
     */
    @PostMapping(path = "/cart")
    public Cart updateCart(@RequestBody Cart cart) {
        return cartService.update(cart);
    }

    /**
     * return all cart IDs
     *
     * @return
     */
    @GetMapping(path = "/carts")
    public List<String> getAllCarts() {
        return cartService.getsAllCarts();
    }

    @GetMapping(path = "/total")
    public float getTotal() {
        return cartService.total();
    }


    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        //Jeg bruker gague her fordi verdiene skal kunne øke og minske kontinuerlig ettersom aplikasjonen blir brukt, i motsetning til i checkout counteren litt over
        Gauge.builder("cart_count", naiveCart.shoppingCarts,
                b -> b.values().size()).register(meterRegistry);

        Gauge.builder("cart_sum", this::getTotal).register(meterRegistry);
    }
}