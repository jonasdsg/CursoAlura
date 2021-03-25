package br.com.alura.entidade;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AgendamentoEmail {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String assunto;
	private String mensagem;
	private Boolean agendado;
	public AgendamentoEmail() {	}
	
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
