package br.com.divus.exception;

public class LoginInvalidoException extends Exception {
	
	public LoginInvalidoException(){
		super("Login nao confere");
	}

}
