package br.com.alura.leilao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.models.ListagemLeiloesPage;

public class CadastrarLeilaoTest {
	ListagemLeiloesPage listagem;

	@BeforeEach
	public void before() {
		this.listagem = ListagemLeiloesPage.obterListagemLeiloesPage("fulano", "pass");
	}
	
	@AfterEach
	public void after() {
		this.listagem.fechar();
	}
	
	@Test
	public void deveCadastrarLeilao() {
		String produto = "UNIT_TESTE";
		Double valor = 500.0;
		listagem.cadastrarLeilaoPara(produto, valor);
		assertTrue(listagem.checarSeUltimoCadastroPossui(produto, valor));
	}
}
