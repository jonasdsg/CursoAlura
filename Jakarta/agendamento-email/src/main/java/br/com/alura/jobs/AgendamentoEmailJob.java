package br.com.alura.jobs;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;

import br.com.alura.servicos.EmailServico;

@Singleton
public class AgendamentoEmailJob {
	@Inject
	private EmailServico emailService;
	
	@Schedule(hour = "*", minute = "*", second = "*/10")
	public void enviarEmails() {
		
		emailService.listarPorNaoAgendados().forEach(email->{
			emailService.enviar(email);
		});
	}
	
}
