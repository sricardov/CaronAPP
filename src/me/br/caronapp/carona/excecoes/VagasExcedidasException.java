package me.br.caronapp.carona.excecoes;

public class VagasExcedidasException extends Exception {
	
	public VagasExcedidasException() {
		super("Opera��o excede o n�mero limite de vagas.");
	}

}
