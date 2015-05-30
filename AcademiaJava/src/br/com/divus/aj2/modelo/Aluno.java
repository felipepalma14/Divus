package br.com.divus.aj2.modelo;


//Coesao = o mais especifico possivel, separar regras de negocios

public class Aluno extends Pessoa{
	private String nome;
	private String cpf;
	
	
	
	//private int nota;
	Turma turma;
	Nota[] notas;
	
	public Aluno(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}


	public void imprime() {
		System.out.println(this.nome);
		for (Nota pontuacao: notas){
			System.out.println(pontuacao.getValorNota());
			
		}
		//System.out.println(this.nota);

	}
	
	//GET E SET

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Nota[] getNotas() {
		return notas;
	}

	public void setNotas(Nota[] nota) {
		this.notas = nota;
	}

	
	// System.out.println("Aprovado?\n"+ac.isAprovado(this.nota));

	// nao precisa add o this p/ chamar metodos

	/*
	 * public boolean isAprovado(){ return this.nota >= 6; }
	 */

}
