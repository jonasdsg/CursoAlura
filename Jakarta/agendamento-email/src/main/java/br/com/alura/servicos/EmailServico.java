package br.com.alura.servicos;

import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class EmailServico {
	public List<String> getEmails(){
		return List.of("teste@teste.com");
	}
}
