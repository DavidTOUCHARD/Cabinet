package eu.ensup.cabinet.presentation;

import java.sql.SQLException;

import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

/**
 * @author David
 *
 *
 */
public class Launcher {

	public static void main(String[] args) throws SQLException {

		Patient patient = new Patient(1, "TOUCHARD", "David", "tousse");
		Medecin medecin = new Medecin(3, "Docteur", "HOUSE", patient, "generaliste");
		MedecinService medecinService = new MedecinService();
		medecinService.consulter(patient, medecin);
		medecinService.ajoutMedecin(medecin);
		medecinService.lireMedecin(3);

	}
}
