package com.yoann.dahouet.controller;


import java.util.List;



import com.yoann.dahouet.dao.ClasseDAO;
import com.yoann.dahouet.dao.ClubDAO;
import com.yoann.dahouet.dao.NeoProprietaireDAO;
import com.yoann.dahouet.dao.SerieDAO;
import com.yoann.dahouet.metier.NeoProprietaire;
import com.yoann.dahouet.ui.UIProprietaire;
import com.yoann.dahouet.ui.UIVoilier;

public class DahouetController {
	

	public static void remplirListSerie() {
	
		try {
			List<String> listeseries = SerieDAO.getListSerie();
			for (String nomSerie: listeseries)
			UIVoilier.cbserie.addItem(nomSerie);
			System.out.print(SerieDAO.getListSerie());
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
			System.out.print(ClasseDAO.getListClasse(nomSerie));
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
			System.out.print(NeoProprietaireDAO.getListProprietaire());
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
	
	public void createProprio(NeoProprietaire p) {
		try {
			NeoProprietaireDAO.createProprio(p);
			
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
		
	}
	
}
