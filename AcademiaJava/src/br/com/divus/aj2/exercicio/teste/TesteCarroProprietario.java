package br.com.divus.aj2.exercicio.teste;

import java.util.Scanner;

import br.com.divus.aj2.exercicio.modelos.Carro;
import br.com.divus.aj2.exercicio.modelos.Proprietario;

public class TesteCarroProprietario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Proprietario prop1 = new Proprietario();
		Carro car1 = new Carro();
		//Carro car1 = new Carro("Sandero STW", "Renault", "Passeio");
		
	
		
		/**
		prop1.setNome("Felipe");
		prop1.setCpf("11");
		prop1.setCarro(car1);
		
		prop1.imprime();
		
		
		Proprietario prop2 = new Proprietario();
		Carro car2 = new Carro("Fiat", "Uno", "Passeio");
		
		prop2.setNome("teste");
		prop2.setCpf("testeCPF");
		prop2.setCarro(car2);
		
		prop2.imprime();
		*/
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Nome do Proprietario: ");
		prop1.setNome(ler.nextLine());
		
		System.out.println("CPF: ");
		prop1.setCpf(ler.nextLine());
		
		System.out.println("Nome do Carro: ");
		car1.setNome(ler.next());
		
		System.out.println("Modelo: ");
		car1.setMarca(ler.next());
		
		System.out.println("Tipo do Carro: ");
		car1.setTipo(ler.next());
		
		ler.close();
		
		prop1.setCarro(car1);
		prop1.imprime();

	}

}
