package belote;

import java.util.ArrayList;
import java.util.Random;

public class Utils {

    static Couleur tirerAtout(){

        switch (new Random().nextInt(4)) {
            case 1: return Couleur.TREFLE;
            case 2: return Couleur.CARREAU;
            case 3: return Couleur.PIQUE;
            case 4: return Couleur.COEUR;
            default: return null;
        }
    }

    static Carte CarteLaPlusForte (ArrayList<Carte> main) {
        Carte carteLaPlusForte = main.get(0);
        for (Carte carte : main) {
            if (carte.calculerValeur() > carteLaPlusForte.calculerValeur()) {
                carteLaPlusForte = carte;
            }
        }
        return carteLaPlusForte;
    }
}
