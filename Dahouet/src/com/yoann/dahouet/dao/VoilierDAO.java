package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

}
