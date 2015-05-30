package br.com.divus.aj2.exercicio.modelos;

public class Proprietario {
	private String nome;
	private String cpf;
	private Carro carro;
	
	
	public void imprime (){
		System.out.println("Proprietario: " + getNome());
		System.out.println("CPF: " + getCpf());
		carro.imprime();
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
	
	
	
	
	

}
