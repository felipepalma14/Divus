package br.com.divus.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.divus.dao.ClienteDAO;
import br.com.divus.dao.IClienteDAO;
import br.com.divus.model.Cliente;

@WebServlet(urlPatterns = "/consultarclienteservlet")
public class ConsultarClienteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String cpf = req.getParameter("cpf");
		// Long id = Long.parseLong(req.getParameter("id"));
		System.out.println(cpf);
		Cliente c = new ClienteDAO().getClienteByCPF(cpf);

		req.setAttribute("cliente", c);

		System.out.println(c);
		req.getRequestDispatcher("consultarcliente.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		IClienteDAO dao = new ClienteDAO();
		String action = req.getParameter("action");
		if ((action != null) && (action.equals("excluir"))) {
			dao.excluir(req.getParameter("cpf"));
			resp.sendRedirect("listarclienteservlet");
			return;
		}
		System.out.println("Entrou no consultar cliente servlet");
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String telefone = req.getParameter("telefone");

		Long id = Long.parseLong(req.getParameter("id"));
		Cliente cliente = new Cliente(id, nome, cpf, telefone);
		dao.atualizar(cliente);

		resp.sendRedirect("listarclienteservlet");
	}
}
