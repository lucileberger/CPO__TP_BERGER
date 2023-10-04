/*
 * TP1
 */
package tp1_guessmynumber_berger_lucile;

/**
 *
 * @author ocean
 */
import java.util.Random;

public class TP1_guessmynumber_berger_lucile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Random generateurAleat = new Random();
    
    
        for (int i = 0; i < 5; i++) {
            int nbAleatoire1 = generateurAleat.nextInt(100); 
            System.out.println("Nombre aleatoire : " + nbAleatoire1);
    }
    
    int nbAleatoire2 = generateurAleat.nextInt(100);
    
    
    int nb;
    System.out.println("Choisir un nombre entre 1 et 100");
    nb = sc.nextInt();
    
    if (nb>nbAleatoire2) {
    System.out.println("trop grand"); 
    }
    
    if (nb<nbAleatoire2) {
    System.out.println("trop petit"); 
    }
    
    if (nb == nbAleatoire2) {
    System.out.println("gagné"); 
    }
    }
}



