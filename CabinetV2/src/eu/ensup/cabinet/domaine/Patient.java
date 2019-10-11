package eu.ensup.cabinet.domaine;

/**
 * @author David
 *
 */
public class Patient extends Personne {

	private Medecin medecin;
	private String symptomes;

	public Patient(int idPersonne, String nom, String prenom, String symptomes) {
		super(idPersonne, nom, prenom);
		this.symptomes = symptomes;
	}

	public String getSymptomes() {
		return this.symptomes;
	}

	public void setSymptomes(String symptomes) {
		this.symptomes = symptomes;
	}

	@Override
	public String toString() {
		return "Patient [symptomes=" + this.symptomes + "]";
	}

	/**
	 * @param nom
	 * @param prenom
	 */

}
