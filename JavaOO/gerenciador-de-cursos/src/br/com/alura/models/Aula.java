package br.com.alura.models;

public class Aula implements Comparable<Aula>{
	private String titulo;
	private Long duracao;
	public Aula(String titulo, Long duracao) {
		super();
		this.titulo = titulo;
		this.duracao = duracao;
	}
	public String getTitulo() {
		return titulo;
	}
	public Long getDuracao() {
		return duracao;
	}
	
	@Override
	public int compareTo(Aula aula) {
		return this.titulo.compareTo(aula.getTitulo());
	}
	
}
