/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercice.entity.Chambre;
import exercice.entity.Compte;
import exercice.exception.DecouvertException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author formation
 */
public class ChambreService {
    
    
    public void reserver (long idchambre, long compte) throws DecouvertException  {
        
        EntityManagerFactory eng=Persistence.createEntityManagerFactory("PU");
        EntityManager eng1=eng.createEntityManager();
        eng1.getTransaction().begin();
        Chambre chambre=eng1.find(Chambre.class, compte);
        
        if(!(chambre.isDisponible())){
            
            throw new DecouvertException();
           
            } 
        
        
        Compte compte1 =eng1.find(Compte.class, chambre);
        
        if(compte1.getSolde()<chambre.getPrix()){
            
            throw new DecouvertException();
            
        } 
        
        else {
           compte1.setSolde((float) (compte1.getSolde()-chambre.getPrix()));
        }
       //chambre.isDisponible(false);
        
       eng1.getTransaction().commit();
    }
    
}
