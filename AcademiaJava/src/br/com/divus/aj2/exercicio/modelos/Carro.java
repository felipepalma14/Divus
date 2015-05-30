package br.com.divus.aj2.exercicio.modelos;

public class Carro extends Automovel{
	
	private String tipo;
	
	public Carro(){
		
	}
	
	public Carro (String nome, String marca,String tipo){
		super(nome, marca);
		this.tipo = tipo;
	}
	
	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		super.imprime();
		System.out.println("Tipo do carro: " + this.getTipo());
	
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
