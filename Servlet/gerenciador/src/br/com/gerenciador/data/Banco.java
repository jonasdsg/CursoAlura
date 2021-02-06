package br.com.gerenciador.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import br.com.gerenciador.model.Empresa;

public class Banco {
	private static List<Empresa> empresas = new ArrayList<Empresa>();
	
	public static Empresa add(String nome,Date data) {
		Empresa empresa = null;
		
		if(nome!=null || "".contains(nome) && data!=null) {			
			empresa = new Empresa(nome,data);
			Banco.empresas.add(empresa);
		}
		return empresa;
	}
	
	public static List<Empresa> list(){
		return Collections.unmodifiableList(empresas);
	}
	
	public static void del(String id) {
		empresas.removeIf(empresa-> empresa.getId()==Long.parseLong(id));
	}
	
	public static void edit(Empresa empresa) {
		for(Empresa e: empresas) {
			if(e.getId()==empresa.getId()) {
				e.setData(empresa.getData());
				e.setNome(e.getNome());
			}
		}
	}
}
