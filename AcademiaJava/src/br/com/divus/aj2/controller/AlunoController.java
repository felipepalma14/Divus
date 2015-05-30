package br.com.divus.aj2.controller;

import br.com.divus.aj2.modelo.Aluno;

//Padrao de projeto MVC(Coesao)
// Serapar codigos em camadas
/*
 * Separa as responsabilidade 
 * M - Classes modelos
 * C - Controle de regras de negocios
 * V - Camada de Apresentação
 */

public class AlunoController {

	public boolean isAprovado(int valor) {
		return valor >= 6;
	}
/**
	public boolean isAprovadoRecuperacao(Aluno aluno, int notaComRecuperacao) {
		// vantagem de passar uma variavel de referencia(Objeto)., é utilizar
		// todos os atributos da class
		int resultadoFinal = (aluno.getNota() + notaComRecuperacao) / 2;
		aluno.setNota(resultadoFinal);
		return resultadoFinal >= 6;
	}
*/
}
