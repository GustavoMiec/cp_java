package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.bens.Aluno;
import br.com.fiap.dao.AlunoDao;

public class TesteSelecionar {

	public static void main(String[] agrs) throws ClassNotFoundException, SQLException {

		AlunoDao dao = new AlunoDao();

		List<Aluno> listaAlunos = (ArrayList<Aluno>) dao.selecionar();

		if (listaAlunos != null) {

			for (Aluno aluno : listaAlunos) {
				System.out.println(
						aluno.getRm() + " " + aluno.getNome() + " " + aluno.getTurma() + " " + aluno.getNota() + " ");

			}

		}
	}

}
