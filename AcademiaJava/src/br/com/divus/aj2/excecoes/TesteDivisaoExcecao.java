package br.com.divus.aj2.excecoes;

public class TesteDivisaoExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a = 30;
		b = 0;
		
		try {
			System.out.println("iniciando try");
			System.out.println(a/b);
			System.out.println("finalizando try");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("fim do programa");
		
				
	}

}
