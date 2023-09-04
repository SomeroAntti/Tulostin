
public class Tulostusohjelma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nimi = "Antti";
		float luku1 = 5;
		float luku2 = 2;
		float tulo = luku1 * luku2;
		float erotus = luku1 - luku2;
		float summa = luku1 + luku2;
		float jako = luku1 / luku2;
		
		System.out.println("Hei olen Tulostin-ohjelma");
		System.out.println("Ohjelman tekijä: " + nimi);
		System.out.println(luku1);
		
		System.out.printf("Luku1-muuttujan arvo on %.0f\n", luku1);
		System.out.printf("Luku2-muuttujan arvo on %.0f\n", luku2);
		System.out.printf("%.0f * %.0f = %.0f\n", luku1, luku2, tulo);
		System.out.printf("%.0f - %.0f = %.0f\n", luku1, luku2, erotus);
		System.out.printf("%.0f + %.0f = %.0f\n", luku1, luku2, summa);
		System.out.printf("%.0f / %.0f = %.1f\n", luku1, luku2, jako);

	}

}
