/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rslogin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Chaixuen
 */
public class modifysr extends javax.swing.JFrame {

    /**
     * Creates new form modifysr
     */
    public modifysr() {
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

        oldtxt = new javax.swing.JTextField();
        rcsaslab = new javax.swing.JLabel();
        minfolab = new javax.swing.JLabel();
        modifybut = new javax.swing.JButton();
        backbut = new javax.swing.JButton();
        contentcombo = new javax.swing.JComboBox<>();
        confirmbut = new javax.swing.JButton();
        contentlab = new javax.swing.JLabel();
        contenttxt = new javax.swing.JTextField();
        selectlab = new javax.swing.JLabel();
        newtxt = new javax.swing.JTextField();
        oldlab = new javax.swing.JTextField();
        newlab = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oldtxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        rcsaslab.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        rcsaslab.setForeground(new java.awt.Color(0, 204, 204));
        rcsaslab.setText("RCSAS");

        minfolab.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        minfolab.setText("Modify Information");

        modifybut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        modifybut.setForeground(new java.awt.Color(0, 204, 204));
        modifybut.setText("Modify");
        modifybut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybutActionPerformed(evt);
            }
        });

        backbut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backbut.setForeground(new java.awt.Color(255, 0, 0));
        backbut.setText("Back");
        backbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutActionPerformed(evt);
            }
        });

        contentcombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Email", "Contact No", "Address", "Password" }));

        confirmbut.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        confirmbut.setForeground(new java.awt.Color(0, 102, 255));
        confirmbut.setText("Confirm");
        confirmbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbutActionPerformed(evt);
            }
        });

        contentlab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contentlab.setText("Content:");

        contenttxt.setEditable(false);
        contenttxt.setBackground(new java.awt.Color(255, 255, 255));
        contenttxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        contenttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contenttxtActionPerformed(evt);
            }
        });

        selectlab.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        selectlab.setText("Select content you want to modify:");

        newtxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        oldlab.setEditable(false);
        oldlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        oldlab.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        newlab.setEditable(false);
        newlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        newlab.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectlab)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(contentcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(contentlab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(backbut)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                            .addComponent(modifybut))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(oldlab, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(newlab))
                                .addComponent(confirmbut, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(newtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                .addComponent(oldtxt))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(rcsaslab, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minfolab)
                .addGap(173, 173, 173))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rcsaslab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minfolab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectlab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contentcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contentlab)
                    .addComponent(contenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(confirmbut, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oldlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newlab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbut)
                    .addComponent(modifybut))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutActionPerformed
        this.setVisible(false);
        rsviewdetail vd = new rsviewdetail();
        vd.setVisible(true);
    }//GEN-LAST:event_backbutActionPerformed

    private void modifybutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybutActionPerformed
        try
        {
            Scanner sc = new Scanner(new File("Registered_Student.txt"));
            StringBuffer buffer = new StringBuffer();
            while (sc.hasNextLine()) 
            {
                buffer.append(sc.nextLine()+System.lineSeparator());
            }
            String fileContents = buffer.toString();
      //closing the Scanner object
            sc.close();
            String oldLine = oldtxt.getText();
            String newLine = newtxt.getText();
      //Replacing the old line with new line
            fileContents = fileContents.replaceAll(oldLine, newLine);
      //instantiating the FileWriter class
            FileWriter writer = new FileWriter("Registered_Student.txt");
            writer.append(fileContents);
            writer.flush();
            
            this.setVisible(false);
            successfulmodify sm = new successfulmodify();
            sm.setVisible(true);
        }catch(Exception e)
        {
            System.out.println("Error");
        }
    }//GEN-LAST:event_modifybutActionPerformed

    private void confirmbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbutActionPerformed
        contenttxt.setText(contentcombo.getSelectedItem().toString());
        if(contenttxt.getText().equals("Name"))
        {
            oldlab.setText("Enter previous name:");
            newlab.setText("Enter new name:");
        }else if(contenttxt.getText().equals("Email"))
        {
            oldlab.setText("Enter previous email:");
            newlab.setText("Enter new email:");
        }else if(contenttxt.getText().equals("Contact No"))
        {
            oldlab.setText("Enter previous contact:");
            newlab.setText("Enter new contact:");
        }else if(contenttxt.getText().equals("Address"))
        {
            oldlab.setText("Enter previous address:");
            newlab.setText("Enter new address:");
        }else if(contenttxt.getText().equals("Password"))
        {
            oldlab.setText("Enter previous password:");
            newlab.setText("Enter new password:");
        }
    }//GEN-LAST:event_confirmbutActionPerformed

    private void contenttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contenttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contenttxtActionPerformed

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
            java.util.logging.Logger.getLogger(modifysr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modifysr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modifysr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modifysr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modifysr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbut;
    private javax.swing.JButton confirmbut;
    private javax.swing.JComboBox<String> contentcombo;
    private javax.swing.JLabel contentlab;
    private javax.swing.JTextField contenttxt;
    private javax.swing.JLabel minfolab;
    private javax.swing.JButton modifybut;
    private javax.swing.JTextField newlab;
    private javax.swing.JTextField newtxt;
    private javax.swing.JTextField oldlab;
    private javax.swing.JTextField oldtxt;
    private javax.swing.JLabel rcsaslab;
    private javax.swing.JLabel selectlab;
    // End of variables declaration//GEN-END:variables
}