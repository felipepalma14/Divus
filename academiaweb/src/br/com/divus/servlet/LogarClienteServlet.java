package br.com.divus.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/logarclienteservlet")
public class LogarClienteServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String login = req.getParameter("username");
		String senha = req.getParameter("password");
		if (login.equals("anna") && senha.equals("123")) {
			HttpSession session = req.getSession();
			session.setAttribute("usuario", "anna");
			resp.sendRedirect("index.html");
			return;
		}
		System.out.println("login: " + login);
		System.out.println("senha: " + senha);

		resp.sendRedirect("login.html");
	}

}
