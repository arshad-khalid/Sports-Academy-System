/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rslogin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chaixuen
 */
public class vdselfrecord extends javax.swing.JFrame {

    /**
     * Creates new form vdselfrecord
     */
    public vdselfrecord() {
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

        rcsaslab = new javax.swing.JLabel();
        detailsrlab = new javax.swing.JLabel();
        backbut = new javax.swing.JButton();
        nametxt = new javax.swing.JTextField();
        viewbut = new javax.swing.JButton();
        clearbut = new javax.swing.JButton();
        namelab = new javax.swing.JLabel();
        selfrecordlab = new javax.swing.JLabel();
        paymentlab = new javax.swing.JLabel();
        sportlab = new javax.swing.JLabel();
        doblab = new javax.swing.JLabel();
        addlab = new javax.swing.JLabel();
        agelab = new javax.swing.JLabel();
        iclab = new javax.swing.JLabel();
        emaillab = new javax.swing.JLabel();
        genderlab = new javax.swing.JLabel();
        contactlab = new javax.swing.JLabel();
        dobtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        ictxt = new javax.swing.JTextField();
        contacttxt = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        gendertxt = new javax.swing.JTextField();
        sporttxt = new javax.swing.JTextField();
        paymenttxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        addtxt = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(399, 480));

        rcsaslab.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        rcsaslab.setForeground(new java.awt.Color(0, 204, 204));
        rcsaslab.setText("RCSAS");

        detailsrlab.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        detailsrlab.setText("Details of Self-Record");

        backbut.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        backbut.setForeground(new java.awt.Color(255, 0, 0));
        backbut.setText("Back");
        backbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutActionPerformed(evt);
            }
        });

        nametxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });

        viewbut.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        viewbut.setForeground(new java.awt.Color(0, 102, 255));
        viewbut.setText("View");
        viewbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbutActionPerformed(evt);
            }
        });

        clearbut.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        clearbut.setForeground(new java.awt.Color(255, 102, 51));
        clearbut.setText("Clear");
        clearbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbutActionPerformed(evt);
            }
        });

        namelab.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        namelab.setText("Enter Name:");

        selfrecordlab.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        selfrecordlab.setText("Self-Record:");

        paymentlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        paymentlab.setText("Payment (RM):");

        sportlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        sportlab.setText("Sport:");

        doblab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        doblab.setText("Date of Birth(dd/mm/yyyy):");

        addlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addlab.setText("Address:");

        agelab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        agelab.setText("Age:");

        iclab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        iclab.setText("I.C NO. :");

        emaillab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emaillab.setText("Email:");

        genderlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        genderlab.setText("Gender(F/M):");

        contactlab.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        contactlab.setText("Contact NO. :");

        dobtxt.setEditable(false);
        dobtxt.setBackground(new java.awt.Color(255, 255, 255));
        dobtxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        emailtxt.setEditable(false);
        emailtxt.setBackground(new java.awt.Color(255, 255, 255));
        emailtxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        ictxt.setEditable(false);
        ictxt.setBackground(new java.awt.Color(255, 255, 255));
        ictxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        contacttxt.setEditable(false);
        contacttxt.setBackground(new java.awt.Color(255, 255, 255));
        contacttxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        agetxt.setEditable(false);
        agetxt.setBackground(new java.awt.Color(255, 255, 255));
        agetxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        gendertxt.setEditable(false);
        gendertxt.setBackground(new java.awt.Color(255, 255, 255));
        gendertxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        sporttxt.setEditable(false);
        sporttxt.setBackground(new java.awt.Color(255, 255, 255));
        sporttxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        paymenttxt.setEditable(false);
        paymenttxt.setBackground(new java.awt.Color(255, 255, 255));
        paymenttxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        addtxt.setEditable(false);
        addtxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(addtxt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 292, Short.MAX_VALUE)
                        .addComponent(backbut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(detailsrlab)
                    .addComponent(rcsaslab)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namelab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewbut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearbut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doblab)
                            .addComponent(emaillab)
                            .addComponent(agelab)
                            .addComponent(iclab)
                            .addComponent(contactlab)
                            .addComponent(genderlab)
                            .addComponent(selfrecordlab)
                            .addComponent(sportlab)
                            .addComponent(paymentlab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ictxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addlab))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rcsaslab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsrlab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelab)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewbut)
                    .addComponent(clearbut))
                .addGap(18, 18, 18)
                .addComponent(selfrecordlab)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(agelab)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(genderlab)
                    .addComponent(gendertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(iclab)
                    .addComponent(ictxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(emaillab)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doblab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(contactlab)
                    .addComponent(contacttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addlab)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sportlab)
                    .addComponent(sporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(paymentlab)
                    .addComponent(paymenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(backbut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbutActionPerformed
        File file =new File("Registered_Student.txt");
    Scanner in = null;
    try 
    {
        in = new Scanner(file);
        while(in.hasNext())
        {
            String line=in.nextLine();
            String name=nametxt.getText();
            if(line.contains(name))
            {
                String pass=in.nextLine();
                String age=in.nextLine();
                agetxt.setText(age);
                String gender=in.nextLine();
                gendertxt.setText(gender);
                String ic=in.nextLine();
                ictxt.setText(ic);
                String email=in.nextLine();
                emailtxt.setText(email);
                String dob=in.nextLine();
                dobtxt.setText(dob);
                String contact=in.nextLine();
                contacttxt.setText(contact);
                String add=in.nextLine();
                addtxt.setText(add);
                String sport=in.nextLine();
                sporttxt.setText(sport);
                String payment=in.nextLine();
                paymenttxt.setText(payment);
            }
        }
    } 
    catch (Exception e) 
    {
        System.out.println("Error");
    }
        
    }//GEN-LAST:event_viewbutActionPerformed

    private void clearbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbutActionPerformed
        nametxt.setText("");
        agetxt.setText("");
        gendertxt.setText("");
        ictxt.setText("");
        emailtxt.setText("");
        dobtxt.setText("");
        contacttxt.setText("");
        addtxt.setText("");
        sporttxt.setText("");
        paymenttxt.setText("");
    }//GEN-LAST:event_clearbutActionPerformed

    private void backbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutActionPerformed
        this.setVisible(false);
        rsvdetails vd = new rsvdetails();
        vd.setVisible(true);
    }//GEN-LAST:event_backbutActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
      
    }//GEN-LAST:event_nametxtActionPerformed

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
            java.util.logging.Logger.getLogger(vdselfrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vdselfrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vdselfrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vdselfrecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vdselfrecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addlab;
    private javax.swing.JEditorPane addtxt;
    private javax.swing.JLabel agelab;
    private javax.swing.JTextField agetxt;
    private javax.swing.JButton backbut;
    private javax.swing.JButton clearbut;
    private javax.swing.JLabel contactlab;
    private javax.swing.JTextField contacttxt;
    private javax.swing.JLabel detailsrlab;
    private javax.swing.JLabel doblab;
    private javax.swing.JTextField dobtxt;
    private javax.swing.JLabel emaillab;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel genderlab;
    private javax.swing.JTextField gendertxt;
    private javax.swing.JLabel iclab;
    private javax.swing.JTextField ictxt;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel namelab;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel paymentlab;
    private javax.swing.JTextField paymenttxt;
    private javax.swing.JLabel rcsaslab;
    private javax.swing.JLabel selfrecordlab;
    private javax.swing.JLabel sportlab;
    private javax.swing.JTextField sporttxt;
    private javax.swing.JButton viewbut;
    // End of variables declaration//GEN-END:variables
}
