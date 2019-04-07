package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudenteDAO {

	public String[] getStudenteFromMatricola(String m) {
		
		final String sql = "SELECT nome, cognome FROM studente " + 
				"WHERE matricola = ?";
		
		
		String[] studente = new String[2];
		
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, m);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				studente[0] = rs.getString("nome");
				studente[1] = rs.getString("cognome");
				
			}
			
			return studente;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db", e);
		}
	}

}
