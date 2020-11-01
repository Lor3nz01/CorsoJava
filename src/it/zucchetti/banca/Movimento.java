package it.zucchetti.banca;

import java.util.Date;

public class Movimento {

	private String contoID;
	private Date dataMovimento;
	private String tipoMovimento;

	public Movimento() {
	}

	public Movimento(String contoID, Date dataMovimento, String tipoMovimento) {
		super();
		this.contoID = contoID;
		this.dataMovimento = dataMovimento;
		this.tipoMovimento = tipoMovimento;
	}

	public void stampaMovimento() {
		System.out.println(getContoID() + "-" + getDataMovimento() + "-" + getTipoMovimento());
	}

	// -----------------------------------

	public String getContoID() {
		return contoID;
	}

	public void setContoID(String contoID) {
		this.contoID = contoID;
	}

	public Date getDataMovimento() {
		return dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

}
