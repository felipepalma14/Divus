package br.com.divus.aj2.labs.lab13_02;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String msgError){
		super(msgError);
	}
}
