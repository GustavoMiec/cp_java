package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Aluno;
import br.com.fiap.conexao.ConexaoFactory;

public class AlunoDao {

	public Connection minhaConexao;

	public AlunoDao() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();

	}

	public String inserir(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Insert into aluno values(?, ?, ?, ?);");
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getTurma());
		stmt.setInt(3, aluno.getRm());
		stmt.setDouble(4, aluno.getNota());
		stmt.execute();
		stmt.close();

		return "Cadastrado com Sucesso!";
	}

	public String deletar(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("Delete From ALUNO where RM_Aluno = ?");
		stmt.setInt(1, aluno.getRm());
		stmt.execute();
		stmt.close();

		return "Deletado com Sucesso!";
	}
	// update
	
	public String atulizar(Aluno aluno) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("update ALUNO set NOME_ALUNO = ?,"
				+ " TURMA_ALUNO = ?, NOTA_ALUNO = ? where RM_ALUNO = ?");
		stmt.setString(1, aluno.getNome());
		stmt.setString(2, aluno.getTurma());
		stmt.setDouble(3, aluno.getNota());
		stmt.setInt(4, aluno.getRm());
		stmt.executeUpdate();
		stmt.close();
		
		return "Atulizado com Sucesso";
		
		
		
	}
	
	

	public List<Aluno> selecionar() throws SQLException{
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		PreparedStatement stmt = minhaConexao.prepareStatement("select * FROM aluno");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()){
			Aluno aluno = new Aluno(); 
			aluno.setRm(rs.getInt(1));
			aluno.setNome(rs.getString(2));
			aluno.setTurma(rs.getString(3));
			aluno.setNota(rs.getDouble(4));
			listaAlunos.add(aluno);
		}
		
		return listaAlunos;
	}
	
	
}
