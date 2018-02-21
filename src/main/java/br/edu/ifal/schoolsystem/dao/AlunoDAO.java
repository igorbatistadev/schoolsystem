package br.edu.ifal.schoolsystem.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.tools.ant.util.SymbolicLinkUtils;

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
		int identificador = Integer.parseInt(id);
		Aluno aluno = em.find(Aluno.class, identificador);
		fecharConexao();
		return aluno;
	}
	
	public void deletarPorId(String id) {
		iniciarConexao();
		int identificador = Integer.parseInt(id);
		Aluno aluno = em.find(Aluno.class, identificador);
		em.remove(aluno);
		System.out.println("Excluído com Sucesso!");
		fecharConexao();
	}
	
	/*public void deletarPorAluno(Aluno aluno) {
		iniciarConexao();
		aluno = em.find(Aluno.class, aluno.getId());
		em.remove(aluno);
		fecharConexao();
	}*/


	/*public List<Aluno> buscarTodos() {
		iniciarConexao();
		List<Aluno> alunos = new ArrayList<Aluno>(); 
		alunos.addAll(alunos);
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
 		fecharConexao();
		return null;
	}
	

	public void deletarTodos() {
		// TODO Auto-generated method stub
		
	}*/

}
