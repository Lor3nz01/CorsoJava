package it.zucchetti.override;

public class Dipendente {
	
	protected String matricola;
	protected int retribuzioneOraria;
	
	public Dipendente() {}
	
	public Dipendente(String matricola, int retribuzioneOraria) {
		super();
		this.matricola = matricola;
		this.retribuzioneOraria = retribuzioneOraria;
	}

	public int stipendio(int ore, int retribuzione) {
		return ore * retribuzione;
	}

}
