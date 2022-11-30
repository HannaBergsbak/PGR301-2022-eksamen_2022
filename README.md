# DevOps med gode intensjoner

## Del 1 besvarelse

### Hva er utfordringene med dagens systemutviklingsprosess - og hvordan vil innføring av DevOps kunne være med på å løse disse? Hvilke DevOps prinsipper blir brutt?
I dagens systemutviklingsprosess bruker de hverken CI/CD eller IaC, de prøver så godt de kan å unngå feil (noe som viser seg å være umulig) i stedet for å forvente feil og være forberedt på å bruke de til videre utvikling. I tillegg har de splittet opp teamet i to deler, utvikling og produksjon. Begrepet DevOps er satt sammen av betegnelsene for disse to teamene, development og operations. Dette navnet beskriver nettopp hva DevOps går ut på, nemlig at disse to teamene slås sammen til ett stort team der alle jobber sammen mot et felles mål.
I oppgaveteksten står det beskrevet “Når de deployer, feiler det fortsatt ofte. Da ruller de tilbake til forrige versjon, og ny funksjonalitet blir derfor ofte forsinket i månedsvis” og dette er ikke en optimal løsning. Som beskrevet kommer det frem feil i løsningen uansett, og ved å benytte denne teknikken blir det mye vanskeligere å håndtere feilene som oppstår. Om man har små og hyppige endringer er det veldig enkelt å identifisere feilene når de oppstår fordi det ikke er gjort store endringer, noe som er tidsbesparende.
Om man ender opp med å måtte sette løsningen tilbake til forrige versjon for å fikse bugs o.l.  er det også en fordel at det da er liten forskjell på versjonene slik at opplevelsen for brukeren er så og si sømløs. Det å sikre at selskapet har så mye uptime som mulig er viktig for business. Om det gjelder en nettbutikk, en avis eller en strømmetjeneste så finnes det i dagens marked utallige konkurrenter, og det er lett å miste kunder om applikasjonene krasjer og er nede ofte. 
I dette scenarioet har selskapet valgt å ansette en mengde nye ansatte for å teste. I devops tar man gjerne i bruk Iac, infrastructure as code, ifm testing blant annet. Dette går ut på at man automatiserer testingen av ny kode, slik at man kan teste alle nye features og endringer ved et klikk, noe som sparer en god del tid og manpower, pluss at man får eliminert litt av potensialet for menneskelig feil med alt som blir automatisert.
Når selskapet kun deployer endringer fire ganger i året får de store oppdateringer der man lett mister kontroll. Det er både vanskeligere å teste, vanskeligere å finne feil ved eventuelle tester som feiler, pluss at det gjerne blir forferdelig vanskelig å merge når det mest sannsynlig har vært mange som har jobbet på løsningen samtidig over en lengre periode. 
DevOps legger også til rette for et bedre arbeidsmiljø der man som felleskap har ansvar for hele utviklingsprosessen, og man kan spille hverandre gode. Dette gjør det bedre for de ansatte i tillegg til at det gjerne reflekteres i løsningen som ender opp hos kundene.
### En vanlig respons på mange feil under release av ny funksjonalitet er å gjøre det mindre hyppig, og samtidig forsøke å legge på mer kontroll og QA. Hva er problemet med dette ut ifra et DevOps perspektiv, og hva kan være en bedre tilnærming?
En av fordelene med devops er at feil kan bli brukt til noe positivt i stedet for at man skal frykte feil. Feil kommer mest sannsynlig uansett, så istedenfor å fokusere på hvordan man kan unngå feil i det hele tatt bør man heller sørge for at man er rustet for å håndtere feilene på best mulig måte. Ved å oppdatere og utvikle små deler av løsningen om gangen blir det lettere å både unngå feil, men ikke minst å håndtere feil. Det er veldig mye lettere for utvikleren å se hvor en feil ligger hvis det kun er 20 linjer med kode som er endret enn om det er 200, og feilen kan dermed rettes mye fortere. Som nevnt er det også en fordel å kunne “rollbacke” til en tidligere versjon uten feil for å sikre bedre uptime, uten å måtte gå tilbake til en versjon som er veldig ulik pga store endringer mellom operative versjoner.
I tillegg kan den nåværende holdningen til feil være skadelig for miljøet i selskapet fordi feil blir sett på noe som skal unngås til enhver pris, og det er lett å peke på hverandre og legge skyld på hverandre på tvers av teamene.

