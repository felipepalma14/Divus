package br.com.divus.aj3.regex.modelo;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private Double salario;



	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

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
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.getCpf() == null ? 0 : this.cpf.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this.getClass() != obj.getClass())
			return false;

		Pessoa outra = (Pessoa) obj;
		if (outra.getCpf() == null || this.cpf == null)
			return false;

		return outra.getCpf() == this.cpf;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salario: "+ this.getSalario() +" nome: " + this.getNome() + " CPF: " + this.getCpf();
	}	
	
	@Override
	public int compareTo(Pessoa o) {
		
		return this.nome.compareTo(o.getNome());
	}
}
