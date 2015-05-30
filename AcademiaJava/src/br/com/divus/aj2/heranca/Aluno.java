package br.com.divus.aj2.heranca;

public class Aluno extends Pessoa{
	private String mat;

	public Aluno(String nome){
		super(nome);
		
	}
	
	public Aluno(String nome, String mat){
		this(nome);
		this.mat = mat;
	}
	public String getMat() {
		return mat;
	}

	public void setMat(String mat) {
		this.mat = mat;
	}
	
	public void imprime(){
		super.imprime();
		System.out.println("Mat: "+ this.mat);
	}
}
