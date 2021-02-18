package escola;

public class FabricaDeAluno {
	private String nome;
	private String cpf;
	private String email;
	
	private FabricaDeAluno() {}

	public static FabricaDeAluno novoAluno() {
		return new FabricaDeAluno();
	}
	
	public FabricaDeAluno comNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public FabricaDeAluno comCPF(String cpf) {
		this.cpf = cpf;
		return this;
	}
	
	public FabricaDeAluno comEmail(String email) {
		this.email=email;
		return this;
	}
	
	public Aluno criar() {
		return new Aluno(new CPF(cpf),new Email(email),nome);
	}
}
