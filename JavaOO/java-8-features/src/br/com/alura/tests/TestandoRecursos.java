package br.com.alura.tests;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestandoRecursos {

	public static void main(String[] args) {
		List<String> array = Arrays.asList("Jonas","Carlos","Amanda","Roberta","Bruna");
		
		array.forEach(nome -> System.out.println(nome));

	}
}