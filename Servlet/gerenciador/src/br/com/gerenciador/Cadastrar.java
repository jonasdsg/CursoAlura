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

@WebServlet(urlPatterns = "/cadastrar")
public class Cadastrar extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String nomeEmpresa = req.getParameter("nome");
		String dataCriacao = req.getParameter("data");
		
		//RequestDispatcher rd = req.getRequestDispatcher("/listar.jsp");
		
		if(nomeEmpresa!=null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date data = sdf.parse(dataCriacao);
				Banco.add(nomeEmpresa,data);
				
			} catch (ParseException e) {
				throw new ServletException(e);
			}
			//rd.forward(req, res);
			res.sendRedirect("listar.jsp");
		}
		
	}

}
