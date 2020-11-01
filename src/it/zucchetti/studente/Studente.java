package it.zucchetti.studente;

public class Studente {
	
	private String nome;
	private String cognome;
	private int eta;
	private int votoScritto;
	private int votoOrale;
	private int votoEsame;
	
	

	public void stampaStudente() {
		System.out.println("Lo studente "+ getNome() +" "+ getCognome() + " ha "+ getEta() +"anni");
	}
	
	public void risultatoEsame() {
		
		setVotoEsame(getVotoOrale() + getVotoScritto());
		
		if(getVotoEsame() < 18) {
			System.out.println("Lo studente è bocciato");
		}else if(getVotoEsame() >= 18 & getVotoEsame() <= 30) {
			System.out.println("Lo studente è promosso con voto: "+getVotoEsame());
		}else if(getVotoEsame() > 30) {
			System.out.println("Lo studente è promosso con voto: 30 e lode");
		}	
	}
	 
	//----------------------
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public int getVotoScritto() {
		return votoScritto;
	}
	public void setVotoScritto(int votoScritto) {
		this.votoScritto = votoScritto;
	}
	public int getVotoOrale() {
		return votoOrale;
	}
	public void setVotoOrale(int votoOrale) {
		this.votoOrale = votoOrale;
	}
	public int getVotoEsame() {
		return votoEsame;
	}
	public void setVotoEsame(int votoEsame) {
		this.votoEsame = votoEsame;
	}
}
