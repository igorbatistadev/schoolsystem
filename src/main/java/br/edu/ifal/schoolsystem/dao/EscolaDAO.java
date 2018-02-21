package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Aluno;
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
		iniciarConexao();
		em.merge(escola);
		fecharConexao();
		
	}

	public Escola buscarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Escola escola = em.find(Escola.class, identificador);
		fecharConexao();
		return escola;
	}

	public void deletarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Escola escola = em.find(Escola.class, identificador);
		em.remove(escola);
		System.out.println("Excluído com Sucesso!");
		fecharConexao();
	}

	/*public List<Escola> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}*/

}
