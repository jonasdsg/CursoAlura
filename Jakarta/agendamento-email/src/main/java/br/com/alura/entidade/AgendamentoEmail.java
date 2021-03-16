package br.com.alura.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AgendamentoEmail {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String assunto;
	private String mensagem;
	private Boolean agendado;
	
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public void setAgendado(Boolean agendado) {
		this.agendado = agendado;
	}
	public Long getId() {
		return id;
	}
	public String getAssunto() {
		return assunto;
	}
	public String getMensagem() {
		return mensagem;
	}
	public Boolean getAgendado() {
		return agendado;
	}
	
}
