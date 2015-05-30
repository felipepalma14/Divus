package br.com.divus.aj3.colletions;

import java.util.ArrayList;
import java.util.List;

import br.com.divus.aj3.regex.modelo.Pessoa;

public class TesteCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Joana", "111");
		Pessoa p2 = new Pessoa("Joana", "111");
		Pessoa p3 = new Pessoa("Joana", "222");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		System.out.println("tamanho: " + pessoas.size());
		
		Pessoa p4 = new Pessoa("Carlos","444");
		
		System.out.println("Lista de pessoas contem carlos " + pessoas.contains(p4));
		
		
		

	}

}
