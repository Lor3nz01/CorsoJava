package it.zucchetti.corsoJava;

import java.util.Scanner;

public class Fibonacci {
	
	  public int fibonacci(int n) {
		    if (n == 0)
		      return 0;
		    else if (n == 1)
		      return 1;
		    else {
		      int f1 = fibonacci(n-1);
		      int f2 = fibonacci(n-2);
		      int ris = f1 + f2;
		      return ris;
		    }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sequenza = 0;
		int n = 0;
		Fibonacci f = new Fibonacci();
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Inserire numero: ");
		n = sc.nextInt();
		sequenza = f.fibonacci(n);
		
		System.out.println(sequenza);
		

	}

}
