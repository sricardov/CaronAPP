package me.br.caronapp.carona.excecoes;

public class UsuarioNaoEncontradoException extends Exception {

	public UsuarioNaoEncontradoException() {
		super("N�o foi poss�vel completar a opera��o. Usu�rio n�o encontrado.");
	}
	
}
