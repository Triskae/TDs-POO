import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    public void paint(Graphics g) {
        IterateurSymbole iterateurSymbole = new IterateurSymbole("010010100", g);
    }
}
