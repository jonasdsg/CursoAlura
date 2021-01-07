package br.com.alura.lojaweb.maven;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produto;

@WebServlet(urlPatterns = {"/contato"})
public class ContatoServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{		
		Produto p = new Produto("nome",1.2);
		PrintWriter writer = resp.getWriter();
		writer.println("<html><h2>Teste restart</h2></html>");
		writer.close();
	}
	

}
