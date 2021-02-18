package br.com.alura.escola.indicacao;
import static java.util.Objects.isNull;

import br.com.alura.escola.aluno.Aluno;
public class Indicacao {
	private Aluno indicacao;
	private Aluno indicante;

	Indicacao(Aluno indicante, Aluno indicacao){
		if( isNull(indicante) || isNull(indicacao)){			
			throw new IllegalArgumentException("Uma indicação não pode conter objeto nulo!");
		}
		this.indicante = indicante;
		this.indicacao = indicacao;	
	}
}
