import java.util.Arrays;

public class Vecteur {

    private double dimensions[];

    private Vecteur(double... composantes) throws ExceptionVecteur {
        if (composantes.length > 2) {
            dimensions = new double[composantes.length];
            System.arraycopy(composantes, 0, dimensions, 0, composantes.length);
        } else {
            throw new ExceptionVecteur();
        }
    }

    private Vecteur(int dim, int[] composantes) throws ExceptionVecteur {
        if (dim != 0 && composantes.length == 0) {
            this.dimensions = new double[dim];
            for (int i = 0; i < dim; i++) {
                this.dimensions[i] = 0;
            }
        } else if (dim < composantes.length) {
            throw new ExceptionVecteur();
        } else {
            this.dimensions = new double[dim];
            System.arraycopy(composantes, 0, this.dimensions, 0, composantes.length);
        }
    }

    public double prodScalaire(Vecteur v) {
        double somme = 0;
        if (this.dimensions.length > v.dimensions.length) {
            for (int i = 0; i < v.dimensions.length; i++) {
                somme += this.dimensions[i] * v.dimensions[i];
            }
        } else {
            for (int i = 0; i < this.dimensions.length; i++) {
                somme += this.dimensions[i] * dimensions[i];
            }
        }
        return somme;
    }

    public Vecteur transpose() throws ExceptionVecteur {
        double[] temp = new double[dimensions.length];
        for (int i = 0; i < this.dimensions.length / 2; i++) {
            int dernElem = dimensions.length - i - 1;
            double tampon = temp[i];
            temp[i] = temp[dernElem];
            temp[dernElem] = tampon;
        }
        Vecteur v = new Vecteur(temp);
        return v;
    }

    public static Vecteur addition(Vecteur v2, Vecteur v1) throws ExceptionVecteur {
        double[] temp;
        if (v1.dimensions.length > v2.dimensions.length) {
            temp = new double[v1.dimensions.length];
        } else {
            temp = new double[v2.dimensions.length];
        }
        Vecteur v = new Vecteur(temp);
        return v;
    }

    public static void main(String[] args) throws ExceptionVecteur {
        Vecteur v1 = new Vecteur(1, 5, 4);
        System.out.println(Arrays.toString(v1.dimensions));
        Vecteur v2 = new Vecteur(4, new int[]{});
        System.out.println(Arrays.toString(v2.dimensions));
    }
}
