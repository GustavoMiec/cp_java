package br.com.fiap.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.conexao.ConexaoFactory;

public class Teste {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		
		
		
		
		Connection c = new ConexaoFactory().conexao();
		
		System.out.println("conectado com Banco de Dados");
		
		
		c.close();
		
	}
	
	
}
