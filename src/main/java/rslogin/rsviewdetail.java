/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rslogin;

import javax.swing.JTextField;

/**
 *
 * @author Chaixuen
 */
public class rsviewdetail extends javax.swing.JFrame {

    /**
     * Creates new form rsviewdetail
     */
    public rsviewdetail() {
        initComponents();
    }

    rsviewdetail(JTextField snametxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomlab = new javax.swing.JLabel();
        choicelab = new javax.swing.JLabel();
        rcsaslab = new javax.swing.JLabel();
        logoutbut = new javax.swing.JButton();
        vdetailsbut = new javax.swing.JButton();
        mselfrecordbut = new javax.swing.JButton();
        pfandstcbut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomlab.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        welcomlab.setText("Welcome Student!!");

        choicelab.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        choicelab.setText("Please Select Your Choice:");

        rcsaslab.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        rcsaslab.setForeground(new java.awt.Color(0, 204, 204));
        rcsaslab.setText("RCSAS");

        logoutbut.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        logoutbut.setForeground(new java.awt.Color(255, 0, 0));
        logoutbut.setText("Logout");
        logoutbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbutActionPerformed(evt);
            }
        });

        vdetailsbut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        vdetailsbut.setText("View Details");
        vdetailsbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vdetailsbutActionPerformed(evt);
            }
        });

        mselfrecordbut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mselfrecordbut.setText("Modify Self Record");
        mselfrecordbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mselfrecordbutActionPerformed(evt);
            }
        });

        pfandstcbut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pfandstcbut.setText(" Provide feedback and Star to Coach");
        pfandstcbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfandstcbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rcsaslab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutbut))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomlab)
                            .addComponent(choicelab, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfandstcbut)
                            .addComponent(mselfrecordbut)
                            .addComponent(vdetailsbut))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rcsaslab))
                    .addComponent(logoutbut))
                .addGap(18, 18, 18)
                .addComponent(welcomlab)
                .addGap(18, 18, 18)
                .addComponent(choicelab)
                .addGap(18, 18, 18)
                .addComponent(vdetailsbut)
                .addGap(18, 18, 18)
                .addComponent(mselfrecordbut)
                .addGap(18, 18, 18)
                .addComponent(pfandstcbut)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbutActionPerformed
        this.setVisible(false);
        slogout sl = new slogout();
        sl.setVisible(true);
    }//GEN-LAST:event_logoutbutActionPerformed

    private void vdetailsbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vdetailsbutActionPerformed
        this.setVisible(false);
        rsvdetails vd = new rsvdetails();
        vd.setVisible(true);
    }//GEN-LAST:event_vdetailsbutActionPerformed

    private void pfandstcbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfandstcbutActionPerformed
        this.setVisible(false);
        pfandstc pf = new pfandstc();
        pf.setVisible(true);
    }//GEN-LAST:event_pfandstcbutActionPerformed

    private void mselfrecordbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mselfrecordbutActionPerformed
        this.setVisible(false);
        modifysr sr = new modifysr();
        sr.setVisible(true);
    }//GEN-LAST:event_mselfrecordbutActionPerformed

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
            java.util.logging.Logger.getLogger(rsviewdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rsviewdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rsviewdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rsviewdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rsviewdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel choicelab;
    private javax.swing.JButton logoutbut;
    private javax.swing.JButton mselfrecordbut;
    private javax.swing.JButton pfandstcbut;
    private javax.swing.JLabel rcsaslab;
    private javax.swing.JButton vdetailsbut;
    private javax.swing.JLabel welcomlab;
    // End of variables declaration//GEN-END:variables
}
