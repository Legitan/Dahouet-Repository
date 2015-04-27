package com.yoann.dahouet;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.yoann.dahouet.util.Calcul;
import com.yoann.dahouet.util.Controle;
import com.yoann.dahouet.util.Lire;

public class AppDahouet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Veuillez saisir une adresse Email: ");
	String email = Lire.S();
	boolean valid = Controle.ctlMail(email);
	if ( valid == false)
	{
		System.out.print ("Email invalide");
	}
	
	//---------------------------------------------------------------------------
		System.out.println("Veuillez saisir une date de naissance: ");
		String naissance = Lire.S();
		
		
		SimpleDateFormat naiss = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date d = naiss.parse(naissance);
			int age = Calcul.calculAge(d);
			System.out.println(age);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
