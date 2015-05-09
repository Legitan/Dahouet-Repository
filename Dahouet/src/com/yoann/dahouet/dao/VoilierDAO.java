package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yoann.dahouet.metier.Voilier;

public class VoilierDAO {
	public static List getListClasse(){
		 
		 Connection c = Connect.cConnect();
		 
		 
		 List cl = new ArrayList<>();
       
       Statement stm;
		try {
			stm = c.createStatement();
			
			String sql = "select Nom_classe from classe ";
	        ResultSet rs = stm.executeQuery(sql);
	      
	       
	        rs.close();
			
			
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
		
		return cl;
      
		 
	 }
	public static void createVoilier(Voilier v) throws Exception {
		 Connection c = Connect.cConnect();
		 PreparedStatement stm;
		try {
			stm = c.prepareStatement("INSERT INTO voilier (Num_proprietaire, Nom_classe, nom_voilier) VALUES (?,?,?)");
			
			
			stm.setInt(1, v.getNumProprietaire());
			stm.setString(2, v.getNomClasse());
			stm.setString(3, v.getNomVoilier());
			stm.execute();
			
			stm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}	
	}

}
