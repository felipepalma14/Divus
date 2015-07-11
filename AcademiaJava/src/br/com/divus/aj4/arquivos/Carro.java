package br.com.divus.aj4.arquivos;

import java.io.Serializable;

public class Carro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String marca;
    transient private String chassi;//transient o atributo fica so em memoria, nao salva em arquivo,#seguranca
    
    
	public Carro() {
		
	}
	
	public Carro(String nome, String marca, String chassi) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.chassi = chassi;
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
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", marca=" + marca + ", chassi="
				+ chassi + "]";
	}
	
	
	
    
    
    
}
