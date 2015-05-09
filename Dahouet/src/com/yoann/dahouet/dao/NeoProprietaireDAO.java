package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yoann.dahouet.metier.NeoProprietaire;



public class NeoProprietaireDAO {

	public static List<String> getListProprietaire()
	 {  
		  Connection c = Connect.cConnect();
		 
		  List<String> prop = new ArrayList<>();	       
		        Statement stm;	        
		        String nomprop;	        
		  try  {
		   stm = c.createStatement();	   
		   String sql = "select Nom_proprietaire from proprietaire ";
		         ResultSet rs = stm.executeQuery(sql);
		         while (rs.next())
		         {
		        	 nomprop = rs.getString("Nom_proprietaire");
		          prop.add(nomprop);
		         }
		         rs.close();  	   
		  } 
		  catch (SQLException e) 
		  {
			  e.printStackTrace();
		   throw new RuntimeException();
		  }	  
		  return prop;
		   
		  
		  }
	/*
	@SuppressWarnings("unchecked")
	public static void remplirListProprietaire(){
		 
		 Connection c = Connect.cConnect();
		 
		 String req= "select Nom_proprietaire from proprietaire ";
			Statement stmt;
		
		    try {
	stmt = c.createStatement();
	ResultSet res = stmt.executeQuery(req);
	while(res.next()){
		UIVoilier.cbproprietaire.addItem(res.getString("Nom_proprietaire"));     

		}
		res.close();
	} catch (SQLException e) {
	e.printStackTrace();
		}
	 }
	 */
	public static void createProprio(NeoProprietaire p, int numClub) throws Exception {
		 
		 Connection c = Connect.cConnect();
		 PreparedStatement stm;
		try {
			stm = c.prepareStatement("INSERT INTO proprietaire (Num_club, Nom_proprietaire, Coordonnees_proprietaire) VALUES (?,?,?)");
			
			
			stm.setInt(1, numClub);
			stm.setString(2, p.getNomProprio());
			stm.setString(3, p.getCoordonneeProprio());
			stm.execute();
			
			stm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}	
	 }
	public static int getNumProprio(String nomProprio){
		
		int numProprio = 0;
		
		 Connection c = Connect.cConnect();
		  Statement stm;
			try {
				stm = c.createStatement();
				String sql = "select Num_proprietaire from proprietaire  WHERE Nom_proprietaire=" + "'"+ nomProprio+"'"+";";
		        ResultSet rs = stm.executeQuery(sql);
		        
		        rs.next();
		        numProprio=rs.getInt("Num_proprietaire");
		        rs.close();
			} catch (SQLException e) {
				 e.printStackTrace();
				throw new RuntimeException();
			}
		return numProprio;
	}
	
	
}
