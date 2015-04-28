package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class ClasseDAO {

	public static List<Classe> getClasse(){
		 
		 Connection c = Connect.cConnect();
		 
		 
		 List<Classe> cl = new ArrayList<>();
        // test avec select
        Statement stm;
		try {
			stm = c.createStatement();
			
			String sql = "select Nom_classe from classe ";
	        ResultSet rs = stm.executeQuery(sql);
	      
	        
	        while (rs.next()){
	        	int nbhabitant = rs.getInt("nbhabitant");
	        	Classe p = new Classe(rs.getString("nom"));
	        	p.setNum(rs.getInt("num"));
	        	p.setNbHabitants(nbhabitant);
	        	
	        	p.setCapitale(getCapitale(rs));
	        	
	        	cl.add(p);
	        }
	        rs.close();
			
			
		} catch (SQLException e) {
			throw new RuntimeException();
		}
		
		
		return cl;
       
		 
	 }
}
