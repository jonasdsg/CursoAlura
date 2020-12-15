package br.com.alura.tests;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import br.com.alura.models.Curso;

public class TestandoRecursos {

	public static void main(String[] args) {
		List<String> array = Arrays.asList("Jonas","Carlos","Amanda","Roberta","Bruna");
		System.out.println("Ordem de inserção :\n");
		array.forEach(nome -> System.out.println(nome));
		array.sort((nome1,nome2)-> nome1.compareTo(nome2));
		System.out.println("\nOrdem alfabética: \n");
		array.forEach(nome -> System.out.println(nome));
		
		// Usando streams.
		
		Collection<Curso> cursos = Arrays.asList(new Curso("PHP",55),new Curso("JAVA",255),new Curso("PHYTHON",600),new Curso("JAVASCRIPT",85),new Curso("C#",95));
		
		cursos.stream().filter(curso -> curso.getDuracao()>100).forEach(System.out::println);
		
	}
}