package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.models.Cliente;
import br.com.alura.models.Conta;

public class TesteArrayList {
	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		c1.setConta(new Conta(1500.0,1L));
		c1.setNome("Jonas");
		c2.setConta(new Conta(7500.0,2L));
		c2.setNome("Maria");
		List<Cliente> contas = new ArrayList<Cliente>();
		contas.add(c2);
		contas.add(c1);
		
		contas.forEach(conta -> {
			System.out.println(conta.getNome());
			System.out.println(conta.getConta().getSaldo());
			});
		System.out.println("------------Ordenado-------------");
		Collections.sort(contas);
		
		contas.forEach(conta -> {
			System.out.println(conta.getNome());
			System.out.println(conta.getConta().getSaldo());
			});
	}
}
