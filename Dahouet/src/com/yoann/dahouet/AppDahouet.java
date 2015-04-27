package com.yoann.dahouet;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.yoann.dahouet.metier.Licencie;
import com.yoann.dahouet.metier.Personne;
import com.yoann.dahouet.util.Lire;

public class AppDahouet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println("Veuillez saisir une adresse Email: ");
	//	String email = Lire.S();
		//Personne.ctlMail(email);
	
		/*System.out.println("Veuillez saisir une date de naissance: ");
		Date naissance = Lire.S();
		Licencie.calculAge(naissance);
		*/
		
		
		
	}
	
	public static boolean isValidDate(String date){
		boolean isOK = true;
			try {
				Date dt  = DateFormat.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				isOK = false;
			}
		return isOK;
		
		}
	
}
