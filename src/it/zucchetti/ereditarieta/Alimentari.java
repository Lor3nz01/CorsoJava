package it.zucchetti.ereditarieta;

import java.util.Date;

public class Alimentari extends Prodotto {
	
	private Date dataScadenza;
	
	public Alimentari() {
		super();
	}

	public Alimentari(String codice, String descrizione, double prezzo) {
		super(codice, descrizione, prezzo);
	}

	public Alimentari(String codice) {
		super(codice);
	}
	

	//------------------------------------

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}
	
	

}
