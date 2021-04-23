package br.com.alura.servicos;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;

@Singleton
public class AgendamentoEmailServico {
	
	@Inject
	private EmailServico emailServico;
	
	@Schedule(hour = "*", minute = "*", second = "*/10")
	public void enviarEmails() {
		System.out.println("Enviar Emails foi executado");
	}
}
