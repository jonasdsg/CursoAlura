package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private CPF cpf;
	private Email email;
	private List<Telefone> telefones;
	private String nome;
	
	Aluno(){
		this.telefones = new ArrayList<Telefone>();
	}
	
	public void adicionarTelefone(String telefone) {
		telefones.add(new Telefone(telefone));
	}
}
