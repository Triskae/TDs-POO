package fr.unice.bar;

import java.util.Comparator;

public class TestNoeud {
    public static void main(String[] args) {
        //Noeud noeud = new Noeud(1, new Noeud(1, new Noeud(2), new Noeud(2)), new Noeud(1, new Noeud(2), new Noeud(2)));
        //System.out.println(noeud);
        ComparateurEntier c = new ComparateurEntier();
        ArbreBinaire arbreBinaire = new ArbreBinaire(5,c);
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
        //arbreBinaire.afficher(arbreBinaire.racine);
    }
}
