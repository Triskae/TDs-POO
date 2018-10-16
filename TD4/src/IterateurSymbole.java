import java.awt.*;

public class IterateurSymbole {


    public IterateurSymbole(String chaine, Graphics g) {
        char[] charArray = chaine.toCharArray();
        int position = 10;
        for (int i = 0; i < charArray.length; i++) {
            if (i%2 == 0) {
                Symbole symboleCourant = new Symbole(charArray[i], position, 10, g, Nature.BARRE);
                position += symboleCourant.getWidth();
            } else {
                Symbole symboleCourant = new Symbole(charArray[i], position, 10, g, Nature.ESPACE);
                position += symboleCourant.getWidth();
            }
        }
    }
}
