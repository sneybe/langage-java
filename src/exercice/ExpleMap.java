package exercice;


import com.sun.java.accessibility.util.EventID;
import java.util.HashMap;
import java.util.LinkedHashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */import java.util.Set;
public class ExpleMap {
    
    public static void main(String[] args) {
        
        HashMap<String ,String> map= new HashMap<String ,String>();
        
        map.put("intrinséque","Qui est inhérent à quelqu'un, à quelque chose, qui lui appartient en propre");
        map.put("ésoterique", "qui ne peut etre compris que par les initiés");
        
        System.out.println("Esoterique = " + map.get("ésoterique"));
        
         
        
        map.keySet();
        map.keySet();
        System.out.println(map.keySet());
        Set<String>cles = map.keySet(); 
         for(String cle:cles)
        System.out.println(map.get(cle)); ;
        
    }
    
}
