package br.com.divus.aj2.pacote;

import java.util.Scanner;
import static br.com.divus.aj2.pacote.modelo.Imposto.*;
public class TesteCalcularImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		byte b= 0;
		
		while (b != 3){
			System.out.println("1 - Calcular IOF");
			System.out.println("2 - Calcular ILP");
			System.out.println("3 - Sair");
			
			b = entrada.nextByte();
			calcularImpostos(entrada, b);
		}
		
	}
	
	// fica statico pq no main ja possui definido static
	// nao eh necessario criar "new" para chamar recursos da classe
	private static void calcularImpostos(Scanner entrada, byte b) {
		
		switch (b) {
		case 1:
			System.out.println("Valor do IOF: " + calcularImpostoIOF(lerValores(entrada)));
			break;
		case 2:
			System.out.println("Valor do ILP: " + calcularImpostoILP(lerValores(entrada)));
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Opcao invalida!!!!");
			break;
		}
	
	}
	
	private static double lerValores(Scanner entrada){
		System.out.println("Entre com o valor");
		double valor = entrada.nextDouble();
		return valor;
	}

}
