package modele;

public class Favori {
private int id_favori;
private int id_produit;
private int id_utilisateur;

public Favori() {

}
public Favori(int id_favori, int id_produit, int id_utilisateur) {
	this.id_favori = id_favori;
	this.id_produit = id_produit;
	this.id_utilisateur = id_utilisateur;
}
public int getId_favori() {
	return id_favori;
}
public void setId_favori(int id_favori) {
	this.id_favori = id_favori;
}
public int getId_produit() {
	return id_produit;
}
public void setId_produit(int id_produit) {
	this.id_produit = id_produit;
}
public int getId_utilisateur() {
	return id_utilisateur;
}
public void setId_utilisateur(int id_utilisateur) {
	this.id_utilisateur = id_utilisateur;
}
@Override
public String toString() {
	return "Favori [id_favori=" + id_favori + ", id_produit=" + id_produit + ", id_utilisateur=" + id_utilisateur + "]";
}

}
