package br.com.divus.aj2.certificacao;

public class FooConstrutor {
	{
		System.out.println("print to aqui");
	}
	
	public FooConstrutor(byte b){
		System.out.println("skjdfs");
	}
	
	FooConstrutor(int b){
		System.out.println("skjdfs");
	}
	
	public static void main(String[] args){
		FooConstrutor foo = new FooConstrutor(2);
	}
}
