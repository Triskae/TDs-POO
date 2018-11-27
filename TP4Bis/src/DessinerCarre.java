import java.awt.*;

public class DessinerCarre implements Command {

    private final double initX;
    private final double initY;

    public DessinerCarre(double posInitX, double posInitY, double longeur, Graphics g) {
        this.initX = posInitX;
        this.initY = posInitY;
        dessiner(g);
    }

    @Override
    public void dessiner(Graphics graph) {

    }
}
