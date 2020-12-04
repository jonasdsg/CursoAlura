package br.com.alura.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.modelo.Movimentacao;

public class TestandoSomaDasMovimentacoes {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		String jpql = "select m.valor from Movimentacao m";
		TypedQuery<Double> query = em.createQuery(jpql,Double.class);
		List<Double> lista = query.getResultList();
		lista.forEach(m -> System.out.println(m));
	}
}
