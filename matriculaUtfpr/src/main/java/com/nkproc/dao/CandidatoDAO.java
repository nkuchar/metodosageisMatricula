package com.nkproc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nkproc.model.Candidato;
import com.nkproc.model.Disciplina;

public class CandidatoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public Candidato salvar(Candidato candidato) {
		manager.persist(candidato);
		return candidato;
	}
	
	public Candidato aprovar(Candidato candidato) {
		candidato.setStatus(Boolean.TRUE);
		manager.persist(candidato);
		return candidato;
	}
	
	public Candidato reprovar(Candidato candidato) {
		candidato.setStatus(Boolean.FALSE);
		manager.persist(candidato);
		return candidato;
	}
	
	public List<Candidato> listar() {
		String jpql = "select distinct(c) from Candidato c ";
		
		return manager.createQuery(jpql, Candidato.class).getResultList();
	}
	
	public List<Candidato> listarAprovados() {
		String jpql = "select distinct(c) from Candidato c where status='TRUE' ";
		
		return manager.createQuery(jpql, Candidato.class).getResultList();
	}
	
}
