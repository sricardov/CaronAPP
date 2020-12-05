package me.br.caronapp.carona;

/*
 * Author: S�rgio Ricardo
 */

public class Rota {

	private Posicao origem;
	private Posicao destino;
	private int sentido;		// 0: em dire��o � UFF, 1: saindo da UFF
	
	public Rota(Posicao origem, Campus destino) {
		this.origem = origem;
		this.destino = destino;
		this.sentido = 0;
	}
	
	public Rota(Campus origem, Posicao destino) {
		this.origem = origem;
		this.destino = destino;
		this.sentido = 1;
	}

	public Posicao getOrigem() {
		return origem;
	}

	public Posicao getDestino() {
		return destino;
	}
	
	public int getSentido() {
		return sentido;
	}
	
}
