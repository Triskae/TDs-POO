
public class Vecteur2D {

    private double x, y;

    Vecteur2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Vecteur2D multiplierParScalaire(double k) {
        Vecteur2D v = new Vecteur2D(this.getX() * k, this.getY() * k);
        return v;
    }

    public double prodScalaire(Vecteur2D v2) {
        return this.getX() * v2.getX() + this.getY() * v2.getY();
    }

    public Vecteur2D transpose() {
        Vecteur2D temp = new Vecteur2D(this.getY(), this.getX());
        return temp;
    }

    public Vecteur2D addition(Vecteur2D v2) {
        double x1, x2;
        x1 = this.getX() + v2.getX();
        x2 = this.getY() + v2.getY();
        Vecteur2D temp = new Vecteur2D(x1, x2);
        return temp;
    }

    @Override
    public String toString() {
        return "Vecteur2D =<" + x + " , " + y + ">";
    }



}
