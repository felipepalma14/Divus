package br.com.divus.aj2.excecoes;

public class GeradorDeArquivos {
	public void criarArquivos(String nome){
		try {
			System.out.println("Criando arquivo..." + nome.toUpperCase());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocorrer um erro ao criar arquivo" 
					+ e.getMessage());
			e.printStackTrace();
		}
	}
}
