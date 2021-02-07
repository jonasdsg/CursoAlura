package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.utils.DataUtils.adicionarDias;

import java.util.Arrays;
import java.util.Date;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.FilmeVazioException;
import br.ce.wcaquino.exceptions.UsuarioVazioException;

public class LocacaoService {
	
	public Locacao alugarFilme(Usuario usuario, Filme filme) throws Exception {
		Locacao locacao = new Locacao();
		
		if(filme == null) {
			throw new FilmeVazioException("Não há uma instancia de filme");
		}
		
		if(Arrays.asList(0,null).contains(filme.getEstoque())) {			
			throw new FilmeSemEstoqueException("Filme não possui estoque");
		}
		
		if(usuario == null) {
			throw new UsuarioVazioException("O usuário está nulo");
		}
		
		locacao.setFilme(filme);
		locacao.setUsuario(usuario);
		locacao.setDataLocacao(new Date());
		locacao.setValor(filme.getPrecoLocacao());

		//Entrega no dia seguinte
		Date dataEntrega = new Date();
		dataEntrega = adicionarDias(dataEntrega, 1);
		locacao.setDataRetorno(dataEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return locacao;
	}

	public static void main(String[] args) {
		
	}
}