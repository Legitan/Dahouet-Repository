package com.yoann.dahouet;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;






import com.yoann.dahouet.metier.Commissaire;
import com.yoann.dahouet.metier.Licencie;
import com.yoann.dahouet.metier.Personne;
import com.yoann.dahouet.metier.Proprietaire;
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
		System.out.println ("Email invalide");
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
	//-----------------------------------------------------------------------------
		Personne p = new Personne("salaun", "yoannsalaun@yahoo.fr", "yoann");
		Personne.affiche(p);
		
		String datnais ="1970/06/14";
		SimpleDateFormat datnais2 = new SimpleDateFormat("yyyy/MM/dd");
		try {
			Date datnais3 = datnais2.parse(datnais);			
			Licencie lic = new Licencie("gabardos", "nathalie.gabardos@hotmail.com", "nathalie", 120, 50, datnais3, 2015);
			Licencie.affiche(lic);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		Proprietaire prop = new Proprietaire("esbens","maxime.esbens@gmail.com", "maxime", "0685486912", "4 rue du gland 58947 la motte verte"); 
		Proprietaire.affiche(prop);
		
		Commissaire com = new Commissaire("zoulagi", "dindon@chonchon.com", "françois", "bretagne");
		Commissaire.affiche(com);
	}
}
