package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import com.yoann.dahouet.ui.UIVoilier;

public class SerieDAO {

	@SuppressWarnings({ "unchecked" })
	public static void remplirlistSerie()
	 {  
	  Connection c = Connect.cConnect();
	  /* 
	  List ss = new ArrayList<>();	       
	        Statement stm;	        
	        String nomserie;	        
	  try  {
	   stm = c.createStatement();	   
	   String sql = "select Nom_serie from serie ";
	         ResultSet rs = stm.executeQuery(sql);
	         while (rs.next())
	         {
	          nomserie = rs.getString("Nom_serie");
	          System.out.println(nomserie);       
	         }
	         rs.close();  	   
	  } 
	  catch (SQLException e) 
	  {
		  e.printStackTrace();
	   throw new RuntimeException();
	  }	  
	  return ss;
	     */  
	  String req= "select Nom_serie from serie ";
		Statement stmt;
	
	    try {
stmt = c.createStatement();
ResultSet res = stmt.executeQuery(req);
while(res.next()){
	UIVoilier.cbserie.addItem(res.getString("Nom_serie"));     

	}
	res.close();
} catch (SQLException e) {
e.printStackTrace();
	}
		
	  }
}
