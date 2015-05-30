package br.com.divus.aj2.labs.lab03_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta {

	public static void main(String[] args) {
		// Criar um objeto do tipo Conta
		Conta conta = new Conta();
		// Usar o metodo inicializaConta para fazer a inicializacao do objeto
		conta.inicializaConta(500, "111", "Felipe", 7252, 324);
		// criado
		// executar um deposito
		conta.deposito(500);
		// Imprimir o saldo apos o deposito
		conta.imprimeDados();
		// executar um saque cujo valor seja menor que o saldo
		conta.saque(30);
		// Imprimir o saldo apos o deposito
		conta.imprimeDados();
		// executar uma retirada cujo valor seja maior que o saldo
		conta.saque(3000);
		// Imprimir o saldo apos o deposito
		conta.imprimeDados();
	}
}
