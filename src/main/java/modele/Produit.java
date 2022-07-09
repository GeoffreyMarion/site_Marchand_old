package modele;

public class Produit {
	private int id_produit;
	private String titre_produit;
	private String description;
	private float prix;
	private String image;
	private int id_sous_categorie;
	private int stock;
	private int stock_minimum;

	public Produit() {

	}

	public Produit(int id_produit, String titre_produit, String description, float prix, String image,
			int id_sous_categorie, int stock, int stock_minimum) {
		this.id_produit = id_produit;
		this.titre_produit = titre_produit;
		this.description = description;
		this.prix = prix;
		this.image = image;
		this.id_sous_categorie = id_sous_categorie;
		this.stock = stock;
		this.stock_minimum = stock_minimum;
	}

	public int getId_produit() {
		return id_produit;
	}

	public void setId_produit(int id_produit) {
		this.id_produit = id_produit;
	}

	public String getTitre_produit() {
		return titre_produit;
	}

	public void setTitre_produit(String titre_produit) {
		this.titre_produit = titre_produit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId_sous_categorie() {
		return id_sous_categorie;
	}

	public void setId_sous_categorie(int id_sous_categorie) {
		this.id_sous_categorie = id_sous_categorie;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getStock_minimum() {
		return stock_minimum;
	}

	public void setStock_minimum(int stock_minimum) {
		this.stock_minimum = stock_minimum;
	}

	@Override
	public String toString() {
		return "Produit [id_produit=" + id_produit + ", titre_produit=" + titre_produit + ", description=" + description
				+ ", prix=" + prix + ", image=" + image + ", id_sous_categorie=" + id_sous_categorie + ", stock="
				+ stock + ", stock_minimum=" + stock_minimum + "]";
	}

}
