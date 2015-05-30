package br.com.divus.aj2.labs.lab08_01;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o INF devido.
 */
public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(double limite,String num,Cliente tit,Agencia ag){
		super(num,tit,ag);
		this.limite = limite;
	}
	
	public ContaEspecial(double limite,double saldoInicial,String num,Cliente tit,Agencia ag){
		super(saldoInicial,num,tit,ag);
		this.limite = limite;
		this.saldo = saldoInicial;
	}
	
	public void saque(double valor){
		//double totalDisponivel = this.limite + this.saldo;
		this.saldo += this.limite;
		super.saque(valor);
	}
	
	public void imprimeDados(){
		super.imprimeDados();
		System.out.println("######## Conta Especial #######");
		System.out.println("Limite Especial: "+ this.limite);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
}
