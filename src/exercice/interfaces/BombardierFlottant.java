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
public class BombardierFlottant implements Volant,Bombardeur,Mitrailleur,Flottant {

    @Override
    public void voler() {
        System.out.println("le bombardier vole");
    }

    @Override
    public void bombarder() {
        System.out.println("le bombardierflottant bombarde");
    }

    @Override
    public void mitrailler() {
        System.out.println("le bombardier flottant mitraillit ");
    }

    @Override
    public void flotter() {
        System.out.println("bombardierflottant flotte");
    }
    
}
