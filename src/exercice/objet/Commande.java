/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.objet;

import exercice.objet.Client;

/**
 *
 * @author formation
 */
public class Commande {
    
    private String description;
    private Double prix;
    private Client client;
    public Commande(String description, Double prix) {
        this.description = description;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Commande{" + "description=" + description + ", prix=" + prix + '}';
    }
    
}
