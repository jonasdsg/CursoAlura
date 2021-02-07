package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.FilmeVazioException;
import br.ce.wcaquino.exceptions.UsuarioVazioException;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {
	private final double VALOR_LOCACAO = 10.0;
	private Usuario usuario;
	private Filme filme;
	private LocacaoService service;
	
	@Before
	public void iniciarObjetos() {
		this.usuario = new Usuario("Usuario 1");
		this.filme = new Filme();
		this.filme.setNome("Filme 1");
		this.service = new LocacaoService();
	}
	
	@Test(expected = FilmeSemEstoqueException.class)
	public void locacaoNaoPodeTerEstoqueVazio() throws Exception {
		//cenário
		this.filme.setEstoque(null);
		//ação
		this.service.alugarFilme(usuario, filme);
	}
	
	@Test
	public void testeDataLocacao() throws Exception {
		//Cenário
		this.filme.setEstoque(5);
		//ação
		Locacao locacao = service.alugarFilme(usuario, filme);
		//verificação
		assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
		assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(),DataUtils.adicionarDias(new Date(), 1)));
	}
	
	@Test
	public void testePrecoLocacao() {
		this.filme.setPrecoLocacao(10.0);
		assertEquals(VALOR_LOCACAO,this.filme.getPrecoLocacao(),0.01);
	}
	
	@Test(expected = FilmeVazioException.class)
	public void testaLocacaoParaFilmeNulo() throws Exception {
		this.service.alugarFilme(usuario, null);
	}
	
	@Test(expected = UsuarioVazioException.class)
	public void testaLocacaoParaUsuarioNulo() throws Exception {
		this.filme.setEstoque(5);
		this.service.alugarFilme(null,filme);
	}

}
