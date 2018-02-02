package br.edu.ifal.schoolsystem.dao;

import java.io.Serializable;
import java.util.List;

public interface DAOInterface<T, Id extends Serializable> {	

	public void salver(T entity);
	public void altualizar(T entity);
	public T buscarPorId(Id id);
	public void deletar(T enity);
	public List<T> buscarTodos();
	public void deletarTodos();
	
}