### Teamet overleverer kode til en annen avdelng som har ansvar for drift - hva er utfordringen med dette ut ifra et DevOps perspektiv, og hvilke gevinster kan man få ved at team han ansvar for både drift- og utvikling?
Det å operere i to ulike team påvirker kommunikasjon, flyt og miljø på en negativ måte. Alle disse tre elementene er viktige for å oppnå gode resultater. Jeg har allerede nevnt litt om dette tidligere i besvarelsen min.
Om man jobber som to separate team hemmer dette kommunikasjonen mellom de ansatte, noe som er negativt når de egentlig samarbeider om et produkt. 
Det å slå seg sammen til et team som samarbeider om hele løsningen gjør at man får bedre arbeidsmiljø og dette gir bedre resultater. 

### Å release kode ofte kan også by på utfordringer. Beskriv hvilke- og hvordan vi kan bruke DevOps prinsipper til å redusere eller fjerne risiko ved hyppige leveraner.
Om man skal sette små endringer ut i produksjon ofte er det viktig at det fungerer. Det er blant annet viktig å ha god versjonskontroll slik at man f.eks kan gå tilbake til den forrige versjonen i de tilfellene hvor ny kode har feil osv, slik at man ikke har så mye downtime. 
I tillegg er det som nevnt nyttig å implementere Iac ifm testing, slik at man raskt kan få greie på og rette opp i kompileringsfeil og kan luke ut bugs. 
I tillegg er det viktig å passe på at man har godt samspill når mange skal uvikle samme løsning kontinuerlig, og det er viktig å sørge for at man ikke får merge konflikter. Det er dermed veldig viktig at man setter regler og setter seg inn i de ulike verktøyene man kan bruke for å sørge for en så sømløs opplevelse som mulig. Det å bruke en plattform som git som har verktøy som hjelper deg med å rebase, å gjøre pull requests, workflows og en versjonslogg der man kan se hva som har blitt endret osv gjør at det blir færre konflikter. 

## OPPGAVETEKST

## Krav til leveransen

* Eksamensoppgaven er gitt på GitHub repository ; https://github.com/PGR301-2022/eksamen_2022
* Du skal ikke lage en fork av dette repositoryet, men kopiere innholdet til et nytt. Årsaken er at sensor vil lage en fork av ditt repo, og arbeidsflyten blir lettere hvis ditt repo ikke er en fork. 
* Du kan jobbe i et public-, eller privat repo, og deretter gjøre det public noen timer etter innleveringsfrist hvis du er bekymret for plagiat fra medstudenter.

Når sensor evaluerer oppgaven vil han/hun se på

* Ditt repository og "Actions" fanen i GutHub for å bekrefte at Workflows faktisk virker
* AWS miljøet i klassens AWS konto for å bekrefte at oppgaver som beskrevet er utført
* Vurdere drøftelsesoppgavene. Du må lage en  "Readme" for besvarelsen i ditt repo.
* Sensor vil Lage en fork av ditt repo og tester ut pipelines med egen AWS bruker/github bruker.

Ved innlevering via WiseFlow, lager du et *tekstdokument* som kun inneholder link til dit repository

## Litt om GitHub free tier

* I oppgaven blir du bedt om å lage GitHub actions workflows.
* Med GitHub "Free tier" har du 2,000 minutter med gratis byggetid per måned, dersom du bruker et privat repo.
* Dersom dere i en ekstrem situasjon skulle trenge mer byggetid, kan dere gjøre repository public. Da er byggetiden ubegrenset.
* Hvis dere da er bekymret for at andre skal kopiere arbeidet deres, kan dere lage en ny GitHub bruker med et tilfeldig navn.

OBS!

* I "Free" planen til GitHub er "branch protection" ikke tillat når et repository er privat. Det vil si at dere ikke kan konfigurere GitHub til å hindre push mot for eksempel _main_ branch direkte, eller konfigurere regler for godkjenning før merge av pull request osv.
* I denne oppgaven blir dere bedt om å beskrive _hvordan_ dette kan gjøres, men dere trenger altså ikke konfigurere dette for repoet dere leverer.

