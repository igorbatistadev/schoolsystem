package br.edu.ifal.schoolsystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Assunto;

public class AssuntoDAO implements DAOInterface <Assunto, String>{
		
		private final String PERSISTENCE_UNIT_NAME = "psunit1";
		private EntityManagerFactory factory;
		private EntityManager em;
		
		public AssuntoDAO() {
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
		

		public void salvar(Assunto assunto) {
			iniciarConexao();
			em.persist(assunto);
			fecharConexao();		
		}

		public void atualizar(Assunto assunto) {
			iniciarConexao();
			em.merge(assunto);
			fecharConexao();
			
		}

		public Assunto buscarPorId(String id) {
			iniciarConexao();
			int identificador = Integer.parseInt(id);
			Assunto assunto = em.find(Assunto .class, identificador);
			fecharConexao();
			return assunto;
		}

		public void deletarPorId(String id) {
			iniciarConexao();
			int identificador = Integer.parseInt(id);
			Assunto assunto = em.find(Assunto.class, identificador);
			em.remove(assunto);
			System.out.println("Excluído com Sucesso!");
			fecharConexao();
			
		}


	}


