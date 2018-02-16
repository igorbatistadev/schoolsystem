package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Aluno;

public class AlunoDAO implements DAOInterface <Aluno, String>{
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public AlunoDAO() {
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
	

	public void salvar(Aluno aluno) {
		iniciarConexao();
		em.persist(aluno);
		fecharConexao();		
	}

	public void atualizar(Aluno aluno) {
		iniciarConexao();
		em.merge(aluno);
		fecharConexao();
		
	}

	public Aluno buscarPorId(String id) {
		iniciarConexao();
		int idetificador = Integer.parseInt(id);
		Aluno aluno = em.find(Aluno.class, idetificador);
		fecharConexao();
		return aluno;
	}

	public void deletar(Aluno aluno) {
		iniciarConexao();
		em.remove(aluno);
		fecharConexao();
	}

	public List<Aluno> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}

}
