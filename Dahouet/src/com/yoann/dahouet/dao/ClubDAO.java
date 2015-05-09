package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.yoann.dahouet.metier.Club;

public class ClubDAO {
	public static List<String> getListClub()
	 {  
		  Connection c = Connect.cConnect();
		 
		  List<String> club = new ArrayList<>();	       
		        Statement stm;	        
		        String nomclub;	        
		  try  {
		   stm = c.createStatement();	   
		   String sql = "select nom_club from club ";
		         ResultSet rs = stm.executeQuery(sql);
		         while (rs.next())
		         {
		        	 nomclub = rs.getString("nom_club");
		        	 club.add(nomclub);
		        	 
		         }
		         rs.close();  	   
		  } 
		  catch (SQLException e) 
		  {
			  e.printStackTrace();
		   throw new RuntimeException();
		  }	  
		  return club;
		   
		  
		  }
	
	public static Club getClub(String nomClub){
			Club cl = null;
			int numClub = 0;
			
			 Connection c = Connect.cConnect();
			  Statement stm;
				try {
					stm = c.createStatement();
					String sql = "select Num_club from club  WHERE nom_club=" + "'"+ nomClub+"'"+";";
			        ResultSet rs = stm.executeQuery(sql);
			        
			        rs.next();
			        	numClub=rs.getInt("Num_club");
			        rs.close();
				} catch (SQLException e) {
					 e.printStackTrace();
					throw new RuntimeException();
				}
				cl=new Club(numClub, nomClub);
			return cl;
		}
//	public static ArrayList<Classe> getClasse(Serie serie) {
//		  c = Connect.cConnect();
//		  String nomSerie = serie.getNomSerie();
//		  int numSerie = 0;
//		  ArrayList<Classe> classeList = new ArrayList<>();
//		  // test avec select
//		  Statement stm;
//		  
//		  try {
//		   stm = c.createStatement();
//
//		   String sql = "select NUM_SERIE from serie where NOM_SERIE ='"+nomSerie+"'";
//		   ResultSet rs = stm.executeQuery(sql);
//		   rs.next();
//		   numSerie=rs.getInt("NUM_SERIE");
//		   
//		   rs.close();
//		  }
//		   catch (SQLException e) {
//		   // TODO Auto-generated catch block
//		   e.printStackTrace();
//		  }
	
}
