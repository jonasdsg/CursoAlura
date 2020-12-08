package br.com.alura.java.io.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteDeLeitura {

	public static void main(String[] args) {
		try 
		{
			FileInputStream fis = new FileInputStream("lorem_read.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader buffer = new BufferedReader(isr);
			String linha;
			while((linha = buffer.readLine()) != null) {System.out.println(linha);}
			buffer.close();
			System.out.println(linha);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
