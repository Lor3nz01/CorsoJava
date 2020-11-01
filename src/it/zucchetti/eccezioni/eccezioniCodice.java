package it.zucchetti.eccezioni;

public class eccezioniCodice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] t = null;
		String s=null;
		
		try {
			t[0] = 7; 
		}catch(NullPointerException e) {
			System.out.println("Errore! array null");
		}
		
		try {
			int l = s.length(); 
		}catch(NullPointerException e) {
			System.out.println("Errore");
		}

	}

}
