package br.com.divus.aj2.teste;

import br.com.divus.aj2.modelo.Carro;
import br.com.divus.aj2.modelo.Pessoa;

public class TesteCarroCliente {
	
	public static void main(String[] args) {
	
	//Estanciando Objetos
	Pessoa pessoa = new Pessoa("Felipe", "111.222.333-09", "33366644");
	Carro carro = new Carro("Renault", "Sandero");
	
	//Associando Objetos Pessoa X Carro / Carro x Pessoa
	pessoa.setCarroProprietario(carro);
	carro.setPessoa(pessoa);
	
	
	System.out.println(carro.getPessoa().getNome());
	
	System.out.println(pessoa.getCarroProprietario().getNome());
	
	}
}
