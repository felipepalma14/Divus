package br.com.divus.aj3.regex.modelo;

public class Pessoa {
	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
}
