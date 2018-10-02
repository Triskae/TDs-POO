public class Polynome {

    private double a, b, c;


    public Polynome(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double evaluerPolynome(double x) {
        return (a * Math.pow(x, 2)) + (b * x) + c;
    }


    public double calculerDiscriminant() {
        return (Math.pow(b, 2) - 4 * a * c);
    }


    public double calculerRacineReel1() {
        double delta = calculerDiscriminant();

        if (delta < 0) return Double.NaN;
        else return (((-b) - Math.sqrt(delta)) / 2 * a);
    }

    public double calculerRacineReel2() {
        double delta = calculerDiscriminant();

        if (delta < 0) return Double.NaN;
        else return (((-b) + Math.sqrt(delta)) / 2 * a);
    }


    public Complexe calculerRacine1() {
        double delta = calculerDiscriminant();
        if (delta > 0) return new Complexe(calculerRacineReel1(), 0);
        else return new Complexe((-b / 2 * a), Math.sqrt(-delta));
    }

    public Complexe calculerRacine2() {
        double delta = calculerDiscriminant();
        if (delta > 0) return new Complexe(calculerRacineReel2(), 0);
        else return new Complexe((-b / 2 * a), -Math.sqrt(-delta));
    }
}
