package br.com.divus.aj2.excecoes;

import br.com.divus.exception.LoginInvalidoException;

public class TesteUsuario {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario();
		
		user.setLogin("fcunha");
		user.setSenha("123");
		
		try {
			user.logar("fcunha", "123");
			System.out.println("Logou");
		}catch (LoginInvalidoException e){
			e.printStackTrace(); 
			System.out.println("Login nao encontrado");
		}catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println("Senha nao encontrada!!!");
		}
		
	}

}
