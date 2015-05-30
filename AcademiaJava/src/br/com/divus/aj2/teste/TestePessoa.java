package br.com.divus.aj2.teste;

import br.com.divus.aj2.modelo.Pessoa;

public class TestePessoa {
	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("felipe", "111.222.333-89", "99887711");

		Pessoa p2 = new Pessoa("ana", "222.333.111-87", "88774411", "Claudia",
				"Fernanda", "Chica");

		// String[] nomes = { "Ana", "Bia", "Carol" };

		// p1.setDep(nomes);
		// p2.setDep(new String[] { "Ana", "Bia", "Carol" });

		p1.imprimePessoa();
		p2.imprimePessoa();

		// System.out.println(Arrays.toString(nomes));
	}
}
