package tortue;

public class Main {
    public static void main(String[] args) {
        Tortue t = new Tortue();

        System.out.println(t);
        t.avancer(50);
        t.goRight(90);
        t.avancer(50);
        t.goRight(90);
        t.reculer(50);
        t.goRight(90);
        t.reculer(50);
        System.out.println(t);
    }
}
