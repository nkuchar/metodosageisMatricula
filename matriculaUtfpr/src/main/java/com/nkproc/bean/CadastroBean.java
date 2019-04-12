package com.nkproc.bean;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.nkproc.dao.CandidatoDAO;
import com.nkproc.model.Candidato;
import com.nkproc.model.Disciplina;

@Named
@RequestScoped
public class CadastroBean {

	@Inject
	private CandidatoDAO dao;
	private Candidato candidato;
	
	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public void salvar(Candidato candidato) {
		this.candidato = dao.salvar(candidato);
	}
	
	public void aprovar() {
	}

	public void reprovar() {
	}

	private List<Disciplina> disciplina = new ArrayList<>();
	
	public List<Disciplina> getLivros() {
		this.disciplina = dao.listar();
		
		return disciplina;
	}
	
}
