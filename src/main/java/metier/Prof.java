package metier;

import java.util.Date;

public class Prof {
	private int id;
	private String no_prof;
	private String nom;
	private String bureau;
	private Date bio;
	
	
	//constructors
	
	public Prof(int id, String no_prof, String nom, String bureau, Date bio) {
		super();
		this.id = id;
		this.no_prof = no_prof;
		this.nom = nom;
		this.bureau = bureau;
		this.bio = bio;
	}


	public Prof(String no_prof, String nom, String bureau, Date bio) {
		super();
		this.no_prof = no_prof;
		this.nom = nom;
		this.bureau = bureau;
		this.bio = bio;
	}



	
	//getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNo_prof() {
		return no_prof;
	}


	public void setNo_prof(String no_prof) {
		this.no_prof = no_prof;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getBureau() {
		return bureau;
	}


	public void setBureau(String bureau) {
		this.bureau = bureau;
	}


	public Date getBio() {
		return bio;
	}


	public void setBio(Date bio) {
		this.bio = bio;
	}
	
	
}
