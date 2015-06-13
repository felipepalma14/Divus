package br.com.divus.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/loja";
	private static final String USER = "root";
	private static final String PSSW = "root";
	
	public static Connection getConexao(){
		try {
			return DriverManager.getConnection(URL, USER, PSSW);
		} catch (SQLException e) {
			System.out.println("nao foi possivel conectar");
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void close(Connection conn){
		try {
			if(conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("Nao foi possivel fechar a conexao");
			e.printStackTrace();
		}
	}

	public static void close(Connection conn,Statement stmt){
		try {
			stmt.close();
			close(conn);
		} catch (SQLException e) {
			System.out.println("Não foi possivel fechar o statement");
			e.printStackTrace();
		}
		
	}
	
	public static void close(Connection conn, Statement stmt, ResultSet result){
		try {
			result.close();
			close(conn,stmt);
		} catch (SQLException e) {
			System.out.println("Nao foi possivel fechar o ResultSet");
			e.printStackTrace();
		}
	}

}
