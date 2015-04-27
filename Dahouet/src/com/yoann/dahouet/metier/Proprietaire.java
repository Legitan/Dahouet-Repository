package com.yoann.dahouet.metier;



public class Proprietaire extends Personne{
	
	private String telephone;
	private String adresse;

	public Proprietaire(String telephone, String adresse) {
		super();
		this.telephone = telephone;
		this.adresse = adresse;
	}

	
	
	public Proprietaire() {
		super();
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
