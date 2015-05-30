package br.com.divus.aj2.classeabstrata.modelos;

public class FuncionarioCLT extends Pessoa{
	private String clt;
	
	
	public FuncionarioCLT(){
		
	}
	
	public FuncionarioCLT(String nome, double salario, String CLT){
		super(nome, salario);
		this.clt = CLT;
	}

	public String getCLT() {
		return clt;
	}

	public void setCLT(String cLT) {
		clt = cLT;
	}

	@Override
	public void gerarReciboPagamento() {
		// TODO Auto-generated method stub
		System.out.println("Criando recibo de pagamento para o func. CLT: " + 
				this.nome + " com salario de: " + this.salario + " CLT: "+ this.clt);
	}
}