## Evaluering

* Del 1 DevOps-prinsipper - 20 poeng
* Del 2 CI - 20 poeng
* Del 3 Docker - 20 poeng
* Del 4 Del - Metrics med Micrometer 20 poeng
* Del 5 Del - Terraform og CloudWatch Dashboards - 20 poeng

## Utvikling i Cloud 9

Dere kan bruke et utviklingsmiljø i Cloud 9. https://244530008913.signin.aws.amazon.com/console - logg på med studentnavn.
Cloud9 miljøene er ble laget på nytt i løpet av helgen før eksamen starter, passord er det "vanlige"

* Siden Cloud 9 miljøet blir laget på nytt før eksamen; må du installere Maven, sette opp "credential helper" osv. Se på en av øvingene vi har gjort i semesteret. 

Hvis dere får følgende feilmelding når dere bygger koden med maven i Cloud9, må dere bare gjøre en "mvn clean"

```text
java.lang.Error: 
Unresolved compilation problem: 
        The method builder() is undefined for the type Cart
        at no.shoppifly.CartServiceTest.shouldRemoveCartAfterCheckout(CartServiceTest.java:13)
```

### Bonusoppgave - 5 Poeng

Vi fant aldi ut av hvorfor ovnernevnte problem oppstår av og til med Maven i Cloud9. Hvis du klarer å reprodusere feilen konsekvent
og kan komme med en forklaring på hvorfor dette skjer, og hva vi kan gjøre for å fikse det, gis 5 ekstra poeng. 

## Scenario

Som DevOps-ekspert, ferdig utlært fra Høgskolen Kristiania blir du ansatt i en bedrift, "Shopifly" som selger droner, 
men også andre varer nå som det nærmer seg jul. 

Shopifly har store utfordringer med utviklingsprosessen sin

* De deployer kode første mandag i kvartalet.
* De pleide å deploye oftere før- men dette førte til ustabilitet. Selskapet ansatte flere testere, og startet en prosess der utviklingsledere måtte se over og godkjenne alle leveranser. De senket samtidig frekvensen på leveransene sine for å få bedre stabilitet.  
* Når de deployer, feiler det fortsatt ofte. Da ruller de tilbake til forrige versjon, og ny funksjonalitet blir derfor ofte forsinket i månedsvis

* Leveransen skjer ved at Utviklingsteamet bruker FTP til å overføre en Spring boot JAR sammen med dokumentasjon i en
  ZIP. En egen avdeling tar i mot disse filene og installerer i AWS / Produksjon.

For å løse problemene sine, leide selskapet så inn DevOps-kompetanse fra Gaffel Consulting. Etter å ha sendt fire
juniorkonsulenter som fakturerte for en liten formue ble det klart at de aldri kom til å klare å levere, og kontrakten ble sagt opp.
"Jim" den "mest senior" av juniorkonsulentene har lagt inn noen kommentarer i koden som kan være til hjelp. 

Det Gaffel Consulting klarte å levere på den medgåtte tiden ligger i dette repositoryet. 

Nå er det din tur til å ta over!

## Beskrivelse av API

Selskapet driver med elektronisk handel, og fokus for denne oppgaven er et API som 
implementerer en handlekurv. Gjør deg godt kjent med APIet og hvordan det virker - via Postman / Curl før du starter på oppgaven.

Du kan starte applikasjonen, enten i ditt Cloud9 miljø- eller på lokal maskin med kommandoen 

```sh
mvn spring-boot:run
```

### Request headers

OBS! For alle reqestene trenger å du sette HTTP header 'Content-Type: application/json'

### Opprette handlekurv - POST /cart

Du kan lage ny handlekurv ved å gjøre en HTTP POST til ````/cart````
Uten "id"

*Request body*

```json
{
  "items": [
    {
      "description": "Ugly christmas sweater",
      "qty": "1",
      "unitPrice": "500"
    }
  ]
}
```

*Respons*

*id* blir satt automatisk

```json
{
  "id": "fb49e386-7124-4c16-9067-2dde2ee75d4e",
  "items": [
    {
      "description": "Ugly christmas sweater",
      "qty": 1,
      "unitPrice": 500.0
    }
  ]
}

```

