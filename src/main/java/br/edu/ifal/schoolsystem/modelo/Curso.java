package br.edu.ifal.schoolsystem.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

	@Id
	private int id;
	
	@Column
	private String nome;
	
	@OneToMany
	private List<Aluno> alunos;
	
	@OneToMany
	private List<Disciplina> disciplinas;
	
	
	public Curso() {
		super();
	}

	public Curso(int id, String nome, List<Aluno> alunos, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.nome = nome;
		this.alunos = alunos;
		this.disciplinas = disciplinas;
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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Curso: id = " + id + ", nome = " + nome + ", alunos = " + alunos + ", disciplinas = " + disciplinas + ".";
	}
	
	
	
	
	
	
	
}
