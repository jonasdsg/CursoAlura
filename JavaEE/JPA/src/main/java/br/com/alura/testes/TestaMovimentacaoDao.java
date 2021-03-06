package br.com.alura.testes;

import javax.persistence.Persistence;

import br.com.alura.modelo.Conta;
import br.com.alura.modelo.dao.MovimentacaoDAO;

public class TestaMovimentacaoDao {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.setId(1L);
		MovimentacaoDAO dao = new MovimentacaoDAO(Persistence.createEntityManagerFactory("contas"));
		
		dao.getMovimentacoesConta(c).forEach(m->{
			System.out.println(m);
		});
		
		dao.getSomaDasMovimentacoesAgrupadasPorData().forEach(m->{
			System.out.println("Dia: "+m.getDia()+'/'+m.getMes());
			System.out.println("Valor: "+m.getValor());
			System.out.println("___________________________");
		});
	}

}
