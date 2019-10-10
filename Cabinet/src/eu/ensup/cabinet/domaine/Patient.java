package eu.ensup.cabinet.domaine;

public class Patient {
	private String nom;
	private String prenom;
	private Medecin medecin;

	public Patient(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Medecin getMedecin() {
		return this.medecin;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
