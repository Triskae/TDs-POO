import java.util.Arrays;

public abstract class test {

	public static void main(String[] args) {
		Vecteur2D v = new Vecteur2D(1,2);
		Vecteur2D v1 = new Vecteur2D(1,2);
		System.out.println(v.toString());
		System.out.println(v.prodScalaire(v1));
		System.out.println(v.transpose());
		System.out.println(v.addition(v1));
		
		
	}
}
