package br.com.divus.aj2.teste;

import br.com.divus.aj2.modelo.Carro;

public class TesteCarro {
	public static void main(String[] args) {
		Carro c1 = new Carro("gol","gti");
		Carro c2 = new Carro("corsa", "sedan");
		Carro c3 = new Carro("Audi","A3");
		
		//c1.vMax =200;
		
		Carro.aumentarVelocidade(30);
		
		c1.imprime();
		c2.imprime();
		c3.imprime();
	}
}
