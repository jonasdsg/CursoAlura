package br.com.gerenciador.olamundo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ola")
public class OlaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Ola mundo</h1>");
		out.print("<p>");
		out.print("</h1>");
		out.print("</bodyl>");
		out.print("</html>");
	}

}
