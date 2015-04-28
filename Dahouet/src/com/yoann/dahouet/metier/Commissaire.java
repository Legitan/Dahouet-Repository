package com.yoann.dahouet.metier;

public class Commissaire extends Personne{
	
	private String commite;

	public Commissaire(String nom, String mail, String prenom, String commite) {
		super(nom, mail, prenom);
		this.commite = commite;
	}

		

	public String getCommite() {
		return commite;
	}

	public void setCommite(String commite) {
		this.commite = commite;
	}

	@Override
	public String toString() {
		return "Commissaire [commite=" + commite + ", nom=" + nom + ", mail="
				+ mail + ", prenom=" + prenom + "]";
	}
	
	public void affiche(){
		System.out.println("Commissaire: " + super.toString());
	}



	
}
