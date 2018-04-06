package br.edu.ifal.schoolsystem.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.ifal.schoolsystem.Enum.TipoProfessor;

@Entity
@Table(name ="professor")
public class Professor {
	
	@Id
	private int id;
	
	@Column
	private String nome;
	
	@Column
	private String formacao;
	
	@OneToMany
	private List<Disciplina> disciplinas;
	
	@Column(name = "professor_Enum", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoProfessor tipoProfessor = TipoProfessor.EFETIVO;
	
	public Professor(int id, String nome, String formacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.formacao = formacao;
	}
	
	

	
	
	public Professor() {
		super();
		
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
		if(nome != null) {
			this.nome = nome;
		}
	}
	public String getFormacao() {
		return formacao;
	}
	
	public void setFormacao(String formacao) {
		if(formacao != null) {
			this.formacao = formacao;
		}
	}
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	@Override
	public String toString() {
		return "Professor: nome = " + nome + ", formacao = " + formacao + ".";
	}
	
}