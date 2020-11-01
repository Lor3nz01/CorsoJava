package it.zucchetti.corsoJava;

import java.util.Scanner;

public class mainCalcolatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scelta;
		double n1 = 0;
		double n2 = 0;
		double ris = 0;

		Calcolatrice c = new Calcolatrice();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);

		System.out.print("Inserire primo numero: ");
		n1 = sc.nextDouble();
		System.out.print("Inserire secondo numero: ");
		n2 = sc.nextDouble();
		System.out.println("1.add;\n2.sot\n3.mol\n4.div");
		scelta = sc.nextInt();

		switch (scelta) {
			case 1: ris = c.addizione(n1, n2);
				break;
			case 2: ris = c.sottrazione(n1, n2);
				break;
			case 3: ris = c.moltiplicazione(n1, n2);
				break;
			case 4: ris = c.divisione(n1, n2);
				break;
		}
		System.out.println("risultato: " + ris);

	}

}
