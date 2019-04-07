package it.polito.tdp.lab04.model;

public class Studente {
	
	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente(String n, String c, String m) {
		this.cognome = c;
		this.nome = n; 
		this.matricola = m;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
}
