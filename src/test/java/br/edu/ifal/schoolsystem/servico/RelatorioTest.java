package br.edu.ifal.schoolsystem.servico;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Disciplina;
import br.edu.ifal.schoolsystem.modelo.Nota;
import br.edu.ifal.schoolsystem.modelo.Professor;

public class RelatorioTest {

	private List<Aluno> alunos;
	private Disciplina disciplina;
	private Professor professor;
	private List<Nota> notas;
	private Relatorio relatorio;
	
	@Before
	public void criacaoDasEntidadesParaOsTestes() {		
		this.alunos = new ArrayList<Aluno>();
		this.professor = new Professor("Cinências da Computação");
		professor.setNome("Maria");
		this.disciplina = new Disciplina(3,"POO", alunos, professor);
		this.notas = new ArrayList<Nota>();
		this.relatorio = new Relatorio();
		
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
		Aluno pedro = new Aluno("2017.1");
		pedro.setNome("Pedro");
		pedro.setIdade(16);
		pedro.setSexo('M');
		alunos.add(ze);
		alunos.add(ana);
		alunos.add(joao);
		alunos.add(pedro);
				
	}
	@Test
	public void deveFuncionarParaAsNotasNaOrdemAleatoria() {		
		
	
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		notas.add(new Nota(2,alunos.get(1),disciplina,9.5));	
		notas.add(new Nota(3,alunos.get(2),disciplina,7.5));
		
		
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(),0000.1);	
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemCrescente() {		
		
		
		
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		notas.add(new Nota(2,alunos.get(1),disciplina,9.5));	
		notas.add(new Nota(3,alunos.get(2),disciplina,7.5));
		
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(),0000.1);	
	}
	
	@Test
	public void deveFuncionarParaAsNotasNaOrdemDecrescente() {		
		
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		notas.add(new Nota(2,alunos.get(1),disciplina,9.5));	
		notas.add(new Nota(3,alunos.get(2),disciplina,7.5));
		
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 9.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);	
	}
	
	@Test
	public void deveFuncionarParaAsNotasComUmUnicoAluno() {
		
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		
		relatorio.gerar(notas);
		
		double maiorNotaEsperada = 2.5;
		double menorNotaEsperada = 2.5;
		
		assertEquals(maiorNotaEsperada, relatorio.getMaiorNota(), 0000.1);
		assertEquals(menorNotaEsperada, relatorio.getMenorNota(), 0000.1);
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotas() {
		
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		notas.add(new Nota(2,alunos.get(1),disciplina,9.5));	
		notas.add(new Nota(3,alunos.get(2),disciplina,7.5));
		
		
		
		
		
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
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		notas.add(new Nota(2,alunos.get(1),disciplina,9.5));	
		notas.add(new Nota(3,alunos.get(2),disciplina,7.5));
		notas.add(new Nota(4,alunos.get(3),disciplina,0));
		
		
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
		
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 0;
		
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComUmaNotaNaLista() {	
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		
		
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 1;
		
		double primeiraNotaEsperada = 2.5;
		double segundaNotaEsperada = 2.5;
		
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		 
	}
	
	@Test
	public void deveFuncionarAIdentificacaoDas3MaioresNotasComDuasNotasNaLista() {		
		notas.add(new Nota(1,alunos.get(0),disciplina,2.5));		
		notas.add(new Nota(2,alunos.get(1),disciplina,9.5));	
		
		relatorio.gerar(notas);
		
		int quantidadeDeNotasEsperadas = 2;
		
		double primeiraNotaEsperada = 9.5;
		double segundaNotaEsperada = 2.5;
		
		
		assertEquals(quantidadeDeNotasEsperadas, relatorio.getTop3Notas().size());
		
		assertEquals(primeiraNotaEsperada, relatorio.getTop3Notas().get(0).getValor(), 000.1);
		assertEquals(segundaNotaEsperada, relatorio.getTop3Notas().get(1).getValor(), 000.1);
	}

}
