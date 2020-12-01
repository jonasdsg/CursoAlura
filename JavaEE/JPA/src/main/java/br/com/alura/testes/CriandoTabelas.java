package br.com.alura.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.modelo.Conta;

public class CriandoTabelas {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		Conta conta = new Conta();
		conta.setAgencia(12345);
		conta.setNumero(6789);
		conta.setSaldo(5000.0);
		conta.setTitular("Jonas Góes");
		
		em.getTransaction().begin();
			em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
	}

}
