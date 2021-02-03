package br.com.gerenciador.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.gerenciador.model.Empresa;

public class Banco {
	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public static Empresa add(String nome) {
		Empresa empresa = null;
		
		if(nome!=null || "".contains(nome)) {			
			empresa = new Empresa(nome);
			Banco.empresas.add(empresa);
		}
		return empresa;
	}
	
	public static List<Empresa> list(){
		return Collections.unmodifiableList(empresas);
	}
	
	public static void del(String nome) {
		empresas.removeIf(empresa-> empresa.getNome().equals(nome));
	}
}