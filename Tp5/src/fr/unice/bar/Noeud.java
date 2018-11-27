package fr.unice.bar;

public class Noeud {

    private int valeur;
    private Noeud gauche, droite;

    public Noeud(int valeur) {
        this.valeur = valeur;
    }

    public Noeud(int valeur, Noeud gauche, Noeud droite) {
        this.valeur = valeur;
        this.gauche = gauche;
        this.droite = droite;
    }

    public int getValeur() {
        return valeur;
    }

    public Noeud getGauche() {
        return gauche;
    }

    public Noeud getDroite() {
        return droite;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setGauche(Noeud gauche) {
        this.gauche = gauche;
    }

    public void setDroite(Noeud droite) {
        this.droite = droite;
    }

    @Override
    public String toString() {
        return "Noeud{" +
                "valeur=" + valeur +
                ", gauche=" + gauche +
                ", droite=" + droite +
                '}';
    }
}
