/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.test;

import exercice.interfaces.Bombardeur;
import exercice.interfaces.BombardierFlottant;
import exercice.interfaces.Flottant;
import exercice.interfaces.HydreAvionMitrailleur;
import exercice.interfaces.Mitrailleur;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class Testinterface {

    @Test

    public void testintef() {

        BombardierFlottant BF = new BombardierFlottant();
        BombardierFlottant BF1 = new BombardierFlottant();

        HydreAvionMitrailleur HAM = new HydreAvionMitrailleur();
        HydreAvionMitrailleur HAM1 = new HydreAvionMitrailleur();

        List<Flottant> flottant = new ArrayList();
        List<Mitrailleur> mittraille = new ArrayList();
        List<Bombardeur> bomb = new ArrayList();

        flottant.add(BF);

        mittraille.add(HAM);

        for (Flottant b : flottant) {
            b.flotter();
        }

        for (Mitrailleur h : mittraille) {

            h.mitrailler();

        }
        bomb.add(BF);
        for (Bombardeur b1 : bomb) {
            b1.bombarder();
        }

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
