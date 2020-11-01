package it.zucchetti.ereditarieta;

public class NonAlimentari extends Prodotto {
	
	private String[] materiale;

	public NonAlimentari(String codice, String descrizione, double prezzo) {
		super(codice, descrizione, prezzo);
	}

	public NonAlimentari(String codice) {
		super(codice);
	}

	//------------------------------------
	public String[] getMateriale() {
		return materiale;
	}

	public void setMateriale(String[] materiale) {
		this.materiale = materiale;
	}
	
	

}
