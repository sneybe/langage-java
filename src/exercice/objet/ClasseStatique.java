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
public class ClasseStatique {
    private static ClasseStatique singleton=null;
    public static int nbreInstance=0;
    public String titre;
    
    private ClasseStatique(){
        nbreInstance++;
    }
    
    public static ClasseStatique getInstance(){
        if(singleton!=null)
                return singleton;
        singleton= new ClasseStatique();
        return singleton;
    }
    
    
    public static void affichernbreInstance(){
        System.out.println("instance: "+ClasseStatique.nbreInstance);
    }
    
}
