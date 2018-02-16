package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Curso;

public class CursoDAO implements DAOInterface <Curso, String>{
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public CursoDAO() {
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
	

	public void salvar(Curso curso) {
		iniciarConexao();
		em.persist(curso);
		fecharConexao();		
	}

	public void atualizar(Curso curso) {
		// TODO Auto-generated method stub
		
	}

	public Curso buscarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletar(Curso curso) {
		// TODO Auto-generated method stub
		
	}

	public List<Curso> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}

}

