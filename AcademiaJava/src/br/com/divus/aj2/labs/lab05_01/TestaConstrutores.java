package br.com.divus.aj2.labs.lab05_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
    	
    	Conta conta = new Conta(1200.00, "222", "Felipe", "111", 222);
    	
    	Conta conta1 = new Conta("123", "Felipe Palma", "789", 1);
    	
    	conta.imprimeDados();
    	conta1.imprimeDados();
    	
    	Cliente cliente = new Cliente("Felipe","01824415206");
    	
    	cliente.imprimeDados();
    	
    }
}
