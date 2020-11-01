package it.zucchetti.cicli;

public class Intero {

	protected void stampaInteri(int fine) {

		for (int i = 0; i < fine; i++) {
			System.out.println(i);
		}

	}

	protected void stampaInverso(int inizio) {
		for (int i = inizio; i >= 0; i--) {
			if ((i % 2) == 0) {
				System.out.println(i);
			}
		}
	}
	
	protected void tabellina(int numero) {
		int ris = 0;
		for(int i = 0;i < 10; i++) {
			ris = i * numero;
			System.out.println(ris);
		}
	}
	
}
