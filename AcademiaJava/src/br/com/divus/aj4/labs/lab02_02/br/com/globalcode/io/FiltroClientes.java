/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 *
 */
package br.com.divus.aj4.labs.lab02_02.br.com.globalcode.io;

import java.io.File;
import java.io.FilenameFilter;

public class FiltroClientes implements FilenameFilter {
	
	private String extensao;
	
	public FiltroClientes(String extensao){
		this.extensao = extensao;
	}
	public boolean accept(File dir, String nomeDoArquivo) {
		
		boolean inicioOk = false;
		boolean extensaoOk = false;

		/*
		 * inserir código a partir daqui
		 */
		if (nomeDoArquivo.startsWith("Cliente") && nomeDoArquivo.endsWith(".ser")){
			inicioOk = true;
			extensaoOk = true;
		}
		return inicioOk && extensaoOk;
	}
}
