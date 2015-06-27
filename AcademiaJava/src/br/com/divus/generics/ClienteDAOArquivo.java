package br.com.divus.generics;

import br.com.divus.model.Cliente;

public class ClienteDAOArquivo implements IGerenericDAO<Cliente>{

	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Salvando cliente no arquivo " + cliente);
		
	}
	

}
