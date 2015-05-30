package br.com.divus.aj2.excecoes;

public class TesteGeradorArquivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeradorDeArquivos ga = new GeradorDeArquivos();
		String nomeArquivo = null;
		ga.criarArquivos(nomeArquivo);
		
		System.out.println("Arquivo criado com sucesso!!");
	}

}
