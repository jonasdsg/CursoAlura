package br.com.alura.models;

public class Aluno implements Comparable<Aluno>{
	String nome;
	String matricula;
	
	public Aluno (String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	@Override
	public int hashCode() {
		return this.matricula.hashCode();
	}

	@Override
	public int compareTo(Aluno aluno) {
		return this.matricula.compareTo(aluno.getMatricula());
	}
	
	@Override
	public boolean equals(Object objeto) {
		Aluno aluno = (Aluno) objeto;
		return this.matricula.equals(aluno.getMatricula()) && this.nome.equals(aluno.getNome());
	}

	public String getNome() {
		return this.nome;
	}

	public String getMatricula() {
		return this.matricula;
	}
	
	public Integer getKey() {
		return this.hashCode();
	}
}
