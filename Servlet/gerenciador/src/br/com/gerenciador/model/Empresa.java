package br.com.gerenciador.model;

import java.util.Date;

public class Empresa {
	private static long ids;
	private Long id;
	private String nome;
	private Date data;
	
	public Empresa() {
		this.updateId();
	}
	
	public Empresa(String nome) {
		this.updateId();
		this.nome = nome;
	}
	
	public Empresa(String nome,Date data) {
		this.updateId();
		this.nome = nome;
		this.data = data;
	}	
	
	public Empresa(Long id, String nome, Date data) {
		this.id = id;
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
	
	private void updateId() {
		if(Empresa.ids==0) {
			Empresa.ids++;
			this.id = 1L;
		}
		else {
			Empresa.ids++;
			this.id = Long.valueOf(Empresa.ids);
		}
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "id: "+this.getId()
				+", Nome: "+this.getNome()
				+"\n";
	}
}
