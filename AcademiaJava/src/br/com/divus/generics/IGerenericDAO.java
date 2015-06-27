package br.com.divus.generics;

import br.com.divus.model.Cliente;

public interface IGerenericDAO<E>{
	
	public abstract void salvar(E o);

}
