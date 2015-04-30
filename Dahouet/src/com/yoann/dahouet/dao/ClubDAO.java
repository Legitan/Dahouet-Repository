package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
}
