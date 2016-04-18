package bib_multimedia;

import java.util.Date;

public class Gerant extends Personne {
  private int gerant_id  ;
  private static  int nombre_gerant  ;
  private String identifient ;
  private String mot_de_passe ;

  public Gerant(String nom ,String prenom , String cin ,Date date_de_naissance ,String adresse ,String email ,String telephone){
    super( nom ,prenom ,  cin , date_de_naissance , adresse , email , telephone) ;
    Gerant.nombre_gerant+=1 ;
    this.gerant_id=nombre_gerant ;
  }

  
  public int getGerant_id() {
    return gerant_id;
  }

  public String getIdentifient() {
    return identifient;
  }


  public void setIdentifient(String identifient) {
    this.identifient = identifient;
  }


  public String getMot_de_passe() {
    return mot_de_passe;
  }


  public void setMot_de_passe(String mot_de_passe) {
    this.mot_de_passe = mot_de_passe;
  }


  
  
  

}
