package br.edu.ifal.schoolsystem.app;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Nota;
import br.edu.ifal.schoolsystem.servico.Relatorio;

public class TesteDoRelatorio {

	public static void main(String[] args) {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno("2018");
		ze.setNome("Ze");
		ze.setIdade(16);
		ze.setSexo('M');
		Aluno ana = new Aluno("2019");
		ana.setNome("Ana");
		ana.setIdade(18);
		ana.setSexo('F');
		Aluno joao = new Aluno("2017");
		joao.setNome("João");
		joao.setIdade(17);
		joao.setSexo('M');
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		
		Disciplina poo = new Disciplina (3,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		
		notas.add(new Nota(2,ana,poo,9.5));
		
		notas.add(new Nota(3,joao,poo,7.5));
		
		Relatorio relatorio = new Relatorio ();
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		System.out.println(relatorio.getMaiorNota() == maiorNotaEsperada);
		
		System.out.println(relatorio.getMenorNota() == menorNotaEsperada);
	}

}
