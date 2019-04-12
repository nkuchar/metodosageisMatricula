package com.nkproc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nkproc.model.Candidato;
import com.nkproc.model.Disciplina;

public class CandidatoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public void salvar(Candidato candidato) {
		manager.persist(candidato);
	}
	
	public List<Disciplina> disciplina() {
		String jpql = "select distinct(l) from Disciplina d "
				+ " join fetch d.professores";
		
		return manager.createQuery(jpql, Disciplina.class).getResultList();
	}
	
}
