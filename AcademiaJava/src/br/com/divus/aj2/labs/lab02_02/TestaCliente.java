package br.com.divus.aj2.labs.lab02_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaCliente {

	public static void main(String[] args) {

		// Criacao do cliente
		// Inicializacao do cliente
		// Impressao dos dados do cliente

		Cliente cliente = new Cliente();

		cliente.inicializaCliente("Felipe Palma", "111.222.999-00");

		cliente.imprimeDados();

	}
}
