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
public class Personne {

    @Override
    public String toString() {
        return "personne{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    protected String nom;
    protected String prenom;

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

    
    
}
