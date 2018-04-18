package br.edu.ifal.schoolsystem.servico;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Nota;
import br.edu.ifal.schoolsystem.modelo.Professor;

public class GerenciadorDeNotasTest {
	
	private double valor;
	private List<Aluno> aluno;
	private Disciplina disciplina;
	private Professor professor;
	
	
	@Before
	public void criacaoDasEntidadesParaOsTestes() {		
		
		
		Aluno ze = new Aluno("2018");
		ze.setNome("Ze");
		ze.setIdade(16);
		ze.setSexo('M');
		aluno.add(ze);
		
		professor = new Professor("ciencias da computação");
		professor.setNome("João");
		
		
		disciplina = new Disciplina(3,"POO",aluno, professor);
				
	}
	
	@Test
	public void setarNotas() {
		/*
		boolean esperado = true;
		
		assertEquals(esperado, nota, 0000.1);
		*/
	}
	
	
	
	
	
	
	
}
