/**
 * @author Globalcode
 * Esta e uma interface que especifica metodos para obter e armazenar clientes,
 * nao importando onde estes objetos serao persistidos, ex: arquivo, collections, 
 * banco de dados, etc...
 */
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package br.com.divus.aj4.labs.lab02_02.br.com.globalcode.dao;


import java.util.List;

import br.com.divus.aj4.labs.lab02_02.br.com.globalcode.beans.Cliente;
import br.com.divus.aj4.labs.lab02_02.br.com.globalcode.util.GlobalcodeException;

public interface ClientesDAO {

    /**
     * @param cliente
     *            Cliente a ser inserido na fonte de dados
     * @throws GlobalcodeException
     */
    public void salvar(Cliente cliente) throws GlobalcodeException;

    /**
     * @param cpf
     *            CPF do Cliente a ser excluido da fonte de dados
     * @throws GlobalcodeException
     */
    public void excluir(String cpf) throws GlobalcodeException;

    /**
     * @return java.util.List Colecao contendo todos os clientes da fonte da dados em questao
     * @throws GlobalcodeException
     */
    public List<Cliente> getAllClientes() throws GlobalcodeException;

    /**
     * @param cpf
     *            CPF do cliente a ser pesquisado na fonte de dados
     * @return Cliente
     * @throws GlobalcodeException
     */
    public Cliente getClienteByCPF(String cpf) throws GlobalcodeException;
}