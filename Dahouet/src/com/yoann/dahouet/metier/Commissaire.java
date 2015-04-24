package com.yoann.dahouet.metier;

public class Commissaire extends Personne{

	private String commite;
	
	public Commissaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commissaire(String nom, String mail, String prenom) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	

	public String getCommite() {
		return commite;
	}

	public void setCommite(String commite) {
		this.commite = commite;
	}

	@Override
	public String affiche() {
		return "Commissaire [commite=" + commite + "]";
	}
}
