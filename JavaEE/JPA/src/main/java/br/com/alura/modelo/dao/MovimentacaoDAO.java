package br.com.alura.modelo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

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
		jpql = "select sum(m.valor) from Movimentacao m";
		TypedQuery<Double> avg = em.createQuery(jpql, Double.class);
		return avg.getSingleResult();
	}

	public List<MovimentacaoAgrupadoPorData> getSomaDasMovimentacoesAgrupadasPorData() {
		jpql = "select new br.com.alura.modelo.dao.MovimentacaoAgrupadoPorData(sum(m.valor),day(m.data),month(m.data)) from Movimentacao m group by day(m.data)";
		TypedQuery<MovimentacaoAgrupadoPorData> group = em.createQuery(jpql, MovimentacaoAgrupadoPorData.class);
		return group.getResultList();
	}
}
