package eu.ensup.cabinet.service;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.dao.MedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService {
	IMedecinDao medecindao;

	public MedecinService(IMedecinDao dao) {
		// TODO Auto-generated constructor stub
		medecindao = dao;
	}

	public void ajoutMedecin(Medecin medecin) {
		MedecinDao medecindao = new MedecinDao();
		this.medecindao.insertMedecin(medecin);
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

	public Medecin lireMedecin(int idMedecin) {
		MedecinDao medecindao = new MedecinDao();
		Medecin med = this.medecindao.readMedecin(idMedecin);
		return med;
	}
}
