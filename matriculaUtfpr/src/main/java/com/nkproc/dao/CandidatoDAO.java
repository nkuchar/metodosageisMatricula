package com.nkproc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nkproc.model.Candidato;

public class CandidatoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public void salvar(Candidato candidato) {
		manager.persist(candidato);
	}
	
}
