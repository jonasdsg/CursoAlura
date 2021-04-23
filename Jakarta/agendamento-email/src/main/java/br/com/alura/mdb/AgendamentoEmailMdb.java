package br.com.alura.mdb;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

import br.com.alura.entidade.AgendamentoEmail;
import br.com.alura.servicos.EmailServico;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationLookup",propertyValue = "java:/jms/queue/EmailQueue"),
		@ActivationConfigProperty(propertyName = "destinationType",propertyValue = "javax.jms.Queue")
})
public class AgendamentoEmailMdb implements MessageListener {

	@Inject
	private EmailServico emailServico;
	@Override
	public void onMessage(Message message) {
		try {
			AgendamentoEmail email = message.getBody(AgendamentoEmail.class);
			emailServico.enviar(email);
			
		} catch (JMSException e) { throw new RuntimeException(e);	}
	}

}
