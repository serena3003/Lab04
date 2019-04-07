package it.polito.tdp.lab04.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;

public class Model {
	
	public Model() {
	}


	public List<Corso> getTuttiICorsi() {
		
		CorsoDAO c = new CorsoDAO();
		
		List <Corso> corsi = new ArrayList<>();
		corsi = c.getTuttiICorsi();
		return corsi;
	}

	public List<String> getNomiCorsi(List<Corso> corsi) {

		List<String> nomiCorsi = new ArrayList<>();
		for(Corso c: corsi)
			nomiCorsi.add(c.getNome());

		return nomiCorsi;
	}

}
