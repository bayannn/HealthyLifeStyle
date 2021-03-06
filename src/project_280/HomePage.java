package project_280;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author انغام
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form articals
     */
    public HomePage() {
        initComponents();
        note.setVisible(false);
        firework.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        articalPages = new javax.swing.JLabel();
        Num_Water_cup = new javax.swing.JComboBox<String>();
        note = new javax.swing.JLabel();
        ex = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        prograss = new javax.swing.JLabel();
        Workouts = new javax.swing.JLabel();
        Meals = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        firework = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        articalPages.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articalPagesMouseClicked(evt);
            }
        });
        getContentPane().add(articalPages, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 350, 140));

        Num_Water_cup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Num_Water_cup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_Water_cupActionPerformed(evt);
            }
        });
        getContentPane().add(Num_Water_cup, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 640, 70, 20));

        note.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        note.setForeground(new java.awt.Color(152, 195, 255));
        note.setText("The daily water task completed !! ");
        getContentPane().add(note, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, 280, 40));

        ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exMouseClicked(evt);
            }
        });
        getContentPane().add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, 140));

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 810, 30, 20));

        prograss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prograssMouseClicked(evt);
            }
        });
        getContentPane().add(prograss, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 810, 40, 20));

        Workouts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkoutsMouseClicked(evt);
            }
        });
        getContentPane().add(Workouts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 810, 30, 30));

        Meals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MealsMouseClicked(evt);
            }
        });
        getContentPane().add(Meals, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 810, 40, 30));

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 810, 30, 30));

        firework.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screenfirework.png"))); // NOI18N
        getContentPane().add(firework, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, 60, 50));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen7.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseClicked
        new excersice().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exMouseClicked

    private void articalPagesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articalPagesMouseClicked
        new articlesPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_articalPagesMouseClicked

    private void Num_Water_cupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_Water_cupActionPerformed
        if (Num_Water_cup.getSelectedItem().toString().equals("12")) {
            note.setVisible(true);
            firework.setVisible(true);
        }
    }//GEN-LAST:event_Num_Water_cupActionPerformed

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        new profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void prograssMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prograssMouseClicked
        new prograss().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_prograssMouseClicked

    private void WorkoutsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WorkoutsMouseClicked
        new workouts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_WorkoutsMouseClicked

    private void MealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealsMouseClicked
        new meals().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MealsMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Meals;
    public static javax.swing.JComboBox<String> Num_Water_cup;
    private javax.swing.JLabel Workouts;
    private javax.swing.JLabel articalPages;
    private javax.swing.JLabel ex;
    private javax.swing.JLabel firework;
    private javax.swing.JLabel note;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel prograss;
    // End of variables declaration//GEN-END:variables
}
