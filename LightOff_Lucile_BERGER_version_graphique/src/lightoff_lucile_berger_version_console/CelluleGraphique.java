/*
 * Cellule Graphique
 */
package lightoff_lucile_berger_version_console;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

/**
 *
 * @author Lucile Berger
 */

/**
 * La classe CelluleGraphique représente une cellule graphique utilisée dans le jeu Lights Off.
 * Cette cellule est un composant JButton personnalisé affichant l'état d'une cellule lumineuse associée.
 */
public class CelluleGraphique extends JButton {
        int largeur; 
        int hauteur; 
        
        
        /** La cellule lumineuse associée à la cellule graphique. */
        CelluleLumineuse celluleLumineuseAssociee;

    /**
     *  Constructeur de la classe CelluleGraphique.
     * @param celluleLumineuseAssociee  La cellule lumineuse associée à la cellule graphique.
     * @param largeur   La largeur de la cellule graphique.
     * @param hauteur   La hauteur de la cellule graphique.
     */
    public CelluleGraphique(CelluleLumineuse celluleLumineuseAssociee, int largeur, int hauteur) {
            this.largeur = largeur;
            this.hauteur = hauteur;
            this.celluleLumineuseAssociee = celluleLumineuseAssociee;
 }

    /**
     * Redéfinition de la méthode paintComponent pour personnaliser le rendu de la cellule graphique.
     * La cellule affiche le texte représentant l'état de la cellule lumineuse associée et ajuste
     * ses couleurs en fonction de cet état.
     * @param g L'objet Graphics utilisé pour dessiner le composant.
     */
    @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            this.setText(celluleLumineuseAssociee.toString());
            if (celluleLumineuseAssociee.estAllumee()) {
                this.setBackground(new Color(147, 97, 173));
                this.setForeground(Color.WHITE);
            }
            else {
                this.setBackground(new Color(222, 140, 194));
                this.setForeground(Color.WHITE);
            }
            
            
 }
        
}