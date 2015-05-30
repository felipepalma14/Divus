package br.com.divus.aj2.labs.lab03_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaAgencia {

	public static void main(String[] args) {
		// Inicializar um objeto do tipo Agencia
		Agencia agencia = new Agencia();
		// usar o metodo inicializaAgencia (ver quais sao os parametros na
		agencia.inicializaAgencia("111", 324);
		// classe Agencia)
		// Imprimir os dados da agencia
		agencia.imprimeDados();
	}
}
