package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.bens.Aluno;
import br.com.fiap.dao.AlunoDao;

public class TesteDeletar {

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Aluno objAluno = new Aluno();

		AlunoDao dao = new AlunoDao();

		objAluno.setRm(inteiro("Digite o RM do Aluno a ser Deletado"));

		System.out.println(dao.deletar(objAluno));

	}

}
