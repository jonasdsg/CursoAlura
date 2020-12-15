package br.com.alura.models;

public class Curso {
	private String nome;
	private Integer duracao;
	
	public Curso(String nome, Integer duracao) {
		this.duracao = duracao;
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Integer getDuracao() {
		return this.duracao;
	}

	@Override
	public String toString() {
		return "Curso [Nome=" + nome + ", Duracao=" + duracao + "]\n";
	}
	
}
