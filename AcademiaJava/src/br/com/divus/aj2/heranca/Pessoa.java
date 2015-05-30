package br.com.divus.aj2.heranca;

public class Pessoa {
	protected String nome;
	
	public Pessoa(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprime(){
		System.out.println("Nome: "+ this.nome);
		
	}
}
