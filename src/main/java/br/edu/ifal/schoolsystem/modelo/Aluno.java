package br.edu.ifal.schoolsystem.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name  = "aluno")
public class Aluno {
	private String id;
	private String matricula;
	private String nome;
	
	public Aluno(String id, String matricula, String nome) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
	}

	public Aluno() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	
}
