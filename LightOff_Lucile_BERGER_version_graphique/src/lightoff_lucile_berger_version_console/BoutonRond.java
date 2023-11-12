/*
 * 
 */
package lightoff_lucile_berger_version_console;

/**
 *
 * @author Lucile Berger
 */
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * La classe BoutonRond représente un bouton graphique rond utilisé dans le jeu Lights Off.
 * Il hérite de la classe JButton.
 * Le bouton est configuré pour avoir une forme ovale avec une couleur de fond bleu.
 */
public class BoutonRond extends JButton {

    /**
     * Constructeur par défaut de la classe BoutonRond.
     */
    public BoutonRond() {
        super();
        setContentAreaFilled(false);
    }

    
    /**
     * Constructeur surchargé de la classe BoutonRond.
     * Initialise un bouton rond avec une image en arrière-plan et une couleur de fond par défaut.
     * Ce qui est utile lorsque vous souhaitez créer des boutons avec des apparences personnaliséees.
     * @param img L'image à utiliser en arrière-plan du bouton. (non utilisé ici)
     */
    BoutonRond(ImageIcon img) {
        super();
        setContentAreaFilled(false);
    }

    /**
     * Redéfinition de la méthode paintComponent pour personnaliser le rendu du bouton.
     * Dessine un cercle rempli avec une couleur spécifique en arrière-plan du bouton.
     * @param g L'objet Graphics utilisé pour dessiner le composant.
     */
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(153, 204, 255));
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }

    /**
     * Redéfinition de la méthode paintBorder pour personnaliser le rendu de la bordure du bouton.
     * Dessine la bordure du bouton sous la forme d'un cercle avec une couleur de bordure spécifique.
     *
     * @param g L'objet Graphics utilisé pour dessiner la bordure du composant.
     */
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.WHITE); 
        g.drawOval(0, 0, getSize().width - 1, getSize().height - 1);
    }
}


