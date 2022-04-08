package metier;

import java.util.Date;

public class Cours {
	private int id;
	private String no_cours;
	private String no_prof;
	private String local;
	private String titre;
	private String descr;
	private String jour;
	private String heure;
	private boolean statut;
	
	//constructors
	public Cours(int id, String no_cours, String no_prof, String local, String titre, String descr, String jour,
			String heure, boolean statut) {
		super();
		this.id = id;
		this.no_cours = no_cours;
		this.no_prof = no_prof;
		this.local = local;
		this.titre = titre;
		this.descr = descr;
		this.jour = jour;
		this.heure = heure;
		this.statut = statut;
	}
	
	
	
	public Cours(String no_cours, String no_prof, String local, String titre, String descr, String jour, String heure,
			boolean statut) {
		super();
		this.no_cours = no_cours;
		this.no_prof = no_prof;
		this.local = local;
		this.titre = titre;
		this.descr = descr;
		this.jour = jour;
		this.heure = heure;
		this.statut = statut;
	}



	//getters and setters
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getNo_cours() {
		return no_cours;
	}

	public void setNo_cours(String no_cours) {
		this.no_cours = no_cours;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	
	//getter and setters
	
}
