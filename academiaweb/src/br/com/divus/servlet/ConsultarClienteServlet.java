package br.com.divus.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.divus.dao.ClienteDAO;
import br.com.divus.model.Cliente;

@WebServlet(urlPatterns = "/consultarclienteservlet")
public class ConsultarClienteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String cpf = req.getParameter("cpf");
		//Long id = Long.parseLong(req.getParameter("id"));
		Cliente c = new ClienteDAO().getClienteByCPF(cpf);

		req.setAttribute("cliente", c);

		req.getRequestDispatcher("consultarcliente.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("Entrou no consultar cliente servlet");
		String nome = req.getParameter("nome");
		String telefone = req.getParameter("telefone");
		String cpf = req.getParameter("cpf");
		Long id = Long.parseLong(req.getParameter("id"));
		Cliente cliente = new Cliente(id, nome, cpf, telefone);
		System.out.println("Salvando cliente " + cliente);

	}
}
