package br.com.alura.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso {
	private String instrutor;
	private String nome;
	private Long turma;

	private List<Aula> aulas = new ArrayList<Aula>();
	private Map<Integer,Aluno> alunos = new HashMap<Integer, Aluno>();
	
	public Curso() {}
	
	public Curso(String nome, Long turma) {
		this.turma = turma;
		this.nome = nome;
	}
	
	public Long getTurma() {
		return this.turma;
	}
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public void adicionarAula(Aula aula) {
		this.aulas.add(aula);
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.put(aluno.getKey(), aluno);
	}
	
	public Long getTempoTotal() {
		Long total = 0L;

		for (Aula aula : aulas)
			total += aula.getDuracao();

		return total;
	}

	public void setInstrutor(String instrutor) {
		if(instrutor.length()<=0) 
				throw new RuntimeException("O nome não pode estar vazio!");		
		this.instrutor = instrutor;  
	}

	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(new ArrayList<Aluno>(alunos.values()));
	}
}
