package br.uva.veiculos.modelos;

public class Motor {
	private Double peso;
	private Integer rpm;
	private Integer velocidade;
	private String tipo;
	private Double preco;
	
	public Motor(Double peso, Integer rpm, Integer velocidade, String tipo, Double preco) {
		this.peso = peso;
		this.rpm = rpm;
		this.velocidade = velocidade;
		this.tipo = tipo;
		this.preco = preco;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Integer getRpm() {
		return rpm;
	}

	public void setRpm(Integer rpm) {
		this.rpm = rpm;
	}

	public Integer getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(Integer velocidade) {
		this.velocidade = velocidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return " [peso=" + peso + ", rpm=" + rpm + ", velocidade=" + velocidade + ", tipo=" + tipo + ", preco="
				+ preco + "]";
	}
	
	
}
