package it.zucchetti.override;

public class Manager extends Dipendente {
	
	protected int bonus;

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String matricola, int retribuzioneOraria) {
		super(matricola, retribuzioneOraria);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int stipendio(int ore, int retribuzione) {	
		return ore * retribuzione + bonus;
	}

}
