package it.zucchetti.studente;

import java.util.Scanner;

public class mainStudente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Studente s = new Studente();
		
		System.out.print("Inserisci nome: ");
		s.setNome(sc.nextLine());
		
		System.out.print("Inserisci cognome: ");
		s.setCognome(sc.nextLine());
		
		System.out.print("Inserire eta: ");
		s.setEta(sc1.nextInt());
		
		System.out.print("Inserire voto orale: ");
		s.setVotoOrale(sc1.nextInt());
		
		System.out.print("Inserire voto scritto: ");
		s.setVotoScritto(sc1.nextInt());
		
		System.out.println();
		
		s.stampaStudente();
		s.risultatoEsame();
	}

}
