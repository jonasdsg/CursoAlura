package br.com.alura.tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestandoRecursos {

	public static void main(String[] args) {
		List<String> array = Arrays.asList("Jonas","Carlos","Amanda","Roberta","Bruna");
		System.out.println("Ordem de inserção :\n");
		array.forEach(nome -> System.out.println(nome));
		array.sort((nome1,nome2)-> nome1.compareTo(nome2));
		System.out.println("\nOrdem alfabética: \n");
		array.forEach(nome -> System.out.println(nome));
	}
}