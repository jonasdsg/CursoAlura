package br.com.alura.entidade;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AgendamentoEmail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	private String assunto;
	private String mensagem;
	private Boolean agendado;
	private String email;
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AgendamentoEmail [id=" + id + ", assunto=" + assunto + ", mensagem=" + mensagem + ", agendado="
				+ agendado + ", email=" + email + "]";
	}
	
	
	
}
