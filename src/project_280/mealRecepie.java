package project_280;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nona-
 */
public class mealRecepie extends javax.swing.JFrame {

    /**
     * Creates new form Profile_DietInfo
     */
    public mealRecepie() {
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

        did = new javax.swing.JRadioButton();
        back = new javax.swing.JLabel();
        fav = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        picRecepit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        did.setBackground(new java.awt.Color(255, 255, 255));
        did.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                didMouseClicked(evt);
            }
        });
        getContentPane().add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 60, 60));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 60, 50));

        fav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favMouseClicked(evt);
            }
        });
        getContentPane().add(fav, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 50, 50));

        show.setBackground(new java.awt.Color(251, 255, 255));
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screenwhitee.png"))); // NOI18N
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 70, 70));

        picRecepit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen_MealRecipe.png"))); // NOI18N
        getContentPane().add(picRecepit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new meals().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void didMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_didMouseClicked
        if (did.isSelected()) {
            JOptionPane.showMessageDialog(null, "bon appétit!");
        }
    }//GEN-LAST:event_didMouseClicked

    private void favMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favMouseClicked
        JOptionPane.showMessageDialog(null, "Recepie added");
    }//GEN-LAST:event_favMouseClicked

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
            java.util.logging.Logger.getLogger(mealRecepie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mealRecepie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mealRecepie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mealRecepie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mealRecepie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JRadioButton did;
    private javax.swing.JLabel fav;
    private javax.swing.JLabel picRecepit;
    private javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}