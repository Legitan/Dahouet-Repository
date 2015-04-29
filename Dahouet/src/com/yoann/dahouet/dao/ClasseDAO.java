package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class ClasseDAO {

	public static List getListClasse(){
		 
		 Connection c = Connect.cConnect();
		 
		 
		 List cl = new ArrayList<>();
      
      Statement stm;
      String nomclasse;
		try {
			stm = c.createStatement();
			
			String sql = "select Nom_classe from classe ";
	        ResultSet rs = stm.executeQuery(sql);
	      
	        while (rs.next())
	         {
	          nomclasse = rs.getString("Nom_classe");
	          System.out.println(nomclasse);       
	         }
	         rs.close();
	       
	       
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		
		return cl;
     
		 
	 }
	
	
}
