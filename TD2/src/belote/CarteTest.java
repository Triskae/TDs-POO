package belote;

import java.util.ArrayList;

public class CarteTest {
    public static void main(String[] args) {
        Couleur atout = Utils.tirerAtout();

        Carte c1 = new Carte(true, Couleur.COEUR, Valeur.VALET);
        System.out.println(c1.calculerValeur());

        ArrayList main4Cartes = new ArrayList();
        main4Cartes.add(new Carte(false, Couleur.COEUR, Valeur.VALET));
        main4Cartes.add(new Carte(false, Couleur.PIQUE, Valeur.DIX));
        main4Cartes.add(new Carte(false, Couleur.CARREAU, Valeur.DAME));
        main4Cartes.add(new Carte(false, Couleur.TREFLE, Valeur.AS));

        System.out.println(Utils.CarteLaPlusForte(main4Cartes));
    }
}
