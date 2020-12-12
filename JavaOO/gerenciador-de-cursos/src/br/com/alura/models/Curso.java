package br.com.alura.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	private String instrutor;
	private String nome;

	private List<Aula> aulas = new ArrayList<Aula>();

	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void adicionar(Aula aula) {
		this.aulas.add(aula);
	}
	
	public Long getTempoTotal() {
		Long total = 0L;
		
		for(Aula aula:aulas)
			total += aula.getDuracao();
		
		return total ;
	}
}
