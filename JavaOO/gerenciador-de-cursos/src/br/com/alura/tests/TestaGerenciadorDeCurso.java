package br.com.alura.tests;

import br.com.alura.models.Aluno;
import br.com.alura.models.Aula;
import br.com.alura.models.Curso;

public class TestaGerenciadorDeCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Curso Java",1L);
		curso.adicionarAluno(new Aluno("Jonas góes","202030302020"));
		curso.adicionarAluno(new Aluno("Mario Monteiro","303040402020"));
		curso.adicionarAluno(new Aluno("João Plaga","50505202021010"));
		curso.adicionarAula(new Aula("Aula Orientação a objetos",20L));
		curso.adicionarAula(new Aula("Aula Banco de dados",80L));
		curso.setInstrutor("Paulo silveira");
		curso.getAulas().forEach(aula -> System.out.println(aula));
		curso.getAlunos().forEach(aluno -> System.out.println(aluno));
		System.out.println(curso.getTempoTotal());
	}

}
