package com.yoann.dahouet.util;

import java.util.Calendar;
import java.util.Date;

import com.yoann.dahouet.metier.Licencie;

public class Calcul {

	
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
	
	 public static String calculPoints(double pts,int currentAnnee,Licencie calcul) {
		   
		  String result=null;
		  int yearLicence=(currentAnnee-calcul.getAnneeLicence());
		  if(yearLicence==0){
		  double FFV=calcul.getPointsFFV();
		  double r=new Double(FFV+pts);
		  result=String.valueOf(r);
		  }else
		  result="Licence expirée, MAJ impossible";
		  
		  
		  
		  return result;

		 }
}
