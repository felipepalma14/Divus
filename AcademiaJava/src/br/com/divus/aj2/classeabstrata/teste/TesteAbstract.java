package br.com.divus.aj2.classeabstrata.teste;

import br.com.divus.aj2.classeabstrata.modelos.FuncionarioCLT;
import br.com.divus.aj2.classeabstrata.modelos.FuncionarioTercerizado;
import br.com.divus.aj2.classeabstrata.modelos.RelatorioService;

public class TesteAbstract {
	public static void main(String[] args) {
		FuncionarioCLT funcCLT = new FuncionarioCLT("Felipe", 2000, "092-1");
		//funcCLT.gerarReciboPagamento();
		
		FuncionarioTercerizado ft = new FuncionarioTercerizado("Neia",1200,"CCE");
		//ft.gerarReciboPagamento();
		
		RelatorioService relatorioCLT = new RelatorioService("Cara do RH");
		
		relatorioCLT.gerarRelatorio(funcCLT);
		
		RelatorioService relatorioTerc = new RelatorioService("Cara do RH");
		
		relatorioTerc.gerarRelatorio(ft);
	
	}
}
