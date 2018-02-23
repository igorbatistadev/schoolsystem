package br.edu.ifal.schoolsystem.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	@Id
	private int id;
	
	@Column
	private String nome;
	
	@ManyToMany
	private List<Aluno> alunos;
	
	@ManyToOne
	private Professor professor;
	
	

	public Disciplina() {
		
	}

	public Disciplina(int id, String nome, List<Aluno> alunos, Professor professor) {
		super();
		this.id = id;
		this.nome = nome;
		this.alunos = alunos;
		this.professor = professor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	@Override
	public String toString() {
		return "Disciplina: id = " + id + ", nome = " + nome + ", alunos = " + alunos + ", professor = " + professor + ".";
	}

	
	
	

}
