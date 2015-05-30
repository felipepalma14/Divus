package br.com.divus.aj2.classeabstrata.modelos;

public abstract class Pessoa {
	
	protected String nome;
	protected double salario;
	
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	//Regras
	/**
	 * Se um metodo eh abstrato,a classe deve ser abstrata.
	 * O metodo nao deve ter corpo, apenas a assinatura
	 * A classe abstrata pode ter metodos nao abstratos
	 */
	
	public abstract void gerarReciboPagamento();
	
	public void imprime(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Salario: " + this.salario);
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}   
