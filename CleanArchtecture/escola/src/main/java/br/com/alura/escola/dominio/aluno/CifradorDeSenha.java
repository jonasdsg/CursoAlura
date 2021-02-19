package br.com.alura.escola.dominio.aluno;

public interface CifradorDeSenha {
	public abstract String cifrarSenha(String senha);
	public abstract Boolean validarSenhaCifrada(String senhaCifrada,String senha);
}
