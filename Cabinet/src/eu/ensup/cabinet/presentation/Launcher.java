package eu.ensup.cabinet.presentation;

import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;
import eu.ensup.cabinet.service.MedecinService;

public class Launcher {

	public static void main(String[] args) {
		Medecin medecin = new Medecin("Docteur", "HOUSE");
		Patient patient = new Patient("TOUCHARD", "David");
		MedecinService medecinService = new MedecinService();
		medecinService.consulter(patient, medecin);

	}
}
