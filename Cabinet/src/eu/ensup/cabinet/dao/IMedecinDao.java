package eu.ensup.cabinet.dao;

import eu.ensup.cabinet.domaine.Medecin;

public interface IMedecinDao {

	public void insertMedecin(Medecin medecin);

	public void readMedecin(int idMedecin);

}
