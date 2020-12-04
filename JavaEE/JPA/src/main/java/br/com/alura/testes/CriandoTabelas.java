package br.com.alura.testes;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.Movimentacao;
import br.com.alura.modelo.TipoMovimentacao;

public class CriandoTabelas {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		Conta conta = new Conta();
		conta.setAgencia(12345);
		conta.setNumero(6789);
		conta.setSaldo(5000.0);
		conta.setTitular("Karine");
		
		em.getTransaction().begin();
			em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		//Transforma uma entidade Detached em Managed
		EntityManager em2 = emf.createEntityManager();
		conta.setSaldo(1500.0);
		em2.merge(conta);
		
		Movimentacao movimentacao = new Movimentacao();
		Movimentacao m2 = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("comissão");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setValor(80.0);
		movimentacao.setConta(conta);
		
		m2.setDescricao("Presente");
		m2.setData(LocalDateTime.now().plusDays(1));
		m2.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		m2.setValor(860.0);
		m2.setConta(conta);
		
		em2.getTransaction().begin();
		em2.persist(movimentacao);
		em2.persist(m2);
		em2.getTransaction().commit();
	}

}
