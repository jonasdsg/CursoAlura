package br.com.alura.java.io.testes;

import java.io.FileWriter;

public class TestandoEscritaComFileWriter {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("lorem_fw.txt");
		fw.write("Teste de Escrita");
		fw.write(System.lineSeparator());
		fw.write("Jonas Góes");
		fw.close();
	}

}
