package br.com.divus.aj2.teste;

import br.com.divus.aj2.modelo.Aluno;
import br.com.divus.aj2.modelo.Nota;

public class TesteAssocAlunoNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno("Felipe", "123");
		
		Nota[] notas = new Nota[2];
		//sempre iniciar o array
		Nota n1 = new Nota(5.5, "14/01/2015");
		Nota n2 = new Nota(8,"08/02/2015");
		
		notas[0] = n1;
		notas[1] = n2;
		
		aluno.setNotas(notas);
		aluno.setNotas(notas);
		
		aluno.imprime();
		
		

	}

}
