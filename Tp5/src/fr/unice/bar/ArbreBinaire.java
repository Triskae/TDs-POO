package fr.unice.bar;

public class ArbreBinaire{
    Noeud racine;
    ComparateurEntier c;

    public ArbreBinaire(int valeur, ComparateurEntier c) {
        this.racine = new Noeud(valeur);
        this.c = c;
    }

    public ArbreBinaire(Noeud racine, Noeud gauche, Noeud droite, ComparateurEntier c) {
        this.racine = racine;
        this.c = c;
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
