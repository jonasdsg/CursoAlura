package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
	private List<Filme> filmes;
	private LocacaoService service;
	
	@Before
	public void iniciarObjetos() {
		this.filmes = new ArrayList<Filme>();
		this.usuario = new Usuario("Usuario 1");
		this.service = new LocacaoService();
	}
	
	@Test(expected = FilmeSemEstoqueException.class)
	public void locacaoNaoPodeTerEstoqueVazio() throws Exception {
		Filme filme = new Filme();
		//cenário
		filme.setEstoque(null);
		filmes.add(filme);
		//ação
		this.service.alugarFilme(usuario, filmes);
	}
	
	@Test
	public void testeDataLocacao() throws Exception {
		Filme filme = new Filme();
		//Cenário
		filme.setEstoque(5);
		filmes.add(filme);
		//ação
		Locacao locacao = service.alugarFilme(usuario, filmes);
		//verificação
		assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
		assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(),DataUtils.adicionarDias(new Date(), 1)));
	}
	
	@Test
	public void testePrecoLocacao() {
		Filme filme = new Filme();
		filme.setPrecoLocacao(10.0);
		assertEquals(VALOR_LOCACAO,filme.getPrecoLocacao(),0.01);
	}
	
	@Test(expected = FilmeVazioException.class)
	public void testaLocacaoParaFilmeNulo() throws Exception {
		this.service.alugarFilme(usuario, null);
	}
	
	@Test(expected = UsuarioVazioException.class)
	public void testaLocacaoParaUsuarioNulo() throws Exception {
		Filme filme = new Filme();
		filme.setEstoque(5);
		filmes.add(filme);
		this.service.alugarFilme(null,filmes);
	}

}
