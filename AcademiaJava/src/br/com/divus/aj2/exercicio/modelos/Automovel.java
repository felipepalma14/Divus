package br.com.divus.aj2.exercicio.modelos;

public class Automovel {
	protected String nome;
	protected String marca;
	
	public Automovel(){
		
	}
	
	public Automovel(String nome,String marca){
		this.nome = nome;
		this.marca = marca;
	}
	
	public void imprime(){
		System.out.println("Nome do carro: " + this.getNome());
		System.out.println("Marca: " + this.getMarca());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
