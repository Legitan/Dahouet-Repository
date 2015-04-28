package com.yoann.dahouet.metier;


import java.text.SimpleDateFormat;
import java.util.Date;


public class Licencie extends Personne{
	
	private int numeroLicence;
	private double pointsFFV;
	private Date dateNaissance;
	private int anneeLicence;

	public Licencie(String nom, String mail, String prenom, int numeroLicence,
			double pointsFFV, Date dateNaissance, int anneeLicence) {
		super(nom, mail, prenom);
		this.numeroLicence = numeroLicence;
		this.pointsFFV = pointsFFV;
		this.dateNaissance = dateNaissance;
		this.anneeLicence = anneeLicence;
	}

	
	
	public  double calculPoints(double pts,String dat) throws Exception
	{
		String annee = dat.substring(0,4);
		 int i;
		  i = Integer.parseInt(annee); 
		
		if(i == anneeLicence)
		{
			pointsFFV = pointsFFV + pts;			  
		}
		else throw new Exception();
		return pointsFFV;
	}

	
	
	
	public int getNumeroLicence() {
		return numeroLicence;
	}

	public void setNumeroLicence(int numeroLicence) {
		this.numeroLicence = numeroLicence;
	}

	public double getPointsFFV() {
		return pointsFFV;
	}

	public void setPointsFFV(double pointsFFV) {
		this.pointsFFV = pointsFFV;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getAnneeLicence() {
		return anneeLicence;
	}

	public void setAnneeLicence(int anneeLicence) {
		this.anneeLicence = anneeLicence;
	}



	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		return "Licencie [numeroLicence=" + numeroLicence + ", pointsFFV="
				+ pointsFFV + ", dateNaissance=" + dateFormat.format(dateNaissance)
				+ ", anneeLicence=" + anneeLicence + ", nom=" + nom + ", mail="
				+ mail + ", prenom=" + prenom + "]";
	}

	public void affiche(){
		System.out.println("Licencie: " + super.toString());
	}


	

	
	
}
