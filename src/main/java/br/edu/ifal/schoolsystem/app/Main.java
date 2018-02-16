package br.edu.ifal.schoolsystem.app;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.dao.ProfessorDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Professor;

public class Main {

	public static void main(String[] args) {
		/*Aluno aluno = new Aluno(11, "2223a120", "Daniel Rodrigues");
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);*/
		
		
		Professor professor = new Professor();
		//professor.setId(1);
		//professor.setNome("Leonardo bruno");
		professor.setFormacao("Doutor em Eletronica");
		ProfessorDAO daoP = new ProfessorDAO();
		daoP.salvar(professor);
		//

	}

}
