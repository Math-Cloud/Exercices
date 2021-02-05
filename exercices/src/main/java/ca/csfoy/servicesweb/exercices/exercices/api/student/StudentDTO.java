package ca.csfoy.servicesweb.exercices.exercices.api.student;

public class StudentDTO {

	public final long matricule;
	public final String nom;
	public final String prenom;
	public final String date;
	
	public StudentDTO(long matricule, String nom, String prenom, String date) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.date = date;
	}
	
}
