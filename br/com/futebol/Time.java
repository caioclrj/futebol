package br.com.futebol;

import java.util.ArrayList;

public class Time {

	private ArrayList<Jogador> jogadores;
	private String nome;

	public Time(String nome, ArrayList<Jogador> jogadores) {
		this.setNome(nome);
		this.setJogadores(jogadores);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
