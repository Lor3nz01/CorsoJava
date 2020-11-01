package it.zucchetti.overload;

public class Stringa {

	public String concatenizzaStringhe(String a, String b) {
		return a.concat(b);
	}
	
	public String concatenizzaStringhe(String a, String b, String c) {
		return concatenizzaStringhe(a,b).concat(c);
	}
	
}
