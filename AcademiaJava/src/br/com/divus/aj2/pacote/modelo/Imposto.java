package br.com.divus.aj2.pacote.modelo;

public class Imposto {
	 public static final double porcentagemIOF = 0.05;
     public static final double porcentagemILP = 0.08;
     public static final double porcentagemDilmas = 0.1;
     
     public static double calcularImpostoIOF(double valor){
    	 return valor * porcentagemIOF;
     }
     

     public static double calcularImpostoILP(double valor){
    	 return valor * porcentagemILP;
     }
     
     public static double calcularImpostoDilma(double valor){
    	 return valor * porcentagemDilmas;
     }
}
