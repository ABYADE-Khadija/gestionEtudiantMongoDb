package metier;

import java.util.Date;

public class Etudiant {
	private int id;
	private String no_etud;
	private String nom;
	private String adresse;
	private Date dat_nais;
	private String prog;
	
	//constructors
	public Etudiant(int id, String no_etud, String nom, String adresse, Date dat_nais, String prog) {
		super();
		this.id = id;
		this.no_etud = no_etud;
		this.nom = nom;
		this.adresse = adresse;
		this.dat_nais = dat_nais;
		this.prog = prog;
	}
	public Etudiant(String no_etud, String nom, String adresse, Date dat_nais, String prog) {
		super();
		this.no_etud = no_etud;
		this.nom = nom;
		this.adresse = adresse;
		this.dat_nais = dat_nais;
		this.prog = prog;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDat_nais() {
		return dat_nais;
	}
	public void setDat_nais(Date dat_nais) {
		this.dat_nais = dat_nais;
	}
	public String getProg() {
		return prog;
	}
	public void setProg(String prog) {
		this.prog = prog;
	}
	
	


}
