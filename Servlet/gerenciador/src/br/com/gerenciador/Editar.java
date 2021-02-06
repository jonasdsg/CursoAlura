package br.com.gerenciador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.data.Banco;
import br.com.gerenciador.model.Empresa;

@WebServlet(urlPatterns = "/editar")
public class Editar extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Empresa emp = null;
		for(Empresa e:Banco.list()) {
			if(e.getId() == Long.valueOf(id)) {
				emp = e;
			}
		}

		if(emp!=null) {			
			RequestDispatcher rd = req.getRequestDispatcher("cadastro.jsp");
			req.setAttribute("empresa", emp);
			rd.forward(req, resp);
		}else {
			Empresa e = new Empresa();
			resp.sendRedirect("listar.jsp");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String nome = req.getParameter("nome");
		String data = req.getParameter("data");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date criacao;
		try {
			criacao = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		System.out.println("id: "+id+", nome: "+nome+", data: "+data);
		Empresa emp = new Empresa(Long.valueOf(id),nome,criacao);
		
		if(emp!=null) {
			Banco.edit(emp);
		}
		resp.sendRedirect("listar.jsp");
	}
}
