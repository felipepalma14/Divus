package br.com.divus.aj3.colletions;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTeste {

	public static void main(String[] args) {
		String nome1 = "William";
		String nome2 = "Zulu";
		String nome3 = "Felipe";
		String nome4 = "Marcos";
		String nome5 = "Rayssa";
		String nome6 = "Rachel";
		String nome7 = "Paulo";
		String nome8 = "Daniel";
		String nome9 = "Edivalber";

		Set<String> nomes = new TreeSet<String>();
		nomes.add(nome1);
		nomes.add(nome2);
		nomes.add(nome3);
		nomes.add(nome4);
		nomes.add(nome5);
		nomes.add(nome6);
		nomes.add(nome7);
		nomes.add(nome8);
		nomes.add(nome9);

		for (String n : nomes) {
			System.out.println(n);
		}
		System.out.println("-------- Navigable SET -------");
		NavigableSet<String> nomesNav = new TreeSet<String>(nomes);
		System.out.println(nomesNav.higher("Marcos"));
		System.out.println(nomesNav.subSet("Marcos", true, "Rayssa", true));
	}
}
