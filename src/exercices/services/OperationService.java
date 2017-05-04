/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercice.entity.Compte;
import exercice.exception.DecouvertException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class OperationService {

    public double transferer(long idComptecible, long idCompteorigin, float montant) throws DecouvertException {

        EntityManagerFactory em = Persistence.createEntityManagerFactory("PU");
        EntityManager enf = em.createEntityManager();

        enf.getTransaction().begin();

        // recupere les deux comptes source et exception si solde insuffisant 
        Compte compteSource = enf.find(Compte.class, idCompteorigin);
        if (compteSource.getSolde() < montant) {
            throw new DecouvertException();
        }

        Compte compteCible = enf.find(Compte.class, idComptecible);

        //j'effectue le transfert
        compteCible.setSolde(compteCible.getSolde() + montant);
        compteSource.setSolde(compteSource.getSolde() - montant);

        enf.getTransaction().commit();

        return montant;
    }

    public void retrait(long idcompte, double montant) throws DecouvertException {

        EntityManagerFactory em1 = Persistence.createEntityManagerFactory("PU");
        EntityManager enf1 = em1.createEntityManager();

        enf1.getTransaction().begin();

        Compte compte1 = enf1.find(Compte.class, idcompte);

        if (compte1.getSolde() < montant) {

            throw new DecouvertException();
        } else if (montant > 1000) {

            throw new DecouvertException();
        } else {

            compte1.setSolde((float) (compte1.getSolde() - montant));
        }
        enf1.merge(compte1);

        enf1.getTransaction().commit();

    }

    public void interetAnnuels(float pourcentage) {

        EntityManagerFactory em2 = Persistence.createEntityManagerFactory("PU");
        EntityManager enf2 = em2.createEntityManager();

        enf2.getTransaction().begin();

        Query query = enf2.createQuery("SELECT c "
                + "FROM Compte c");

        List<Compte> list = query.getResultList();

        for (Compte l : list) {

            l.setSolde(l.getSolde() * pourcentage / 100 + l.getSolde());

        }
        enf2.getTransaction().commit();
    }

}
