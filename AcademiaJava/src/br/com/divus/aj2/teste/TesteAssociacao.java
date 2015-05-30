package br.com.divus.aj2.teste;

import br.com.divus.aj2.modelo.Aluno;
import br.com.divus.aj2.modelo.Turma;

public class TesteAssociacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma turma = new Turma("Computacao","2");
		
		Aluno aluno = new Aluno("Felipe", "111.222.333-06");
		
		aluno.setTurma(turma);
		
		System.out.printf("Aluno(a): %s\nCurso: %s\nSala: %s",aluno.getNome(),aluno.getTurma().getNome(), aluno.getTurma().getSala());
		

	}

}
