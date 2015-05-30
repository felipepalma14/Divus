package br.com.divus.aj2.classeabstrata.modelos;

public class FuncionarioTercerizado extends Pessoa {
	private String nomeEmpresa;
	
	
	public FuncionarioTercerizado() {
		// TODO Auto-generated constructor stub
	}
	
	public FuncionarioTercerizado(String nome, double salario, String nomeEmpresa){
		super(nome,salario);
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public void gerarReciboPagamento() {
		// TODO Auto-generated method stub
		System.out.printf("Criando recibo de pagamento para o func. CLT: %s com salario de: %.2f Empresa: %s",
				this.nome,this.salario,this.nomeEmpresa);
	}
	
	
}
