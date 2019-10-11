package eu.ensup.cabinet.service;

import eu.ensup.cabinet.dao.IMedecinDao;
import eu.ensup.cabinet.domaine.Medecin;
import eu.ensup.cabinet.domaine.Patient;

public interface IMedecinService {

	public void ajoutMedecin(Medecin medecin, IMedecinDao iMedecinDao);

	public void consulter(Patient patient, Medecin medecin);

	public void lireMedecin(int idMedecin);
}
