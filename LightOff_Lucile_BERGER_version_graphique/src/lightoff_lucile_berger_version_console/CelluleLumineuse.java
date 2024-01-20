/*
 * 
 */
package lightoff_lucile_berger_version_console;

/**
 *
 * @author lucile
 */
public class CelluleLumineuse {
    private boolean etat; 

    /**
     * Initialise la cellule en état "éteint".
     */
    public CelluleLumineuse() {
        this.etat = false; 
    }

    /**
     * Méthode pour activer/inverse la cellule.
     */
    public void activerCellule() {
        this.etat = !this.etat;    // ! oppérateur de négation logique 
    }

    /**
     * Passe la cellule dans l'état "éteint".
     */
    public void eteindreCellule() {
        this.etat = false;
    }

    /**
     * Méthode pour vérifier si la cellule est éteinte.
     * @return true si la ceullue est est éteinte, sinon false si la ceullule est allumé.
     */
    public boolean estEteint() {
        return !this.etat;
    }

    /**
     * Méthode pour vérifier l'état de la cellule (allumé ou éteinte). 
     * @return true si elle est allumée ou false si elle est éteinte.
     */
    public boolean getEtat() {
        return this.etat;
    }
    
    public boolean estAllumee() {
        return etat; 
 
}

    /**
     * Affiche l'état de la cellule de manière lisible.
     * @return Si la cellule est allumé, elle affiche X, et si elle est éteinte elle affiche O.
     */
    @Override
    public String toString() {
        if (this.etat) {
            return "X"; 
        } else {
            return "O"; 
        }
        
    }
}


        
        
        
        
        
    

   


