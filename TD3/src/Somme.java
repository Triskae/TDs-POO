import java.util.Arrays;

public class Somme {

	private static int somme = 0;

	public static void main (String[] args) {
	    Arrays.sort(args);

        for (String arg : args) {
            System.out.println(arg.toString());
        }

	    System.out.println("Calcul de la somme \n");
        for (String arg : args) {
            somme += Integer.parseInt(arg);
        }
	    System.out.println(somme);
	}

}
