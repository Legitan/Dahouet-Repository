package com.yoann.dahouet.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.yoann.dahouet.ui.UIVoilier;





public class ClasseDAO {

	@SuppressWarnings("unchecked")
	public static void remplirListClasse(String nomSerie){
		 
		 Connection c = Connect.cConnect();
		 
		 /*
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
	 */
	  String req= "select classe.Nom_classe from classe " +
    "inner join serie on classe.Num_serie = serie.Num_serie "+
    " where serie.Nom_serie = " + "'" + nomSerie + "'"+ ";";
			Statement stmt;
		
		    try {
	stmt = c.createStatement();
	ResultSet res = stmt.executeQuery(req);
	while(res.next()){
		UIVoilier.cbclasse.addItem(res.getString("Nom_classe"));     

		}
		res.close();
	} catch (SQLException e) {
	e.printStackTrace();
		}
	}
}
