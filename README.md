# Test techique de développement: Affichage sur écran LCD

## Sujet:

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
    
    Ce test technique devrait nécessiter 3 h au maximum. N’hésite pas à justifier les choix que tu prendras pour ne pas dépasser cette limite.
     
    Tu peux faire ce test en JavaScript ou en Java.

## Chronologie

    - Analyse du sujet
    - Choix de la technologie
    - Première conception à l'aide d'un diagramme de classe
    - Génération d'un archetype de projet Maven
 
## Analyse

Test de conception et de développement autour de la création d'un affichage LCD.

L'écran affichera des numéros uniquement, mais sera peut être sujet à extension.
L'écran est composé d'unités d'affichage. Chaque unité est une grille de cases de 3 * 3 avec affichage possible des signes ' ', '_', '|'.
Chaque unité d'affichage doit être effaçable (uniquement composée d'espaces). 

L'écran sera affiché en console dans l'optique de respecter le temps du test et de diriger les efforts vers la conception.
Le contrôle de l'affichage devra être séparé de l'affichage pour une meilleure maintenabilité du code.
Le dispositif doit être testable.

## Choix de la technologie

Java SE 8 sera utilisé pour le test. Grâce à Maven il est facile et rapide de générer un archetype de projet avec infrastructure de test.
De plus Java est un langage adapté à l'embarqué, en accord avec le sujet du test.


## Point forts

## Points faibles

## Perspectives
