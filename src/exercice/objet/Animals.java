/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.objet;

import java.util.ArrayList;

/**
 *
 * @author formation
 */
public abstract class Animals {
    protected int x;
    protected int y;
    private String nom;
    
  
   public abstract void bouger();
       
  public  abstract void manger();
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
