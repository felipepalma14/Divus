package br.com.divus.generics;

import br.com.divus.model.Cliente;

public class ClienteDAO implements IGerenericDAO<Cliente>{

	public void salvar(Cliente cliente) {
		// TODO Auto-generated method stub
		System.out.println("Salvando cliente " + cliente);

	}

}
