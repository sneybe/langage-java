package exercice;


import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author formation
 */
public class ExpleList {
    
    
    public static void main(String[] args) {
        ArrayList liste = new ArrayList();
        liste.add("la fierté des notres");
        liste.add("un eternel recomencement");
        liste.add(new Date());
        liste.add(10);
        
        for(Object list:liste){
        System.out.println(list);
        }
        
        ArrayList<String> titres=new ArrayList<String>();
        
        titres.add("thriller");
        titres.add("Bad");
        titres.add("on la zone my");
        
        for(String tit:titres)
            System.out.println(tit);
        
        ArrayList A=new ArrayList();
        ArrayList B=new ArrayList();
        ArrayList C=new ArrayList();
        A.add("a");
        A.add("b");
        A.add("c");
        
        B.add("d");
        B.add("e");
        B.add("f");
        
        C.addAll(A);
        C.addAll(B);
        C.remove("a");
        
        if(C.contains("a")){
            System.out.println(C);
        }
        System.out.println(C);
    }
    
}