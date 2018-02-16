package br.edu.ifal.schoolsystem.app;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.dao.ProfessorDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Professor;

import br.edu.ifal.schoolsystem.dao.EscolaDAO;
import br.edu.ifal.schoolsystem.modelo.Escola;


public class Main {

	public static void main(String[] args) {
		
		AlunoDAO dao = new AlunoDAO();	
		Aluno aluna = dao.buscarPorId("69");
		System.out.println(aluna);

		/*
		Aluno aluno = new Aluno(69, "654654", "Maria");
		
		/*
		Escola escola = new Escola(5, "IFAL", "IVO","redes");
		EscolaDAO dao = new EscolaDAO();
		
		dao.salvar(escola);
		dao.salvar(aluno);*/

		/*Aluno aluno = new Aluno(11, "2223a120", "Daniel Rodrigues");
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);*/
		
		/*
		Professor professor = new Professor();
		//professor.setId(1);
		//professor.setNome("Leonardo bruno");
		professor.setFormacao("Doutor em Eletronica");
		ProfessorDAO daoP = new ProfessorDAO();
		daoP.salvar(professor);*/
		//

	}

}
