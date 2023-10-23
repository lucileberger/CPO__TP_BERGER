/*
 * Lucile BERGER TP3
 */
package tp3_heroic_fantasy_berger;

import Armes.Arme;
import Armes.Epee;
import Armes.Baton;
import java.util.ArrayList;

/**
 *
 * @author ocean
 */
public class TP3_Heroic_Fantasy_BERGER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        
        ArrayList<Arme> armes = new ArrayList<>();
        
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        
        
        armes.add(baton1);
        armes.add(baton2);
        armes.add(epee1);
        armes.add(epee2);
        
        for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i);
            System.out.println("Arme " + (i + 1) + ": " + arme);
        }
        
    }
    
}
