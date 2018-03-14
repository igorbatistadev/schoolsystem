package br.edu.ifal.schoolsystem.servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.edu.ifal.schoolsystem.modelo.Nota;

public class Relatorio {
	private double maiorNota = Double.NEGATIVE_INFINITY;
	private double menorNota = Double.POSITIVE_INFINITY;
	private List<Nota> top3Notas = new ArrayList<Nota>();

	
	
	
	public void gerar(List<Nota> notas) {
		for (Nota nota : notas) {
			if(nota.getValor() > maiorNota) {
				maiorNota = nota.getValor();
			}
			if(nota.getValor() < menorNota) {
				menorNota = nota.getValor();
			}
		}
		
		setarMaioresNotas(notas);
	}


	private void setarMaioresNotas(List<Nota> notas) {
		List<Nota> notasOrdemDecrescente = notas.stream().sorted(Comparator.comparing(Nota::getValor)).collect(Collectors.toList());
		Collections.reverse(notasOrdemDecrescente);
	}


	public double getMaiorNota() {
		return maiorNota;
	}


	public double getMenorNota() {
		return menorNota;
	}
	
	
}
