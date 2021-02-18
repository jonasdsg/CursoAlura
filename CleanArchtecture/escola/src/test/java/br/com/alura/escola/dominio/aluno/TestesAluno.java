package br.com.alura.escola.dominio.aluno;

import static br.com.alura.escola.dominio.aluno.FabricaDeAluno.novoAluno;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;

public class TestesAluno {
	
	@Test
	public void testeEmailValido() {
		Email email  = new Email("teste11_@test.co");
		assertEquals("teste11_@test.co", email.getEmail());
	}
	
	@Test
	public void testeEmailInvalido() {
		assertThrows(IllegalArgumentException.class,()->{
			new Email("teste-11_@test.co");
		});
	}
	
	@Test
	public void testeCPFValido() {
		CPF cpf = new CPF("111.222.333-44");
		assertEquals("111.222.333-44",cpf.getCpf());
	}
	
	@Test
	public void testeCPFInvalido() {
		assertThrows(IllegalArgumentException.class,()->{
			new CPF("11.44");	
		});
	}
	
	@Test
	public void testarBuilderAluno() {
		Aluno aluno = novoAluno()
						.comNome("Teste")
						.comEmail("teste_teste@email.com")
						.comCPF("111.222.333-44")
						.criar();
		
		assertNotNull(aluno);
	}
	
	@Test
	public void testarBuilderAlunoInvalido() {
		assertThrows(IllegalArgumentException.class,()->{
			novoAluno().criar();
		});
	}
	
}
