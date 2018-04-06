package br.edu.ifal.schoolsystem.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.mapping.Collection;

@Entity
@Table(name="nota")
public class Nota {
	
	@Id
	private int id;
	
	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Disciplina disciplina;
	
	
	@Column(precision=2)
	private Double mediaFinal;
	
	@ElementCollection
	private List<Double> notas;
	
	

	public Nota() {
		
	}

	public Nota(int id, Aluno aluno, Disciplina disciplina, Double valor) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.mediaFinal = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public double getValor() {
		return mediaFinal;
	}

	public void setValor(double valor) {
		valor = valor;
	}

	
	
	
}
