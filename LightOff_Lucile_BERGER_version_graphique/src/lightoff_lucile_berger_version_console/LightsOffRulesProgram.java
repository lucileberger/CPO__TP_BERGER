/*
 * 
 */
package lightoff_lucile_berger_version_console;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lucile berger
 */
public class LightsOffRulesProgram extends JFrame {

    public LightsOffRulesProgram() {
        // Configurer la fenêtre
        setTitle("Lights Off Rules");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Créer un bouton pour afficher les règles
        JButton rulesButton = new JButton("Afficher les règles");
        rulesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afficherReglesLightsOff();
            }
        });

        // Ajouter le bouton à la fenêtre
        getContentPane().add(rulesButton);

        // Centrer la fenêtre sur l'écran
        setLocationRelativeTo(null);

        // Rendre la fenêtre visible
        setVisible(true);
    }

    private void afficherReglesLightsOff() {
        // Afficher les règles dans une boîte de dialogue
        JOptionPane.showMessageDialog(this,
                "Règles du jeu Lights Off :\n\n" +
                        "1. Objectif : Éteindre toutes les lumières sur le plateau.\n" +
                        "2. Plateau de jeu : Le jeu se déroule sur un plateau de lumières.\n" +
                        "3. Action du joueur : Appuyer sur une lumière inverse son état et celui des lumières adjacentes.\n" +
                        "4. Inversion des lumières : Lorsqu'une lumière est pressée, son état change, et l'état des lumières adjacentes est également inversé.\n" +
                        "5. Stratégie : Trouver une séquence d'actions qui éteint toutes les lumières.\n" +
                        "6. Variations : Il existe différentes tailles de plateaux et des règles spécifiques pour augmenter la complexité.\n",
                "Règles du jeu Lights Off",
                JOptionPane.INFORMATION_MESSAGE);
    }

  
}
