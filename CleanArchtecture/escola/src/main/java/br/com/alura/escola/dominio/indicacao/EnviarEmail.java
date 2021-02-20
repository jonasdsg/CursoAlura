package br.com.alura.escola.dominio.indicacao;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.alura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.alura.escola.dominio.aluno.Aluno;

public class EnviarEmail implements EnviarEmailIndicacao {
	Properties props = new Properties();
	Session session = null;
	
	EnviarEmail() {
		props.put("mail.smtp.host", "smtp.gmail.com");
	    props.put("mail.smtp.socketFactory.port", "465");
	    props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.port", "465");
	    
	    session = Session.getDefaultInstance(props, new Authenticator() {
	    	protected PasswordAuthentication getPasswordAuthentication()
            {
                  return new PasswordAuthentication("curso@gmail.com", "senha123");
            }
	    	}); 
	}
	
	@Override
	public void enviarEmailPara(Aluno indicado) {
		Message message = new  MimeMessage(session);
		
		try {
			
			message.setFrom(new InternetAddress("seuemail@hotmail.com"));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(indicado.getEmail())); 
			message.setSubject("Você recebeu um DESCONTO !!! por indicação :) ");
			message.setText("Você foi indicado!");
			Transport.send(message);
			
		} catch (MessagingException e) {
			e.printStackTrace();
		}


	}

}
