package br.uva.veiculos.modelos;

public class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private Double comprimento;
	private Double largura;
	
	public Veiculo(String marca, String modelo, String cor, Double comprimento, Double largura) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.comprimento = comprimento;
		this.largura = largura;
	}
	
	public Veiculo(String marca, String modelo, String cor, Double comprimento) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.comprimento = comprimento;
	}
	
	public Veiculo(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Veiculo(String marca) {
		this.marca = marca;
	}
	
	public Veiculo(String cor,Double comprimento) {
		this.cor = cor;
		this.comprimento = comprimento;
	}
	
	public Veiculo(Double largura) {
		this.largura = largura;
	}
	
	public Veiculo() {}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Double getComprimento() {
		return comprimento;
	}

	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}
	
}