*Curl-eksempel*

```sh 
curl --location --request POST 'http://localhost:8080/cart' \
  --header 'Content-Type: application/json' \
  --data-raw '{
      "items": 
      [
        {
          "description": "Ugly christmas sweater",
          "qty": "1",
          "unitPrice": "500"
        }
      ]
  }'
```

### Oppdatere handlekurv - POST /cart

Du kan poste et helt cart-objekt med en "id" for å oppdatere handlekurven

*Request*

````json 
{
    "id": "fb49e386-7124-4c16-9067-2dde2ee75d4e",
    "items": [
        {
            "description": "Ugly christmas sweater",
            "qty": 1,
            "unitPrice": 500.0
        },
        {
            "description": "Shark socks",
            "qty": 20,
            "unitPrice": 10.0
        }
    ]
}
````

*Response*

Samme som request

#### Eksempel Curl kommando

```sh
curl --location --request POST 'http://localhost:8080/cart' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "fb49e386-7124-4c16-9067-2dde2ee75d4e",
    "items": [
        {
            "description": "Ugly christmas sweater",
            "qty": 1,
            "unitPrice": 500.0
        },
        {
            "description": "Shark socks",
            "qty": 20,
            "unitPrice": 10.0
        }
    ]
}'
```

### Fullføre handel - POST /cart/checkout

Sjekker ut handlekurven, sletter den fra listen over aktive handlekurver og returnerer en ordre ID

#### request

````json 
{
    "id": "fb49e386-7124-4c16-9067-2dde2ee75d4e",
    "items": [
        {
            "description": "Cheap 4K Drone with spare parts (needed)",
            "qty": 1,
            "unitPrice": 500.0
        },
        {
            "description": "Shark socks",
            "qty": 20,
            "unitPrice": 10.0
        }
    ]
}
````

#### Response

```text
25d07757-4e56-408c-be30-a0568d35a70d
```

* Eksempel Curl kommando*

```sh
curl --location --request POST 'http://localhost:8080/cart/checkout' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": "fb49e386-7124-4c16-9067-2dde2ee75d4e",
    "items": [
        {
            "description": "Ugly christmas sweater with Drone logo",
            "qty": 1,
            "unitPrice": 500.0
        },
        {
            "description": "Shark socks",
            "qty": 20,
            "unitPrice": 10.0
        }
    ]
}'
```

### Hente alle handlekurver - GET /carts

Du kan få en oversikt over alle aktive handlekurver med dette endepunktet. 

*Response*

```json
[
"4eb4d739-5df9-48b1-84c0-57c039d4fe35",
"cc7068e8-b855-416f-a34c-65dcdf478174",
"9e1e846f-45b7-472d-8bde-af9eba3224a5"
]
```

*Eksempel Curl kommando*

```sh 
curl --location --request GET 'http://localhost:8080/carts' \
--header 'Content-Type: application/json'
```

## Del 1 DevOps-prinsipper

Beskriv med egne ord;

* Hva er utfordringene med dagens systemutviklingsprosess - og hvordan vil innføring av DevOps kunne være med på å løse
  disse? Hvilke DevOps prinsipper blir brutt?
* En vanlig respons på mange feil under release av ny funksjonalitet er å gjøre det mindre hyppig, og samtidig forsøke å legge på mer kontroll og QA. Hva er problemet med dette ut ifra et DevOps perspektiv, og hva kan være en bedre tilnærming?
* Teamet overleverer kode til en annen avdelng som har ansvar for drift - hva er utfordringen med dette ut ifra et DevOps perspektiv, og hvilke gevinster kan man få ved at team han ansvar for både drift- og utvikling? 
* Å release kode ofte kan også by på utfordringer. Beskriv hvilke- og hvordan vi kan bruke DevOps prinsipper til å redusere
  eller fjerne risiko ved hyppige leveraner.

## Del 2 - CI

Konsulentene som har jobbet med innføring av DevOps har startet på en GitHub actions workflow for kontinuerlig
integrasjon. GitHub actions workflow (yml) filen ligger i dette repositoryet og heter ````ci.yml````

Problemet er at utviklingsteamet må starte jobben manuelt fra GitHub actions brukergrensesnittet. Det er jo ikke bra!

