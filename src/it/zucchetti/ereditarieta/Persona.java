package it.zucchetti.ereditarieta;

import java.util.Date;

public class Persona {
	
	protected String nome;
	protected String cognome;
	protected Date dataNascita;
	
	
	public Persona(String nome, Date dataNascita) {
		this.nome = nome;
		this.dataNascita = dataNascita;
	}


	public Persona(String nome, String cognome, Date dataNascita) {
		this(nome, dataNascita);
		
		this.cognome = cognome;
	}
	
	
	
}
