package br.com.divus.testes;

import java.util.List;

import br.com.divus.dao.ClienteDAO;
import br.com.divus.model.Cliente;

public class TesteListarCliente {
	public static void main(String[] args) {
		ClienteDAO dao = new ClienteDAO();
		
		Cliente teste = new Cliente();
		teste.setNome("Ana");
		teste.setCpf("444.444.444-44");
		
		System.out.println(dao.inserir(teste));
		
		
		List<Cliente> clientes = dao.listarClientes();
		//List<Cliente> clientes = dao.buscarPorNome("");
		for (Cliente cliente : clientes){ //dao.listarClientes()) {
			System.out.println(cliente);
		}
	}

}