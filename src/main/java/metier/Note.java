package metier;

import java.util.Date;

public class Note {
	private int id;
	private String matiere;
	private Float note;
	public Note(int id, String matiere, Float note) {
		super();
		this.id = id;
		this.matiere = matiere;
		this.note = note;
	}
	public Note(String matiere, Float note) {
		super();
		this.matiere = matiere;
		this.note = note;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public Float getNote() {
		return note;
	}
	public void setNote(Float note) {
		this.note = note;
	}
	
	
}
