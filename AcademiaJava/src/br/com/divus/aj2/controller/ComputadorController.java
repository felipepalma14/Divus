package br.com.divus.aj2.controller;

import br.com.divus.aj2.modelo.Computador;

public class ComputadorController {

	public double calculaFrete(Computador computador) {
		double valor = computador.frete * 5.0;
		return valor;
	}

}
