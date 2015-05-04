package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProprietaireDAO {

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
}
