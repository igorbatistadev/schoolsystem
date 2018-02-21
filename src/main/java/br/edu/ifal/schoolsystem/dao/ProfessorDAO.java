package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Aluno;
import br.edu.ifal.schoolsystem.modelo.Professor;

public class ProfessorDAO implements DAOInterface <Professor, String>{
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public ProfessorDAO() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	public void iniciarConexao() {
		em = factory.createEntityManager();
		em.getTransaction().begin();			
	}
	
	public void fecharConexao() {
		em.getTransaction().commit();
		em.close();	
	}
	

	public void salvar(Professor professor) {
		iniciarConexao();
		em.persist(professor);
		fecharConexao();		
	}

	public void atualizar(Professor professor) {
		iniciarConexao();
		em.merge(professor);
		fecharConexao();		 
	}

	public Professor buscarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Professor professor = em.find(Professor.class, identificador);
		fecharConexao();
		return professor;
	}

	public void deletarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Professor professor = em.find(Professor.class, identificador);
		em.remove(professor);
		System.out.println("Excluído com Sucesso!");
		fecharConexao(); 
		
	}

	/*public List<Professor> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}*/

}
