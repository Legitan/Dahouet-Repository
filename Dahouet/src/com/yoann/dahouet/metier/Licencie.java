package com.yoann.dahouet.metier;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Licencie extends Personne{
	
	
	private int numeroLicence;
	private double pointsFFV;
	private Date dateNaissance;
	private int anneeLicence;
	
	
	public Licencie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Licencie(String nom, String mail, String prenom) {
		super(nom, mail, prenom);
		// TODO Auto-generated constructor stub
	}

	
	

	
	
	public void calculPoints()
	{
		
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
	public String affiche() {
		return "Licencie [numeroLicence=" + numeroLicence + ", pointsFFV="
				+ pointsFFV + ", dateNaissance=" + dateNaissance
				+ ", anneeLicence=" + anneeLicence + "]";
	}
	
	public static int calculAge(Date naiss)
	{
		Calendar curr = Calendar.getInstance();
		  Calendar birth = Calendar.getInstance();
		  birth.setTime(naiss);
		  int age = curr.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
		  curr.add(Calendar.YEAR,-age);
		  if(birth.after(curr))
		  {
			  age = age - 1;
		  }
		return age;
	}
}
