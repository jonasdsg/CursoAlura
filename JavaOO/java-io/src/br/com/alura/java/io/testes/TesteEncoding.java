package br.com.alura.java.io.testes;

import java.nio.charset.Charset;
import java.util.Arrays;

public class TesteEncoding {

	public static void main(String[] args) {
		String caracter = "Ç";
		Charset charSet = Charset.defaultCharset();
		System.out.println(caracter+" "+caracter.codePointAt(0)+" "+charSet);
		byte[] bytes = caracter.getBytes();
		System.out.println(Arrays.toString(bytes));
	}

}
