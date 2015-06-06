package br.com.divus.aj3.colletions;

import java.util.Set;
import java.util.TreeSet;

import br.com.divus.aj3.regex.modelo.Pessoa;


///  Ordenação por nome


public class TesteTreeSetPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Felicia", "111",4500);
		Pessoa p2 = new Pessoa("Maria", "222",3500);
		Pessoa p3 = new Pessoa("Felipe","333",1200);
		
		Set<Pessoa> pessoas = new TreeSet<Pessoa>();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		System.out.println(pessoas);
	}

}
