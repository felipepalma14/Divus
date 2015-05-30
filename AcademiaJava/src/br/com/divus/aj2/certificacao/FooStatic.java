package br.com.divus.aj2.certificacao;

public class FooStatic {
	static int version = 5;
	static String name = "march";
	
	public static void method(){
		System.out.println(name+version);
	}
	
	public static void main(String[] args){
		FooStatic foo = new FooStatic();
		foo.method();
	}
}
