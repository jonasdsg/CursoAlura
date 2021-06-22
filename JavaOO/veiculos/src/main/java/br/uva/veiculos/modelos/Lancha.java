package br.uva.veiculos.modelos;

public class Lancha extends Veiculo {
	private Motor motor1;
	private Motor motor2;
	private String nome;

	public Lancha() {
	}

	public Lancha(String marca, String modelo, Motor motor1, Motor motor2) {
		super(marca, modelo);
		this.motor1 = motor1;
		this.motor2 = motor2;
	}

	public Lancha(String marca, String modelo, String cor, Double comprimento, Double largura, Double preco,
			Motor motor1) {
		super(marca, modelo, cor, comprimento, largura, preco);
		this.motor1 = motor1;
	}

	public Lancha(String marca, Motor motor1, Motor motor2) {
		super(marca);
		this.motor1 = motor1;
		this.motor2 = motor2;
	}

	public Lancha(String marca, String modelo, String cor, Double comprimento, Double largura, Double preco,
			Motor motor1, Motor motor2) {
		super(marca, modelo, cor, comprimento, largura, preco);
		this.motor1 = motor1;
		this.motor2 = motor2;
	}

	@Override
	public Double valorDesconto() {
		return this.getPreco() * 0.9;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Motor getMotor1() {
		return motor1;
	}

	public void setMotor1(Motor motor1) {
		this.motor1 = motor1;
	}

	public Motor getMotor2() {
		return motor2;
	}

	public void setMotor2(Motor motor2) {
		this.motor2 = motor2;
	}

	@Override
	public String imprimir() {
		return super.toString() + "\nNome: " + this.nome + "\nMotor 1: " + this.motor1 + "\nMotor 2: " + this.motor2
				+ "\n----------------------------------";
	}

}
