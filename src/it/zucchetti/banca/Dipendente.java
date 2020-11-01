package it.zucchetti.banca;

public class Dipendente {
	
	private String matricola;
	ContoCorrente c = new ContoCorrente();
	
	public Dipendente() {}
	
	public Dipendente(String matricola) {
		super();
		this.matricola = matricola;
	}

	public void firma(int scelta) {
		if(scelta == 0) {
			c.setFirma(false);
		}else if(scelta == 1){
			c.setFirma(true);
		}
	}
	
	//----------------------------

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	
	
}
