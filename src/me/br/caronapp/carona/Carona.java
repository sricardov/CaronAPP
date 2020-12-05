package me.br.caronapp.carona;

import java.util.ArrayList;
import me.br.caronapp.usuario.Usuario;
import me.br.caronapp.carona.excecoes.*;

/*
 * Author: S�rgio Ricardo
 */

public class Carona {
	
	public enum Estado {ABERTO, AGUARDANDO, FECHADO};
	
	private Usuario host;
	private ArrayList<Usuario> guests = new ArrayList<Usuario>();
	private int maximoGuests;
	private Data dataHora;
	private Rota rota;
	
	public Carona(Usuario host, int maximoGuests, Data dataHora, Rota rota) {
		super();
		this.host = host;
		this.maximoGuests = maximoGuests;
		this.dataHora = dataHora;
		this.rota = rota;
	}
	
	public void adicionaPassageiro(Usuario user) throws VagasExcedidasException {
		if (getVagasPreenchidas() < maximoGuests) {
			guests.add(user);
		} else {
			throw new VagasExcedidasException();
		}
	}
	
	public void removePassageiro(Usuario user) throws UsuarioNaoEncontradoException {
		if (!guests.remove(user)) throw new UsuarioNaoEncontradoException();
	}
	
	public void atualiza() {
		//TODO implementar m�todo.
	}
	
	public void finaliza() {
		//TODO: implementar m�todo.
	}
	
	// Getters and Setters
	
	public int getVagasPreenchidas() {
		return guests.size();
	}
	
	public Usuario getHost() {
		return host;
	}

	public int getMaximoGuests() {
		return maximoGuests;
	}

	public void setMaximoGuests(int maximoGuests) {
		this.maximoGuests = maximoGuests;
	}

	public Data getDataHora() {
		return dataHora;
	}

	public void setDataHora(Data dataHora) {
		this.dataHora = dataHora;
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}
	
}
