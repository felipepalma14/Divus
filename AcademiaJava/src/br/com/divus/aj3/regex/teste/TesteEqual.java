package br.com.divus.aj3.regex.teste;

import br.com.divus.aj3.regex.modelo.Pessoa;

public class TesteEqual {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joana", "111");
		Pessoa p2 = new Pessoa("Joana", "111");
		Pessoa p3 = new Pessoa("Joana", "222");

		System.out.println("p1 igual p2 " + p1.equals(p2));
		System.out.println("p2 igual p3 " + p2.equals(p3));

		System.out.println(p1.hashCode());

		System.out.println(p2.hashCode());

		System.out.println(p3.hashCode());

	}
}
