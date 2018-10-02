package belote;

public class Carte {

    private boolean atout;
    private Couleur couleur;
    private Valeur valeur;

    public Carte(boolean atout, Couleur couleur, Valeur valeur) {
        this.atout = atout;
        this.couleur = couleur;
        this.valeur = valeur;
    }

    int calculerValeur() {
        switch(this.valeur) {
            case AS: return 11;
            case ROI: return 4;
            case DAME: return 3;
            case VALET:
                if(!this.atout) return 2;
                return 20;
            case SEPT: return 0;
            case HUIT: return 0;
            case NEUF:
                if(!this.atout) return 0;
                return 14;
            case DIX: return 10;
            default: return 0;
        }
    }

    @Override
    public String toString() {
        return "belote.Carte{" +
                "atout=" + atout +
                ", couleur=" + couleur +
                ", valeur=" + valeur +
                '}';
    }
}
