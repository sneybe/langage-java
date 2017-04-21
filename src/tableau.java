
import java.util.Random;
/**
 * tableau a double dimension
 * @author formation
 */
public class tableau {

    public static void main(String[] args) {
        

        
        // on declare le tableau à deux dimensions 
        String[][] tab = new String[10][10];
//     on fait une boucle for pour parcourir les deux tableaux et y afficher l'etoile 
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                tab[i][j] = "*";
// on affiche le tableau 
                System.out.print(tab[i][j]);
            }

            System.out.println();
            
            
        }
      
       // on instancie la classe Random pour generer des valeurs aléatoires
        Random rand = new Random();
        
        // on initialise lenombre de valeurs 
        
        int nbrealeatoire = 5;

        for (int i = 0; i < nbrealeatoire; i++) {

            int indice1 = rand.nextInt(10);
            int indice2 = rand.nextInt(10);

         
            tab[indice1][indice2] = "$";

            System.out.println(" dollar " + tab[indice1][indice2]);

        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tab[i][j]);
            }
            System.out.println("");
        }
   }
}
