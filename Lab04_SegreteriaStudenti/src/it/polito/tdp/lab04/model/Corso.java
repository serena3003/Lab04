package it.polito.tdp.lab04.model;

public class Corso {
	
	private String codins;
	private int numeroCrediti;
	private String nome;
	private int periodoDidattico;
	
	public Corso (String c, int nc, String n, int pd) {
		this.codins = c;
		this.numeroCrediti = nc;
		this.nome = n;
		this.periodoDidattico = pd;
	}

	public String getCodins() {
		return codins;
	}

	public void setCodins(String codins) {
		this.codins = codins;
	}

	public int getNumeroCrediti() {
		return numeroCrediti;
	}

	public void setNumeroCrediti(int numeroCrediti) {
		this.numeroCrediti = numeroCrediti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeriodoDidattico() {
		return periodoDidattico;
	}

	public void setPeriodoDidattico(int periodoDidattico) {
		this.periodoDidattico = periodoDidattico;
	}

	
}
