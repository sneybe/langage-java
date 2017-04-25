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
public class Oiseau extends Animals {
    private String nom;

    @Override
    public String toString() {
        return "Oiseau{" + "nom=" + nom + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void bouger() {
        this.y++;
        this.x++;
       System.out.println("je vole à la position "+(y)+" "+(x));
    }
    
    @Override
  public   void manger() {
      System.out.println("je me nourris des insectes") ;
    }
    
}
