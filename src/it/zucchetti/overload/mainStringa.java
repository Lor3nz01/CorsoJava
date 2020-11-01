package it.zucchetti.overload;

import java.util.Scanner;

public class mainStringa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1;
		String str2;
		String str3;
		
		Scanner sc = new Scanner(System.in);
		Stringa s = new Stringa();
		
		System.out.println("Inserire stringa");
		str1 = sc.nextLine();
		
		System.out.println("Inserire stringa");
		str2 = sc.nextLine();
		
		System.out.println("Inserire stringa");
		str3 = sc.nextLine();
		
		System.out.println(s.concatenizzaStringhe(str1,str2));
		System.out.println(s.concatenizzaStringhe(str1,str2,str3));
		
	}

}
