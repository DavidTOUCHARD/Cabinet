package eu.ensup.cabinet.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import eu.ensup.cabinet.domaine.Medecin;

public class MedecinDao implements IMedecinDao {

	@Override
	public void insertMedecin(Medecin medecin) {

		ConnexionDao cd = new ConnexionDao();

		Statement stm = null;
		try {
			stm = cd.connection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String sql = "INSERT INTO `medecin` (`idMedecin`,`idPatient`,`specialite`) VALUES ('"
					+ medecin.getIdPersonne() + "','" + medecin.getPatient().getIdPersonne() + "','"
					+ medecin.getSpecialite() + "');";

			stm.executeUpdate(sql);
			sql = "INSERT INTO `personne`(`idPersonne`,`nom`,`prenom`) VALUES ('" + medecin.getIdPersonne() + "','"
					+ medecin.getNom() + "','" + medecin.getPrenom() + "');";
			stm.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();
	}

	@Override
	public void readMedecin(int idMedecin) {
		ConnexionDao cd = new ConnexionDao();

		Statement stm = null;
		try {
			stm = cd.connection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String sql = "SELECT * from `medecin`,`personne` where personne.idPersonne=" + idMedecin
					+ " and medecin.idMedecin=" + idMedecin + ";";
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				String nom = rs.getString(5);
				String prenom = rs.getString(6);
				String specialite = rs.getString(3);
				System.out.println(nom + " " + prenom + " " + specialite);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		cd.deconnection();

	}

}
