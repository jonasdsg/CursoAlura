package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
public class LivroDao {
	
	@PersistenceContext
	private EntityManager em;
	//private Banco banco = new Banco();
	
	public void salva(Livro livro) {
		em.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		return em.createQuery("SELECT livros FROM Livro livros",Livro.class).getResultList();
	}
	
}
