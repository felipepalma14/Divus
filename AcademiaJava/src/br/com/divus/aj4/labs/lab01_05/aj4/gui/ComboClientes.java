/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.divus.aj4.labs.lab01_05.aj4.gui;

import java.util.List;

import javax.swing.JComboBox;

import br.com.divus.aj4.labs.lab01_05.aj4.dao.ClientesDAO;
import br.com.divus.aj4.labs.lab01_05.aj4.dao.IClientesDAO;
import br.com.divus.aj4.labs.lab01_05.model.Cliente;
import br.com.divus.aj4.labs.lab01_05.util.GlobalcodeException;

/**
 * Classe que estende JComboBox para criar um combo de clientes do banco de
 * dados.
 */
public class ComboClientes extends JComboBox {

	public ComboClientes() throws GlobalcodeException {
		this.reloadFromDatabase();
	}

	public void reloadFromDatabase() throws GlobalcodeException {
		IClientesDAO db = new ClientesDAO();
		List<Cliente> clientes = db.getAllClientes();
		this.removeAllItems();
		for (Cliente c : clientes) {
			this.addItem(c);
		}
	}
}
