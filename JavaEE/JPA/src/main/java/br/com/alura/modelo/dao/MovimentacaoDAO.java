package br.com.alura.modelo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.Movimentacao;

public class MovimentacaoDAO {
	private EntityManager em;
	private String jpql;

	public MovimentacaoDAO(EntityManagerFactory emf) {
		em = emf.createEntityManager();
	}

	public List<Movimentacao> getMovimentacoesConta(Conta conta) {
		jpql = "select c from Conta c left join fetch c.movimentacoes where :pconta = c";
		TypedQuery<Conta> query = em.createQuery(jpql, Conta.class);
		query.setParameter("pconta", conta);
		return query.getSingleResult().getMovimentacoes();
	}

	public Double getMediaMovimentacoes() {
		TypedQuery<Double> avg = em.createNamedQuery("retornaMediaMovimentacoes", Double.class);
		return avg.getSingleResult();
	}

	public List<MovimentacaoAgrupadoPorData> getSomaDasMovimentacoesAgrupadasPorData() {
		jpql = "select new br.com.alura.modelo.dao.MovimentacaoAgrupadoPorData(sum(m.valor),day(m.data),month(m.data)) from Movimentacao m group by day(m.data)";
		TypedQuery<MovimentacaoAgrupadoPorData> group = em.createQuery(jpql, MovimentacaoAgrupadoPorData.class);
		return group.getResultList();
	}
	
	public List<Movimentacao> getMovimentacoesFiltradasPorData(Integer dia,Integer mes, Integer ano){
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Movimentacao> criteriaQuery = cb.createQuery(Movimentacao.class);
		Root<Movimentacao> root = criteriaQuery.from(Movimentacao.class);
		List<Predicate> predicates = new ArrayList<Predicate>();
		
		if(dia!=null) {
			Predicate predicate = cb.equal(cb.function("day", Integer.class, root.get("data")),dia);
			predicates.add(predicate);
		}
		if(mes!=null) {
			Predicate predicate = cb.equal(cb.function("month", Integer.class, root.get("data")),mes);
			predicates.add(predicate);
		}
		if(ano!=null) {
			Predicate predicate = cb.equal(cb.function("year", Integer.class, root.get("data")),ano);
			predicates.add(predicate);
		}
		
		criteriaQuery.where((Predicate []) predicates.toArray(new Predicate[0]));
		TypedQuery<Movimentacao> typedQuery = em.createQuery(criteriaQuery);
		
		return typedQuery.getResultList();
	}
}
