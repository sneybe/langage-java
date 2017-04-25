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
public class Employe extends Personne {
    

    @Override
    public String toString() {
        return "Employe{" + super.toString() + ", salaire=" + salaire + '}';
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    
    private double salaire;
  
    }

   
   
    

