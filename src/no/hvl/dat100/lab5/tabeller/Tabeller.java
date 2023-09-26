package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i] + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tekst = "[";

		for (int i = 0; i < tabell.length; i++) {
			tekst += tabell[i];
			if (i == tabell.length - 1)
				break;
			tekst += ",";
		}
		return tekst + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++)
			sum += tabell[i];

		sum = 0;
		int i = 0;

		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}

		sum = 0;

		for (int tall : tabell)
			sum += tall;

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;

		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				finnes = true;
				break;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int res = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				res = i;
				break;
			}
		}
		return res;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] revTab = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++)
			revTab[tabell.length - 1 - i] = tabell[i];

		return revTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean res = true;

		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i + 1] < tabell[i])
				res = false;
		}

		return res;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nytabell = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++)
			nytabell[i] = tabell1[i];

		for (int i = 0; i < tabell2.length; i++)
			nytabell[i + tabell1.length] = tabell2[i];

		return nytabell;
	}
}
