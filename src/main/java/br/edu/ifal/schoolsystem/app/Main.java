package br.edu.ifal.schoolsystem.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.dao.DisciplinaDAO;
import br.edu.ifal.schoolsystem.dao.ProfessorDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Professor;

import br.edu.ifal.schoolsystem.dao.EscolaDAO;
import br.edu.ifal.schoolsystem.modelo.Escola;


public class Main {

	public static void main(String[] args) {
		
		List<Aluno> alunosP = new ArrayList<Aluno>();
		List<Aluno> alunosA = new ArrayList<Aluno>();
		
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = new Aluno(1, "20162594", "João Marcos");
		//alunosP.add(aluno);
		//dao.salvar(aluno);
		alunosA.add(aluno);
		
		Aluno aluno2 = new Aluno(2, "20172594", "Marcos Silva");
		//alunosP.add(aluno2);
		//dao.salvar(aluno2);
		alunosA.add(aluno2);
		
		ProfessorDAO daoP = new ProfessorDAO();
		Professor professor = new Professor(1, "Leonardo Bruno", "Doutorado em Eletronica");
		//daoP.salvar(professor);
		Professor professor2 = new Professor(2, "Ivo Calado", "Doutorado em Redes");
		//daoP.salvar(professor2);
		
		Aluno aluno3 = new Aluno(3, "20185288", "Anderso Alfredo");
		//alunosP.add(aluno3);
		//dao.salvar(aluno);
		
		DisciplinaDAO daoD = new DisciplinaDAO(); 
		//Disciplina disciplina = new Disciplina(1, "Introdução à Programação", alunosP, professor);
		//daoD.atualizar(disciplina);
		
		Disciplina disciplina2 = new Disciplina(2, "Administração de Redes", alunosA, professor2);
		//daoD.salvar(disciplina2);
		
	}

}
