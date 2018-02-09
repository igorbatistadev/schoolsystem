package br.edu.ifal.schoolsystem.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	@Override
	public String toString() {
		return "Professor [nome=" + nome + ", formacao=" + formacao + "]";
	}
	
}