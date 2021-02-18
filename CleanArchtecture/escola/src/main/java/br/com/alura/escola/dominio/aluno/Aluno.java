package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private CPF cpf;
	private Email email;
	private List<Telefone> telefones;
	private String nome;
	
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
}
