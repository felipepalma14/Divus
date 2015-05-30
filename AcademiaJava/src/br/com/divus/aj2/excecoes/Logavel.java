package br.com.divus.aj2.excecoes;

import br.com.divus.exception.LoginInvalidoException;

public interface Logavel {
	public void logar(String login, String senha) throws SenhaInvalidaException, LoginInvalidoException;
	
}
