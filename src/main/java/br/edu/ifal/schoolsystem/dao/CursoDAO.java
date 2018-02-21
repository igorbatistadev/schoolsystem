package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Aluno;
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
		iniciarConexao();
		em.merge(curso);
		fecharConexao();
		
	}

	public Curso buscarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Curso curso = em.find(Curso.class, identificador);
		fecharConexao();
		return curso;
	}

	public void deletarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Curso curso = em.find(Curso.class, identificador);
		em.remove(curso);
		System.out.println("Excluído com Sucesso!");
		fecharConexao();
		
	}

	/*public List<Curso> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}*/

}

