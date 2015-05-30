package br.com.divus.aj2.modelo;

public class Computador {
	public String nomeProcessador;
	public int espacoHD;
	public String modelo;
	public int qtdeMemoria;
	public double peso;
	public double frete;

	public void imprimir() {
		System.out.println("Venda um computador:" + this.modelo);
		System.out.println("Com processador: " + this.nomeProcessador);
		System.out.println(this.qtdeMemoria + " Gb de RAM");
		System.out.println(this.espacoHD + " Gb de HD");
		System.out.println("Peso: " + this.peso + "kg");

	}

}
