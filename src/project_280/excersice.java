package project_280;

/**
 *
 * @author انغام
 */
public class excersice extends javax.swing.JFrame {

    /**
     * Creates new form excersice
     */
    public excersice() {
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

        imajeClick = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        prograss = new javax.swing.JLabel();
        Workouts = new javax.swing.JLabel();
        Meals = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imajeClick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imajeClickMouseClicked(evt);
            }
        });
        getContentPane().add(imajeClick, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 400, 460));

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 820, 30, 20));

        prograss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prograssMouseClicked(evt);
            }
        });
        getContentPane().add(prograss, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 820, 40, 20));

        Workouts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WorkoutsMouseClicked(evt);
            }
        });
        getContentPane().add(Workouts, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 820, 30, 30));

        Meals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MealsMouseClicked(evt);
            }
        });
        getContentPane().add(Meals, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 820, 40, 30));

        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 820, 30, 30));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen8.png"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imajeClickMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imajeClickMouseClicked
        new excersices().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imajeClickMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(excersice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(excersice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(excersice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(excersice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new excersice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Meals;
    private javax.swing.JLabel Workouts;
    private javax.swing.JLabel back;
    private javax.swing.JLabel imajeClick;
    private javax.swing.JLabel pic;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel prograss;
    // End of variables declaration//GEN-END:variables
}
