package project_280;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jana
 */
public class profile_PersonalInfo extends javax.swing.JFrame {

    /**
     * Creates new form Profile_PersonalInfo
     */
    public profile_PersonalInfo() {
        initComponents();
        this.setInfo ();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Confirm_Editing = new javax.swing.JOptionPane();
        Back = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Name_Edit = new javax.swing.JButton();
        Gender = new javax.swing.JComboBox<>();
        Gender_Edit = new javax.swing.JButton();
        Age = new javax.swing.JTextField();
        Age_Edit = new javax.swing.JButton();
        Weight = new javax.swing.JTextField();
        Weight_Edit = new javax.swing.JButton();
        Hight = new javax.swing.JTextField();
        Hight_Edit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 34, 30, 20));

        Name.setEnabled(false);
        Name.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                NameCaretUpdate(evt);
            }
        });
        Name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameMouseClicked(evt);
            }
        });
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 120, 30));

        Name_Edit.setBackground(java.awt.Color.white);
        Name_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Name_Edit.setText("Edit");
        Name_Edit.setEnabled(false);
        Name_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Name_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Name_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 60, 20));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        Gender.setEnabled(false);
        Gender.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GenderItemStateChanged(evt);
            }
        });
        Gender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenderMouseClicked(evt);
            }
        });
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 120, 30));

        Gender_Edit.setBackground(java.awt.Color.white);
        Gender_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Gender_Edit.setText("Edit");
        Gender_Edit.setEnabled(false);
        Gender_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Gender_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 60, 20));

        Age.setEnabled(false);
        Age.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                AgeCaretUpdate(evt);
            }
        });
        Age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgeMouseClicked(evt);
            }
        });
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 120, 30));

        Age_Edit.setBackground(java.awt.Color.white);
        Age_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Age_Edit.setText("Edit");
        Age_Edit.setEnabled(false);
        Age_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Age_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Age_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 60, 20));

        Weight.setEnabled(false);
        Weight.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                WeightCaretUpdate(evt);
            }
        });
        Weight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WeightMouseClicked(evt);
            }
        });
        getContentPane().add(Weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 120, 30));

        Weight_Edit.setBackground(java.awt.Color.white);
        Weight_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Weight_Edit.setText("Edit");
        Weight_Edit.setEnabled(false);
        Weight_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Weight_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Weight_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 60, 20));

        Hight.setEnabled(false);
        Hight.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                HightCaretUpdate(evt);
            }
        });
        Hight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HightMouseClicked(evt);
            }
        });
        getContentPane().add(Hight, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 120, 30));

        Hight_Edit.setBackground(java.awt.Color.white);
        Hight_Edit.setForeground(new java.awt.Color(0, 0, 102));
        Hight_Edit.setText("Edit");
        Hight_Edit.setEnabled(false);
        Hight_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hight_EditActionPerformed(evt);
            }
        });
        getContentPane().add(Hight_Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 60, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_280/Screen_profile_personalInfo.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        new profile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void NameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_NameCaretUpdate
        if (Name.getText().length() > 0 && Name.isEnabled()) {
            Name_Edit.setEnabled(true);
        }
        else {
            Name_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_NameCaretUpdate

    private void NameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameMouseClicked
        if(Name.isEnabled() == false){
            Name.setEnabled(true);
        }
    }//GEN-LAST:event_NameMouseClicked

    private void Name_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Name_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
            this,
            "Are You Sure?",
            "Confirm",
            Confirm_Editing.YES_NO_OPTION,
            Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newName = Name.getText();
            profile_PersonalInfo n = new profile_PersonalInfo();
            n.setVisible(true);
            n.Name.setText(newName);
            signUp.name.setText(newName);
            this.dispose();
        }else {
            Name.setEnabled(false);
            Name_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Name_EditActionPerformed

    private void Gender_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
            this,
            "Are You Sure?",
            "Confirm",
            Confirm_Editing.YES_NO_OPTION,
            Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newGender = Gender.getItemAt(Gender.getSelectedIndex());
            profile_PersonalInfo n = new profile_PersonalInfo();
            n.setVisible(true);
            n.Gender.setSelectedItem(newGender);
            this.dispose();
        }
        else {
            Gender.setEnabled(false);
            Gender_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Gender_EditActionPerformed

    private void AgeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_AgeCaretUpdate
        if (Age.getText().length() > 0 && Age.isEnabled()) {
            Age_Edit.setEnabled(true);
        }
        else {
            Age_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_AgeCaretUpdate

    private void AgeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeMouseClicked
        if(Age.isEnabled() == false){
            Age.setEnabled(true);
        }
    }//GEN-LAST:event_AgeMouseClicked

    private void Age_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Age_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
            this,
            "Are You Sure?",
            "Confirm",
            Confirm_Editing.YES_NO_OPTION,
            Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newAge = Age.getText();
            profile_PersonalInfo n = new profile_PersonalInfo();
            n.setVisible(true);
            n.Age.setText(newAge);
            this.dispose();
        }
        else {
            Age.setEnabled(false);
            Age_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Age_EditActionPerformed

    private void WeightCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_WeightCaretUpdate
        if (Weight.getText().length() > 0 && Weight.isEnabled()) {
            Weight_Edit.setEnabled(true);
        }
        else {
            Weight_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_WeightCaretUpdate

    private void WeightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WeightMouseClicked
        if(Weight.isEnabled() == false){
            Weight.setEnabled(true);
        }
    }//GEN-LAST:event_WeightMouseClicked

    private void Weight_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Weight_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
            this,
            "Are You Sure?",
            "Confirm",
            Confirm_Editing.YES_NO_OPTION,
            Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newWeight = Weight.getText();
            profile_PersonalInfo n = new profile_PersonalInfo();
            n.setVisible(true);
            n.Weight.setText(newWeight);
            this.dispose();
        }
        else {
            Weight.setEnabled(false);
            Weight_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Weight_EditActionPerformed

    private void HightCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_HightCaretUpdate
        if (Hight.getText().length() > 0 && Hight.isEnabled()) {
            Hight_Edit.setEnabled(true);
        }
        else {
            Hight_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_HightCaretUpdate

    private void HightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HightMouseClicked
        if(Hight.isEnabled() == false){
            Hight.setEnabled(true);
        }
    }//GEN-LAST:event_HightMouseClicked

    private void Hight_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hight_EditActionPerformed
        int result = Confirm_Editing.showOptionDialog(
            this,
            "Are You Sure?",
            "Confirm",
            Confirm_Editing.YES_NO_OPTION,
            Confirm_Editing.QUESTION_MESSAGE, null, null, null);

        if (result == Confirm_Editing.YES_OPTION) {
            String newHight = Hight.getText();
            profile_PersonalInfo n = new profile_PersonalInfo();
            n.setVisible(true);
            n.Hight.setText(newHight);
            this.dispose();
        }
        else {
            Hight.setEnabled(false);
            Hight_Edit.setEnabled(false);
        }
    }//GEN-LAST:event_Hight_EditActionPerformed

    private void GenderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GenderItemStateChanged
        if (Gender.isEnabled()) {
            Gender_Edit.setEnabled(true);
        }
    }//GEN-LAST:event_GenderItemStateChanged

    private void GenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenderMouseClicked
        if (Gender.isEnabled() == false) {
            Gender.setEnabled(true);
        }
    }//GEN-LAST:event_GenderMouseClicked

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
            java.util.logging.Logger.getLogger(profile_PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile_PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile_PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile_PersonalInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                profile_PersonalInfo frame = new profile_PersonalInfo();
                frame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Age;
    private javax.swing.JButton Age_Edit;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Background;
    private javax.swing.JOptionPane Confirm_Editing;
    public static javax.swing.JComboBox<String> Gender;
    private javax.swing.JButton Gender_Edit;
    public static javax.swing.JTextField Hight;
    private javax.swing.JButton Hight_Edit;
    public static javax.swing.JTextField Name;
    private javax.swing.JButton Name_Edit;
    public static javax.swing.JTextField Weight;
    private javax.swing.JButton Weight_Edit;
    // End of variables declaration//GEN-END:variables

    public static void setInfo() {
        if (welcome.here.equals("signUp")) {
            Name.setText(signUp.name.getText());
            Age.setText("20");
            if (step2.Female.isSelected()) {
                Gender.setSelectedIndex(1);
            } 
            if (step2.Male.isSelected()) {
                Gender.setSelectedIndex(0);
            }
            Weight.setText(step4.weight.getText());
            Hight.setText(step3.tall.getText());
        } else if (welcome.here.equals("logIn")) {
            Name.setText(logIn.email.getText().replace("@gmail|.com|@|@hotmail", ""));
            Age.setText("20");
            Gender.setSelectedIndex(1);
            Weight.setText("52");
            Hight.setText("148");
        } else if (welcome.here.equals("")) {
            Name.setText("bayan");
            Age.setText("20");
            Gender.setSelectedIndex(1);
            Weight.setText("52");
            Hight.setText("148");
        }
    }

}