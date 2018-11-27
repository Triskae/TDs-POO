package fr.unice.bar;

public class ArbreBinaire {
    Noeud racine;

    public ArbreBinaire(int valeur) {
        this.racine = new Noeud(valeur);
    }

    public ArbreBinaire(Noeud racine, Noeud gauche, Noeud droite) {
        this.racine = racine;
    }

    Noeud inserer(int value, Noeud noeud) {
        if (noeud == null)
            return new Noeud(value, null, null);
        if (value < noeud.getValeur())
            noeud.setGauche(inserer(value, noeud.getGauche()));
        else if (value > noeud.getValeur())
            noeud.setDroite(inserer(value, noeud.getDroite()));
        return noeud;
    }

    boolean rechercher(int valeur, Noeud noeud) {
        if (noeud == null) return false;
        if(valeur == noeud.getValeur()) return true;
        if (valeur <= noeud.getValeur()) return rechercher(valeur, noeud.getGauche());
        else return rechercher(valeur, noeud.getDroite());
    }
}
