package br.edu.ifal.schoolsystem.servico;

import java.util.List;

import br.edu.ifal.schoolsystem.modelo.Nota;

public class Relatorio {
	private double maiorNota = Double.NEGATIVE_INFINITY;
	private double menorNota = Double.POSITIVE_INFINITY;

	
	
	
	public void gerar(List<Nota> notas) {
		for (Nota nota : notas) {
			if(nota.getValor() > maiorNota) {
				maiorNota = nota.getValor();
			}else if(nota.getValor() < menorNota) {
				menorNota = nota.getValor();
			}
		}
	}


	public double getMaiorNota() {
		return maiorNota;
	}


	public double getMenorNota() {
		return menorNota;
	}
	
	
}
