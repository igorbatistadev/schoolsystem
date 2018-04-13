package br.edu.ifal.schoolsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import br.edu.ifal.schoolsystem.modelo.Pessoa;

public class PessoaDAO implements DAOInterface <Pessoa, String>{
	
	private final String PERSISTENCE_UNIT_NAME = "psunit1";
	private EntityManagerFactory factory;
	private EntityManager em;
	
	public PessoaDAO() {
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
	

	public void salvar(Pessoa pessoa) {
		iniciarConexao();
		em.persist(pessoa);
		fecharConexao();		
	}

	public void atualizar(Pessoa pessoa) {
		iniciarConexao();
		em.merge(pessoa);
		fecharConexao();
		
	}

	public Pessoa buscarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Pessoa pessoa = em.find(Pessoa .class, identificador);
		fecharConexao();
		return pessoa;
	}

	public void deletarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Pessoa pessoa = em.find(Pessoa.class, identificador);
		em.remove(pessoa);
		System.out.println("Excluído com Sucesso!");
		
	}


}



