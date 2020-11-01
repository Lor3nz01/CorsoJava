package it.zucchetti.banca;

public class EccezionePrelievo extends Exception{
	
	EccezionePrelievo(){
		super("Saldo non disponibile!");
	}
	
}
