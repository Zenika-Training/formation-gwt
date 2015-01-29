# Gestion de l'historique

<!-- .slide: class="page-title" -->




Notes :




## Rappels

- GWT Fonctionne en mode«SinglePageInterface » (SPI)
- Cela implique que le « passage » d'un écran à un autre ne modifie pas l'URL de la page.
- Il faut donc trouver des contournements afin de conserver l'ergonomie de l'interface
Notes :




## Ergonomie et navigateur

- Habitudes de l'utilisateur après une action effectuée
	- Passage à l'étape précédente par bouton du navigateur
- Impact sur l'utilisation d'une application GWT
- Conséquence : nécessité de prendre en charge l'utilisation des boutons browser
	- Notion d'historique
	- Utilisation de la classe History

```
Clic sur
Précédent / Suivant
```

```
Chargement d'une
nouvelle URL
```

```
Annulation des actions
effectuées dans l'application GWT
```

Notes :




## Gestion de l'historique

- GWT fournit la classe History qui permet de prendre la main sur les fonctions back/forward du navigateur
- Change l'état courant → enregistre une URL spécifique dans l'historique du navigateur
- Invoque programmatiquement la fonction back du navigateur
- Invoque programmatiquement la fonction forward du navigateur
- Récupère le jeton associé à l'état courant
public static voidnewItem(String historyToken)
public static voidback()
public static voidforward()
public staticString getToken()
Notes :




## Enregistrement d'un état
…History.newItem("etat_selection_voyage");…

![](ressources/images/GWT_-_10_-_Historique-10000000000002D20000005B2AFD40D2.png)
Changement d'URL → activation bouton back
Notes :




## Listener Historique (1/2)

- La classe History ne gére que des tokens → l'état global de l'application n'est pas pris en charge
- Les changements d'état de l'application suite à l'utilisation des boutons back/forward doivent être pris en charge par le développeur
- Il est nécessaire de mettre en place un ou plusieurs listeners d'historique afin de mettre en œuvre la gestion d'historique
	- L'activation des boutons back/forward déclenche un appel à la méthode onValueChange(...) du listener → il est possible de gérer le changement d'état
Notes :




## Listener Historique (2/2)

- Remarque : l'appel àHistory.newItem(token)déclenche également un appel à la méthode onValueChange(...) → il est possible d'empêcher ce comportement en utilisant la méthodeHistory.newItem(token,false)…History.addValueChangeHandler(newValueChangeHandler<String>() {@OverridepublicvoidonValueChange(ValueChangeEvent<String> event) {if(event.getValue().equals("etat_selection_voyage")) {// affichage ecran selection voyage…}elseif(event.getValue().equals("etat_infos_utilisateur") {// affichage ecran infos utilisateur…}else{…}}});…
Notes :




## HyperLink (1/2)

- Le widget HyperLink crée un lien interne associé à un état interne de l'application géré par l'historique (boutons Back & Next du navigateur)publicclassMyWidgetpublicvoidinit() {…History.addValueChangeHandler(newValueChangeHandler<String>() {@OverridepublicvoidonValueChange(ValueChangeEvent<String> event) {if("step1".equals(event.getValue())) {// TRAITEMENT}}});Hyperlink hyperlink =newHyperlink("un lien","step1");…}L'écouteur réagit à l'événement et change l'état de l'applicationClé de associée à l'état du lienL'écouteur implémenteValueChangeHandlerHistory permet une gestioncentralisée des événements de navigation
Notes :




## HyperLink (2/2)

- Différence de comportement entre l'utilisation d'un HyperLink et d'un Label cliquable

```

```
Un lien

```

```
Un lienEtat 1

```

```
Un lienHyperLink GWTValueChangeHandler

![](ressources/images/GWT_-_10_-_Historique-100000000000009D00000058DAE23635.png)

```
click
```

```

```
Un lien

```

```

```

```
Un lien

```

```

```

```
Un lienLabel GWTClickHandler

```

```


![](ressources/images/GWT_-_10_-_Historique-100000000000009D00000058DAE23635.png)
Ecran1Ecran2Ecran1Retour à l'état 1

```
click
```

```
click
```

```
click
```
Arrêt de l'application

![](ressources/images/GWT_-_10_-_Historique-100002010000003000000030F16806CD.png)

```

```

```

```

```

```
Ecran2
Notes :






![](ressources/images/GWT_-_10_-_Historique-10000201000001000000010037A4F079.png)
## TP 9

Notes :




<!-- .slide: class="page-questions" -->



<!-- .slide: class="page-tp1" -->