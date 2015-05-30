package br.com.divus.aj2.teste;

import java.util.Scanner;

import br.com.divus.aj2.controller.ComputadorController;
import br.com.divus.aj2.modelo.Computador;

public class TesteComputador {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		Computador c = new Computador();
		ComputadorController controller = new ComputadorController();
		System.out.println("Entre com o nome do processador:");
		c.nomeProcessador = in.nextLine();

		System.out.println("Entre com o modelo:");
		c.modelo = in.nextLine();

		System.out.println("Entre com o espaco de HD:");
		c.espacoHD = in.nextInt();

		System.out.println("Entre com a quantidade de memoria:");
		c.qtdeMemoria = in.nextInt();

		System.out.println("Peso do computador");
		c.peso = in.nextDouble();

		System.out.println("Frete: ");
		c.frete = in.nextDouble();

		c.imprimir();
		System.out.println("Frete " + controller.calculaFrete(c) + " Reais.");

		in.close();
	}
}
