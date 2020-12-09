package br.com.alura.java.io.testes;

import java.io.File;
import java.util.Scanner;

public class LeituraDeArquivoComScanner {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("lorem_read.txt"));
		String linha = "";
		while(linha!=null) {
			System.out.println(linha);
			linha = scanner.nextLine();
		}
	}

}
