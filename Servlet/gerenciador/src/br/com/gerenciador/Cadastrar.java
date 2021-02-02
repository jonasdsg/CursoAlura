package br.com.gerenciador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.data.Banco;

@WebServlet(urlPatterns = "/cadastrar")
public class Cadastrar extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String nomeEmpresa = req.getParameter("nome");
		RequestDispatcher rd = req.getRequestDispatcher("/listagem.jsp");
		
		if(nomeEmpresa!=null) {
			Banco.add(nomeEmpresa);
			rd.forward(req, res);
		}
		
	}

}
