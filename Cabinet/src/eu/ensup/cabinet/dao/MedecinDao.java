package eu.ensup.cabinet.dao;

import java.sql.SQLException;
import java.sql.Statement;

import eu.ensup.cabinet.domaine.Patient;

public class MedecinDao {

	public static void insertPatient(Patient patient) throws SQLException {

		ConnexionDao cd = new ConnexionDao();

		Statement stm = cd.connection();
		try {
			String sql = "INSERT INTO `patient` (1,`nom`,`prenom`,`tousse`) VALUES ('" + patient.getIdPersonne() + "','"
					+ patient.getNom() + "','" + patient.getPrenom() + "','" + patient.getSymptomes() + "');";

			stm.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
	}

}
