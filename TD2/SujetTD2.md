Support de cours  

1. Les polynômes du second degré
2. Générer des nombres aléatoires
3. La belote
4. La tortue

Pour chaque exercice, écrire la ou les classes demandées ainsi qu'une (ou plusieurs) classe de test avec une méthode main. 

# Les polynômes du second degré
On veut créer une classe qui représente un polynôme du second degré (à une indéterminée): P(x)=a.x^2+b.x+c. Si nécessaire consulter ces rappels sur les équations du second degré 

x est l'indéterminée (un nombre approché). a, b, c sont des paramètres à valeur entière.

Proposer une classe Polynome pour répondre au problème. Quels sont les champs et quel est leur type ? Quels sont le ou les constructeurs nécessaires et quelle est leur signature ?
Ajouter une méthode pour évaluer le polynôme. On donne la valeur de x, la méthode nous donne la valeur de P(x). Quelle est la signature de cette méthode ?
Ajouter une méthode qui calcule le discriminant d'un polynôme. Quelle est la signature ? 
Proposer deux méthodes (racineReelle1 et racineReelle2) qui donnent les deux racines réelles du polynôme ? Que faut-t-il renvoyer lorsque le discriminant est négatif ? (voir les constantes de la classe Double)
Proposer deux autres méthodes  (racine1 et racine2) qui donnent les deux racines (éventuellement complexes) du polynôme. On utilisera pour cela la classe Complexe vue en cours. 
Générer des nombres aléatoires
Consulter la documentation sur la méthode random() de la classe Math. Comparer aux différentes méthodes de la classe Random.

Dans chacun des cas suivants, proposer un programme Java (des fois une ligne seulement) qui utilise les deux solutions (méthode random de Math et classe Random) pour répondre au problème et proposer des solutions équiprobables:

Générer pseudo-aléatoirement un nombre entier dans l'intervalle [0; 50]
Générer pseudo-aléatoirement un nombre entier dans l'intervalle ]-20; 50]
Générer pseudo-aléatoirement un nombre entier dans l'intervalle [a;b]
Générer pseudo-aléatoirement un nombre entier pair dans l'intervalle [a; b]
Générer pseudo-aléatoirement un nombre entier multiple de n dans l'intervalle [a; b]
a, b et n sont des entiers tels que n est positif et non nul, b est supérieur ou égal à a. Utiliser le mécanisme d'assertion vu en cours pour imposer ces contraintes. On ne fait aucune supposition sur le signe de a et b.

# La belote
Implanter une classe Carte qui représente une carte pour le jeu de belote:

Les couleurs sont TREFLE, PIQUE, CARREAU, COEUR
Les valeurs sont 7, 8, 9, 10, VALET, DAME, ROI, AS
On implantera seulement la version vue en cours qui utilise le mot clé enum.

On veut:

connaître la valeur d'une carte selon qu'elle soit à l'atout ou non;
étant données quatre cartes, on veut savoir quelle est la carte la plus forte?
étant données quatre cartes, on veut savoir quelle est la carte la plus forte, en fonction de l'atout?

# La tortue
La tortue est un instrument pédagogique qui a fait les heures de gloire du langage LOGO et qui a également paradoxalement causé sa perte. Usuellement utilisée pour faire des représentations graphiques, elle est très intéressante pour illustrer les principes fondamentaux de la programmation orientée objet. Plus tard dans le semestre nous aurons (peut-être) l'occasion de construire une interface graphique pour la tortue mais contentons-nous dans un premier temps de programmer un modèle objet pour le comportement intrinsèque de la tortue.

On peut ajouter beaucoup de propriétés à une tortue. Contentez-vous dans un premier temps de couvrir les fonctionnalités demandées. Vous pourrez ensuite, sur votre temps libre, donner libre cours à votre imagination, si vous le souhaitez.

N'attendez pas d'arriver à la question 9 pour tester votre travail, il faut quasiment tester chaque question !

Traduire en Java les affirmations suivantes:

Une tortue est un objet qui a une position exprimée dans un repère cartésien (x; y).  Chaque tortue connaît sa propre position et ignore la position des autres tortues.
Chaque tortue a une orientation qui lui est propre et qui est exprimée comme un angle en radians (un nombre approché).
Chaque tortue possède un stylo qui peut être soit levé, soit baissé. Le fait qu'une tortue baisse ou lève son stylo n'a aucune influence sur le stylo des autres tortues. Attention à bien choisir le type de chacun des champs.
Par défaut, la tortue est créée à la position (0; 0). L'orientation et la position du stylo par défaut sont déterminés en fonction d'un champ statique. Quels sont les constructeurs que vous pouvez proposer ?
Définir une ou des opérations (méthodes) pour permettre de lever et de baisser le stylo ?
L'opération la plus simple est l'opération pour tourner à gauche d'un angle delta. Attention les commandes à la tortue sont exprimées en degrés alors que le champ est donné en radian. Ex: léa.gauche(90); pour dire à la tortue léa de tourner de 90° à gauche.
Tourner à droite ne devrait pas vous poser de problèmes si vous savez tourner à gauche !
Définir une opération pour faire avancer la tortue d'une distance d. Le paramètre d est exprimé en nombre de pixels.  Ex: léa.avance(50); indique à la tortue léa d'avancer de 50 pixels. Si vous vous demandez dans quelle direction, retournez à l'étape 1.
Reculer est trivial lorsqu'on sait avancer, non ?
Pour être sûr que tout fonctionne bien, faire parcourir à une tortue un carré de côté 50 et assurez vous qu'elle revient bien à sa position initiale.
