package eu.ensup.cabinet.presentation;

import java.sql.SQLException;

import eu.ensup.cabinet.dao.IMedecinDao;
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
		IMedecinDao dao = new IMedecinDao() {

			@Override
			public void insertMedecin(Medecin medecin) {
				// TODO Auto-generated method stub

			}

			@Override
			public Medecin readMedecin(int idMedecin) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Patient patient = new Patient(1, "TOUCHARD", "David", "tousse");
		Medecin medecin = new Medecin(3, "Docteur", "HOUSE", patient, "generaliste");
		MedecinService medecinService = new MedecinService(dao);
		medecinService.consulter(patient, medecin);
		medecinService.ajoutMedecin(medecin);
		medecinService.lireMedecin(3);

	}
}
