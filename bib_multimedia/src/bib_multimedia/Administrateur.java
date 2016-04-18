package bib_multimedia;

import java.util.Date;

public class Administrateur  extends Personne {
  private static int nombre_administrateur ;
  private int administrateur_id ;
  private String identifient ;
  private String mot_de_passe ;
  
 

  public Administrateur(String nom ,String prenom , String cin ,Date date_de_naissance ,String adresse ,String email ,String telephone){
    super( nom , prenom ,  cin ,date_de_naissance ,adresse , email , telephone) ;
    Administrateur.nombre_administrateur+=1 ;
    this.administrateur_id=nombre_administrateur ;
    
  }
  

  public int getAdministrateur_id() {
    return administrateur_id;
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
