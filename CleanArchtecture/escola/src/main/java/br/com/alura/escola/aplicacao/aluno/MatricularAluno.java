package br.com.alura.escola.aplicacao.aluno;

import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	RepositorioDeAlunos repositorio;
	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	public void matricular(AlunoDTO dto) {
		repositorio.matricularAluno(dto.dtoToAluno());
	}
}
