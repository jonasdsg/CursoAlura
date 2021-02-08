package br.ce.wcaquino.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.DoubleStream;

public class Locacao {

	private Usuario usuario;
	private List<Filme> filme;
	private Date dataLocacao;
	private Date dataRetorno;
	private List<Double> valor;
	
	public Locacao() {
		this.filme = new ArrayList<Filme>();
		this.valor = new ArrayList<Double>();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataRetorno() {
		return dataRetorno;
	}
	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	public Double getValor() {
		Double valor = 0.0;
		for(Double v: this.valor) {
			valor += v;
		}
		return valor;
	}
	public void setValor(Double valor) {
		this.valor.add(valor);
	}
	public List<Filme> getFilme() {
		return Collections.unmodifiableList(filme);
	}
	public void setFilme(Filme filme) {
		this.filme.add(filme);
	}
}