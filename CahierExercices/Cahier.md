# GWT (Google Web Toolkit)
# Cahier de TP

![Zenika](../../../../../CahierExercices/ressources/logo-zenika.jpg)

## Pré-requis

### Installation

Installer les technos demandées

## TP 1 : Prise en main

### Objectif

Réaliser un projet en mettant en œuvre les concepts abordés pendant la formation. Le projet consiste en une application de réservation de voyages en ligne nommé Resanet.

C'est une application utilisable par un opérateur d'une agence de voyage, qui va répondre aux demandes des clients et leur réserver un voyage.

Créer un projet eclipse « from scratch » à l'aide du plugin Eclipse.

###  Installer GWT et le plugin Eclipse

- Installer si besoin la release GWT
- Installer si besoin le plugin GWT Eclipse

### Tester le projet

- Créer un nouveau projet GWT « Resanet » avec comme package racine « com.zenika.resanet.gwt »
- Parcourir l'ensemble de l'arborescence du projet afin de prendre en main la structure GWT
- Lancer le projet en mode développement et tester l'application
- Compiler l'application
	- Vérifier si la génération Javascript a bien été effectuée
	- Installer un serveur Tomcat 7
	- Passer le projet en tant que projet web
		- Dans les propriétés du projet, dans la section « Project Facets » cocher « Dynamic Web Module » puis faire Ok
		- Retourner dans les propriétés du projet et dans la section « Deployement Assembly » supprimer la ligne « /WebContent » et ajouter le répertoire « war »
	- Ajouter le projet au serveur Tomcat puis le démarrer.
	- Tester la version compilée de l'application via l'URL `http://127.0.0.1:8080/<Nom du projet>` (normalement, ici Resanet-TP1)


## TP 2 : Mettre en œuvre l'application Resanet

### Initialiser le projet Eclipse

Afin de partir d'un projet vide, il est nécessaire de « nettoyer » le projet généré par le plugin GWT :
- Supprimer GreetingService, GreetingServiceAsync et GreetingServiceImpl
- Supprimer FieldVerifier
- Supprimer les balises ```<servlet>```et ```<servlet-mapping>``` dans le fichier web.xml
- Supprimer le contenu du ```<body>``` dans Resanet.html hormis ```<iframe>``` et ```<noscript>```
- Dans l'EntryPoint de l'application, ne garder que la méthode onModuleLoad() et vider son contenu

Une fois la réinitialisation effectuée, lancer l'application pour tester qu'elle démarre correctement (ie. page blanche)

### Mise en œuvre d'un écran de login

- Ajouter une table HTML dans la page Resanet.html comportant les slots GWT suivants 
	- slot de label utilisateur
	- slot de champ utilisateur
	- slot de label mot de passe
	- slot de champ mot de passe
	- slot de bouton « reset »
	- slot de bouton « connexion »
- Depuis la méthode onModuleLoad de l'EntryPoint, remplir l'ensemble des slots de telle sorte à avoir le formulaire suivant

![Node.js](../../../../../CahierExercices/ressources/TP2.png)


## TP 3. Mise en page en utilisant les widgets GWT

- Supprimer le contenu du <body> dans Resanet.html hormis ```<iframe>``` et ```<noscript>```
- Importer le répertoire images fourni dans le répertoire war du projet GWT
- Utiliser les widgets et panels fournis par GWT afin de mettre en page l'application de telle sorte à avoir l'écran suivant

![Node.js](../../../../../CahierExercices/ressources/TP3.png)

- Il est nécessaire de s'appuyer sur les propriété CSS et les propriétés des widgets/panels GWT afin d'assurer une mise en page optimale
« margin-left : auto; margin-right : auto » permet de centrer un élément au sein de son élément parent
« border-spacing » permet de gérer l'espace entre les éléments fils d'un élément donné (exemple : « border-spacing : 5px »)

- Ajouter traitements suivants :
	- bouton « Reset » → vidage des champs utilisateur et mot de passe
	- bouton "Se connecter" → comparaison des champs utilisateur et mot de passe
		- si les deux champs sont non vides et égaux, afficher un popup d'alerte « Login/Mot de passe valides »
		- sinon, afficher un popup d'alerte « Login/Mot de passe invalide(s) »
	- Tester l'application


## TP 4. Communication RPC
 
### 
Objectifs
L'objectif de ce TP est de mettre en œuvre un premier appel RPC au sein de l'application RPC

Pour cela, nous allons déporter la comparaison login/mot de passe faite précédemment coté client, vers le serveur GWT.

### Mise en œuvre 

- Créer un objet Java (commun au client et au serveur) pouvant contenir le login et le mot de passe de l'utilisateur
- Créer un service RPC se chargeant de faire la comparaison login/mot de passe (cf. TP 2) coté serveur et qui renvoie un booléen.
- Au sein du callback, afficher un message d'alerte indiquant le résultat de la comparaison
- Tester
 
 ### Mise en œuvre 2
