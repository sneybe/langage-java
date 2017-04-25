/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.interfaces;

/**
 *
 * @author formation
 */
public class HydreAvionMitrailleur implements Flottant,Volant,Mitrailleur {

    @Override
    public void flotter() {
        System.out.println("hydreavion flotte");
        
    }

    @Override
    public void voler() {
        System.out.println("hydreavion vole");
    }
    
    @Override
    public void mitrailler() {
        
        System.out.println("il mitraillit");
}
    }