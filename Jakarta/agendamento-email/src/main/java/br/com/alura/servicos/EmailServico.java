package br.com.alura.servicos;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entidade.AgendamentoEmail;

@Stateless
public class EmailServico {
	
	@Inject
	AgendamentoEmailDAO dao;
	
	private Logger logger = Logger.getLogger("email serviço");
	
	public List<AgendamentoEmail> listarEmails(){
		return dao.listar();
	}
	
	public List<AgendamentoEmail> listarPorNaoAgendados(){
		return dao.listarPorNaoAgendado();
	}
	
	public void inserir(AgendamentoEmail agendamento) {
		agendamento.setAgendado(false);
		dao.inserir(agendamento);
	}
	
	public void alterar(AgendamentoEmail email) {
		email.setAgendado(email.getAgendado()==false);
		dao.alterar(email);
	}
	
	public void enviar(AgendamentoEmail email) {
		
		try {
			Thread.sleep(5000);
			logger.info("Enviando email para : "+email.getEmail());
			
			this.alterar(email);
			
		}catch(Exception e) {
			logger.warning(e.getMessage());
		}
	}
}
