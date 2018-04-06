package br.edu.ifal.schoolsystem.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import br.edu.ifal.schoolsystem.Enum.TipoDeAluno;

@Entity
@Table(name = "aluno")
public class Aluno {

	@Id
	private int id;

	@Column
	private String matricula;

	@Column
	private String nome;

	@ManyToMany
	private List<Disciplina> disciplinas;
	

	@Column(name = "aluno_Enum", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoDeAluno tipoDeAluno = TipoDeAluno.BOLSAASSISTENCIA;
	

	public Aluno(int id, String matricula, String nome) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
	}

	public Aluno() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno: id = " + id + ", matricula = " + matricula + ", nome = " + nome + ".";
	}

}
