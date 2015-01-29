# Événements

<!-- .slide: class="page-title" -->




Notes :




## Les événements personnalisés dans GWT

- Les événements dans une architecture logicielle assurent un couplage faible entre composants/écrans
	- Maintenabilité
	- Évolutivité
- GWT fournit une API permettant de créer facilement des événements personnalisés
- Pour un composant GWT, il est possible d'utiliser les événements personnalisés afin de communiquer avec
	- Son parent
	- L'ensemble de l'application
Notes :




## Événements parent-enfant

Notes :




## Handler événement

- Tout événement personnalisé doit être associé à un Handler
- Un Handler d'événement
	- Doit hériter de EventHandler
	- Fournit une/plusieurs méthodes permettant d'associer une action à un événement donnépublicinterfaceLoginHandlerextendsEventHandler {voidonLogin(LoginEvent event);}
Notes :




## Événement personnalisé (1/2)
publicclassLoginEventextendsGwtEvent<LoginHandler> {publicstaticType<LoginHandler>TYPE=newType<LoginHandler>();privateUtilisateurutilisateur=null;publicLoginEvent(Utilisateur utilisateur) {this.utilisateur= utilisateur;}publicUtilisateur getUtilisateur() {returnutilisateur;}@OverridepublicfinalType<LoginHandler> getAssociatedType() {returnTYPE;}@Overrideprotectedvoiddispatch(LoginHandler handler) {handler.onLogin(this);}}
Notes :




## Événement personnalisé (2/2)

- Les événements personnalisés font le lien entre les différents composants/écrans de l'application
- Un événement personnalisé
	- Doit hériter de Event<Handler> (Handler doit correspondre auHandler précédemment créé)
	- Peut fournir plusieurs informations contextuelles (exemple : Utilisateur)
	- Doit fournir un type égal à Type<Handler>
	- Doit appeler l'ensemble des méthodes du Handler depuis la méthode dispatch
Notes :




## Composant personnalisé

- Le composant peut envoyer un événement qui est transmis aux handlers enregistrés (remarque : tout widget peut envoyer un événement)
- Le composant parent peut enregistrer un handler afin de réagir aux événements du composant filspublicclassParentComponentextendsComposite {publicParentComponent() {LoginComponent component =newLoginComponent();component.addHandler(newLoginHandler() {@OverridepublicvoidonLogin(LoginEvent event) {Window.alert("L'utilisateur s'est connecté !");}},LoginEvent.TYPE);publicvoidlogin(Operateur operateur) {fireEvent(newLoginEvent(operateur));}
Notes :




## Événements entre modules

Notes :




## Les événements au sein de l'application

- Les événements personnalisés peuvent également servir à découpler les écrans d'une application
- Cette mise en œuvre s'appuie sur un élément central : un EventBus
- L'objectif principal est d'assurer la navigation entre écrans de manière optimale en palliant l'effet « spaghetti »
Notes :




## Pallier l'effet spaghetti (1/2)

- L'enchaînement des vues/écrans peut conduire à la mise en œuvre d'une navigation de type « spaghetti »

```
Commande
```

```
Commande
```

```
Commande
```

```
Commande
```

```
Commande
```

```
Voyage
```

```
Utilisateur
```

```
Écran
Login
```

```
Écran
Voyages
```

```
Écran
Commandes
```

```
Écran
Créer
Commande
```

Notes :




## EventBus : pallier l'effet spaghetti (2/2)

- Afin de pallier l'effet « spaghetti », il est conseillé de mettre en place un bus d'événements

```
Commande
```

```
Commande
```

```
Commande
```

```
Commande
```

```
Commande
```

```
Voyage
```

```
Utilisateur
```

```
Écran
Login
```

```
Écran
Voyages
```

```
Écran
Commandes
```

```
Écran
Créer
Commande
```

```
Event
Bus
```

Notes :




## EventBus

- Depuis la version 2.1 de GWT, Google fournit une API EventBus
- Interface EventBus
- Plusieurs implémentations disponibles
	- SimpleEventBus
	- ResettableEventBus
	- CountingEventBus
	- RecordingEventBus
Notes :




## EventBus
publicinterfaceLoginHandlerextendsEventHandler {voidonLogin(LoginEvent event);}// INSTANCE UNIQUE POUR TOUTE L'APPLICATIONpublic static finalEventBusEVENT_BUS=newSimpleEventBus();EVENT_BUS.addHandler(LoginEvent.TYPE,newLoginHandler() {@OverridepublicvoidonLogin(LoginEvent event) {// TRAITEMENT SUITE A LOGIN}});

![](ressources/images/GWT_-_07_-_Evenements-1000020100000080000000801B084A46.png)
…EVENT_BUS.fireEvent(newLoginEvent(utilisateur));…

```
Module 2
```

```
Module 1
```

Notes :






![](ressources/images/GWT_-_07_-_Evenements-10000201000001000000010037A4F079.png)
## TP 6

Notes :




<!-- .slide: class="page-questions" -->



<!-- .slide: class="page-tp1" -->