package com.yoann.dahouet.metier;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Period;


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
	/*--------------F1
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
	*/
	
	public int calculAge(Date naissance, Date today) { 
	    Calendar cNaissance = new GregorianCalendar(); 
	    Calendar cToday = new GregorianCalendar(); 
	    cNaissance.setTime(naissance); 
	    cToday.setTime(today); 
	 
	    int yearDiff = cToday.get(Calendar.YEAR) - cNaissance.get(Calendar.YEAR); 
	    cNaissance.set(Calendar.YEAR, cToday.get(Calendar.YEAR)); 
	    if (!cNaissance.after(cToday)) { 
	        return yearDiff; //Birthday already celebrated this year 
	    } 
	    else { 
	        return Math.max(0, yearDiff-1); //Need a max to avoid -1 for baby 
	    } 
	    
	}
	/*
	 ------------------------F2
	
	public int computeAge(DateTime birthDay, DateTime currentDate) { 
		if(birthDay.isBefore(currentDate)){
		Period period = new Period(birthDay, currentDate);
		return period.getYears();
		} else {
		return 0;
		}
		}

		public int computeAge(Date birthDay, Date currentDate ){
		return computeAge(new DateTime(birthDay), new DateTime(currentDate));
		}
		 */
}
