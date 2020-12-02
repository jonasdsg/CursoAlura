package br.com.alura.testes;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.modelo.Categoria;
import br.com.alura.modelo.Cliente;
import br.com.alura.modelo.Conta;
import br.com.alura.modelo.Movimentacao;
import br.com.alura.modelo.TipoMovimentacao;

public class TestandoRelacionamento {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Categoria categoriaViag = new Categoria();
		categoriaViag.setNome("Lazer");
		
		Categoria categoriaNeg = new Categoria();
		categoriaNeg.setNome("Conferencia");
		
		
		Conta conta = new Conta();
		conta.setAgencia(1234);
		conta.setNumero(654);
		conta.setSaldo(15000.0);
		conta.setTitular("Jonas Góes");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Jonas Góes");
		cliente.setEndereco("R. da minha casa, nº 1,Rio de Janeiro/RJ");
		cliente.setProfissao("Analista de sistemas");
		cliente.setConta(conta);
		
		Movimentacao movimentacaoViag = new Movimentacao();
		movimentacaoViag.setCategoria(categoriaViag);
		movimentacaoViag.setCategoria(categoriaNeg);
		movimentacaoViag.setConta(conta);
		movimentacaoViag.setData(LocalDateTime.now());
		movimentacaoViag.setDescricao("Festa em Ipanema");
		movimentacaoViag.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacaoViag.setValor(857.43);
		
		Movimentacao movimentacaoNeg = new Movimentacao();
		movimentacaoNeg.setCategoria(categoriaNeg);
		movimentacaoNeg.setConta(conta);
		movimentacaoNeg.setData(LocalDateTime.now());
		movimentacaoNeg.setDescricao("Conferencia em vancouver");
		movimentacaoNeg.setTipoMovimentacao(TipoMovimentacao.SAIDA);
		movimentacaoNeg.setValor(857.43);
		
		em.getTransaction().begin();
			em.persist(categoriaViag);
			em.persist(categoriaNeg);
			em.persist(movimentacaoNeg);
			em.persist(conta);
			em.persist(cliente);
			em.persist(movimentacaoNeg);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
}
