package fr.unice.bar;

public class TestNoeud {
    public static void main(String[] args) {
        //Noeud noeud = new Noeud(1, new Noeud(1, new Noeud(2), new Noeud(2)), new Noeud(1, new Noeud(2), new Noeud(2)));
        //System.out.println(noeud);

        ArbreBinaire arbreBinaire = new ArbreBinaire(5);
        arbreBinaire.inserer(3, arbreBinaire.racine);
        arbreBinaire.inserer(6, arbreBinaire.racine);
        arbreBinaire.inserer(2, arbreBinaire.racine);
        arbreBinaire.inserer(2, arbreBinaire.racine);
        arbreBinaire.inserer(4, arbreBinaire.racine);
        arbreBinaire.inserer(5, arbreBinaire.racine);
        arbreBinaire.inserer(3, arbreBinaire.racine);
        arbreBinaire.inserer(8, arbreBinaire.racine);
        System.out.println(arbreBinaire);
        System.out.println(arbreBinaire.rechercher(2, arbreBinaire.racine));
        arbreBinaire.afficher(arbreBinaire.racine);
    }
}
