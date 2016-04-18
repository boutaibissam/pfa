package bib_multimedia;
import java.util.Date;

public class Document {
  private static int nombre_total_documents ;
  private int code_document ;
  private String nom_document  ;
  private String auteur_editeur ;
  private String genre  ;
  private String format  ;
  private int code_fournisseur  ;
  private Date date_acquisition ;
  private int etat ;
  private int duree_de_pret ;
  private int prix ;
  
  public Document (int code_document ,String nom_document ,String auteur_editeur ,String genre ,String format, int code_fournisseur,Date date_acquisition ,int etat,Date duree_de_peret,double prix){
    Document.nombre_total_documents+=1 ;
    this.code_document=nombre_total_documents ;
    this.nom_document=nom_document ;
    this.auteur_editeur=auteur_editeur ;
    this.genre=genre ;
    this.format=format ;    
  }
  
  public static int getNombre_total_documents() {
    return nombre_total_documents;
  }
  
  public int getCode_document() {
    return code_document;
  }
  
  public String getNom_document() {
    return nom_document;
  }
  public void setNom_document(String nom_document) {
    this.nom_document = nom_document;
  }
  public String getauteur_editeur() {
    return auteur_editeur;
  }
  public void setAuteur_editeur(String auteur_editeur) {
    this.auteur_editeur = auteur_editeur;
  }
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }
  public int getCode_fournisseur() {
    return code_fournisseur;
  }
  public void setCode_fournisseur(int code_fournisseur) {
    this.code_fournisseur = code_fournisseur;
  }
  public Date getDate_acquisition() {
    return date_acquisition;
  }
  public void setDate_acquisition(Date date_acquisition) {
    this.date_acquisition = date_acquisition;
  }
  public int getEtat() {
    return etat;
  }
  public void setEtat(int etat) {
    this.etat = etat;
  }
  public int getDuree_de_pret() {
    return duree_de_pret;
  }
  public void setDuree_de_pret(int duree_de_pret) {
    this.duree_de_pret = duree_de_pret;
  }
  public int getPrix() {
    return prix;
  }
  public void setPrix(int prix) {
    this.prix = prix;
  }
  
  
  
  
}
