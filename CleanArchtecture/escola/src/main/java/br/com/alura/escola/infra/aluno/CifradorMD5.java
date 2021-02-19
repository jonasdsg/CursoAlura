package br.com.alura.escola.infra.aluno;

import java.security.MessageDigest;

import br.com.alura.escola.dominio.aluno.CifradorDeSenha;

public class CifradorMD5 implements CifradorDeSenha{

	@Override
	public String cifrarSenha(String senha) {
		
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(senha.getBytes());
			StringBuilder sb = new StringBuilder();
			byte[] bytes = md.digest();
			for(byte b:bytes) {
				sb.append(Integer.toString(b&0xff));
			}
			
			return sb.toString();
			
		}catch(Exception e) { throw new RuntimeException(e); }
	}

	@Override
	public Boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return senhaCifrada.equals(this.cifrarSenha(senha));
	}

}
