/*
 * @author Globalcode 
 *
 * TesteRecuperacao.java
 *
 */

package br.com.divus.aj4.labs.lab02_01.teste;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.divus.aj4.labs.lab02_01.beans.Cliente;


public class TesteRecuperacao {
    

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        String cpf = "11232404-6";
        String nomeArquivo = "Cliente" + cpf + ".ser";
        FileInputStream leitor = null;//new FileInputStream(nomeArquivo);
        ObjectInputStream leitorObjetos = null;//new ObjectInputStream(leitor);
        
        try {
            
            leitor = new FileInputStream(nomeArquivo);
            leitorObjetos = new ObjectInputStream(leitor);
            Cliente clienteRecuperado = (Cliente)leitorObjetos.readObject();
            
            
            /* 
             * Inserir o codigo de leitura a partir deste ponto 
             *
             */
        


            
            
            System.out.println("cliente recuperado: " + clienteRecuperado);
            
            
        } catch (IOException e) {
            System.out.println("Erro na operacao de I/O");
            e.printStackTrace();
        } finally {
        	// fechando os streams
        	try {
        		if (leitorObjetos != null)
        			leitorObjetos.close();
        		else if (leitor != null) {
        			leitor.close();
        		}
        	} catch (IOException ex) {
        		ex.printStackTrace();
        	}
        }
        
    }
    
}