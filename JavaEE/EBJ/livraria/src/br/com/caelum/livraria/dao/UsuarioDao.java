package br.com.caelum.livraria.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Usuario;

@Stateless
public class UsuarioDao {

	@PersistenceContext
	private EntityManager em;
	//private Banco banco = new Banco();

	public Usuario buscaPeloLogin(String login) {
		return em.find(Usuario.class,login);
	}
	
}
