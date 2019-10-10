package eu.ensup.cabinet.service;

import java.sql.SQLException;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService {
	public IMedecinDao dao;

	public void ajoutMedecin(Medecin medecin) throws SQLException {
		MedecinDao medecindao = new MedecinDao();
		this.dao.insertMedecin(medecin);
		System.out.println("Insertion du medecin : " + medecin.getNom() + " dans la base de données");
	}

	/**
	 * @param patient
	 * @param medecin
	 */
	public void consulter(Patient patient, Medecin medecin) {
		System.out.println("Le medecin " + medecin.getNom() + " " + medecin.getPrenom() + " de type "
				+ medecin.getSpecialite() + " consulte le patient : " + patient.getPrenom() + " " + patient.getNom()
				+ "dont les symptomes sont : " + patient.getSymptomes());
	}

	public void lireMedecin(int idMedecin) throws SQLException {
		MedecinDao medecindao = new MedecinDao();
		this.dao.readMedecin(idMedecin);
	}
}
