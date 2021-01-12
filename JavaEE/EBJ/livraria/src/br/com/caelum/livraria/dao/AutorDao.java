package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorDao {
	
	@PersistenceContext
	private EntityManager em;
	private Banco banco = new Banco();

	@PostConstruct
	private void posCriacao() {
		System.out.println("autor dao criado.");
	}
	
	public void salva(Autor autor) {
		System.out.println("salvando Autor: "+autor.getNome());
		em.persist(autor);
		//banco.save(autor);
		System.out.println("salvou Autor: "+autor.getNome());

	}
	
	public List<Autor> todosAutores() {
		return em.createQuery("SELECT autor FROM Autor autor",Autor.class).getResultList();
				//banco.listaAutores();
	}

	public Autor buscaPelaId(Integer autorId) {
		//Autor autor = this.banco.buscaPelaId(autorId);
		return em.find(Autor.class,autorId);
	}
	
}
