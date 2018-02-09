package br.edu.ifal.schoolsystem.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	
	public Professor() {
		super();
		nome = "";
		formacao = "";
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
		return "Professor [nome=" + nome + ", formacao=" + formacao + "]";
	}
	
}