package it.zucchetti.banca;

import java.util.Date;

public class ContoCorrente {
	private String contoID;
	private String titolareCF;
	private double saldo;
	static private boolean firma;
	private Date dataApertura;
	private Date dataChiusura;
	private String insFirma;

	// classe parseException per la gestione della data

	public ContoCorrente() {
	}

	public ContoCorrente(String titolareCF, double saldo, boolean firma, Date dataApertura, Date dataChiusura,
			String insFirma) {
		super();
		this.titolareCF = titolareCF;
		this.saldo = saldo;
		this.firma = firma;
		this.dataApertura = dataApertura;
		this.dataChiusura = dataChiusura;
		this.insFirma = insFirma;
	}

	public void versamento(int somma) {

		Movimento m = new Movimento();
		setSaldo(getSaldo() + somma);
		m.setContoID(getContoID());
		m.setTipoMovimento("+" + somma);
		m.setDataMovimento((new Date()));
	}

	public void prelievo(int somma) throws EccezionePrelievo {
		Movimento m = new Movimento();

		if (getSaldo() < somma) {
			throw new EccezionePrelievo();
		} else {
			setSaldo(getSaldo() - somma);
			System.out.println("Transazione eseguita correttamente!");
			m.setContoID(getContoID());
			m.setTipoMovimento("+" + somma);
			m.setDataMovimento((new Date()));
		}
	}

	// -------------------------------
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitolareCF() {
		return titolareCF;
	}

	public void setTitolareCF(String titolareCF) {
		this.titolareCF = titolareCF;
	}

	public boolean getFirma() {
		return firma;
	}

	public void setFirma(boolean firma) {
		this.firma = firma;
	}

	public Date getDataApertura() {
		return dataApertura;
	}

	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}

	public Date getDataChiusura() {
		return dataChiusura;
	}

	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}

	public String getInsFirma() {
		return insFirma;
	}

	public void setInsFirma(String insFirma) {
		this.insFirma = insFirma;
	}

	public String getContoID() {
		return contoID;
	}

	public void setContoID(String contoID) {
		this.contoID = contoID;
	}

}
