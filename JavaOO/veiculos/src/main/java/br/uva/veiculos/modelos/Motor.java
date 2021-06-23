package br.uva.veiculos.modelos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Motor {
	private Double peso;
	private Integer rpm;
	private Integer velocidade;
	private String tipo;
	private Double preco;
	private Scanner teclado;

	public Motor() {
	}

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
		return " [peso=" + peso + ", rpm=" + rpm + ", velocidade=" + velocidade + ", tipo=" + tipo + ", preco=" + preco
				+ "]";
	}
	public void imprimir() {
		System.out.println(this.toString());
	}
	
	public void entradaDados() {
		Boolean mismatch = false;
		teclado = new Scanner(System.in);
		do {
			mismatch = false;
			try {
				System.out.print("peso: ");
				peso = Double.parseDouble(teclado.nextLine());
				System.out.print("rpm: ");
				rpm = Integer.parseInt(teclado.nextLine());
				System.out.print("velocidade: ");
				velocidade = Integer.parseInt(teclado.nextLine());
				System.out.print("tipo: ");
				tipo = teclado.nextLine();
				System.out.print("preco: ");
				preco = teclado.nextDouble();
			} catch (InputMismatchException | NumberFormatException e) {
				System.out.println("O Valor inserido é inválido!");
				mismatch = true;
			}
		} while (mismatch);
	}

	public void cadastrar(Double peso, Integer rpm, Integer velocidade, String tipo, Double preco) {
		this.peso = peso;
		this.rpm = rpm;
		this.velocidade = velocidade;
		this.tipo = tipo;
		this.preco = preco;
	}
}
