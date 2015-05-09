package com.yoann.dahouet.metier;

public class NeoProprietaire {
	
	int numProprio;
	Club club;
	String nomProprio;
	String coordonneeProprio;

		public NeoProprietaire(int numProprio, Club club, String nomProprio,
			String coordonneeProprio) {
		super();
		this.numProprio = numProprio;
		this.club = club;
		this.nomProprio = nomProprio;
		this.coordonneeProprio = coordonneeProprio;
	}
		
		public int getNumProprio() {
			return numProprio;
		}
		public void setNumProprio(int numProprio) {
			this.numProprio = numProprio;
		}
		public Club getClub() {
			return club;
		}
		public void setClub(Club club) {
			this.club = club;
		}
		public String getNomProprio() {
			return nomProprio;
		}
		public void setNomProprio(String nomProprio) {
			this.nomProprio = nomProprio;
		}
		public String getCoordonneeProprio() {
			return coordonneeProprio;
		}
		public void setCoordonneeProprio(String coordonneeProprio) {
			this.coordonneeProprio = coordonneeProprio;
		}
		
}
