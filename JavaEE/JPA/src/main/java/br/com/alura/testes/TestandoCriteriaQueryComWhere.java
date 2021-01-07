package br.com.alura.testes;

import javax.persistence.Persistence;

import br.com.alura.modelo.dao.MovimentacaoDAO;

public class TestandoCriteriaQueryComWhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovimentacaoDAO dao = new MovimentacaoDAO(Persistence.createEntityManagerFactory("contas"));
		dao.getMovimentacoesFiltradasPorData(null,null , 2020).forEach(m ->{
			System.out.println(m.getValor());
			System.out.println(m.getDescricao());
		});
	}

}