- Importer les ressources fournies dans le répertoire java

- Nous vous fournissons un service Java AuthentificationService qui
	- renvoie un objet Operateur quand les login/password sont corrects
	- renvoie une exception dans le cas contraire
Remarque : les utilisateurs disponibles sont « Pierre » et « admin »

- Modifier le service de connexion afin d'utiliser le service AuthentificationService coté serveur (ie. le service RPC coté serveur doit appeler le service 
- AuthentificationService et non plus comparer login et password)
	- afin d'implémenter le service, il est nécessaire d'utiliser la factory dédiée (ie. com.zenika.resanet.gwt.server.service.factory.ServiceFactory)
	- prendre en charge l'exception OperateurNotFoundException coté client
- Tester


## TP 5. Table et navigation

### Objectifs
L'objectif  de ce TP est de manipuler les tables GWT ainsi de que de mettre en œuvre la navigation entre plusieurs écrans.

### Mise en œuvre

- Refactorer si besoin votre application afin que le formulaire de login soit un composant propre (ie. classe Composite)
- Créer un composant (ie. Composite) EcranOperateur permettant de modifier les données de l'opérateur connecté (cf. capture d'écran)
	Remarque : le champ « Login » est non modifiable
- S'appuyer sur FlexTable afin mettre en page le formulaire
- Après connexion, afficher l'EcranOperateur en lui passant en paramètre l'Opérateur

![Node.js](../../../../../CahierExercices/ressources/TP5.png)

### Combobox
- Remplacer le champ « Rôle » par un widget de type Combobox contenant les valeurs « ADMINISTRATEUR » et « AGENT »
- Initialiser la valeur de la combobox avec le rôle de l'utilisateur courant
- Tester


## TP 6. Bus d’événements et navigation 

### Mise en place du bus et de la navigation

- Créer un composant EcranPrincipal pouvant contenir d'autres composants et qui pour le moment ne contiendra que le formulaire de login et l'EcranOperateur
- Dans cet EcranPrincipal, mettre en place un EventBus et créer un événement personnalisé LoginEvent, pouvant contenir un opérateur, et son Handler associé
- Remplacer l'affichage de l'EcranOperateur ,après connexion, en envoyant un LoginEvent via le bus et en ajoutant le handler associé dans l'écran principal
- Après connexion, l'écran doit afficher le formulaire suivant :

![Node.js](../../../../../CahierExercices/ressources/TP6.png)

- Créer un service RPC permettant de modifier les données de l'opérateur
- Appeler le service RPC sur clic bouton « Enregistrer les modifications »
	Remarques : il est important de fournir le mot de passe actuel afin de ne pas l'écraser
- Afficher un message d'alerte afin de confirmer la mise à jour et mettre à jour l'opérateur courant coté client
- Tester (Après mise à jour de l'opérateur, rafraîchir l'application afin de vérifier que les modifications ont bien été prises en compte)

## TP 7. Internationalisation

Cet exercice consiste à internationaliser l'application Resanet.

### Déclaration des locales

- Déclarer deux locales dans votre application (en et fr)

### Interface Constants
- Créer l'interface AppConstants qui va contenir toutes les chaines de caractère de votre application ainsi que les fichiers de properties
- Extraire toutes ces constantes dans les fichiers de properties en créant à chaque fois la méthode associée dans l'interface
- Remplacer les constantes dans votre code par l'appel à l'interface i18n

###Interface Messages
- Créer l'interface AppMessages pour les chaines variables
- Ajouter un message d'alerte lors de la connexion de l'utilisateur contenant son login en utilisant l'interface précédente pour paramétrer le message.

Tester avec les deux locales spécifiées.

## TP 8. UiBinder

### Objectifs
L'objectif de ce TP est de mettre en œuvre un menu principal, une fenêtre de déconnexion ainsi qu'un nouvel écran, tout ceci en utilisant le framework UiBinder.

### Menu

- Créer le menu principal suivant dans un composant dédié
 
 ![Node.js](../../../../../CahierExercices/ressources/TP8_1.png)

 ![Node.js](../../../../../CahierExercices/ressources/TP8_2.png)


- Ajouter le menu dans l'écran opérateur pour qu'il s'affiche après connexion
- Nous n'allons pour l'instant pas implémenter toutes les commandes sur les menus

##  Popup

- Associer un popup de déconnexion à la commande « Utilisateur -> Se déconnecter »
	- Créer cette popup en utilisant le framework UiBinder

![Node.js](../../../../../CahierExercices/ressources/TP8_3.png)