Du kan gjerne teste dette selv ved å gå til "Actions" i ditt repository, du vil se teksten "This workflow has a workflow_dispatch event trigger." Og vil
ha et valg som heter "Run workflow"

### Oppgave 1 

* Start med å få workflowen til å kjøre når det lages en pull request, og på hver push til main branch

### Oppgave 2 

Det er andre utfordringer med denne flyten også; Workflowen kjører "ok" selv om det åpenbart er unit-testfeil i koden. 

* Få først ```ci.yml```workflow til å feile fordi enhetstesten feiler. 
* Rett deretter enhetstesten og se at pipeline kjører "ok".  
* Workflowen skal kompilere javakoden og kjøre enhetstester på hver eneste push, *uavhengig av branch* 

### Oppgave 3 

Branch protection og status sjekker - Beskriv hva sensor må gjøre for å konfigurere sin fork på en slik måte
at

* Ingen kan pushe kode direkte på main branch
* Kode kan merges til main branch ved å lage en Pull request med minst en godkjenning
* Kode kan merges til main bare når feature branchen som pull requesten er basert på, er verifisert av GitHub Actions.

## Del 3 - Docker

Applikasjonen er laget for å pushe et container image til Docker Hub. 

Det ligger en ```Dockerfile``` i prosjektet, og en workflow fil som heter ```docker.yml``` .

### Oppgave 1

Beskriv hva du må gjøre for å få workflow til å fungere med din DockerHub konto? Hvorfor feiler workflowen? 

### Oppgave 2

Når du har fikset problemet i oppgave 1, og du forøker å kjøre applikasjonen fra Docker hub med for eksempel; 
```docker run <dockerhub brukeravn>/shopifly```

Får du en feilmelding 
```text
Exception in thread "main" java.lang.UnsupportedClassVersionError: no/shoppifly/CddemoApplication has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
        at java.lang.ClassLoader.defineClass1(Native Method)
        at java.lang.ClassLoader.defineClass(ClassLoader.java:756)
        at java.security.SecureClassLoader.defineClass(SecureClassLoader.java:142)
        at java.net.URLClassLoader.defineClass(URLClassLoader.java:473)
        at java.net.URLClassLoader.access$100(URLClassLoader.java:74)
        at java.net.URLClassLoader$1.run(URLClassLoader.java:369)
        at java.net.URLClassLoader$1.run(URLClassLoader.java:363)
```

De annsatte i Gaffel consulting tenkte at Maven-bygget kunne kjøres i GitHub Actions, med  ```mvn ...```, og at JAR filen kunne kopieres inn i Container Image docker under bygging.  

Men så bestemte en av utviklerene seg for å oppgradere Javaversjonen i pom.xml, og workflow filen, til Java 11. 
Alt stoppet å fungere! Som dere ser av Dockerfilen, kjører Spring boot på Java 8...

```
FROM adoptopenjdk/openjdk8
```

Konsulentene ga opp, og hoppet som vanlig over på en annen oppgave. Så for øyeblikket har ikke Shopifly en fungerende applikasjon. 

Vi kan få bedre kontroll på byggeprosessen ved også å gjøre maven bygget i en container. For å unngå lignende problemer i fremtiden ønsker vi derfor å bruke Docker til kompilere- og bygge koden.

* Skriv om Dockerfilen. til bruke en *Multi Stage Build*. 
* Du må også rydde opp i ```docker.yml``` workflow filen... Fjern ønødvendige "steps".

### Oppave 3

Gaffel consulting var ikke klar over at det var en dårlig idè å ha sitt container image i et offentlig Docker hub repository - og Shopifly har allerede sett at flere hundre har lastet ned deres container image.
Et privat ECR repository i AWS er en bedre løsning.

* Lag dit eget ECR repository med kandidatnummer som navn, enten ved hjelp av UI - eller ved hjelp av CLI.
* Endre ```docker.yml```, workflow til å pushe docker container til Amazon ECR, istedet for docker hub
* Beskriv deretter med egne ord hva sensor må gjøre for å få sin fork til å laste opp container image til sitt eget ECR repo.
* Docker workflow skal pushe et container image med en tag som er lik GitHub commit hash (id); for eksempel ```244530008913.dkr.ecr.eu-west-1.amazonaws.com/glenn_exam_practice:8234efc```

