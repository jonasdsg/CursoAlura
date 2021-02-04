package br.com.gerenciador.model;

import java.util.Date;

public class Empresa {
	private static long ids;
	private Long id;
	private String nome;
	private Date data;
	
	public Empresa() {
		Empresa.ids++;
		this.id = Long.valueOf(Empresa.ids);
	}
	
	public Empresa(String nome) {
		this.id = Long.valueOf(Empresa.ids);
		this.nome = nome;
	}
	
	public Empresa(String nome,Date data) {
		this.id = Long.valueOf(Empresa.ids);
		this.nome = nome;
		this.data = data;
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
	
	
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return this.getNome();
	}
}
