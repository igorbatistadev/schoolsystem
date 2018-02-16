package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Escola;

public class EscolaDAO implements DAOInterface <Escola, String>{
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public EscolaDAO() {
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
	

	public void salvar(Escola escola) {
		iniciarConexao();
		em.persist(escola);
		fecharConexao();		
	}

	public void atualizar(Escola escola) {
		// TODO Auto-generated method stub
		
	}

	public Escola buscarPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletar(Escola escola) {
		
	}

	public List<Escola> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}

}
