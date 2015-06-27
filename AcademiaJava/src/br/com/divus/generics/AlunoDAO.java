package br.com.divus.generics;

import br.com.divus.model.Aluno;

public class AlunoDAO implements IGerenericDAO<Aluno>{

	public void salvar(Aluno aluno){
		System.out.println("Salvando aluno " + aluno);
	}
}
