package tp2;

public class Livre {
	public static final double tva=0.18;
	private String titre,auteur;
	private float nbPages;
	private double prix;
	private boolean prixFixe;
	public Livre (String auteur,String titre) {
		this.auteur=auteur;
		this.titre=titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public String getTitre() {
		return titre;
	}
	public float getnbPages() {
		return nbPages;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		if (prixFixe == true) {
		this.prix= prix+prix*tva;
		prixFixe=false;}
		else System.out.println("impossible de modifier");
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public void setNbPages(int nb) {
		if (nb>20) {
		nbPages = nb;}
		else System.out.println("le nombre indiqué est faible");
	}
	public String toString() {
		return "livre intitulé "+titre +" de "+auteur+" , contenant "+nbPages+" pages et de prix  "+prix;
	}
	public void decrire() {
		System.out.println(toString());
	}
	public Livre() {
		titre="";
		auteur="";
		nbPages=0;
	}
	public Livre(String titre,float nbPages) {
		this.titre=titre;
		this.nbPages=nbPages;
	}
	public Livre(String titre,String auteur,float nbPages) {
		this.titre=titre;
		this.auteur=auteur;
		this.nbPages=nbPages;
	}
	public Livre(String titre,String auteur,float nbPages, double prix) {
		this.titre=titre;
		this.auteur=auteur;
		this.nbPages=nbPages;
		this.prix=prix;
	}
	public boolean testPrix() {
		if (this.prix!=0) {
			return true;
		}
		else return false;
	}
}
