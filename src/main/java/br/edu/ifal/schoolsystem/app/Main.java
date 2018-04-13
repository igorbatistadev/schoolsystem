package br.edu.ifal.schoolsystem.app;

import java.util.ArrayList;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.dao.DisciplinaDAO;
import br.edu.ifal.schoolsystem.dao.NotaDAO;
import br.edu.ifal.schoolsystem.dao.ProfessorDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Endereco;
import br.edu.ifal.schoolsystem.modelo.Nota;
import br.edu.ifal.schoolsystem.modelo.Professor;


public class Main {

	public static void main(String[] args) {
		
		
		
		/*AlunoDAO daoA = new AlunoDAO();
		Aluno aluno = new Aluno();
		aluno.setNome("THIAgo");
		aluno.setIdade(99);
		aluno.setMatricula("2004G55047");
		aluno.setSexo('M');
		
		Endereco endereco =  new Endereco();
		
		endereco.setCidade("Rio Largo");
		endereco.setBairro("Rua 16");
		endereco.setCep("57100-000");
		endereco.setEstado("Alagoas");
		endereco.setLogradouro("Prasdfgasdfa");
		endereco.setNumero("07A");
		
		aluno.setEndereco(endereco);
		
		//daoA.atualizar(aluno);
		daoA.salvar(aluno);
		
		ProfessorDAO daoP = new ProfessorDAO();
		Professor professor = new Professor();
		professor.setNome("Ivo");
		professor.setIdade(36);
		professor.setSexo('M');
		professor.setFormacao("Doutor em Redes de Computadores");
		daoP.salvar(professor);
		
		ProfessorDAO daoP = new ProfessorDAO();*/
		
		DisciplinaDAO daoD = new DisciplinaDAO();
		/*Disciplina disciplina = new Disciplina();
		disciplina.setNome("Administração de Redes de Cmoputadores");
		disciplina.setProfessor(daoP.buscarPorId("3"));
		daoD.salvar(disciplina);*/
		
		AlunoDAO daoA = new AlunoDAO();
		Aluno aluno = daoA.buscarPorId("18");
		
		
		ArrayList<Double> notas = new ArrayList<>(); 
		notas.add(9.8);
		notas.add(9.7);
		notas.add(9.6);
		notas.add(9.5);
		notas.add(9.4);
		notas.add(9.3);
		
		NotaDAO daoN = new NotaDAO();
		Nota nota = daoN.buscarPorId("20");
		nota.setAluno(aluno);
		nota.setDisciplina(daoD.buscarPorId("0"));
		nota.setNotas(notas);
		daoN.atualizar(nota);
		

		/*
		List<Aluno> alunosP = new ArrayList<Aluno>();
		List<Aluno> alunosA = new ArrayList<Aluno>();
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		List<Professor> professores = new ArrayList<Professor>();
		List<Curso> cursos = new ArrayList<Curso>();
		
		
		AlunoDAO dao = new AlunoDAO();
		Aluno aluno = new Aluno(1, "20162594", "João Marcos");
		//alunosP.add(aluno);
		//dao.salvar(aluno);
		//alunosA.add(aluno);
		alunos.add(aluno);
		
		Aluno aluno2 = new Aluno(2, "20172594", "Marcos Silva");
		//alunosP.add(aluno2);
		//dao.salvar(aluno2);
		//alunosA.add(aluno2);
		alunos.add(aluno2);
		
		ProfessorDAO daoP = new ProfessorDAO();
		Professor professor = new Professor(1, "Leonardo Bruno", "Doutorado em Eletronica");
		//daoP.salvar(professor);
		professores.add(professor);
		
		Professor professor2 = new Professor(2, "Ivo Calado", "Doutorado em Redes");
		//daoP.salvar(professor2);
		professores.add(professor2);
		
		Aluno aluno3 = new Aluno(3, "20185288", "Anderso Alfredo");
		//alunosP.add(aluno3);
		//dao.salvar(aluno);
		alunos.add(aluno3);
		
		DisciplinaDAO daoD = new DisciplinaDAO(); 
		Disciplina disciplina = new Disciplina(1, "Introdução à Programação", alunosP, professor);
		//daoD.atualizar(disciplina);
		disciplinas.add(disciplina);
		
		Disciplina disciplina2 = new Disciplina(2, "Administração de Redes", alunosA, professor2);
		//daoD.salvar(disciplina2);
		disciplinas.add(disciplina2);

		CursoDAO daoC = new CursoDAO();
		Curso curso = new Curso(1, "Informática para internet", alunos, disciplinas);
		//daoC.salvar(curso);
		cursos.add(curso);
		
		EscolaDAO daoE = new EscolaDAO();
		Escola escola = new Escola(1, "IFAL -  CAMPUS RIO LARGO", professores, cursos);
		daoE.salvar(escola);
		*/
		
	}

}
