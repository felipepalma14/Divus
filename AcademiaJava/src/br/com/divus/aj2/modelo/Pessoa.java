package br.com.divus.aj2.modelo;

public class Pessoa {

	private String nome;// Atributo de Instancia
	private String cpf;
	private String tel;
	private String[] dep;
	
	Carro carroProprietario;

	// Construtor
	

	public Carro getCarroProprietario() {
		return carroProprietario;
	}

	public void setCarroProprietario(Carro carroProprietario) {
		this.carroProprietario = carroProprietario;
	}

	public Pessoa(String nome, String cpf, String tel) {
		this.nome = nome;
		this.cpf = cpf;
		this.tel = tel;
	}

	public Pessoa(String nome, String cpf, String tel, String... dep) {
		this(nome, cpf, tel);// chamar construtor, ele deve ser a primeira linha
		this.dep = dep;
	}

	public Pessoa() {// nao é necessario passar o parametro,

	}

	public String[] getDep() {
		return dep;
	}

	public void setDep(String... dep) {
		this.dep = dep;
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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void imprimePessoa() {
		System.out.println("nome: " + this.getNome());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Tel: " + this.getTel());

		System.out.println("\nDependentes: ");

		/*
		 * for (int i = 0; i < this.dep.length; i++) { System.out.println((i +
		 * 1) + " " + this.dep[i]); }
		 */
		// System.out.println("For Each\n");
		if (this.dep != null) {
			for (String dependentes : dep) {
				System.out.println(dependentes);
			}
			return;
		}
		System.out.println("Não tem dependentes\n");

	}

}
