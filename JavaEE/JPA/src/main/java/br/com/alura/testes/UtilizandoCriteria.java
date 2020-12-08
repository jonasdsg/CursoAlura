package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import br.com.alura.modelo.Movimentacao;

public class UtilizandoCriteria {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		//Informa o tipo de objeto retornado pela query.
		CriteriaQuery<Double> query = cb.createQuery(Double.class);
		//Informa o objeto a ser consultado do banco (e retorna a raiz)
		Root<Movimentacao> root = query.from(Movimentacao.class);
		//faz a operação
		Expression<Double> exp = cb.sum(root.<Double>get("valor"));
		query.select(exp);
		
		TypedQuery<Double> typedQuery = em.createQuery(query);
		System.out.println(typedQuery.getSingleResult());
	}

}
