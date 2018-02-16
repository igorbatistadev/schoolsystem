package br.edu.ifal.schoolsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifal.schoolsystem.modelo.Disciplina;

public class DisciplinaDAO implements DAOInterface <Disciplina, String>{
		
		private final String PERSISTENCE_UNIT_NAME = "psunit1";
		private EntityManagerFactory factory;
		private EntityManager em;
		
		public DisciplinaDAO() {
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
		

		public void salvar(Disciplina disciplina) {
			iniciarConexao();
			em.persist(disciplina);
			fecharConexao();		
		}

		public void atualizar(Disciplina disciplina) {
			// TODO Auto-generated method stub
			
		}

		public Disciplina buscarPorId(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		public void deletar(Disciplina disciplina) {
			// TODO Auto-generated method stub
			
		}

		public List<Disciplina> buscarTodos() {
			// TODO Auto-generated method stub
			return null;
		}

		public void deletarTodos() {
			// TODO Auto-generated method stub
			
		}
}
