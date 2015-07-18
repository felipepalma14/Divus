package br.com.divus.aj4.arquivos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteFile {
	
	//Evitar estanciar toda fez que chamar o metodo
	private static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	public static void main(String[] args) throws IOException {
		
		//File file = new File("arquivo.txt");
		//imprimirPropriedades(file);
		
		File file = new File("C:\\Users\\LAB101\\Documents\\teste3");
		
		//System.out.println("Data de modificacao" + file.lastModified());
		
		//System.out.println("Criar diretorio" + file.mkdir());	
		
		//criarNovoArquivo(file);
		imprimirPropriedades(file);
		//funciona apenas se for diretorio
		imprimirArquivoDiretorio(file);
		
		imprimirArquivosPorExtensao(file);
	}
	
	
	/*
	 * Sobrecarga dos metodos imprimirArquivoPorExtensao
	 * obtendo o tipo de extensao
	 * Feito de duas formas diferentes
	 */
	
	public static void imprimirArquivosPorExtensao(File file) throws IOException{
		FiltroPorExtensao filtro = new FiltroPorExtensao(".xml");
		String[] arquivos = file.list(filtro);
		for (String arquivo : arquivos) {
			System.out.println(arquivo);
		}
	}
	
	public static void imprimirArquivosPorExtensao(File file,String extensao) throws IOException{
		System.out.println("\nArquivos com extensao: " + extensao);
		for (String arquivo : file.list(new FiltroPorExtensao(extensao))) {
			System.out.println(arquivo);
			
		}
	}
	
	
	public static boolean criarNovoArquivo(File file) throws IOException{
		return file.createNewFile();
	}
	
	public static boolean criarNovoDiretorio(File file) throws IOException{
		return file.mkdir();
	}
	
	public static void imprimirArquivoDiretorio(File file) {
		
		String[] listfiles = file.list();
		System.out.println("\nArquivos no diretorio: ");
		for (String arquivo : listfiles) {
			//lista os arquivos existes no diretorio
			System.out.println(arquivo);
		}
	}

	public static void imprimirPropriedades(File file) throws IOException {
		//File file = new File("arquivo2.txt");
		
		//System.out.println("Criando arquivo: " +  file.createNewFile());
		
		System.out.println("O arquivo existe? " + file.exists());
		System.out.println("Modo de leitura ativado? " + file.canRead());
		System.out.println("O arquivo esta oculto" + file.isHidden());
		System.out.println("Diretorio" + file.isDirectory());
		System.out.println("� um arquivo: " + file.isFile());
		System.out.println("Tamanho? " + file.length());
		
		//SimpleDateFormat data = new SimpleDateFormat("dd/MM/Y h:mm:ss");
		System.out.println("Data de modifica��o"+format.format(file.lastModified()));
	}
	
	
}
