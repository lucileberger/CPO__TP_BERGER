/*
 * Fenetre Principale 
 */
package lightoff_lucile_berger_version_console;

/**
 * @author Lucile Berger
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

/**
* La classe FenetrePrincipale représente la fenêtre principale du jeu Lights Off.
 * Elle contient une grille de cellules, des boutons pour activer les lignes et colonnes,
 * et gère l'initialisation de la partie ainsi que l'affichage de la victoire.
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    GrilledeCellules grille;
    int nbCoups;
    int i;

    /**
     * Constructeur de la classe FenetrePrincipale.
     * Initialise les composants graphiques, crée une grille de cellules,
     * configure la fenêtre et les panneaux, et lance une nouvelle partie.
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 7;
        int nbColonnes = 7;
        this.grille = new GrilledeCellules(nbLignes, nbColonnes);

        setTitle("Bienvenue dans le jeu LightOff!");
        setLocationRelativeTo(null);
        setSize(900, 800);
        setVisible(true);

        PanneauGrille.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
       

        initialiserPartie();
        PanneauGrille.setLayout(new GridLayout(nbLignes, nbColonnes));

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                CelluleGraphique bouton_cellule = new CelluleGraphique(grille.matriceCellules[i][j], 36, 36);
                PanneauGrille.add(bouton_cellule);
            }
        }

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, nbColonnes * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        PanneauBoutonsVerticaux.setLayout(new GridLayout(nbLignes, 1));
        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 80, 1 * 40, nbLignes * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < nbLignes; i++) {
            final int ligne = i;
            BoutonRond bouton_ligne = new BoutonRond();
            bouton_ligne.setBackground(Color.WHITE);

            ActionListener ecouteurClick = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(ligne);
                    repaint();
                    if (grille.estTouteEteinte()) {
                        new VictoireFrame();
                        FenetrePrincipale.this.dispose();

                    }

                }
            };
            bouton_ligne.addActionListener(ecouteurClick);
            PanneauBoutonsVerticaux.add(bouton_ligne);

        }

        PanneauBoutonsOri.setLayout(new GridLayout(1, nbColonnes));
        getContentPane().add(PanneauBoutonsOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 35, nbLignes * 40, 1 * 40));
        this.pack();
        this.revalidate();

        // création du panneau de boutons horizontaux (pour les colonnes)
        for (i = 0; i < nbColonnes; i++) {
            final int colonne = i;

            BoutonRond bouton_colonnes = new BoutonRond();

            bouton_colonnes.setBackground(Color.WHITE);

            ActionListener ecouteurClick = new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(colonne);
                    PanneauGrille.repaint();
                    if (grille.estTouteEteinte()) {
                        new VictoireFrame();
                        FenetrePrincipale.this.dispose();

                    }
                }
            };
            bouton_colonnes.addActionListener(ecouteurClick);
            PanneauBoutonsOri.add(bouton_colonnes);
        }

        jButtondd.setBackground(new Color(153, 204, 255));
        jButtondd.setForeground(Color.WHITE);
        jButtondd.setFont(new Font("Arial", Font.BOLD, 12));
        jButtondd.setMargin(new Insets(5, 10, 5, 10));

        jButtondm.setBackground(new Color(153, 204, 255));
        jButtondm.setForeground(Color.WHITE);
        jButtondm.setFont(new Font("Arial", Font.BOLD, 12));
        jButtondm.setMargin(new Insets(5, 10, 5, 10));




    }

    /**
     *Initialise une nouvelle partie en mélangeant la matrice aléatoirement.
     */
    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10000);
    }
    
    
    /**
     * Affiche les règles du jeu Lights Off dans une boîte de dialogue.
     */
    private void afficherReglesLightsOff() {
    String message =
            "<html><body style='width: 300px; padding: 10px;'>" +
                    "<h1 style='color: #1E90FF; font-style: italic;'>Règles du jeu Lights Off :</h1>" +
                    "<div style='margin-left: 20px;'>" +
                        "<ol>" +
                            "<li><strong>Objectif :</strong> Éteindre toutes les lumières sur le plateau.</li>" +
                            "<li><strong>Plateau de jeu :</strong> Le jeu se déroule sur un plateau de lumières.</li>" +
                            "<li><strong>Action du joueur :</strong> Appuyer sur un bouton bleu pour inverser les états des lumières et de celles adjacentes.</li>" +
                            "<li><strong>Stratégie :</strong> Trouver une séquence d'actions qui éteint toutes les lumières.</li>" +
                        "</ol>" +
                    "</div>" +
                    "</body></html>";

    JOptionPane.showMessageDialog(this,
            message,
            "Règles du jeu Lights Off",
            JOptionPane.PLAIN_MESSAGE);
}

    /**
     * Elle représente une fenêtre affichant un message de victoire.
     */
    public class VictoireFrame extends JFrame {

        public VictoireFrame() {
            super("Victoire !");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(500, 300);

            ImageIcon img = new ImageIcon("D:/OneDrive/EPF/2eme année/CPO_TP_persos/WIN.png");
            JLabel imageLabel = new JLabel(img);
            getContentPane().add(imageLabel, BorderLayout.CENTER);

            setLocationRelativeTo(null);
            setVisible(true);

        }
        
   


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        PanneauGrille = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsOri = new javax.swing.JPanel();
        jButtondd = new javax.swing.JButton();
        jButtondm = new javax.swing.JButton();
        rulesButton = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 290, 290));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 190, -1));

        PanneauBoutonsVerticaux.setBackground(javax.swing.UIManager.getDefaults().getColor("MenuBar.hoverBackground"));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 80, 40, 290));

        PanneauBoutonsOri.setBackground(javax.swing.UIManager.getDefaults().getColor("ToggleButton.light"));

        javax.swing.GroupLayout PanneauBoutonsOriLayout = new javax.swing.GroupLayout(PanneauBoutonsOri);
        PanneauBoutonsOri.setLayout(PanneauBoutonsOriLayout);
        PanneauBoutonsOriLayout.setHorizontalGroup(
            PanneauBoutonsOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        PanneauBoutonsOriLayout.setVerticalGroup(
            PanneauBoutonsOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 290, 40));

        jButtondd.setText("DD");
        jButtondd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 30));

        jButtondm.setText("DM");
        jButtondm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondmActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 70, 30));

        rulesButton.setText("Voir les règles du jeu : ");
        rulesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rulesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(rulesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtondmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondmActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        if (grille.estTouteEteinte()) {
            new VictoireFrame();
            FenetrePrincipale.this.dispose();
        }

    }//GEN-LAST:event_jButtondmActionPerformed

    private void jButtonddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonddActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        if (grille.estTouteEteinte()) {
            new VictoireFrame();
            FenetrePrincipale.this.dispose();
        }
    }//GEN-LAST:event_jButtonddActionPerformed

    private void rulesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rulesButtonActionPerformed
        
        this.afficherReglesLightsOff();
        rulesButton.setBackground(Color.WHITE); 
        rulesButton.setForeground(new Color(153, 204, 255));
        rulesButton.setFont(new Font("Arial",Font.ITALIC, 12)); 
  
        repaint();
    }//GEN-LAST:event_rulesButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanneauBoutonsOri;
    private javax.swing.JPanel PanneauBoutonsVerticaux;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtondd;
    private javax.swing.JButton jButtondm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton rulesButton;
    // End of variables declaration//GEN-END:variables
}
