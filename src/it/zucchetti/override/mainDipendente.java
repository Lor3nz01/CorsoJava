package it.zucchetti.override;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainDipendente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Dipendente> dip = new ArrayList<Dipendente>();
		Dipendente d = new Dipendente();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		for(int i=0; i < 5; i++) {
			System.out.print("Inserire matricola: ");
			d.matricola = sc.nextLine();
			System.out.print("Inserire retribuzione oraria: ");
			d.retribuzioneOraria = sc1.nextInt();
			
			dip.add(d);
		}
		
		System.out.println(dip);
		
	}

}
