package com.yoann.dahouet.controller;


import java.util.List;





import com.yoann.dahouet.dao.ClasseDAO;
import com.yoann.dahouet.dao.ClubDAO;
import com.yoann.dahouet.dao.NeoProprietaireDAO;
import com.yoann.dahouet.dao.SerieDAO;
import com.yoann.dahouet.metier.Club;
import com.yoann.dahouet.metier.NeoProprietaire;
import com.yoann.dahouet.ui.UIProprietaire;
import com.yoann.dahouet.ui.UIVoilier;

public class DahouetController {
	

	public static void remplirListSerie() {
	
		try {
			List<String> listeseries = SerieDAO.getListSerie();
			for (String nomSerie: listeseries)
			UIVoilier.cbserie.addItem(nomSerie);
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}

	
	public static void remplirListClasse(String nomSerie) {
		try {
			List<String> classes = ClasseDAO.getListClasse(nomSerie);
			for (String nomClasse: classes)
			UIVoilier.cbclasse.addItem(nomClasse);
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	public static void remplirListProprietaire() {
		
		try {
			List<String> listeproprios = NeoProprietaireDAO.getListProprietaire();
			for (String nomproprio: listeproprios)
			UIVoilier.cbproprietaire.addItem(nomproprio);
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	public static void remplirListClub() {
		
		try {
			List<String> listeclub = ClubDAO.getListClub();
			for (String nomclub: listeclub)
			UIProprietaire.cbclub.addItem(nomclub);
			
		}

		catch (Exception e) {
			throw new RuntimeException();
		}
	}
	
	
	public static void save() throws Exception{
		
		String nomClub=UIProprietaire.cbclub.getSelectedItem().toString();
		Club club= new Club(0, null);
		club=ClubDAO.getClub(nomClub);
		int numClub = club.getNumClub();
		NeoProprietaire p = new NeoProprietaire(club,UIProprietaire.txtNomDuPropritaire.getText() ,UIProprietaire.txtCoordonnesDuPropritaire.getText()) ;
		NeoProprietaireDAO.createProprio(p,numClub);
		}

	
}
