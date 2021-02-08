/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vues;

import Entity.FonctionsMetier;
import Entity.Labo;
import Entity.Secteur;
import Entity.Visiteurs;
import Model.ModelVisiteur;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kayum
 */
public class frmListerVisiteurs extends javax.swing.JFrame {

    
    FonctionsMetier fm;
    ModelVisiteur mdlVisiteur;
    /**
     * Creates new form frmListerVisiteurs
     */
    public frmListerVisiteurs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisiteurs = new javax.swing.JTable();
        txtNom = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAdresse = new javax.swing.JTextField();
        txtCp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboLabo = new javax.swing.JComboBox<>();
        cboSecteur = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInserer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnRaz = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblVisiteurs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblVisiteurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVisiteursMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVisiteurs);

        jLabel1.setText("Nom");

        jLabel2.setText("Prenom");

        jLabel3.setText("Adresse ");

        jLabel4.setText("Code postal");

        jLabel5.setText("Ville");

        jLabel6.setText("Date Embauche");

        jLabel7.setText("Labo");

        jLabel8.setText("Secteur");

        btnInserer.setText("Inserer");
        btnInserer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsererMouseClicked(evt);
            }
        });

        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });

        btnRaz.setText("RAZ");
        btnRaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRazMouseClicked(evt);
            }
        });

        txtDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAdresse)
                                .addComponent(txtCp))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(txtVille))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cboLabo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 200, Short.MAX_VALUE)
                                .addComponent(cboSecteur, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInserer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInserer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRaz))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboLabo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cboSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(6, 6, 6)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsererMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsererMouseClicked
        // TODO add your handling code here:
        
        if(txtNom.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir un nom", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAdresse.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir une adresse", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPrenom.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir un prenom", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtVille.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir une ville", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtCp.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir un code postal", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDate.getDate().toString().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir une date", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else 
        {
            String nom = txtNom.getText();
            String prenom = txtPrenom.getText();
            String ville = txtVille.getText();
            int cp = Integer.parseInt(txtCp.getText());
            String adresse = txtAdresse.getText();
            int labo = fm.getIdLaboByName(cboLabo.getSelectedItem().toString());
            int secteur = fm.getIdSecteurByName(cboSecteur.getSelectedItem().toString());
                    
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
            String dateEmb = format.format( txtDate.getDate() );
         
            Visiteurs unVisiteur = new Visiteurs(nom,
            prenom, adresse, cp, ville, dateEmb);
            // Insertion en BB du nouveau jeu
            fm.insertVisiteur(unVisiteur, labo, secteur);
            // On recharge le modèle car il y a un nouveau jeu
            mdlVisiteur.loadDatasVisiteur(fm.getAllVisiteurs());
            // On met à jour le modèle du JTable
            tblVisiteurs.setModel(mdlVisiteur);
        }
        
    }//GEN-LAST:event_btnInsererMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fm = new FonctionsMetier();
        // On crée notre modelJeux
        mdlVisiteur = new ModelVisiteur();
        // On charge les données dans le modèle
        mdlVisiteur.loadDatasVisiteur(fm.getAllVisiteurs());
        // On met à jour le modèle du JTable
        tblVisiteurs.setModel(mdlVisiteur);
        
        for (Labo labo : fm.getAllLabos())
        {
            cboLabo.addItem(labo.getNomLabo());
        }
        
        for (Secteur secteur : fm.getAllSecteurs())
        {
            cboSecteur.addItem(secteur.getNomSecteur());
        }
    }//GEN-LAST:event_formWindowOpened

    private void tblVisiteursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVisiteursMouseClicked
        try {
            // TODO add your handling code here:
            String nom = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 1).toString();
            String prenom = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 2).toString();
            String adresse = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 3).toString();
            String cp = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 4).toString();
            String ville = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 5).toString();
            String dateEmb = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 6).toString();
            String labo = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 7).toString();
            String secteur = tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 8).toString();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(dateEmb);
            
            txtNom.setText(nom);
            txtPrenom.setText(prenom);
            txtAdresse.setText(adresse);
            txtCp.setText(cp);
            txtVille.setText(ville);
            cboLabo.setSelectedItem(labo);
            cboSecteur.setSelectedItem(secteur);
            txtDate.setDate(date);
            
        } catch (ParseException ex) {
            Logger.getLogger(frmListerVisiteurs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblVisiteursMouseClicked

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        // TODO add your handling code here:
        if(txtNom.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir un nom", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtAdresse.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir une adresse", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtPrenom.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir un prenom", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtVille.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir une ville", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtCp.getText().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir un code postal", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else if(txtDate.getDate().toString().compareTo("") == 0)
        {
            // On affiche un message
            JOptionPane.showMessageDialog(null,
                    "Veuillez saisir une date", "Erreur de saisie",
                    JOptionPane.ERROR_MESSAGE);
        }
        else 
        {
            String nom = txtNom.getText();
            String prenom = txtPrenom.getText();
            String ville = txtVille.getText();
            int cp = Integer.parseInt(txtCp.getText());
            String adresse = txtAdresse.getText();
            int labo = fm.getIdLaboByName(cboLabo.getSelectedItem().toString());
            int secteur = fm.getIdSecteurByName(cboSecteur.getSelectedItem().toString());
            int id = Integer.parseInt(tblVisiteurs.getValueAt(tblVisiteurs.getSelectedRow(), 0).toString());
                    
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
            String dateEmb = format.format( txtDate.getDate() );
         
            Visiteurs unVisiteur = new Visiteurs(nom,
            prenom, adresse, cp, ville, dateEmb);
            
            fm.modifierAction(unVisiteur, id, labo, secteur);
            
            mdlVisiteur.loadDatasVisiteur(fm.getAllVisiteurs());
            // On met à jour le modèle du JTable
            tblVisiteurs.setModel(mdlVisiteur);
        }
    }//GEN-LAST:event_btnModifierMouseClicked

    private void btnRazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRazMouseClicked
        // TODO add your handling code here:
        
            txtNom.setText(null);
            txtPrenom.setText(null);
            txtAdresse.setText(null);
            txtCp.setText(null);
            txtVille.setText(null);
            cboLabo.setSelectedItem(null);
            cboSecteur.setSelectedItem(null);
            txtDate.setDate(null);
        
        
    }//GEN-LAST:event_btnRazMouseClicked

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
            java.util.logging.Logger.getLogger(frmListerVisiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListerVisiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListerVisiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListerVisiteurs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListerVisiteurs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRaz;
    private javax.swing.JComboBox<String> cboLabo;
    private javax.swing.JComboBox<String> cboSecteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblVisiteurs;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCp;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
