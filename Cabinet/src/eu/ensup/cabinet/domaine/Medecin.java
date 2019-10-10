package eu.ensup.cabinet.domaine;

/**
 * @author David
 *
 */
public class Medecin {
	private String nom;
	private String prenom;
	private Patient patient;

	/**
	 * @param nom
	 * @param prenom
	 */
	public Medecin(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return this.nom;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
