package exercice;

import java.util.Random;
import java.util.Scanner;

public class NombreAleatoire {

    public static void partie() {
        Scanner clavier = new Scanner(System.in);

        int nombre_juste = (int) (Math.random() * 100);
        int nbreessai = 0;
        System.out.println(nombre_juste);
        int nombresaisi;
        do {
            System.out.println("entrez un nombre entre 1 et 100");
            nombresaisi = clavier.nextInt();
            nbreessai++;
            if (nombresaisi < nombre_juste) {
                System.out.println("nombre trop petit");
            } else if (nombresaisi > nombre_juste) {
                System.out.println("nombre trop grand");
            }
        } while (nombre_juste != nombresaisi);

        System.out.println("bravo ");

        if (nbreessai <= 3) {
            System.out.println("Votre score *** ");
        } else if (nbreessai <= 6) {
            System.out.println("Votre score ** ");
        } else {
            System.out.println("vous etes null");
        }

        System.out.println("il vous a fallu " + nbreessai + " essais  pour trouver le nombre juste");
        String reponse;
        System.out.println("voulez vous continuer O/N");

        reponse = clavier.next();

        if (reponse.equals("O")) {
            partie();
        } else {
            System.out.println("Au revoir");
        }

    }

    public static void main(String[] args) {

        partie();
    }

}
