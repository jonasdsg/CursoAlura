package br.com.alura.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;
import static java.util.Collections.unmodifiableList;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class RepositorioAluno implements RepositorioDeAlunos{
	List<Aluno> alunos;
	RepositorioAluno() {
		alunos = new ArrayList<Aluno>();
	}
	@Override
	public void matricularAluno(Aluno aluno) {
		alunos.add(aluno);
	}

	@Override
	public Aluno buscarAlunoPorCPF(CPF cpf) {
		return alunos.stream()
				.filter( aluno -> aluno.getCPF().equals(cpf.getCpf()) )
				.findFirst()
				.orElseThrow(()-> {
					throw new IllegalArgumentException("CPF inválido!");
				});
	}

	@Override
	public List<Aluno> listarAlunos() {
		return unmodifiableList(alunos);
	}

}
