package br.edu.ifal.schoolsystem.app;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(12, "2018N12345", "Janaina Rodrigues");
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);

	}

}
