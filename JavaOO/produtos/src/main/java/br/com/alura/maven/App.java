package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Bala Juquinha",0.10);
		
		System.out.println(produto.getNome());
	}
}
