package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.bens.Aluno;
import br.com.fiap.dao.AlunoDao;

public class TesteCadastro {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		var objAluno = new Aluno();

		AlunoDao dao = new AlunoDao();

		objAluno.setRm(inteiro("RM"));
		objAluno.setNome(texto("nome"));
		objAluno.setTurma(texto("Turma"));
		objAluno.setNota(real("nota"));

		System.out.println(dao.inserir(objAluno));

	}

}
