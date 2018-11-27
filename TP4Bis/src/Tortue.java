import java.applet.Applet;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

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

    public Tortue(double initX, double initY) {
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

    public void avancer(double distance, Graphics g) {

        double posInitialX = this.x, posInitialY = this.y;

        this.x += distance * Math.cos(this.orientation);
        this.y += distance * Math.sin(this.orientation);

        if(leve) listCommands.add(new DrawLine(posInitialX, posInitialY, this.x, this.y, g));
    }

    public void reculer(double distance, Graphics g) {
        avancer(-distance, g);
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
        Tortue t = new Tortue(50, 50);


        double posInitialX = t.x;
        double posInitialY = t.y;

        t.changerPosStylo();

//        for (int i = 0; i < 10000; i++) {
//            double random1 = Math.random()*100-10;
//            double random2 = Math.random()*20-10;
//
//            t.avancer(random1, g);
//            t.goRight(random1);
//        }

        t.avancer(50, g);
        t.goRight(-90);
        t.avancer(50, g);
        t.goRight(-90);
        t.avancer(50, g);
        t.goRight(-90);
        t.avancer(50, g);
    }
}
