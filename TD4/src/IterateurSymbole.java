import java.awt.*;

public class IterateurSymbole {

    private static int position = 10;

    public IterateurSymbole(String chaine, Graphics g) {
        char [] encodedString = chaine.toCharArray();

        Symbole espaceBlanc = new Symbole('0', position, 10, g, Nature.ESPACE);
        position += espaceBlanc.getWidth();
        for (int i = 0; i < encodedString.length; i++) {
            if (i % 2 == 0) {
                Symbole symboleCourant = new Symbole(encodedString[i], position, 10, g, Nature.BARRE);
                position += symboleCourant.getWidth();
            } else {
                Symbole symboleCourant = new Symbole(encodedString[i], position, 10, g, Nature.ESPACE);
                position += symboleCourant.getWidth();
            }
        }
    }
}
