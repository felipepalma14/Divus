package br.com.divus.aj2.classeabstrata.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RelatorioService {
	
	private String funcRH;
	
	public RelatorioService(String nome){
		this.funcRH = nome;
	}
	
	//Polimorfismo
	public void gerarRelatorio(Pessoa funcionario){
		System.out.println("######### Funcionario CLT ##########");
		System.out.println("Relatorio gerando em:" + new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new Date()));
		System.out.println("usuario que gerou: " + this.funcRH);
		funcionario.gerarReciboPagamento();
	}
	
	/**
	public void gerarRelatorio(FuncionarioTercerizado funcionario) {
		System.out.println("######### Funcionario Terc ##########");
		System.out.println("Relatorio gerando em:" + new SimpleDateFormat("dd/MM/YYYY - HH:mm").format(new Date()));
		System.out.println("usuario que gerou: " + this.funcRH);
		funcionario.gerarReciboPagamento();
	}
	*/
	public String getFuncRH() {
		return funcRH;
	}

	public void setFuncRH(String funcRH) {
		this.funcRH = funcRH;
	}
	
	
}
