package modele;

import java.time.LocalDate;

public class Visite {
private int id_visite;
private int id_produit;
private int id_utilisateur;
private LocalDate date_visite;

public Visite() {

}

public Visite(int id_visite, int id_produit, int id_utilisateur, LocalDate date_visite) {
	this.id_visite = id_visite;
	this.id_produit = id_produit;
	this.id_utilisateur = id_utilisateur;
	this.date_visite = LocalDate.now();
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

public LocalDate getDate_visite() {
	return date_visite;
}

public void setDate_visite(LocalDate date_visite) {
	this.date_visite = date_visite;
}

@Override
public String toString() {
	return "Visite [id_visite=" + id_visite + ", id_produit=" + id_produit + ", id_utilisateur=" + id_utilisateur
			+ ", date_visite=" + date_visite + "]";
}

}
