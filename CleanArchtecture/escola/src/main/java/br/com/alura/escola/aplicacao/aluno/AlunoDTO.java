package br.com.alura.escola.aplicacao.aluno;

import java.util.List;

import br.com.alura.escola.dominio.aluno.Aluno;
import static br.com.alura.escola.dominio.aluno.FabricaDeAluno.novoAluno;

public class AlunoDTO {
	public String nome;
	public String cpf;
	public String email;
	public List<String> telefone;
	
	public Aluno dtoToAluno() {
		return novoAluno()
				.comCPF(this.cpf)
				.comEmail(this.email)
				.comNome(this.nome)
				.criar();
	}
}
