package com.yoann.dahouet.metier;



public class Personne {
	
	protected String nom;
	protected String mail;
	protected String prenom;
	
	public Personne() {
		super();
	}

	public Personne(String nom, String mail, String prenom) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.prenom = prenom;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", mail=" + mail + ", prenom=" + prenom
				+ "]";
	}


	
	
	public static void affiche(Personne p){
		System.out.println("Personne: " + p.toString());
	}
	
}
