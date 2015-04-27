package com.yoann.dahouet.util;


import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controle {

	public static boolean ctlMail(String mail)
	{
		boolean valid = true;
		
		
		
		/*-----------expression reguliere
		  if (mail.matches("^[a-zA-Z0-9._-]{2,}+@[a-zA-Z0-9._-]{2,}\\.[a-z]{2,4}$"));
		  else
		   { System.out.print("Adresse mail invalide"); }
		   */
		
		if (!mail.contains("@"))
		{
			return false;
		}
				
			//System.out.println("Adresse invalide: la saisie doit contenir un @");
					
		if(!mail.contains("."))
		{
			return false;
		}
					//System.out.println("Adresse invalide: la saisie doit contenir un .");
				
		if((mail.indexOf('@')) > (mail.lastIndexOf('.')))
		{
			return false;
		}
					//System.out.println("Adresse invalide: le '.'ne se trouve pas apres le '@'.");
					
		if((mail.indexOf('@')) < 3)
		{
			return false;
		}
					//System.out.println("Adresse invalide: necessite deux caracteres minimum avant l''@'.");
					
		if(((mail.lastIndexOf('.'))-(mail.indexOf('@'))) < 3)
		{
			return false;
		}
					//System.out.println("Adresse invalide: necessite deux caracteres minimum entre l''@' et le '.'.");
					
		if(((mail.length())-(mail.lastIndexOf('.'))) < 3)
		{
			return false;
		}
					//System.out.println("Adresse invalide: necessite deux caracteres minimum entre le '.' et la fin de l'Email.");
			
		return valid;
	
	}
	
	//-----------------------------------------------------------------------
	static final String dateRegex = "^(\\d{4})/(\\d{2})/(\\d{2})$";
	static Pattern patternDate = Pattern.compile(dateRegex);
	
	static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	public static boolean isValidDate(String date){
		Matcher matcher = patternDate.matcher(date);
		return matcher.find();
	}
	/*
	public static boolean testIsDateValid(String naissance){
		boolean naiss = true;
		
		
				try {
					Date dt  = DateFormat.parse(naissance);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					naiss = false;
				}
			return naiss;
			
	}
	*/
}
