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
	private List<Candidato> listaCandidato;

	public void salvar(Candidato candidato) {
		this.candidato = dao.salvar(candidato);
	}

	public void aprovar() {
	}

	public void reprovar() {
	}

	public List<Candidato> listaCandidatos() {
		this.listaCandidato = dao.listar();

		return listaCandidato;
	}

	public List<Candidato> getListaCandidato() {
		return listaCandidato;
	}

	public void setListaCandidato(List<Candidato> listaCandidato) {
		this.listaCandidato = listaCandidato;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

}
