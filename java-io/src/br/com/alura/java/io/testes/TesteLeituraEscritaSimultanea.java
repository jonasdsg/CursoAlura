package br.com.alura.java.io.testes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteLeituraEscritaSimultanea {

	public static void main(String[] args) {
		try
		{
			String linha;
			//Declarações Leitura
			FileInputStream fis = new FileInputStream("lorem_read.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			//Declarações Escrita
			FileOutputStream fos = new FileOutputStream("lorem_write.txt");
			Writer osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			while((linha = br.readLine())!=null) {
				bw.write(linha);
				bw.newLine();
			}
			bw.close();
			br.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
