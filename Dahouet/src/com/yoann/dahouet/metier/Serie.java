package com.yoann.dahouet.metier;

public class Serie {

	int Num_serie;
	String Nom_serie;
	
	public Serie(int num_serie, String nom_serie) {
		super();
		this.Num_serie = num_serie;
		this.Nom_serie = nom_serie;
	}
	
	
	public int getNum_serie() {
		return Num_serie;
	}
	public void setNum_serie(int num_serie) {
		Num_serie = num_serie;
	}
	public String getNom_serie() {
		return Nom_serie;
	}
	public void setNom_serie(String nom_serie) {
		Nom_serie = nom_serie;
	}
	
}
