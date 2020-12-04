package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Conta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titular;
	private Integer agencia;
	private Integer numero;
	private Double saldo;
	@OneToMany(mappedBy = "conta")
	private List<Movimentacao> movimentacoes = new ArrayList<Movimentacao>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [id=" + id + ", titular=" + titular + ", agencia=" + agencia + ", numero=" + numero + ", saldo="
				+ saldo + "]";
	}
	public Movimentacao setMovimentacao(Movimentacao movimentacao) {
		if(movimentacao!=null) {
			movimentacoes.add(movimentacao);
			return movimentacao;
		}
		return null;
	}
	
	public List<Movimentacao> getMovimentacoes() {
		return this.movimentacoes;
	}

}