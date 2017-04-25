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
public class Poisson extends Animals {
    
   private String nom;

    @Override
    public String toString() {
        return "Poisson{" + "nom=" + nom + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
   public  void bouger() {
       this.x++;
      System.out.println("je m'appelle "+getNom()+" je nage à la position "+x);
    }

    @Override
  public   void manger() {
      System.out.println("je m appelle " + getNom() + " je me nouris des petits poissons ");
    }
    
    
    
}
