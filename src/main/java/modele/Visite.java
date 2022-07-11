package modele;

import java.time.LocalDate;

public class Visite {
private int id_visite;
private Produit produit;
private Utilisateur utilisateur;
private Date date_visite;

public Visite() {

}


public Visite(int id_visite, Produit produit, Utilisateur utilisateur, Date date_visite) {
	super();
	this.id_visite = id_visite;
	this.produit = produit;
	this.utilisateur = utilisateur;
	this.date_visite = date_visite;
}


public int getId_visite() {
	return id_visite;
}

public void setId_visite(int id_visite) {
	this.id_visite = id_visite;
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


public Produit getProduit() {
	return produit;
}


public void setProduit(Produit produit) {
	this.produit = produit;
}


public Utilisateur getUtilisateur() {
	return utilisateur;
}


public void setUtilisateur(Utilisateur utilisateur) {
	this.utilisateur = utilisateur;
}


public Date getDate_visite() {
	return date_visite;
}


public void setDate_visite(Date date_visite) {
	this.date_visite = date_visite;
}


@Override
public String toString() {
	return "Visite [id_visite=" + id_visite + ", utilisateur=" + utilisateur + "]";
}

}
