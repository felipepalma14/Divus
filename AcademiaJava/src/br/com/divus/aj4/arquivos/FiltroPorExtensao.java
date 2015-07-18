package br.com.divus.aj4.arquivos;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroPorExtensao implements FilenameFilter{
	
	private String extensao;
	/*
	 * A extensao do arquivo deve ser passada obrigatoriamente
	 * no construtor
	 */
	
	public FiltroPorExtensao(String extensao){
		this.extensao = extensao;
	}
	
	/*
	 * Verifica a extensao do arquivo
	 */
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(extensao);
	}
}
