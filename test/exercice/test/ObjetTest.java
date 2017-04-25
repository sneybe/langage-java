/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.test;

import exercice.objet.Animal;
import exercice.objet.Animal;
import exercice.objet.ClasseStatique;
import exercice.objet.ClasseStatique;
import exercice.objet.Client;
import exercice.objet.Client;
import exercice.objet.Commande;
import exercice.objet.Employe;
import exercice.objet.Responsable;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ObjetTest {

    @Test
    public void testVariablestatique() {

        ClasseStatique.getInstance();

        ClasseStatique.affichernbreInstance();
    }
//
    @Test
    public void tesConstructeur() {
        Animal renard = new Animal();
        renard.setNbrePattes(12);
        renard.setNom("roux");
        //System.out.println(renard.getNom())  ;
        Animal renard1 = new Animal("rex", 15, "herbivore");
        renard1.afficher();
        // renard.afficher();

    }
//
    @Test
    public void testCode() {

        Commande cmd = new Commande("taboulé", 22.0);
        
        Client C = new Client("yunus", "kaplan", 22, cmd);

        System.out.println(C);
      
    }
     @Test
      public void testCode1() {
          Employe emp=new Employe();
          emp.setNom("SY");
          emp.setPrenom("Samba");
          emp.setSalaire(2000.0);
          System.out.println(emp.toString());
          System.out.println("");
          
          Responsable resp=new Responsable();
          HashSet empl =new HashSet();
          
          empl.add("haby");
          empl.add("Thiam");
          empl.add(2600.0);
          resp.setNom("Diallo");
          resp.setPrenom("Aminata");
          resp.setSalaire(2500.0);
          
          System.out.println(resp.toString()+empl);
          
      }
}
