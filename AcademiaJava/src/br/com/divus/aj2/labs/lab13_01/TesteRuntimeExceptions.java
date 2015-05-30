package br.com.divus.aj2.labs.lab13_01;
public class TesteRuntimeExceptions {

    public static void main(String[] args) {
        // Leitura do parametro digitado pelo usuario como parametro do main
    	
    	try{
            String parametro1 = "1";
            int numero = Integer.parseInt(parametro1);
            System.out.println(numero);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
        
    }
}
