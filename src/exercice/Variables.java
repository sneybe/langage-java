package exercice;

import java.util.Scanner;

public class Variables {

    public static void main(String[] args) {

        System.out.println(exposant(2, 3));
        Nom("samba");
        
        Scanner s = new Scanner(System.in);
        System.out.println("entrez un texte");
        String text =s.nextLine();
        System.out.println("vous avez ecrit"+text);
    }

    public static int exposant(int nb, int exp) {
        int m = 1;
        for (int i = 0; i < exp; i++) {
            m = nb * m;
        }
        return m;
    }
    
    public static void  Nom(String nom){
        
        System.out.println("votre nom est : "+nom);
    }
    
    
    
    
}
