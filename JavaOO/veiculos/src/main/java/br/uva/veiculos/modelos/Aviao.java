package br.uva.veiculos.modelos;

public class Aviao extends Veiculo {
	private Motor motor1, motor2, motor3, motor4;
	private String identificacao;
	
	public Aviao() {
		motor1 = new Motor();
		motor2 = new Motor();
		motor3 = new Motor();
		motor4 = new Motor();
	}
	
	public Aviao(String marca, String modelo, String cor, Double comprimento, Double largura, Double preco,
			Motor motor1, Motor motor2, Motor motor3, Motor motor4, String identificacao) {
		super(marca, modelo, cor, comprimento, largura, preco);
		this.motor1 = motor1;
		this.motor2 = motor2;
		this.motor3 = motor3;
		this.motor4 = motor4;
		this.identificacao = identificacao;
	}

	public Aviao(String cor, Double comprimento, Motor motor1, Motor motor2, Motor motor3, Motor motor4,
			String identificacao) {
		super(cor, comprimento);
		this.motor1 = motor1;
		this.motor2 = motor2;
		this.motor3 = motor3;
		this.motor4 = motor4;
		this.identificacao = identificacao;
	}

	public Aviao(String marca, Motor motor1, Motor motor2, Motor motor3, Motor motor4, String identificacao) {
		super(marca);
		this.motor1 = motor1;
		this.motor2 = motor2;
		this.motor3 = motor3;
		this.motor4 = motor4;
		this.identificacao = identificacao;
	}

	public Aviao(Motor motor1, Motor motor2, Motor motor3, Motor motor4, String identificacao) {
		super();
		this.motor1 = motor1;
		this.motor2 = motor2;
		this.motor3 = motor3;
		this.motor4 = motor4;
		this.identificacao = identificacao;
	}

	public Aviao(String marca, String modelo, String cor, Motor motor1, Motor motor2, Motor motor3, Motor motor4,
			String identificacao) {
		super(marca, modelo, cor);
		this.motor1 = motor1;
		this.motor2 = motor2;
		this.motor3 = motor3;
		this.motor4 = motor4;
		this.identificacao = identificacao;
	}

	public Integer pessoasPorCabine() {
		return 50;
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

	public Motor getMotor3() {
		return motor3;
	}

	public void setMotor3(Motor motor3) {
		this.motor3 = motor3;
	}

	public Motor getMotor4() {
		return motor4;
	}

	public void setMotor4(Motor motor4) {
		this.motor4 = motor4;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	@Override
	public Double valorDesconto() {
		return this.getPreco() * 0.92;
	}

	@Override
	public void imprimir() {
		System.out.println(super.toString() + "\nmotor1: " + motor1 + " \nmotor2: " + motor2 + " \nmotor3: " + motor3
				+ " \nmotor4: " + motor4 + " \nidentificacao: " + identificacao + "\n--------------------[  FIM  DO RELATÓRIO  ]--------------------");
	}

	@Override
	public void entradaDados() {
		this.entradaDadosDefault();
		System.out.println("Identificação: ");
		identificacao = teclado.next();
		System.out.println("\n--------[ Cadastrando motor 1 ]-------------");
		motor1.entradaDados();
		System.out.println("\n--------[ Cadastrando motor 2 ]-------------");
		motor2.entradaDados();
		System.out.println("\n--------[ Cadastrando motor 3 ]-------------");
		motor3.entradaDados();
		System.out.println("\n--------[ Cadastrando motor 4 ]-------------");
		motor4.entradaDados();
	}
	
	public void cadastrar(String marca, String modelo, String cor, Double comprimento, Double largura, Double preco,
				Motor motor1, Motor motor2, Motor motor3, Motor motor4, String identificacao) {
			cadastrarDefault(marca, modelo, cor, comprimento, largura, preco);
			this.motor1 = motor1;
			this.motor2 = motor2;
			this.motor3 = motor3;
			this.motor4 = motor4;
			this.identificacao = identificacao;		
	}
}
