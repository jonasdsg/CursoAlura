package br.uva.veiculos.modelos;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private Double comprimento;
	private Double largura;
	private Double preco;
	protected Scanner teclado;

	public Veiculo(String marca, String modelo, String cor, Double comprimento, Double largura, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.comprimento = comprimento;
		this.largura = largura;
		this.preco = preco;
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

	public Veiculo(String cor, Double comprimento) {
		this.cor = cor;
		this.comprimento = comprimento;
	}

	public Veiculo(Double largura) {
		this.largura = largura;
	}

	public Veiculo() {
	}

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public abstract Double valorDesconto();

	public abstract void imprimir();

	public abstract void entradaDados();

	@Override
	public String toString() {
		return "--------------------[ INÍCIO DO RELATÓRIO ]--------------------" + "\nMarca: " + marca + "\nModelo: " + modelo + "\nPreco: "
				+ preco + "\nCor: " + cor + "\nComprimento: " + comprimento + "\nLargura: " + largura;
	}

	protected void entradaDadosDefault() {
		Boolean mismatch = false;
		teclado = new Scanner(System.in);
		do {
			mismatch = false;
			try {

				System.out.println("---------[Cadastrando: " + this.getClass().getSimpleName() + " ]-------");
				System.out.println("Informe a:");
				System.out.print("Marca: ");
				marca = teclado.nextLine();
				System.out.print("Modelo: ");
				modelo = teclado.nextLine();
				System.out.print("Preco: ");
				preco = Double.parseDouble(teclado.nextLine());
				System.out.print("Cor: ");
				cor = teclado.nextLine();
				System.out.print("Comprimento: ");
				comprimento = teclado.nextDouble();
				System.out.print("Largura: ");
				largura = teclado.nextDouble();

			} catch (InputMismatchException| NumberFormatException e) {
				System.out.println("O Valor inserido é inválido!");
				mismatch = true;
			}
		} while (mismatch);
	}

	protected void cadastrarDefault(String marca, String modelo, String cor, Double comprimento, Double largura,
			Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.comprimento = comprimento;
		this.largura = largura;
		this.preco = preco;
	}
}
