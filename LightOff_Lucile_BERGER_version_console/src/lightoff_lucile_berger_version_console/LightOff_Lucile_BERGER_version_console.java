/*
 * Lucile Berger Projet n*1, main 
 */
package lightoff_lucile_berger_version_console;

/**
 *
 * @author ocean
 */
public class LightOff_Lucile_BERGER_version_console {


    public static void main(String[] args) {
    
       
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        
        System.out.println("Etat initial de cellule1 : " + cellule1); 
        
        cellule1.activerCellule();
        System.out.println("Nouvel etat de cellule1 : " + cellule1); 
        
        boolean etatCellule1 = cellule1.getEtat();
        System.out.println("Etat de cellule1 : " + etatCellule1);
        
     
        
    }
}


    
