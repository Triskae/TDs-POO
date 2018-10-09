
public class Vecteur {


    public static void main(String[] args) {
        Vecteur vecteur = new Vecteur(1, 1, 2, 3, 3);

        int []tab = new int [5];


    }

	int vecteur[];

	public Vecteur(int ... valeurs) {

	}

	public Vecteur (int dim, int [] composantes) throws ExecptionVecteur {
	    if (dim != 0 && composantes.length == 0) {
            this.vecteur = new int [dim];
        } else if (dim < composantes.length) {
	        throw new ExecptionVecteur("La dim ne doit pas être inférieur au nombres d'éléments");
        } else {
	        this.vecteur = new int [dim];
	        for (int i = 0; i < composantes.length; i++) {
	            this.vecteur[i] = composantes[i];
            }
        }
    }
}
