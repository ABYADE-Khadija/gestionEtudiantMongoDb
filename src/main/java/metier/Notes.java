package metier;

import java.util.Date;

public class Notes {
	private int id;
	private String no_etud;
	private String no_cours;
	private Float note;
	
	//constructors
	public Notes(int id, String no_etud, String no_cours, Float note) {
		super();
		this.id = id;
		this.no_etud = no_etud;
		this.no_cours = no_cours;
		this.note = note;
	}
	public Notes(String no_etud, String no_cours, Float note) {
		super();
		this.no_etud = no_etud;
		this.no_cours = no_cours;
		this.note = note;
	}

	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNo_etud() {
		return no_etud;
	}
	public void setNo_etud(String no_etud) {
		this.no_etud = no_etud;
	}
	public String getNo_cours() {
		return no_cours;
	}
	public void setNo_cours(String no_cours) {
		this.no_cours = no_cours;
	}
	public Float getNote() {
		return note;
	}
	public void setNote(Float note) {
		this.note = note;
	}
	
}
