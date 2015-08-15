package br.com.divus.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

import br.com.divus.dao.ClienteDAO;
import br.com.divus.dao.IClienteDAO;
import br.com.divus.model.Cliente;

@WebServlet (urlPatterns="/listarclienteservlet")

public class ListarClienteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		IClienteDAO dao = new ClienteDAO();
		List<Cliente> clientes = dao.getAllClientes();
		
		req.setAttribute("clientes", clientes);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("listarcliente.jsp");
		dispatcher.forward(req, resp);
		//resp.sendRedirect("listarcliente.jsp");
	}
}
