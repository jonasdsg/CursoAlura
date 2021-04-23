package br.com.alura.jobs;

import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.jms.JMSConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;

import br.com.alura.servicos.EmailServico;

@Singleton
public class AgendamentoEmailJob {
	@Inject
	private EmailServico emailService;
	
	@Inject
	@JMSConnectionFactory("java:jboss/DefaultJMSConnectionFactory")
	private JMSContext context;
	
	@Resource(mappedName = "java:/jms/queue/EmailQueue")
	private Queue queue;
	
	@Schedule(hour = "*", minute = "*", second = "*/10")
	public void enviarEmails() {
		
		emailService.listarPorNaoAgendados().forEach(email->{
			context.createProducer().send(queue, email);
			emailService.alterar(email);
		});
	}
	
}
