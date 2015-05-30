package br.com.divus.aj2.excecoes;

import br.com.divus.exception.LoginInvalidoException;

public class Usuario implements Logavel {

	private String login;
	private String senha;
	
	
	public void logar (String login, String senha) throws LoginInvalidoException,SenhaInvalidaException{
		if (!login.equals(this.login))
			throw new LoginInvalidoException();
		else if (!senha.equals(this.senha))
			throw new SenhaInvalidaException();
			
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
		
		
	

}