- Afficher le formulaire de login initial si l'utilisateur clique sur « Oui »
	- Pour faire cela, utiliser l'EventBus en envoyant un événement personnalisé 
- Fermer le popup après action utilisateur
	- utiliser la méthode PopupDeconnexion.this.hide()

### Écran de recherche

- Ajouter un nouvel écran de recherche de voyages, toujours avec UiBinder
	- L'écran est composé
		- d'un formulaire contenant
		- Ville de départ
		- Ville d'arrivée
		- Date de départ (format JJ/MM/AAAA)
	- d'une liste des voyages correspondants aux critères
		- Type (ie. Train ou Avion)
		- Prix
		- Nombre sièges total
		- Nombre sièges disponibles
		- Heure départ
		- Heure arrivée

![Node.js](../../../../../CahierExercices/ressources/TP8_4.png)

- Pour la liste de résultats, utiliser l'objet CellTable de GWT
- Permettre la navigation entre les différents écrans en ajoutant les commandes correspondantes dans le Menu précédent 
- Pour cela, utiliser l'EventBus en envoyant un événement personnalisé 

Remarques : 
	- les voyages disponibles sont à la date du jour entre Paris et Lyon/Marseille
	- Les villes peuvent être récupérées sur le serveur via le service VilleService


## TP 9. Gestion de l'historique

- Mettre en place l'historique (ie. gestion back/forward) après connexion de l'utilisateur en gérant les états suivants :
	- écran « modification utilisateur »
	- écran « rechercher voyage »
- Tester

## TP 10. Test

 ### Mise en place de JUnit
- S'assurer que le projet est bien un projet web (détail dans le TP1)
- Copier le jar « junit » présent dans les répertoire « test » des ressources de TP dans le répertoire de votre application « war/WEB-INF/lib »
- Créer une classe de test pour le projet Resanet qui possède une seul méthode de test qui contient assertTrue(true) puis lancer le test
 
 ###  Isoler et tester un traitement métier
- Mettre en place une remise de 5 % à l'affichage des prix dans la recherche des transports lorsque l'utilisateur connecté est un Administrateur.
- Tester la remise dans notre test unitaire.
 
 ### Mise en place HTMLUnit
- Copier l'ensemble des jar présents dans le répertoires « test/HTMLUnit » des ressources de TP dans le répertoire de votre application « war/WEB-INF/lib »
- Créer une classe test pour le projet Resanet qui possède une seul méthode de test qui contient assertTrue(true) puis lancer le test

### Réaliser un scénario de test
- Réaliser les modifications requises à la page de Login pour permettre la récupération des champs et du bouton de connexion.
- Compiler puis déployer l'application sur votre serveur Tomcat
- Écrire le scénario de test pour se connecter à l'application en tant qu'admin
- Contrôler que la popup « Bienvenue admin » se soit correctement affiché
- Attention : bien attendre que la page se charge et que l'appel d'authentification soit effectué.

## TP 11. Code Splitting
- Créer des points de rupture dans le code lors de l'affichage de l'écran de modification d'un opérateur ainsi que lors de l'affichage de l'écran de recheche de voyage.
- Compiler puis lancer l'application sur tomcat (procédure du TP1). 
- Depuis le navigateur constater le chargement des différents parties de code dans les fichiers ```<chiffre>```.cache.js

### TP 12. JNSI
- Inclure les éléments présent dans le répertoire de ressource « jnsi » dans le module xml (Resanet.gwt.xml)
- Inclure la la hostPage :
	- jquery-ui.js
	- jquery-ui.css
	- external/jquery/jquery.js
- Créer un nouveau widget MyDatePicker qui étend TextBox et qui la transforme en datepicker en exécutant la commande JavaScript (element correspondant au retour de getElement()) :


```javascript
		$wnd.jQuery(element).datepicker({
			dateFormat : 'yy-mm-dd'
		});
```		

- Ajouter une méthode « getDate » au widget pour récupérer la date sélectionné qui fera appel à du code JavaScript. La date sera au format String, il faudra alors la 
transformer en Date avec la classe DateTimeFormat.

```javascript
	 return $wnd.jQuery(element).val(); 
```

- Faire attention à changer le type de widget utilisé dans le fichier java pour qu'il soit bien MyDatePicker et corriger l'utilisation de getValue par getDate pour que le code compile.
- Tester que l'ensemble fonctionne correctement

### Difficultés courantes rencontrées lors des Tps

- Encodage des fichiers (Assurez vous de configurer Eclipse en UTF-8)
- Cache navigateur (Penser a purger le cache de votre navigateur ou passer en navigation privée)
- Mode hors-connexion navigateur (Assurez vous d'être en mode "connecté")
- teChangement de version du SDK GWT (Vérifier un potentiel problème de compatibilité de version entre votre SDK GWT et le plugin de votre navigateur)
