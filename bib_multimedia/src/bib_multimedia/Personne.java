package bib_multimedia;
import java.util.Date ;

public class Personne {
  protected String nom ;
  protected String prenom ;
  protected String cin  ;
  protected Date date_de_naissance ;
  protected String adresse ;
  protected String email ;
  protected String telephone ;
  
  
  public Personne(String nom ,String prenom , String cin ,Date date_de_naissance ,String adresse ,String email ,String telephone ){
    this.nom =nom ;
    this.prenom =prenom ;
    this.cin=cin ;
    this.date_de_naissance=date_de_naissance  ;
    this.adresse=adresse ;
    this.email=email ;
    this.telephone=telephone  ;
    
  }
  public String getNom() {
    return nom;
  }
  public void setNom(String nom) {
    this.nom = nom;
  }
  public String getPrenom() {
    return prenom;
  }
  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  public String getCin() {
    return cin;
  }
  public void setCin(String cin) {
    this.cin = cin;
  }
  public Date getDate_de_naissance() {
    return date_de_naissance;
  }
  public void setDate_de_naissance(Date date_de_naissance) {
    this.date_de_naissance = date_de_naissance;
  }
  public String getAdresse() {
    return adresse;
  }
  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getTelephone() {
    return telephone;
  }
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

}
