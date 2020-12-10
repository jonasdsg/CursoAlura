package br.com.alura.java.io.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteDeEscrita {

	public static void main(String[] args) {
		try {			
			FileOutputStream fos = new FileOutputStream("lorem.txt");
			Writer osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write("Jonas Góes");
			bw.newLine();
			bw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
