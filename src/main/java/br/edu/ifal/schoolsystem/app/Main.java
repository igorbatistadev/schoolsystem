package br.edu.ifal.schoolsystem.app;

import br.edu.ifal.schoolsystem.dao.AlunoDAO;
import br.edu.ifal.schoolsystem.modelo.Aluno;

import br.edu.ifal.schoolsystem.dao.EscolaDAO;
import br.edu.ifal.schoolsystem.modelo.Escola;


public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(67, "4789d987", "José Maria");
		AlunoDAO dao = new AlunoDAO();	
		/*
		Escola escola = new Escola(5, "IFAL", "IVO","redes");
		EscolaDAO dao = new EscolaDAO();
		
		dao.salvar(escola);*/
		dao.salvar(aluno);

		
		//

	}

}
