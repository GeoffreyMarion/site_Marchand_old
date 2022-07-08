package modele;

public class Sous_categorie {
	private int id_sous_categorie;
	private String titre;
	
	
	public Sous_categorie() {
	}


	public Sous_categorie(int id_sous_categorie, String titre) {
		this.id_sous_categorie = id_sous_categorie;
		this.titre = titre;
	}


	public int getId_sous_categorie() {
		return id_sous_categorie;
	}


	public void setId_sous_categorie(int id_sous_categorie) {
		this.id_sous_categorie = id_sous_categorie;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	@Override
	public String toString() {
		return "Sous_categorie [id_sous_categorie=" + id_sous_categorie + ", titre=" + titre + "]";
	}
}
