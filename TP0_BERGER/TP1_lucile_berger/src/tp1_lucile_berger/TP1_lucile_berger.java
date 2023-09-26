/*
 * TP1 partie manipNombresInt.
 * lucile berger
 */
package tp1_lucile_berger;

import java.util.Scanner;

/**
 *
 * @author ocean
 */
public class TP1_lucile_berger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        
        int a;
        System.out.print("Entrez le premier entier : ");
        a = sc.nextInt();
        
        int b;
        System.out.print("Entrez le deuxième entier : ");
        b = sc.nextInt();

        System.out.println("Premier entier (a): " + a);
        System.out.println("Deuxième entier (b): " + b);
 
        
        int nbsomme;
        nbsomme = a + b;
        System.out.println(" a + b = " +nbsomme);
        
        int nbd;
        nbd = a - b;
        System.out.println(" a - b = " +nbd);
        
        int nbp;
        nbp = a * b;
        System.out.println(" a * b = " +nbp);
        
        int quotient;
        quotient = a / b;
        System.out.println("Le quotient de a et b est : " +quotient);
        
        int reste;
        reste = a % b;
        System.out.println("Le reste de la division euclidienne de a par b est : " +reste);
    
    }
    
}
