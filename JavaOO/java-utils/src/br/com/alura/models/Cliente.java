package br.com.alura.models;

public class Cliente implements Comparable<Cliente>{
	
	private Long id;
	private String nome;
	private Conta conta;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public int compareTo(Cliente c2) {
		if(this.getConta().getSaldo()<((Cliente) c2).getConta().getSaldo()) {
			return -1;
		}
		if(this.getConta().getSaldo()>((Cliente) c2).getConta().getSaldo()) {
			return 1;
		}
		return 0;
	}
	
	
	
}
