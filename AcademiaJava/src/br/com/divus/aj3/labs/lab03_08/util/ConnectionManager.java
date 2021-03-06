package br.com.divus.aj3.labs.lab03_08.util;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import br.com.divus.aj3.labs.lab03_08.exception.GlobalcodeException;


public class ConnectionManager {

	/*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de
	 * dados utilizado.
	 */
	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DATABASE = "loja";
	private static final String IP = "localhost";
	private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/" + DATABASE;
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() throws GlobalcodeException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("Status: Conectado!!!");
			// a) Faca o carregamento do driver
			
			// b) Faca a abertura da conexao
			
			System.out.println("[ConnectionManager]: Obtendo conexao");
			return conn;
		} catch (SQLException e) {
			throw new GlobalcodeException("Erro ao obter a conexao", e);
		}
	}

	public static void closeAll(Connection conn) {
		try {
			// c)Se a conexao (conn) n�o eh null, entao feche a conexao
			if (conn != null){
				conn.close();
				System.out.println("Status: Conexao Encerrada!!!");
			}
			
		} catch (Exception e) {
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}
}
