package Home;

import Semester.Sem1;
import Semester.Sem2;
import Semester.Sem3;
import Semester.Sem4;
import Semester.Sem5;
import Semester.Sem6;
import Semester.Sem7;
import Semester.Sem8;
import Semester.SemGpa1;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Gpa extends javax.swing.JFrame {
    double r=0;
    /**
     * Creates new form Gpa
     */
    public Gpa() {
        initComponents();
    }
    Sem1 s1 = new Sem1();
    Sem2 s2 = new Sem2();
    Sem3 s3 = new Sem3();
    Sem4 s4 = new Sem4();
    Sem5 s5 = new Sem5();
    Sem7 s7 = new Sem7();
    Sem6 s6 = new Sem6();
    Sem8 s8 = new Sem8();
    SemGpa1 s = new SemGpa1();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        sem = new javax.swing.JMenu();
        sem1 = new javax.swing.JMenuItem();
        sem2 = new javax.swing.JMenuItem();
        sem3 = new javax.swing.JMenuItem();
        sem4 = new javax.swing.JMenuItem();
        sem5 = new javax.swing.JMenuItem();
        sem6 = new javax.swing.JMenuItem();
        sem7 = new javax.swing.JMenuItem();
        sem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uva Wellassa University GPA Calculator for CST Student");
        setPreferredSize(new java.awt.Dimension(1093, 750));
        setResizable(false);

        desktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1099, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UVA WELLASSA UNIVERSITY GPA CALCULATOR FOR CST STUDENT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jMenuBar1.setBorder(null);

        sem.setText("Select Sem");

        sem1.setText("1 Semester");
        sem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1ActionPerformed(evt);
            }
        });
        sem.add(sem1);

        sem2.setText("2 Semester");
        sem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem2ActionPerformed(evt);
            }
        });
        sem.add(sem2);

        sem3.setText("3 Semester");
        sem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem3ActionPerformed(evt);
            }
        });
        sem.add(sem3);

        sem4.setText("4 Semester");
        sem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem4ActionPerformed(evt);
            }
        });
        sem.add(sem4);

        sem5.setText("5 Semester");
        sem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem5ActionPerformed(evt);
            }
        });
        sem.add(sem5);

        sem6.setText("6 Semester");
        sem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem6ActionPerformed(evt);
            }
        });
        sem.add(sem6);

        sem7.setText("7 Semester");
        sem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem7ActionPerformed(evt);
            }
        });
        sem.add(sem7);

        sem8.setText("8 Semester");
        sem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem8ActionPerformed(evt);
            }
        });
        sem.add(sem8);

        jMenuBar1.add(sem);

        jMenu1.setText("Overall");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Get Sem GPA and Overall");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1ActionPerformed
            // TODO add your handling code here:
            try{
                desktop.add(s1);
                s1.setVisible(true);
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();}
            
            catch(Exception e){
                desktop.add(s1);
                s1.setVisible(true);
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
                    }
    }//GEN-LAST:event_sem1ActionPerformed

    private void sem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem2ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s2);
                s2.setVisible(true);
                s1.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
            catch(Exception e){
                desktop.add(s2);
                s2.setVisible(true);
                s1.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
            
    }//GEN-LAST:event_sem2ActionPerformed

    private void sem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem3ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s3);
                s3.setVisible(true);
                s1.dispose();
                s2.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
            catch(Exception e){
                desktop.add(s3);
                s3.setVisible(true);
                s1.dispose();
                s2.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
                
    }//GEN-LAST:event_sem3ActionPerformed

    private void sem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem4ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s4);
                s4.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
            
            catch(Exception e){
                desktop.add(s4);
                s4.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
                
    }//GEN-LAST:event_sem4ActionPerformed

    private void sem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem5ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s5);
                s5.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
            
            catch(Exception e){
                desktop.add(s5);
                s5.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s6.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
                
    }//GEN-LAST:event_sem5ActionPerformed

    private void sem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem6ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s6);
                s6.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
            
            catch(Exception e){
                desktop.add(s6);
                s6.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s7.dispose();
                s8.dispose();
                s.dispose();
            }
                
    }//GEN-LAST:event_sem6ActionPerformed

    private void sem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem7ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s7);
                s7.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s8.dispose();
            }
            
            catch(Exception e){
                desktop.add(s7);
                s7.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s8.dispose();
            }
                
    }//GEN-LAST:event_sem7ActionPerformed

    private void sem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem8ActionPerformed
        // TODO add your handling code here:
            try{
                desktop.add(s8);
                s8.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s.dispose();
            }
            
            catch(Exception e){
                desktop.add(s8);
                s8.setVisible(true);
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
                s.dispose();
            }
                
    }//GEN-LAST:event_sem8ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
            try{
                 desktop.add(s);
                s.setVisible(true);
                s8.dispose();
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
            }
            
            catch(Exception e){
                 desktop.add(s);
                s.setVisible(true);
                s8.dispose();
                s1.dispose();
                s2.dispose();
                s3.dispose();
                s4.dispose();
                s5.dispose();
                s6.dispose();
                s7.dispose();
            }
               
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Gpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gpa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gpa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu sem;
    private javax.swing.JMenuItem sem1;
    private javax.swing.JMenuItem sem2;
    private javax.swing.JMenuItem sem3;
    private javax.swing.JMenuItem sem4;
    private javax.swing.JMenuItem sem5;
    private javax.swing.JMenuItem sem6;
    private javax.swing.JMenuItem sem7;
    private javax.swing.JMenuItem sem8;
    // End of variables declaration//GEN-END:variables
}
