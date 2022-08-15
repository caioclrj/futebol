package br.com.futebol;

public class Jogador {

	private Tipo posicao;
	private String nome;

	public Jogador(String nome, Tipo posicao) {
		this.setNome(nome);
		this.setPosicao(posicao);
		// TODO Auto-generated constructor stub
	}

	public Tipo getPosicao() {
		return posicao;
	}

	public void setPosicao(Tipo posicao) {
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
