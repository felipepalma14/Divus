/**
 * @author Globalcode 
 * TesteGravacaoCliente.java
 */

package br.com.divus.aj4.labs.lab02_01.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.divus.aj4.labs.lab02_01.beans.Cliente;

public class TesteGravacaoCliente {
    
    public static void main(String[] args) throws IOException {
        
        Cliente cliente1 = new Cliente("Joao da Silva", "11-8558-7447", "11232404-6", 1);
        String nomeArquivo1 = "Cliente" + cliente1.getCpf() + ".ser";
        FileOutputStream gravador = null;//new FileOutputStream(nomeArquivo1);
        ObjectOutputStream gravadorObjetos = null;//new ObjectOutputStream(gravador);        
        
        try {
            gravador = new FileOutputStream(nomeArquivo1);
            gravadorObjetos = new ObjectOutputStream(gravador);
            gravadorObjetos.writeObject(cliente1);

            /* 
		     * preencha o codigo de escrita de objeto a partir deste ponto
		     *  
		     */


            
            
			System.out.println("Cliente gravado com sucesso!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
        	// fechando os streams
        	try {
        		if (gravadorObjetos != null)
        			gravadorObjetos.close();
        		else if (gravador != null) {
        			gravador.close();
        		}
        	} catch (IOException ex) {
        		ex.printStackTrace();
        	}
        }
    }
}
