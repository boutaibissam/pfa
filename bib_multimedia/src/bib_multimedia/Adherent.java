package bib_multimedia;
import java.util.Date;

public class Adherent extends Personne {
  private static int nombre_total_adherents ;
  private int code_adherent ;
  private Date date_adhesion ;
  private int type_adhesion  ;
  private Date date_expiration ;
  private int etat ;
  
  
  public Adherent(String nom ,String prenom , String cin ,Date date_de_naissance ,Date date_adhesion ,int type_adhesion ,String adresse ,String email ,String telephone){
    super( nom , prenom ,  cin ,date_de_naissance ,adresse , email , telephone) ;
    Adherent.nombre_total_adherents+=1 ;
    this.code_adherent=nombre_total_adherents ;
    this.date_adhesion=date_adhesion ;
    this.date_expiration= date_adhesion;
    this.etat=1 ;     
  }


  public Date getDate_adhesion() {
    return date_adhesion;
  }


  public void setDate_adhesion(Date date_adhesion) {
    this.date_adhesion = date_adhesion;
  }


  public int getType_adhesion() {
    return type_adhesion;
  }


  public void setType_adhesion(int type_adhesion) {
    this.type_adhesion = type_adhesion;
  }


  public Date getDate_expiration() {
    return date_expiration;
  }


  public void setDate_expiration(Date date_expiration) {
    this.date_expiration = date_expiration;
  }


  public int getEtat() {
    return etat;
  }


  public void setEtat(int etat) {
    this.etat = etat;
  }


  public static int getNombre_total_adherents() {
    return nombre_total_adherents;
  }


  public int getCode_adherent() {
    return code_adherent;
  }
  
  
  
  
  

}
