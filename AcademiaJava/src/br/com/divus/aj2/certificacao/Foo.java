package br.com.divus.aj2.certificacao;

public class Foo {
	public static void main(String[] args) {
		Foo foo = new Foo();
		short s1 = 123;
		short s2 = 456;

		foo.method(s1, s2);
		/*
		 * essa é a ordem de precedencia "Long" "int" "short" "byte"
		 */

	}

	public void method(int... param) {
		System.out.println("var args");
	}

	public void method(int a, int b) {
		System.out.println("two int");
	}

	public void method(int a, long b) {
		System.out.println("a int and a long");
	}

	public void method(long x, int y) {
		System.out.println("a long and a int");
	}
}
