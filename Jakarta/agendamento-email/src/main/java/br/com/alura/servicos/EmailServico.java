package br.com.alura.servicos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entidade.AgendamentoEmail;

@Stateless
public class EmailServico {
	@Inject
	AgendamentoEmailDAO dao;
	
	public List<AgendamentoEmail> getEmails(){
		return dao.listar();
	}
}
