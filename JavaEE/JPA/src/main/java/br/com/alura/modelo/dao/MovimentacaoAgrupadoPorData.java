package br.com.alura.modelo.dao;

public class MovimentacaoAgrupadoPorData {
	private Integer dia;
	private Integer mes;
	private Double valor;
	
	
	public MovimentacaoAgrupadoPorData(Double valor, Integer dia, Integer mes) {
		this.valor = valor;
		this.dia = dia;
		this.mes = mes;
	}
	
	public Integer getDia() {
		return dia;
	}
	public Integer getMes() {
		return mes;
	}
	public Double getValor() {
		return valor;
	}
	
	
}
