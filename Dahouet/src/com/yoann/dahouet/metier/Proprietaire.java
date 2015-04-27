package com.yoann.dahouet.metier;



public class Proprietaire extends Personne{
	

	private String telephone;
	private String adresse;

	public Proprietaire(String nom, String mail, String prenom,
			String telephone, String adresse) {
		super(nom, mail, prenom);
		this.telephone = telephone;
		this.adresse = adresse;
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
				+ ", nom=" + nom + ", mail=" + mail + ", prenom=" + prenom
				+ "]";
	}

	

}
