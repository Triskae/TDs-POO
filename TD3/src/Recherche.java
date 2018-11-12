import java.util.Arrays;

public class Recherche {

    public static int recherche(int[] t1, int e) {
        int indice = -1;
        for (int i = 0; i < t1.length; i++) {
            if (t1[i] == e) {
                indice = i;
            }
        }
        return indice;
    } // Le pire des cas est que l'élément cherché soit le dernier élément du tableau donc le pire cout est la taille du tableau soit n

    public static int rechercheDichotomique(int[] t1, int e) {
        //Arrays.sort(t1);
        int milieu = t1.length / 2;
        if (t1.length == 0) return -1;
        if (t1[milieu] == e) return milieu;
        while (t1[milieu] != e) {
            if (t1[milieu] < e) {
                milieu = (t1.length + milieu) / 2;
            }

            if (t1[milieu] > e) {
                milieu = milieu / 2;
            }
        }
        return milieu;
    }

    public static void main(String[] args) {
        int[] t1 = {1, 2, 5, 8, 4, 4, 1, 3, 5, 4};
        System.out.println(recherche(t1, 8));
        Arrays.sort(t1);
        System.out.println(rechercheDichotomique(t1, 2));
    }
}
