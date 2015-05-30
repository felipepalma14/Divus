
package br.com.divus.aj2.labs.lab02_02;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Analise o codigo
 * 
 */
class Cliente {

    String nome;
    String cpf;

    /**
     * @param nomeCliente
     *            nome do cliente
     * @param cpfCliente
     *            cpf do cliente
     */
    void inicializaCliente(String nomeCliente, String cpfCliente) {
        cpf = cpfCliente;
        nome = nomeCliente;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------------");
    }
}
