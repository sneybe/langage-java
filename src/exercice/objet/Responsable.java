/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.objet;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author formation
 */
public class Responsable extends Employe {
    HashSet empl = new HashSet();

    @Override
    public String toString() {
        return "Responsable{" + super.toString() + ", empl=" + empl + '}';
    }

    public HashSet getEmpl() {
        return empl;
    }

    public void setEmpl(HashSet empl) {
        this.empl = empl;
    }
    
    
   
    }

    

   
    

