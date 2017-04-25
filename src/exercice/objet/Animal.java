/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.objet;

/**
 *
 * @author formation
 */
public class Animal {
    
    
 private String nom;
 private int nbrePattes;
 private String genre;
 
 public Animal(){
     
 }
  public Animal(String nom,int nbrePattes,String genre){
      this.nom=nom;
      this.nbrePattes=nbrePattes;
      this.genre=genre;
      
      
     
 }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrePattes(int nbrePattes) {
        this.nbrePattes = nbrePattes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrePattes() {
        return nbrePattes;
    }

    public String getGenre() {
        return genre;
    }
    
    public void afficher(){
       
        System.out.println(nom+ " " +"avec "+nbrePattes+" pattes "+""+"et de genre "+genre);
    }
}
