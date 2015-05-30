package br.com.divus.aj2.modelo;

public class Carro {
	private String nome;
	private String Modelo;
	
	Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public static double VMAX = 250;
	
	public Carro(String nome,String modelo){
		this.setModelo(modelo);
		this.setNome(nome);
	}
	
	public static void aumentarVelocidade(double velocidade){
		VMAX += velocidade;
	}

	public void imprime(){
		System.out.println("------------------------");
		System.out.println("Nome: "+this.getNome());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Velocidade Maximna: "+VMAX);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	
}
