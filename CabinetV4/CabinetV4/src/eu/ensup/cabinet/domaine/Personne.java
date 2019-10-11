package eu.ensup.cabinet.domaine;

/**
 * @author David
 *
 */
public class Personne {

	private int idPersonne;
	private String nom;
	private String prenom;

	/**
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 */
	public Personne(int idPersonne, String nom, String prenom) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdPersonne() {
		return this.idPersonne;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + this.idPersonne + ", nom=" + this.nom + ", prenom=" + this.prenom + "]";
	}

}
