package com.yoann.dahouet.metier;



public class Proprietaire extends Personne{
	

	private String telephone;
	private String adresse;
	
	public Proprietaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Proprietaire(String nom, String mail, String prenom) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
	}

	

	
	
	

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String affiche() {
		return "Proprietaire [telephone=" + telephone + ", adresse=" + adresse
				+ "]";
	}

}
