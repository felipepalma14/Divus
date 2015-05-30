package br.com.divus.aj2.labs.lab03_01;

/*

 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

	public static void main(String[] args) {
		// Criacao do cliente
		Cliente cliente = new Cliente();
		// Inicializacao do cliente usando o metodo inicializaCliente
		cliente.inicializaCliente("Felipe", "123123");
		// Impressao dos dados do cliente
		cliente.imprimeDados();
	}
}
