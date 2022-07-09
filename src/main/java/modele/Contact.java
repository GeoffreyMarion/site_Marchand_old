package modele;

public class Contact {
private int id_contact;
private int id_utilisateur = 1;
private String sujet;
private String message;
private int etat_contact;

public Contact() {

}
public Contact(int id_contact, int id_utilisateur, String sujet, String message, int etat_contact) {
	this.id_contact = id_contact;
	this.id_utilisateur = id_utilisateur;
	this.sujet = sujet;
	this.message = message;
	this.etat_contact = etat_contact;
}
public int getId_contact() {
	return id_contact;
}
public void setId_contact(int id_contact) {
	this.id_contact = id_contact;
}
public int getId_utilisateur() {
	return id_utilisateur;
}
public void setId_utilisateur(int id_utilisateur) {
	this.id_utilisateur = id_utilisateur;
}
public String getSujet() {
	return sujet;
}
public void setSujet(String sujet) {
	this.sujet = sujet;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public int getEtat_contact() {
	return etat_contact;
}
public void setEtat_contact(int etat_contact) {
	this.etat_contact = etat_contact;
}
@Override
public String toString() {
	return "Contact [id_contact=" + id_contact + ", id_utilisateur=" + id_utilisateur + ", sujet=" + sujet
			+ ", message=" + message + ", etat_contact=" + etat_contact + "]";
}
}
