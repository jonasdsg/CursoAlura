package br.com.alura.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.modelo.Conta;

public class TestaRelatorioMovimentacoes {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		String jpql = "select c from Conta c";
		TypedQuery<Conta> query = em.createQuery(jpql,Conta.class);
		List<Conta> contas = query.getResultList();
		contas.forEach(conta ->{
			System.out.println("Titular: "+conta.getTitular());
			System.out.println("Saldo: "+conta.getSaldo());
			System.out.println("Movimentacoes: "+conta.getMovimentacoes().size());
		});
	}

}
