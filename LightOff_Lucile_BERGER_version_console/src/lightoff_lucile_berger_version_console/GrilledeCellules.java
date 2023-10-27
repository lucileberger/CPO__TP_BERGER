/*
 * Grille de Cellules
 */
package lightoff_lucile_berger_version_console;
    import java.util.Random;

/**
 * 
 * @author lucile
 */
public class GrilledeCellules {
    CelluleLumineuse[][] matriceCellules;
    int nbLignes;
    int nbColonnes;

 
    public GrilledeCellules(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne] = new CelluleLumineuse();
            }
        }
    }
 
    /**
     * Éteint toutes les cellules de la grille.
     */
    public void eteindreToutesLesCellules() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne].eteindreCellule();
            }
        }
    }
    
    /**
     * Active toutes les cellules de la ligne spécifiée.
     *
     * @param idLigne L'indice de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            matriceCellules[idLigne][colonne].activerCellule();
        }
    }

    /**
     * Active toutes les cellules de la colonne spécifiée.
     *
     * @param idColonne L'indice de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            matriceCellules[ligne][idColonne].activerCellule();
        }
    }
    
    /**
     * Active la diagonale descendante de la grille en allumant les cellules correspondantes.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }
    
    
    /**
     * Active la diagonale montante de la grille en allumant les cellules correspondantes.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }
    

    /**
    * Active de manière aléatoire soit une ligne, soit une colonne, soit une diagonale de cellules dans la grille.
    */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(3); 

        if (choix == 0) {
            int ligneAleatoire = random.nextInt(nbLignes);
            activerLigneDeCellules(ligneAleatoire);
        } else if (choix == 1) {
            int colonneAleatoire = random.nextInt(nbColonnes);
            activerColonneDeCellules(colonneAleatoire);
        } else {
            activerDiagonaleDescendante();
        }
    }
    
    
    /**
     * Mélange la grille de manière aléatoire en effectuant un certain nombre de tours.
     * @param nbTours Le nombre de tours de mélange à effectuer.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        Random random = new Random();

        eteindreToutesLesCellules();

        for (int tour = 0; tour < nbTours; tour++) {
            int choix = random.nextInt(3);

            if (choix == 0) {
                int ligneAleatoire = random.nextInt(nbLignes);
                activerLigneDeCellules(ligneAleatoire);
            } else if (choix == 1) {
                int colonneAleatoire = random.nextInt(nbColonnes);
                activerColonneDeCellules(colonneAleatoire);
            } else {
                activerDiagonaleDescendante();
            }
        }
    }

    
    
     @Override
public String toString() {
    String grilleString = "";

    grilleString += "    |";
    for (int i = 0; i < matriceCellules[0].length; i++) {
        grilleString += "  " + i + " |"; 
    }
    grilleString += "\n";
    grilleString += "------------------------------------\n";

    for (int i = 0; i < matriceCellules.length; i++) {
        grilleString += " " + i + " |";
        for (int j = 0; j < matriceCellules[i].length; j++) {
            grilleString += "  " + (matriceCellules[i][j].getEtat() == true ? "X" : "O") + " |";
        }
        grilleString += "\n";
        grilleString += "------------------------------------\n";
    }

    return grilleString;
}




        }

 
