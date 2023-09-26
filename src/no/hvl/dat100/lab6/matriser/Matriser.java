package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] rad : matrise) {
			System.out.print("{");

			for (int tall : rad) {
				System.out.print(tall);

				if (tall != rad[rad.length - 1])
					System.out.print(", ");
			}

			System.out.println("}");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String tekst = "";
		for (int[] rad : matrise) {
			for (int tall : rad)
				tekst += tall + " ";

			tekst += "\n";
		}
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++)
				nymatrise[i][j] = matrise[i][j] * tall;
		}

		return nymatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean lik = true;

		outer: for (int i = 0; i < a.length; i++) {
			if (a.length != b.length | a[i].length != b[i].length) {
				lik = false;
				break;
			}

			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					lik = false;
					break outer;
				}
			}
		}
		return lik;
	}

	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nymatrise = new int[matrise[0].length][matrise.length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++)
				nymatrise[j][i] = matrise[i][j];
		}

		return nymatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int rad = a.length;
		int kolonne = b[0].length;
		
		int[][] c = new int[rad][kolonne];

		for (int i = 0; i < rad; i++)
			for (int j = 0; j < kolonne; j++)
				for (int k = 0; k < kolonne; k++)
					c[i][j] += a[i][k] * b[k][j];

		return c;
	}
}
