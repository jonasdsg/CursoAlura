package br.com.alura.controllers;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entidade.AgendamentoEmail;

@Path("/email")
@Consumes(value = MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class AgendamentoController {
	
	@Inject
	private AgendamentoEmailDAO dao;
	
	@GET
	public Response obter() {
		return Response.ok(dao.listar()).build(); 
	}
	
	@PUT
	public Response inserir(AgendamentoEmail agendamento) {
		dao.inserir(agendamento);
		return Response.accepted().build();
	}
}
