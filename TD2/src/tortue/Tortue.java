package tortue;

public class Tortue {

    public boolean leve;
    private double x, y, orientation;

    private static double defaultOrientation;
    public static boolean defaultLeve;


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
        this.orientation += (delta * Math.PI)/100;
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
}
