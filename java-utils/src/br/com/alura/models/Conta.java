package br.com.alura.models;

public class Conta {
	private Long id;
	private Double saldo;
	private Long agenciaCod;
	
	
	public Conta(Double saldo, Long agenciaCod) {
		super();
		this.saldo = saldo;
		this.agenciaCod = agenciaCod;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public Double getSaldo() {
		return saldo;
	}
	
	public void deposita(Double saldo) {
		if(saldo>0)
			this.saldo = saldo;
	}
	
	public void saca(Double saldo) {
		if(saldo>0)
			this.saldo -= saldo;
	}
	public void tranfere(Double valor,Conta conta) {
		if(conta!=null && valor>0 && this.saldo>=valor) {
			this.saca(valor);
			conta.deposita(valor);
		}
			
	}
	public Long getAgenciaCod() {
		return agenciaCod;
	}
	public void setAgenciaCod(Long agenciaCod) {
		this.agenciaCod = agenciaCod;
	}
	
}
