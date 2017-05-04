/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice.test;

import exercice.entity.Compte;
import exercice.exception.DecouvertException;
import exercices.services.OperationService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class ExceptionTest {

    //@Test
    public void test1() {
        Compte c = new Compte();
        c.setNomClient("samba");
        c.setId(1L);
        c.setSolde(1500);

        Compte c1 = new Compte();
        c1.setNomClient("Nahane");
        c1.setId(2L);
        c1.setSolde(2000);

        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager ent = en.createEntityManager();

        ent.getTransaction().begin();
        ent.persist(c);
        ent.persist(c1);
        ent.getTransaction().commit();

    }

    @Test
    public void test2() throws DecouvertException {
        OperationService op = new OperationService();
        op.transferer(1l, 2l, 500);
        op.retrait(1L, 500);
        op.interetAnnuels(20);

    }

}

