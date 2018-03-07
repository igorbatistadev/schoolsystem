package br.edu.ifal.schoolsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Nota;

public class NotaDAO implements DAOInterface <Nota, String>{
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public NotaDAO() {
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
	

	public void salvar(Nota nota) {
		iniciarConexao();
		em.persist(nota);
		fecharConexao();		
	}

	public void atualizar(Nota nota) {
		iniciarConexao();
		em.merge(nota);
		fecharConexao();
		
	}

	public Nota buscarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Nota nota = em.find(Nota.class, identificador);
		fecharConexao();
		return nota;
	}

	public void deletarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Nota nota = em.find(Nota.class, identificador);
		em.remove(nota);
		System.out.println("Excluído com Sucesso!");
		fecharConexao();
	}

}
