package it.zucchetti.overload;

import java.util.Scanner;

public class mainNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		int n2;
		double n3;
		double n4;
		
		Scanner sc = new Scanner(System.in);
		Numero n = new Numero();
		
		System.out.println("Inserire int");
		n1 = sc.nextInt();
		System.out.println("Inserire int");
		n2 = sc.nextInt();
		
		System.out.println("Inserire double");
		n3 = sc.nextDouble();
		System.out.println("Inserire double");
		n4 = sc.nextDouble();
		
		System.out.println("Somma int: "+n.somma(n1, n2));
		System.out.println("Diff double: "+n.differenza(n3, n4));
		
		System.out.println("\nSomma double: "+n.somma(n3, n4));
		System.out.println("Diff int: "+n.differenza(n1, n2));


	}

}
