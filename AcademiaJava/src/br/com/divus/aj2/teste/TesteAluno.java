package br.com.divus.aj2.teste;

import br.com.divus.aj2.controller.AlunoController;
import br.com.divus.aj2.modelo.Aluno;

public class TesteAluno {
	public static void main(String args[]) {

		Aluno al = new Aluno("Felipe","123.333.666-98");
		AlunoController ac = new AlunoController();

		//al.nome = "Felipe";
		//al.setNota(1);
		int notaRecuperacao = 7;

		al.imprime();

	}
}	
//boolean situacaoAprovacao = ac.isAprovado(al.getNota());
/**
		System.out.println("Aprovado de Primeira? " + situacaoAprovacao);

		if (situacaoAprovacao == false) {
			System.out.println("Aprovado Recuperacao? "
					+ ac.isAprovadoRecuperacao(al, notaRecuperacao));
		}

		// al.isAprovado();// nao imprime, faz a operacao mas n é solicitado
		// impressao

	}

}
*/