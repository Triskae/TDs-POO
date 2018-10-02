package random;

import java.util.Random;

public class NombresAleatoires {

    public static void main(String[] args) {
        NombresAleatoires n = new NombresAleatoires();

        System.out.println("Avec Math.random()");
        System.out.println(n.generer0aet50());
        System.out.println(n.genererMoins20et50());
        System.out.println(n.genererAetB(0, 5));
        System.out.println(n.genererAetBpair(0, 100));
        System.out.println(n.genererAetBMultipleN(0, 20, 4));
        System.out.println("Avec la classe Random");
        System.out.println(n.generer0et5RandomClass());
        System.out.println(n.genererMoins20et50RandomClass());
        System.out.println(n.genererAetBRandomClass(0, 5));
        System.out.println(n.genererAetBpairRandomClass(0, 100));
        System.out.println(n.genererAetBMultipleNRandomClass(0, 20, 4));
    }

    private int generer0aet50() {
        return (int) (Math.random() * 50);
    }

    private int genererMoins20et50() {
        return (int) (Math.random() * ((50 - (-19) + 1)) + (-19));
    }

    private int genererAetB(int a, int b) {
        return (int) (Math.random() * ((a - b) + 1) + b);
    }

    private int genererAetBpair(int a, int b) {
        return (int) (Math.random() * ((b - a) / 2)) * 2;
    }

    private int genererAetBMultipleN(int a, int b, int n) {
        return (int) (Math.random() * ((b - a) / n)) * n;
    }

    private int generer0et5RandomClass() {
        return new Random().nextInt(50);
    }

    private int genererMoins20et50RandomClass() {
        return new Random().nextInt(50 + 1 - (-19)) + (-19);
    }

    private int genererAetBRandomClass(int a, int b) {
        return new Random().nextInt(b + 1 - a) + a;
    }

    private int genererAetBpairRandomClass(int a, int b) {
        int r = new Random().nextInt(b + 1 - a) + a;
        if (r % 2 != 0) {
            return genererAetBpairRandomClass(a, b);
        } else {
            return r;
        }
    }

    private int genererAetBMultipleNRandomClass(int a, int b, int n) {
        int r = new Random().nextInt(b + 1 - a) + a;
        if (r % n != 0) {
            return genererAetBMultipleNRandomClass(a, b, n);
        } else {
            return r;
        }
    }
}
