/*
 * partie
 */
package lightoff_lucile_berger_version_console;

import java.util.Scanner;

/**
 *
 * @author Lucile Berger
 */

/*
 * Partie du jeu LightOff
 */
public class Partie {
    GrilledeCellules grille;
    int nbCoups;

    /**
    * Initialise une nouvelle partie du jeu LightOff avec une grille de cellules de taille 7x7.
    * Le nombre de coups joués est initialisé à zéro.
     */
    public Partie() {
        grille = new GrilledeCellules(7, 7);
        nbCoups = 0;
    }

    /**
     * Initialise la partie en mélangeant aléatoirement les cellules de la grille.
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); 
    }

    public static void main(String[] args) {
        Partie partie = new Partie();
        partie.initialiserPartie();
        partie.lancerPartie();
    }

    /**
    * Cette méthode permet de lancer une partie du jeu LightOff en interaction avec l'utilisateur.
    * L'utilisateur peut activer une ligne, une colonne, une diagonale montante ou une diagonale descendante pour éteindre les cellules de la grille.
    * La partie continue jusqu'à ce que toutes les cellules de la grille soient éteintes.
     */
    public void lancerPartie() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bienvenue dans le jeu LightOff!");
    System.out.println("Voici l'état initial de la grille :");
    System.out.println(grille);

    while (!grille.estTouteEteinte()) {
        System.out.println("Coup " + (nbCoups + 1));
        System.out.println("Entrez 1 pour activer une ligne,\n 2 pour activer une colonne,\n 3 pour activer une diagonale montante,\n 4 pour activer une diagonale descendante : ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Entrez la ligne : ");
                int ligne = scanner.nextInt();
                grille.activerLigneDeCellules(ligne);
                break;
            case 2:
                System.out.println("Entrez la colonne : ");
                int colonne = scanner.nextInt();
                grille.activerColonneDeCellules(colonne);
                break;
            case 3:
                grille.activerDiagonaleMontante();
                break;
            case 4:
                grille.activerDiagonaleDescendante();
                break;
            default:
                System.out.println("Choix invalide. Veuillez entrer un nombre entre 1 et 4.");
                continue;
        }

        nbCoups++;
        System.out.println("Nombre de coups joués : " + nbCoups);

        System.out.println("État de la grille après le coup :");
        System.out.println(grille);
    }

    System.out.println("Félicitations ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
}

}



