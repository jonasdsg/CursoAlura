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
		conta.setTitular("Mario Monteiro");
		
		em.getTransaction().begin();
			em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		//Transforma uma entidade Detached em Managed
		EntityManager em2 = emf.createEntityManager();
		conta.setSaldo(15000.0);
		em2.merge(conta);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Churras");
		movimentacao.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacao.setValor(600.0);
		movimentacao.setConta(conta);
		
		em2.getTransaction().begin();
		em2.persist(movimentacao);
		em2.getTransaction().commit();
	}

}
