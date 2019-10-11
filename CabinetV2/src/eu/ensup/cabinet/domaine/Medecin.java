package eu.ensup.cabinet.domaine;

/**
 * @author David
 *
 */
public class Medecin extends Personne {

	private Patient patient;
	private String specialite;

	public Medecin(int idPersonne, String nom, String prenom, Patient patient, String specialite) {
		super(idPersonne, nom, prenom);
		this.patient = patient;
		this.specialite = specialite;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public String getSpecialite() {
		return this.specialite;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Medecin [patient=" + this.patient + ", specialite=" + this.specialite + "]";
	}

	/**
	 * @param nom
	 * @param prenom
	 */

}
