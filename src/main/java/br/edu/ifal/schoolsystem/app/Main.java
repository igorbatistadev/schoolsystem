package br.edu.ifal.schoolsystem.app;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(10, "1023a120", "Rodrigo Rodrigues");
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);

	}

}
