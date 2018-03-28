package br.edu.ifal.schoolsystem.servico;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Nota;

public class RelatorioTest {

	@Test
	public void deveFuncionarParaAsNotasNaOrdemAleatoria() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(5, "2018", "ze");
		Aluno ana = new Aluno(6, "2019", "ana");
		Aluno joao = new Aluno(3, "2017", "joao");
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		
		Disciplina poo = new Disciplina (3,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		
		notas.add(new Nota(2,ana,poo,9.5));
		
		notas.add(new Nota(3,joao,poo,7.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(),0000.1);	
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemCrescente() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(5, "2018", "ze");
		Aluno ana = new Aluno(6, "2019", "ana");
		Aluno joao = new Aluno(3, "2017", "joao");
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		
		Disciplina poo = new Disciplina (3,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		
		notas.add(new Nota(2,ana,poo,7.5));
		
		notas.add(new Nota(3,joao,poo,9.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(),0000.1);	
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemDecrescente() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(5, "2018", "ze");
		Aluno ana = new Aluno(6, "2019", "ana");
		Aluno joao = new Aluno(3, "2017", "joao");
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		
		Disciplina poo = new Disciplina (3,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,9.5));
		
		notas.add(new Nota(2,ana,poo,7.5));
		
		notas.add(new Nota(3,joao,poo,2.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);	
	}
	
	@Test
	public void deveFuncionarParaAsNotasComUmUnicoAluno() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(5, "2018", "ze");
		
		alunos.add(ze);
		
		
		Disciplina poo = new Disciplina (3,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 2.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotas() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(1, "2018", "ze");
		Aluno ana = new Aluno(2, "2019", "ana");
		Aluno joao = new Aluno(3, "2017", "joao");
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		
		Disciplina poo = new Disciplina (1,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		notas.add(new Nota(2,ana,poo,7.5));
		notas.add(new Nota(3,joao,poo,9.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 3;
		
		double primeiraNotaEsperada = 9.5;
		double segundaNotaEsperada = 7.5;
		double terceiraNotaEsperada = 2.5;
		
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
		assertEquals(terceiraNotaEsperada, relatorio.getTop3Notas().get(2).getValor(), 000.1);
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComQuatroNotasNaLista() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(1, "2018", "ze");
		Aluno ana = new Aluno(2, "2019", "ana");
		Aluno joao = new Aluno(3, "2017", "joao");
		Aluno pedro = new Aluno(4,"2020", "pedro");
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		alunos.add(pedro);
		
		Disciplina poo = new Disciplina (1,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		notas.add(new Nota(2,ana,poo,7.5));
		notas.add(new Nota(3,joao,poo,9.5));
		notas.add(new Nota(4,pedro,poo,0));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 3;
		
		double primeiraNotaEsperada = 9.5;
		double segundaNotaEsperada = 7.5;
		double terceiraNotaEsperada = 2.5;
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
		assertEquals(terceiraNotaEsperada, relatorio.getTop3Notas().get(2).getValor(), 000.1);
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComNenhumaNotaNaLista() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(1, "2018", "ze");
		Aluno ana = new Aluno(2, "2019", "ana");
		Aluno joao = new Aluno(3, "2017", "joao");
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		
		Disciplina poo = new Disciplina (1,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 0;
		
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComDuasNotasNaLista() {
		List<Aluno> alunos = new ArrayList<Aluno>();
		Aluno ze = new Aluno(1, "2018", "ze");
		Aluno ana = new Aluno(2, "2019", "ana");
		alunos.add(ze);
		alunos.add(ana);
		
		Disciplina poo = new Disciplina (1,"POO",alunos,null);
		
		List <Nota> notas = new ArrayList<Nota>();
		notas.add(new Nota(1,ze,poo,2.5));
		notas.add(new Nota(2,ana,poo,7.5));
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 2;
		
		double primeiraNotaEsperada = 7.5;
		double segundaNotaEsperada = 2.5;
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
	}

}
