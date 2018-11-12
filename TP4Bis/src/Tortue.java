import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;

public class Tortue extends Applet {

    public boolean leve;
    private double x, y, orientation;

    private static double defaultOrientation;
    public static boolean defaultLeve;

    public ArrayList<Command> listCommands = new ArrayList();


    public Tortue() {
        leve = defaultLeve;
        orientation = defaultOrientation;
        this.x = 0;
        this.y = 0;
    }

    public Tortue(boolean leve, double orientation) {
        this.leve = leve;
        this.x = 0;
        this.y = 0;
        this.orientation = orientation;
    }

    public void changerPosStylo() {
        leve = !leve;
    }

    public void goLeft (double delta) {
        this.orientation += (delta * Math.PI)/180;
    }

    public void goRight (double delta) {
        goLeft(-delta);
    }

    public void avancer(double distance) {
        this.x += distance + Math.cos(this.orientation);
        this.y += distance + Math.sin(this.orientation);
    }

    public void reculer(double distance) {
        avancer(-distance);
    }

    @Override
    public String toString() {
        return "Tortue{" +
                "leve=" + leve +
                ", x=" + x +
                ", y=" + y +
                ", orientation=" + orientation +
                '}';
    }

    public void paint(Graphics g) {
        Tortue t = new Tortue();
        int posInitialX = t.getX();
        int posInitialY = t.getY();
        t.goRight(45.0);
        t.avancer(10);

        listCommands.add(new DrawLine(posInitialX, posInitialY, t.getX, 10));
    }
}
