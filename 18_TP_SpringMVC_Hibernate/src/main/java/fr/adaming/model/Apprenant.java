package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_infos")
public class Apprenant {

	@Id
	@Column(name = "id_app")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dateNaissance;
	private String nom;
	private String prenom;
	private String diplome;
	private String cv;

	public Apprenant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apprenant(int id, String dateNaissance, String nom, String prenom, String diplome, String cv) {
		super();
		this.id = id;
		this.dateNaissance = dateNaissance;
		this.nom = nom;
		this.prenom = prenom;
		this.diplome = diplome;
		this.cv = cv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Apprenant [id=" + id + ", dateNaissance=" + dateNaissance + ", nom=" + nom + ", prenom=" + prenom
				+ ", diplome=" + diplome + ", cv=" + cv + "]";
	}



}
