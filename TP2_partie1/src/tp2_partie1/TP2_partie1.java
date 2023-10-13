/*
 * Lucile BERGER
 */
package tp2_partie1;

/**
 *
 * @author ocean
 */
public class TP2_partie1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0,"Dubuisson") ;
      uneBiere.lireEtiquette();
      BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", (float) 6.6,"Abbaye de Leffe") ;
      secondeBiere.lireEtiquette();
      
      
    BouteilleBiere B1 = new BouteilleBiere("Blanche", (float) 5.6,"Brasserie Mont Blanc") ;
    B1.Décapsuler();
    BouteilleBiere B2 = new BouteilleBiere("Delirium Tremens", (float) 8.5,"Brasserie Huyghe") ;
    B2.Décapsuler(); 
    
        
        System.out.println(B1 + "\n" + B2); 
    }

    }
    

