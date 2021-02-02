package br.com.gerenciador.model;

public class Empresa {
	private static long ids;
	private Long id;
	private String nome;
	
	public Empresa() {
		Empresa.ids++;
		this.id = Long.valueOf(Empresa.ids);
	}
	
	public Empresa(String nome) {
		this.id = Long.valueOf(Empresa.ids);
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getId() {
		return this.id;
	}
	
	@Override
	public String toString() {
		return this.getNome();
	}
}
