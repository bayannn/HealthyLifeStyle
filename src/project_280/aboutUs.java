package project_280;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nona-
 */
public class aboutUs extends javax.swing.JFrame {

    /**
     * Creates new form AboutUs
     */
    public aboutUs() {
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

        Back = new javax.swing.JLabel();
        face = new javax.swing.JLabel();
        gmaill = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 40, 30));

        face.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faceMouseClicked(evt);
            }
        });
        getContentPane().add(face, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 310, 90));

        gmaill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gmaillMouseClicked(evt);
            }
        });
        getContentPane().add(gmaill, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 310, 90));

        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterMouseClicked(evt);
            }
        });
        getContentPane().add(twitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 310, 90));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen_AboutUs.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new setting().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void faceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faceMouseClicked
        // TODO add your handling code here:
         try {
            Desktop.getDesktop().browse(new URI ("https://www.facebook.com/campaign/landing.php?campaign_id=1661689889&extra_1=s%7Cc%7C320280751357%7Ce%7Cfacebook%7C&placement=&creative=320280751357&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D1661689889%26adgroupid%3D65800001964%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-541132862%26loc_physical_ms%3D1012089%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiAnvj9BRA4EiwAuUMDfz3pgs9cvf1SisxfNw2_KfnyUKt0DYKsrCGHUWpFHY7xTYI_rWj06hoCKkIQAvD_BwE"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(aboutUs.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(aboutUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_faceMouseClicked

    private void gmaillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gmaillMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI ("https://www.google.com/gmail/"));
        } catch (URISyntaxException ex) {
        } catch (IOException ex) {
            Logger.getLogger(aboutUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gmaillMouseClicked

    private void twitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterMouseClicked
        // TODO add your handling code here:
         try {
            Desktop.getDesktop().browse(new URI ("https://twitter.com/login/"));
        } catch (URISyntaxException ex) {
        } catch (IOException ex) {
            Logger.getLogger(aboutUs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_twitterMouseClicked

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
            java.util.logging.Logger.getLogger(aboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel face;
    private javax.swing.JLabel gmaill;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables

}