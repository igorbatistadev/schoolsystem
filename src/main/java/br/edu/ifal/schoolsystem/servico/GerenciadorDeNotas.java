package br.edu.ifal.schoolsystem.servico;

import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Nota;

public class GerenciadorDeNotas {
	
	
	
	public boolean setarNota(double valor, Aluno aluno, Disciplina disciplina) {
		if(aluno != null && disciplina != null) {
			Nota nota = new Nota();
			nota.setAluno(aluno);
			return true;
		} else {
			return false;
		}
	}
	
	
}
