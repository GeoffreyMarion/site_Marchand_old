package modele;

public class Commentaire {
private int id_commentaire;
private String commentaire;
private int note;
private int id_produit;
private int id_utilisateur;

public Commentaire() {

}
public Commentaire(int id_commentaire, String commentaire, int note, int id_produit, int id_utilisateur) {
	this.id_commentaire = id_commentaire;
	this.commentaire = commentaire;
	this.note = note;
	this.id_produit = id_produit;
	this.id_utilisateur = id_utilisateur;
}
public int getId_commentaire() {
	return id_commentaire;
}
public void setId_commentaire(int id_commentaire) {
	this.id_commentaire = id_commentaire;
}
public String getCommentaire() {
	return commentaire;
}
public void setCommentaire(String commentaire) {
	this.commentaire = commentaire;
}
public int getNote() {
	return note;
}
public void setNote(int note) {
	this.note = note;
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
	return "Commentaire [id_commentaire=" + id_commentaire + ", commentaire=" + commentaire + ", note=" + note
			+ ", id_produit=" + id_produit + ", id_utilisateur=" + id_utilisateur + "]";
}


}
