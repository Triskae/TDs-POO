package fr.unice.bar;

<<<<<<< HEAD
public class ArbreBinaire{
    Noeud racine;
    ComparateurEntier c;
=======
import java.util.Comparator;

public class ArbreBinaire {
    Noeud racine;
    Comparator comparator;
>>>>>>> 590ce794009ce5d584f5c745032d735942d0e24c

    public ArbreBinaire(int valeur, ComparateurEntier c) {
        this.racine = new Noeud(valeur);
        this.c = c;
    }

<<<<<<< HEAD
    public ArbreBinaire(Noeud racine, Noeud gauche, Noeud droite, ComparateurEntier c) {
        this.racine = racine;
        this.c = c;
=======
    public ArbreBinaire(Noeud racine, Noeud gauche, Noeud droite, Comparator comparator) {
        this.racine = racine;
        this.comparator = comparator;
>>>>>>> 590ce794009ce5d584f5c745032d735942d0e24c
    }

    Noeud inserer(int value, Noeud noeud) {
        if (noeud == null)
            return new Noeud(value, null, null);
        if (c.compare(value, noeud.getValeur())<=0) {
            noeud.setGauche(inserer(value, noeud.getGauche()));
        } else if (c.compare(value, noeud.getValeur())>0)
            noeud.setDroite(inserer(value, noeud.getDroite()));
        return noeud;
    }

    boolean rechercher(int valeur, Noeud noeud) {
        if (noeud == null) return false;
        if(c.compare(valeur, noeud.getValeur())==0) return true;
        if (c.compare(valeur, noeud.getValeur())<0) return rechercher(valeur, noeud.getGauche());
        else return rechercher(valeur, noeud.getDroite());
    }


}
