
package br.com.divus.aj2.labs.lab02_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Seguindo o modelo da classe Cliente, crie o metodo 
 *    inicializaAgencia da classe Agencia
 * 
 */


class Agencia {

    String numero;
    int banco;

    /**
     * Metodo para impressao de todos os dados da classe
     */
    
    void inicializaAgencia(String numero, int banco){
    	this.numero = numero;
    	this.banco = banco;
    }
    
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + this.numero);
        System.out.println("Banco no." + this.banco);
        System.out.println("----------------------");
    }
}
