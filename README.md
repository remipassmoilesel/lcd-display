# Test technique de développement: Affichage sur écran LCD

## Utilisation du dépôt

Nécéssite Git et Maven:

    $ git clone git@github.com:remipassmoilesel/lcd-display.git -b just-3-commits-more-😜
    $ cd lcd-display
    $ mvn test

    $ mvn exec:java -Dexec.mainClass="remipassmoilesel.Launcher" -Dexec.args="-t"
    $ mvn exec:java -Dexec.mainClass="remipassmoilesel.Launcher" -Dexec.args="-d 12345"


## Sujet

    Affichage sur écran LCD
    -----------------------
     
    On te propose de faire un petit exercice de code from scratch.
     
    Ta mission est de créer la logique pour afficher des numéros sur un écran LCD. 
    Cet écran dispose d’un grid de 3x3, chaque case peut contenir une espace, un tiret bas, ou un pipe.
    Par exemple (ici en utilisant un point à la place d’espace)
     
    ._.   ...   ._.   ._.   ...   ._.   ._.   ._.   ._.   ._.
    |.|   ..|   ._|   ._|   |_|   |_.   |_.   ..|   |_|   |_|
    |_|   ..|   |_.   ._|   ..|   ._|   |_|   ..|   |_|   ..|
     
    Exemple: 910
    ._. ... ._.
    |_| ..| |.|
    ..| ..| |_|
    
    Ce test technique devrait nécessiter 3 h au maximum. N’hésite pas à justifier
     les choix que tu prendras pour ne pas dépasser cette limite.
     
    Tu peux faire ce test en JavaScript ou en Java.

## Chronologie de réalisation

1. Analyse du sujet
1. Choix de la technologie
1. Première conception à l'aide d'un diagramme de classe
1. Génération d'un archetype de projet Maven
1. Implémentation d'un premier prototype
1. Ajout des premiers tests
1. Améliorations et ajout des premières vérifications de pré-requis 
1. Tests supplémentaire
1. Rédaction finale
 
## Analyse

- Test de conception et de développement autour de la création d'un affichage LCD.
- L'écran affichera des numéros uniquement, mais sera peut être sujet à extension.
- L'écran est composé d'unités d'affichage. Chaque unité est une grille de cases de 3 * 3 avec affichage possible des signes ' ', '_', '|'.
- L'écran sera affiché en console dans l'optique de respecter le temps du test et de diriger les efforts vers la conception.
- Le contrôle de l'affichage devra être séparé de l'affichage pour une meilleure maintenabilité du code.
- Le dispositif doit être testable.

## Choix de la technologie

Java SE 8 sera utilisé pour le test. Grâce à Maven il est facile et rapide de générer un archetype de projet avec infrastructure de test.
De plus Java est un langage adapté à l'embarqué, en accord avec le sujet du test.

## Point forts de l'implémentation

- Possibilité d'ajouter de nouveaux caractères
- Possibilité d'ajouter de nouveaux types d'écran

## Points faibles

- Pas de déclaration explicites ni différenciation des exceptions
- Code verbeux et peu optimisé dans l'optique de satisfaire le temps du test
- Pas de Test Driven Design dans l'optique de satisfaire le temps du test 

## Travail restant

- Mettre en confrontation avec le besoin
- Faire plus de tests
- Executer une relecture et une analyse de code (SonarQube ?) 
- Améliorer la documentation intégrée au code
- Trouver un moyen de lister les DisplayableChar disponibles de manière plus élégante
- Terminer le diagramme de classes


