package com.nkproc.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.nkproc.model.Candidato;

@Named
@RequestScoped
public class CadastroBean {

	private Candidato candidato = new Candidato();
	
	public void salvar() {
		System.out.println("teste: " + candidato);
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}
