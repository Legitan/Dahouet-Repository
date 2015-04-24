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

	

	
	
	
	public static void ctlMail(String mail)
	{
		
		/*-----------expression reguliere
		  if (mail.matches("^[a-zA-Z0-9._-]{2,}+@[a-zA-Z0-9._-]{2,}\\.[a-z]{2,4}$"));
		  else
		   { System.out.print("Adresse mail invalide"); }
		   */
		
		if(mail.contains("@"))
		{
			
		}
		else
		{
			System.out.println("Adresse invalide: la saisie doit contenir un @");
		}
		if(mail.contains("."))
		{
			
		}
		else
		{
			System.out.println("Adresse invalide: la saisie doit contenir un .");
		}
		if((mail.indexOf('@')) < (mail.lastIndexOf('.')))
		{
			
		}
		else
		{
			System.out.println("Adresse invalide: le '.'ne se trouve pas apres le '@'.");
		}
		if((mail.indexOf('@')) > 3)
		{
			
		}
		else
		{
			System.out.println("Adresse invalide: necessite deux caracteres minimum avant l''@'.");
		}
		if(((mail.lastIndexOf('.'))-(mail.indexOf('@'))) >= 3)
		{
			
		}
		else
		{
			System.out.println("Adresse invalide: necessite deux caracteres minimum entre l''@' et le '.'.");
		}
		if(((mail.length())-(mail.lastIndexOf('.'))) >= 3)
		{
			
		}
		else
		{
			System.out.println("Adresse invalide: necessite deux caracteres minimum entre le '.' et la fin de l'Email.");
		}
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

	public String affiche() {
		return "Personne [nom=" + nom + ", mail=" + mail + ", prenom=" + prenom
				+ "]";
	}

	
	
}
