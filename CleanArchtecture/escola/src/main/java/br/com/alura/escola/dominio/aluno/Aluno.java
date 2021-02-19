package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private CPF cpf;
	private Email email;
	private String nome;
	private String senha;
	private List<Telefone> telefones;
	
	private Aluno(){}
	
	
	public Aluno(CPF cpf, Email email, String nome) {
		super();
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
		this.telefones = new ArrayList<Telefone>();
	}


	public void adicionarTelefone(String telefone) {
		telefones.add(new Telefone(telefone));
	}
	
	public String getCPF() {
		return cpf.getCpf();
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email.getEmail();
	}
}
