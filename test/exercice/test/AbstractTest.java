/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.test;

import exercice.objet.Animal;
import exercice.objet.Animals;
import exercice.objet.Oiseau;
import exercice.objet.Poisson;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class AbstractTest {
    
   @Test
   public void Test2(){
       
     Poisson POI=new Poisson ();
     POI.setNom("Merou");
     POI.manger();
     POI.bouger();
     
     Oiseau OI=new Oiseau();
     OI.setNom("Kaplan");
     OI.bouger();
     OI.manger();
     
     List<Animals> Ani =new ArrayList();
    Ani.add(OI);
    Ani.add(POI);
    
    for(Animals an:Ani){
        
       an.bouger();
       an.manger();
        
    }
   }
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
