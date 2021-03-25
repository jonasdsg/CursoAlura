package br.com.alura.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.alura.entidade.AgendamentoEmail;

@Stateless
public class AgendamentoEmailDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<AgendamentoEmail> listar(){
		return em.createQuery("SELECT ag FROM AgendamentoEmail ag",AgendamentoEmail.class).getResultList();
	}
	
	public AgendamentoEmail buscarPorId(Long id) {
		return em.find(AgendamentoEmail.class, id);
	}
}
