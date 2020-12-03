package br.com.alura.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.modelo.Movimentacao;

public class TestandoJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		String sql = "select m from Movimentacao m where m.conta.id = 1";
		
		TypedQuery<Movimentacao> query = em.createQuery(sql,Movimentacao.class);
		
		List<Movimentacao> result = query.getResultList();
		
		System.out.println(result);
	}

}
