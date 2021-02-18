package br.com.alura.escola.dominio.aluno;

import java.util.List;

public interface RepositorioDeAlunos {
	public abstract void matricularAluno(Aluno aluno);
	public abstract Aluno buscarAlunoPorCPF(CPF cpf);
	public abstract List<Aluno> listarAlunos();
}
