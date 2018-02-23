package br.edu.ifal.schoolsystem.modelo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="escola")
public class Escola {
	
	@Id
	private int id;
	
	@Column
	private String nome;
	
	@ManyToMany
	private List<Professor> professores;
	
	@ManyToMany
	private List<Curso> cursos;
	
	public Escola() {
		
	}
	
	public Escola(int id, String nome, List<Professor> professores, List<Curso> cursos) {
		super();
		this.id = id;
		this.nome = nome;
		this.professores = new ArrayList<Professor>();
		this.cursos = new ArrayList<Curso>();
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

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		if(professores != null) {
			this.professores = professores;
		}
	}

	public List<Curso> getCursos() {
		return cursos;	
	}

	public void setCursos(List<Curso> cursos) {
		if(cursos != null) {
			this.cursos = cursos;
		}
	}
	public void adcionarCurso(Curso c) {
		
		if (cursos != null) {
			cursos.add(c);
		}
		
	}
    public void removerCurso (Curso c ) {
    	cursos.remove(c);
	
	
	    
    }
    public void adicionarProfessor(Professor p) {
    	if (professores != null) {
    		professores.add(p);
    	}
    }
    
    public void removerProfessor(Professor p) {
    	professores.remove(p);
  }

	@Override
	public String toString() {
		return "Escola: id = " + id + ", nome = " + nome + ", professores = " + professores + ", cursos = " + cursos + ".";
	}
    
}

