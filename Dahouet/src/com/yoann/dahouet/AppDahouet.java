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

		System.out.println("Veuillez saisir une adresse Email: ");
		String email = Lire.S();
		Personne.ctlMail(email);
	
	
		
	}

}
