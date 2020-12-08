package br.com.alura.java.io.testes;

import java.io.FileReader;
import java.io.PrintStream;

public class TestandoEscritaComPrintStream {

	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream("lorem_ps.txt");
		ps.print("Escrita com PrintStream");
		ps.println();
		ps.print("fim");
		ps.close();

	}

}
