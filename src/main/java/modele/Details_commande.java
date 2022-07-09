package modele;

public class Details_commande {
private int id_details_commande;
private int id_commande;
private int id_produit;
private int quantite;
private int prix;

public Details_commande() {

}

public Details_commande(int id_details_commande, int id_commande, int id_produit, int quantite, int prix) {
	this.id_details_commande = id_details_commande;
	this.id_commande = id_commande;
	this.id_produit = id_produit;
	this.quantite = quantite;
	this.prix = prix;
}

public int getId_details_commande() {
	return id_details_commande;
}

public void setId_details_commande(int id_details_commande) {
	this.id_details_commande = id_details_commande;
}

public int getId_commande() {
	return id_commande;
}

public void setId_commande(int id_commande) {
	this.id_commande = id_commande;
}

public int getId_produit() {
	return id_produit;
}

public void setId_produit(int id_produit) {
	this.id_produit = id_produit;
}

public int getQuantite() {
	return quantite;
}

public void setQuantite(int quantite) {
	this.quantite = quantite;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}

@Override
public String toString() {
	return "Details_commande [id_details_commande=" + id_details_commande + ", id_commande=" + id_commande
			+ ", id_produit=" + id_produit + ", quantite=" + quantite + ", prix=" + prix + "]";
}

}