## Del 4 - Metrics, overvåkning og alarmer

Cloud9 er ikke verdens beste IDE. Det anbefales å gjøre den følgende oppgaven på lokal PC. Husk å kjøre  
```aws configure``` 
;-) 

### Oppgave 1

Gjør nødvendige endringer i ```pom.xml``` - og koden, slik at applikasjonen kan levere Metrics til CloudWatch ved hjelp av Spring Boot Micrometer.
Konfigurer applikasjonen til å bruke ditt eget ClodWatch Metrics Namespace - ditt Kandidatnummer. 

*OBS!* Når dere innfører Micrometer i koden deres, vil enhetstesten slutte å fungere. Dere får lov til å slette 
enhetstesten når dere starter å jobbe med denne oppgaven. I "virkeligheten" ville vi brukt et rammeverk som feks Mockito  
til å "mocke" micrometer fra enhetstestene, men det er ikke ønskelig at dere skal bruke tid på dette under eksamen!

### Oppgave 2 

Endre Javakoden slik at den rapporterer følgende Metrics til CloudWatch

* "carts" -  Antall handlekurver på et gitt tidspunkt i tid - verdien kan gå opp og ned ettersom kunder sjekker ut handlekurver og nye blir laget.  
* "cartsvalue" - Total sum med penger i handlekurver på et gitt tidspunkt i tid - verdien kan gå opp og ned ettersom kunder sjekker ut handlekurver og nye blir laget.
* "checkouts" - Totalt antall  handlevogner er blitt sjekket ut
* "checkout_latency" - Gjennomsnittlig responstid for Checkout metoden i Controller-klassen.

## Del 5 - Terraform og CloudWatch Dashboards

Konsulentene i Gaffel consulting hadde ambisiøse planer om å få Terraform-koden i dette repoet til å kjøre
i GitHub Actions. Workflowen kjørte bra første gang, men nå feiler den hver gang, og klager over at en bucket med samme navn allerede eksisterer.
Shopifly har tenkt på bruke denne bucketen til data-analyse.

```text
Error: creating Amazon S3 (Simple Storage) Bucket (analytics-jim): BucketAlreadyOwnedByYou: 
Your previous request to create the named bucket succeeded and you already own it.
```

De kommenterte derfor bare ut S3 bucket koden, og gikk videre til neste oppgave. 

### Oppgave 1 

Se på ```provider.tf filen```. 

* Forklar med egne ord. Hva er årsaken til dette problemet? Hvorfor forsøker Terraform å opprette en bucket, når den allerede eksisterer? 
* Gjør nødvendige Endre slik denne slik at Terraform kan kjøres flere ganger uten å forsøke å opprette ressurser hver gang den kjører.
* Fjern kommentarene fra ```databacket.tf``` slik at Terraform-koden  også lager en S3 bucket. 

### Oppgave 2

Et annet problem er at "terraform apply" bare blir kjørt hver gang noen lager en Pull request. Vi ønsker bare å kjøre apply når
noen gjør en push mot main branch. 

Fullfør workflow filen ```cloudwatch_dashboard.yml``` filen slik at apply bare bli kjørt på push mot main branch, og terraform plan   
på når det lages en Pull request 

### Oppgave 3

* Fullfør cloudwatch_dashboard.tf slik at koden lager et CloudWatch Dashboard med *fire widgets*. Disse skal vise metrikkene fra oppgave 2, Del 4. 
* Antall handlekurver på et gitt tidspunkt i tid - verdien kan gå opp og ned ettersom kunder sjekker ut handlekurver og nye blir laget.
* Total sum med penger i handlekurver på et gitt tidspunkt i tid - verdien kan gå opp og ned ettersom kunder sjekker ut handlekurver og nye blir laget.
* Totalt antall  handlevogner er blitt "sjekket ut" per time
* Gjennomsnittlig responstid for Checkout metoden i Controller-klassen.

### Alarmer

Lag Terraform-kode som oppretter

* En CloudWatch Alarm  som løses ut dersom antall handlekurver over tre repeternde perioder,på fem minutter, overstiger verdien 5
* Alarmen skal sendes som e-post til en addresse som gis i workflow filen ```cloudwatch_dashboard.yml``` 
