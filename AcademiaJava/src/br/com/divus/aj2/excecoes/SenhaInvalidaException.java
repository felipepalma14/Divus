package br.com.divus.aj2.excecoes;

public class SenhaInvalidaException extends Exception {
	public SenhaInvalidaException(){
		super("Senha invalida");
	}
}
