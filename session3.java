
public class Main {

	public static void main(String[] args) {
		String[] animale = { "caine", "pisica", "tigru", "sarpe", "peste", "veverita" };
		// verificati cuvintele din vectorul animale astfel:
		// Daca este animal domestic (Caine, Pisica, Peste) - afisati pe ecran
		// animale[x] (pozitia curenta) " este animal domestic"
		// Daca ne aflam in cazul Tigru sau Sarpe - afisati pe ecrane animale[x]
		// " este animal salbatic"
		// In orice alt caz afisati "Nu stim ce tip de animal este " +
		// animale[x]
		for (int i = 0; i <= 5; i++) {

			if (animale[i] == "caine" || animale[i] == "pisica" || animale[i] == "peste")
				System.out.println(animale[i] + " este domestic");
			else {
				if (animale[i] == "tigru" || animale[i] == "sarpe")
					System.out.println(animale[i] + " este salbatic");
				else
					System.out.println("nu stim ce tip de animal este " + animale[i]);
			}
		}

		int a = 9;
		// Folosind o conditionala cu conditii multiple, daca numarul stocat in
		// variabila a este mai mic decat 10 si mai mare decat 8, afisati
		// Textul "Numarul este bun", altfel, afisati textul "Numarul nu este
		// bun"

		if (a < 10 && a > 8)
			System.out.println(" numarul este bun ");
		else {
			System.out.println(" numarul nu este bun");
		}

		int n = 20;
		double sum = 0;
		// Calculati si afisati suma armonica. Formula este: harmonic(x) = 1 +
		// 1/2 + 1/3 + 1/4 + ...+ 1/n
		// Daca aceasta este mai mare decat 1.3 sau este mai mica decat 3,
		// afisati patratul acesteia
		for (double i = 1; i <= n; i++) {
			sum = sum + 1 / i;
		}
		if (sum > 1.3 || sum < 3) {
			System.out.println(sum * sum);
		}

		// Afisati, folosind 2 structuri repetitive, un patrat de 5/5, care
		// contine doar elemente "#".
		// Apoi, folosind acelasi patrat, inlocuiti elementele de pe diagonala
		// principala cu "*";

		for (int i = 0; i < 5; i = i + 1) {
			for (int j = 0; j < 5; j = j + 1) {
				if (i == j)
					System.out.print(" * ");
				else
					System.out.print(" # ");
			}

			System.out.println(" ");
		}

		// Construiti si afisati tabla inmultirii lui 9
		/*
		 * * | 1 2 3 4 5 6 7 8 9 ------------------------------- 1 | 1 2 3 4 5 6
		 * 7 8 9 2 | 2 4 6 8 10 12 14 16 18 3 | 3 6 9 12 15 18 21 24 27 4 | 4 8
		 * 12 16 20 24 28 32 36 5 | 5 10 15 20 25 30 35 40 45 6 | 6 12 18 24 30
		 * 36 42 48 54 7 | 7 14 21 28 35 42 49 56 63 8 | 8 16 24 32 40 48 56 64
		 * 72 9 | 9 18 27 36 45 54 63 72 81
		 * 
		 * 
		 */

		for (int i = 0; i <= 9; i = i + 1) {
			for (int j = 0; j <= 9; j = j + 1) {
				if (i * j == 0)
					System.out.print(" - ");
				else
					System.out.print(i * j + " ");

			}
			System.out.println(" ");
		}

		int m = 1234994;
		// Calculati si afisati inversul numarului m (4994321).

		while (m > 0) {
			System.out.print(m % 10);
			m = m / 10;

		}
		// Formati un numar nou, utilizand doar cifrele pare ale numarului m.
		// Daca noul numar are un numar impar de cifre si ele sunt mai mici
		// decat 9 (toate), afisati "OK", altfel, afisati "KO"
		m = 12349944;
		int nrCifre = 0;
		int z = 0;
		while (m > 0) {
			int ultimaCifra = m % 10;
			if (ultimaCifra % 2 == 0 && ultimaCifra < 9) {
				z = z * 10 + m % 10;
				nrCifre = nrCifre + 1;
			}
			m = m / 10;
		}

		System.out.println(" ");

		System.out.println(z);

		if (nrCifre % 2 != 0)
			System.out.println("ok");
		else
			System.out.println("ko");

		int h = 3;
		int min = 30;
		// Mai sus aveti 2 variabile care semnifica un cronometru care porneste
		// de la 3 ore, 30 de minute.
		// Afisati, folosind structuri repetitive, toate iteratiile prin care
		// trece acest cronometru (sub forma h:min), pana ajunge la 2 ore si 50
		// de minute

		while (h > 2 || min >= 50) {
			if (min < 10)
				System.out.println(h + ":0" + min);
			else
				System.out.println(h + ":" + min);
			if (min == 0) {
				h = h - 1;
				min = 59;

			} else
				min = min - 1;
		}

		// Gasiti cea mai mare cifra a numarului 9 factorial

		int factorial = 1;
		for (int i = 1; i <= 4; i++) {
			factorial = factorial * i;
		}
		int max = 0;
		while (factorial > 0) {
			if (factorial % 10 > max)
				max = factorial % 10;
			factorial = factorial / 10;
		}
		System.out.println(max);

		// Formati un numar din prima si ultima cifra a ariei unui triunghi
		// dreptunghic cu catetele egale cu 18;

		int x = 4;
		int y = 20;
		/*
		 * Folosind operatorul conditional, calculati de cate sticle de cate x
		 * litri fiecare este nevoie pentru a umple un vas de y litri. Exemplu:
		 * daca x=4 si y=20 , atunci e nevoie de 5 sticle daca x=4 si y=23 ,
		 * atunci e nevoie de 6 sticle
		 */
		System.out.println(" SUNT UN JM3K3R");
		if (y % x == 0) {

			System.out.println(y / x);

		} else
			System.out.println(y / x + 1);

		int j = 27;
		// Se citeste un numar natural j. Sa se determine daca este cub perfect.

		int cub = 2;
		while (cub * cub * cub <= j) {
			if (cub * cub * cub == j) {

				System.out.println(cub);

			}
			cub = cub + 1;
		}

		int k = 13;
		/*
		 * Se afiseze pe ecran un triunghi de forma:
		 * 
		 ** 
		 *** 
		 * ..... ...* (k caractere *)
		 * 
		 */
	}

}