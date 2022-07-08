package modele;

import java.util.Date;

public class Entree_en_stock {
	private int id_entree_en_stock;
	private Fournisseur fournisseur;
	private int id_produit;
	private Date date_entree_en_stock;
	private int quantite;

	public Entree_en_stock() {
	}

	public Entree_en_stock(int id_entree_en_stock, Fournisseur fournisseur, int id_produit, Date date_entree_en_stock,
			int quantite) {
		this.id_entree_en_stock = id_entree_en_stock;
		this.fournisseur = fournisseur;
		this.id_produit = id_produit;
		this.date_entree_en_stock = date_entree_en_stock;
		this.quantite = quantite;
	}

	public int getId_entree_en_stock() {
		return id_entree_en_stock;
	}

	public void setId_entree_en_stock(int id_entree_en_stock) {
		this.id_entree_en_stock = id_entree_en_stock;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public Date getDate_entree_en_stock() {
		return date_entree_en_stock;
	}

	public void setDate_entree_en_stock(Date date_entree_en_stock) {
		this.date_entree_en_stock = date_entree_en_stock;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Entree_en_stock [id_entree_en_stock=" + id_entree_en_stock + ", fournisseur=" + fournisseur
				+ ", id_produit=" + id_produit + ", date_entree_en_stock=" + date_entree_en_stock + ", quantite="
				+ quantite + "]";
	}

}
