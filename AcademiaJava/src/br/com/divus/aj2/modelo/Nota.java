package br.com.divus.aj2.modelo;

public class Nota {
	
	private double valorNota;
	private String data;
	
	public Nota(double nota,String data){
		this.valorNota = nota;
		this.data = data;
	}
	
	public double getValorNota() {
		return valorNota;
	}
	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	

}
