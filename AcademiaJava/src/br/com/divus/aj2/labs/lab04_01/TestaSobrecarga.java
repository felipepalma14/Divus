package br.com.divus.aj2.labs.lab04_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Execute esta classe para testar a sobrecarga do metodo inicializaConta da classe
 * Conta 
 *
 */
public class TestaSobrecarga {

	public static void main(String[] args) {
		// 1. Instanciar uma Conta c1
		Conta c1 = new Conta();
		// 2. Chame o metodo inicializaConta informando o saldo
		c1.inicializaConta(100, "11", "Felipe", "22", 01);
		// 3. Imprima os dados da Conta, usando o metodo imprimeDados
		c1.imprimeDados();
		// 4. Instanciar uma Conta c2
		Conta c2 = new Conta();
		// 5. Chame o metodo inicializaConta informando sem informar o saldo
		c2.inicializaConta("11", "Ana", "33", 02);
		// 6. Imprima os dados da Conta c2, usando o metodo imprimeDados
		c2.imprimeDados();
	}
}
