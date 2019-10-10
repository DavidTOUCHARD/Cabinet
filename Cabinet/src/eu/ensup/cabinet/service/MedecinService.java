package eu.ensup.cabinet.service;

import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public class MedecinService {

	public void consulter(Patient patient, Medecin medecin) {
		System.out.println("Le medecin " + medecin.getNom() + " " + medecin.getPrenom() + " consulte le patient : "
				+ patient.getPrenom() + " " + patient.getNom());
	}
}
