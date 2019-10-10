package eu.ensup.cabinet.service;

import java.sql.SQLException;

import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService {

	public void ajoutPatient(Patient patient) throws SQLException {
		MedecinDao medecindao = new MedecinDao();
		MedecinDao.insertPatient(patient);
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
}
