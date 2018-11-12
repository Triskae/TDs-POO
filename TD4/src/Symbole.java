import java.awt.*;

public class Symbole {

    Epaisseur epaisseur;
    int test;


    public Symbole(char symbole, int x, int y, Graphics g, Nature nature) {
        if (symbole == '0') {
            nature.setCouleur(g);
            epaisseur = Epaisseur.ETROIT;
            epaisseur.drawSymbole(g, x, y);
        } else if (symbole == '1'){
            nature.setCouleur(g);
            epaisseur = Epaisseur.LARGE;
            epaisseur.drawSymbole(g, x, y);
        }
    }


    public int getWidth() {
        return  epaisseur.width;
    }


}
