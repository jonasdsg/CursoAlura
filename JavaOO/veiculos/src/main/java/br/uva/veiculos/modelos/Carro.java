package br.uva.veiculos.modelos;

public class Carro extends Veiculo {
	private Motor motor = new Motor();
	private String placa;

	public Carro(String marca, String modelo, String cor, Double comprimento, Double largura, Double preco, Motor motor,
			String placa) {
		super(marca, modelo, cor, comprimento, largura, preco);
		this.motor = motor;
		this.placa = placa;
	}

	public Carro(String marca, String modelo, Motor motor, String placa) {
		super(marca, modelo);
		this.motor = motor;
		this.placa = placa;
	}

	public Carro(Motor motor, String placa) {
		super();
		this.motor = motor;
		this.placa = placa;
	}

	public Carro(Double largura, Motor motor) {
		super(largura);
		this.motor = motor;
	}

	public Carro(String marca, Motor motor, String placa) {
		super(marca);
		this.motor = motor;
		this.placa = placa;
	}

	public Carro() {
	}

	@Override
	public Double valorDesconto() {
		return this.getPreco() * 0.85;
	}

	@Override
	public void imprimir() {
		System.out.println( super.toString() + "\nmotor: " + motor + " \nplaca: " + placa + "\n--------------------[  FIM  DO RELATÓRIO  ]--------------------");
	}

	@Override
	public void entradaDados() {
		this.entradaDadosDefault();
		System.out.print("Placa: ");
		placa = teclado.nextLine();
		motor.entradaDados();
	}

}
