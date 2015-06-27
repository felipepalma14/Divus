package br.com.divus.model;

public class Aluno extends AbstractEntity {
	
	private String nome;
	
	
	
	
	public Aluno(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + "]";
	}
	
	
}
