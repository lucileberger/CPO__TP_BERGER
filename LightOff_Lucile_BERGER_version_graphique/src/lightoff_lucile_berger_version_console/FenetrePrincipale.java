/*
 * Fenetre Principale Lucile Berger
 */
package lightoff_lucile_berger_version_console;

/**
 *
 * @author Lucile Berger
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class FenetrePrincipale extends javax.swing.JFrame {

    GrilledeCellules grille;
    int nbCoups;
    int i;

    /**
     * Creates new form FenetrePrincipale
     */
    public FenetrePrincipale() {
        initComponents();
        int nbLignes = 7;
        int nbColonnes = 7;
        this.grille = new GrilledeCellules(nbLignes, nbColonnes);

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
            JButton bouton_ligne = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
                

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerLigneDeCellules(j);
                    repaint();
                    if (grille.estTouteEteinte()) {
                        new VictoireFrame();
                        FenetrePrincipale.this.dispose();
                        ajouterPaillettes();
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
            JButton bouton_colonnes = new JButton();
            ActionListener ecouteurClick = new ActionListener() {
              

                @Override
                public void actionPerformed(ActionEvent e) {
                    grille.activerColonneDeCellules(j);
                    repaint();
                    if (grille.estTouteEteinte()) {
                        new VictoireFrame();
                        FenetrePrincipale.this.dispose();
                        ajouterPaillettes();
                    }
                }
            };
            bouton_colonnes.addActionListener(ecouteurClick);
            PanneauBoutonsOri.add(bouton_colonnes);
        }

    }

    public void initialiserPartie() {
        grille.eteindreToutesLesCellules();
        grille.melangerMatriceAleatoirement(10);

    }

    public class VictoireFrame extends JFrame {

        public VictoireFrame() {
            super("Victoire !");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(300, 100);

            JLabel label = new JLabel("Félicitations ! Vous avez gagné !");
            label.setHorizontalAlignment(JLabel.CENTER);
            getContentPane().add(label);

            setLocationRelativeTo(null); 
            setVisible(true);
    
        }

    }

    import java.awt.Color ;
    import java.awt.Font ;
    import java.awt.GridLayout ;
    import java.awt.event.ActionEvent ;
    import java.awt.event.ActionListener ;
    import javax.swing.ImageIcon ;
    import javax.swing.JFrame ;
    import javax.swing.JLabel ;
    import javax.swing.JPanel ;
    import javax.swing.Timer ;

    public class VictoireFrame extends JFrame {

        private JPanel paillettesPanel;

        public VictoireFrame() {
            super("Victoire !");
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(400, 200);
            setLayout(new GridLayout(2, 1));

            JLabel label = new JLabel("Félicitations ! Vous avez gagné !");
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 20));

            add(label);

            paillettesPanel = new JPanel();
            paillettesPanel.setBackground(Color.BLACK);
            add(paillettesPanel);

            setLocationRelativeTo(null);
            setVisible(true);

     
        }

        
        // ????
        private void ajouterPaillettes() {
            Timer timer = new Timer(100, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JLabel paillette = new JLabel(new ImageIcon("OneDrive\\EPF\\2eme année\\CPO_TP_persos\\offimages.png"));
                    paillettesPanel.revalidate();
                    paillettesPanel.repaint();
                }
            });

            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.start();
        }

        public static void main(String[] args) {
            new VictoireFrame();
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

        PanneauGrille = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanneauBoutonsVerticaux = new javax.swing.JPanel();
        PanneauBoutonsOri = new javax.swing.JPanel();
        jButtondd = new javax.swing.JButton();
        jButtondm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanneauGrille.setBackground(new java.awt.Color(255, 153, 204));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 290, 360));

        jLabel1.setText("\"Bienvenue dans le jeu LightOff!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 190, -1));

        PanneauBoutonsVerticaux.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PanneauBoutonsVerticauxLayout = new javax.swing.GroupLayout(PanneauBoutonsVerticaux);
        PanneauBoutonsVerticaux.setLayout(PanneauBoutonsVerticauxLayout);
        PanneauBoutonsVerticauxLayout.setHorizontalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        PanneauBoutonsVerticauxLayout.setVerticalGroup(
            PanneauBoutonsVerticauxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsVerticaux, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 80, 40, 360));

        PanneauBoutonsOri.setBackground(new java.awt.Color(255, 204, 255));

        javax.swing.GroupLayout PanneauBoutonsOriLayout = new javax.swing.GroupLayout(PanneauBoutonsOri);
        PanneauBoutonsOri.setLayout(PanneauBoutonsOriLayout);
        PanneauBoutonsOriLayout.setHorizontalGroup(
            PanneauBoutonsOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PanneauBoutonsOriLayout.setVerticalGroup(
            PanneauBoutonsOriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(PanneauBoutonsOri, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 300, 40));

        jButtondd.setText("DD");
        jButtondd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 50, 30));

        jButtondm.setText("DM");
        jButtondm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondmActionPerformed(evt);
            }
        });
        getContentPane().add(jButtondm, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 60, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtondmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondmActionPerformed
        this.grille.activerDiagonaleMontante();
        repaint();
        FenetrePrincipale.this.dispose();

    }//GEN-LAST:event_jButtondmActionPerformed

    private void jButtonddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonddActionPerformed
        this.grille.activerDiagonaleDescendante();
        repaint();
        FenetrePrincipale.this.dispose();
    }//GEN-LAST:event_jButtonddActionPerformed

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
    private javax.swing.JButton jButtondd;
    private javax.swing.JButton jButtondm;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
