package it.polito.tdp.lab04.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

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

	public Studente getStudenteFromMatricola(String m) {
		StudenteDAO s = new StudenteDAO();
		
		Studente stud = new Studente(s.getStudenteFromMatricola(m)[0], s.getStudenteFromMatricola(m)[1],m);
		return stud;
		//return s.getStudenteFromMatricola(m);
	}
	
	public List<Studente> getStudentiIscrittiAlCorso(String ncorso) {
		CorsoDAO c = new CorsoDAO();
		return c.getStudentiIscrittiAlCorso(ncorso);
		
	}

	public List<Corso> cercaCorsi(String m) {
		CorsoDAO c = new CorsoDAO();
		return c.getCorsiIscritto(m);
	}

	public boolean confrontaIscritti(String m, String nomec) {
		CorsoDAO cdao = new CorsoDAO();
		
		return cdao.studenteIscritto(m, nomec);
	}
}
