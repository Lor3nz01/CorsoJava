package it.zucchetti.cicli;

import java.util.Scanner;

public class mainNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		Intero i = new Intero();
		
		System.out.print("Inserire intero: ");
		numero = sc.nextInt();
		
		System.out.println("Stampa numeri interi");
		i.stampaInteri(numero);
		
		System.out.println("Stampa numeri pari in ordine decrescente");
		i.stampaInverso(numero);
		
		System.out.println("Tabellina");
		i.tabellina(numero);
		
	}

}
