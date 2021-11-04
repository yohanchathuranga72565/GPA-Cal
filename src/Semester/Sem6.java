/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semester;

import Home.Gpa;
import java.awt.event.MouseListener;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

/**
 *
 * @author User
 */
public class Sem6 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Sem6
     */
    public Sem6() {
        initComponents();
        
        BasicInternalFrameUI bb=((javax.swing.plaf.basic.BasicInternalFrameUI)this.getUI());
        for(MouseListener listener:bb.getNorthPane().getMouseListeners()){
            bb.getNorthPane().removeMouseListener(listener);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        s1gpa = new javax.swing.JLabel();
        g3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        v1 = new javax.swing.JComboBox<>();
        g7 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        g5 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        g8 = new javax.swing.JComboBox<>();
        g1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        g6 = new javax.swing.JComboBox<>();
        g4 = new javax.swing.JComboBox<>();
        g2 = new javax.swing.JComboBox<>();
        btn3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setTitle("Semester 6");
        setPreferredSize(new java.awt.Dimension(1088, 574));

        jLabel7.setText("CST394-2  Research Methodology and Scientific Writing");

        s1gpa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        g3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        jLabel3.setText("CST395-2  Social, Ethical and Professional Issues in Computing");

        v1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your optional subject", "CST334-2  Mobile Computing", "CST314-2  Statistical Method-II", "IIT323-2  Project Management", " " }));

        g7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g7ActionPerformed(evt);
            }
        });

        jLabel4.setText("CST382-3  Digital Image Processing");

        jLabel6.setText("CST345-2  Software Quality Assurance");

        jLabel1.setText("CST329-2  Web Application Development-II");

        g5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel17.setText("6 Semester GPA:");

        g8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g8ActionPerformed(evt);
            }
        });

        g1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g1ActionPerformed(evt);
            }
        });

        jLabel5.setText("CST365-3  Systems Level Programming");

        btn1.setBackground(new java.awt.Color(102, 102, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setText("Calculate Semester GPA");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        jLabel2.setText("CST363-2  Computer Systems Architecture");

        g6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g6ActionPerformed(evt);
            }
        });

        g4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });

        g2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E" }));
        g2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 102, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn3.setText("Save as xls file ");
        btn3.setBorderPainted(false);
        btn3.setDefaultCapable(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(s1gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s1gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g3ActionPerformed

    private void g7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g7ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g5ActionPerformed

    private void g8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g8ActionPerformed

    private void g1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        String grade1=(String)g1.getSelectedItem();
        String grade2=(String)g2.getSelectedItem();
        String grade3=(String)g3.getSelectedItem();
        String grade4=(String)g4.getSelectedItem();
        String grade5=(String)g5.getSelectedItem();
        String grade6=(String)g6.getSelectedItem();
        String grade7=(String)g7.getSelectedItem();
        String grade8=(String)g8.getSelectedItem();

        double gpv1=0,gpv2=0,gpv3=0,gpv4=0,gpv5=0,gpv6=0,gpv7=0,gpv8=0,res=0;

        switch(grade1){
            case "A+":
            gpv1=4.00*2;
            break;
            case "A":
            gpv1=4.00*2;
            break;
            case "A-":
            gpv1=3.70*2;
            break;
            case "B+":
            gpv1=3.30*2;
            break;
            case "B":
            gpv1=3.00*2;
            break;
            case "B-":
            gpv1=2.70*2;
            break;
            case "C+":
            gpv1=2.30*2;
            break;
            case "C":
            gpv1=2.00*2;
            break;
            case "C-":
            gpv1=1.70*2;
            break;
            case "D+":
            gpv1=1.30*2;
            break;
            case "D":
            gpv1=1.00*2;
            break;
            case "E":
            gpv1=0;
            break;
            default :
            gpv1=0;
        }

        switch(grade2){
            case "A+":
            gpv2=4.00*2;
            break;
            case "A":
            gpv2=4.00*2;
            break;
            case "A-":
            gpv2=3.70*2;
            break;
            case "B+":
            gpv2=3.30*2;
            break;
            case "B":
            gpv2=3.00*2;
            break;
            case "B-":
            gpv2=2.70*2;
            break;
            case "C+":
            gpv2=2.30*2;
            break;
            case "C":
            gpv2=2.00*2;
            break;
            case "C-":
            gpv2=1.70*2;
            break;
            case "D+":
            gpv2=1.30*2;
            break;
            case "D":
            gpv2=1.00*2;
            break;
            case "E":
            gpv2=0;
            break;
            default :
            gpv2=0;
        }

        switch(grade3){
            case "A+":
            gpv3=4.00*2;
            break;
            case "A":
            gpv3=4.00*2;
            break;
            case "A-":
            gpv3=3.70*2;
            break;
            case "B+":
            gpv3=3.30*2;
            break;
            case "B":
            gpv3=3.00*2;
            break;
            case "B-":
            gpv3=2.70*2;
            break;
            case "C+":
            gpv3=2.30*2;
            break;
            case "C":
            gpv3=2.00*2;
            break;
            case "C-":
            gpv3=1.70*2;
            break;
            case "D+":
            gpv3=1.30*2;
            break;
            case "D":
            gpv3=1.00*2;
            break;
            case "E":
            gpv3=0;
            break;
            default :
            gpv3=0;
        }

        switch(grade4){
            case "A+":
            gpv4=4.00*2;
            break;
            case "A":
            gpv4=4.00*2;
            break;
            case "A-":
            gpv4=3.70*2;
            break;
            case "B+":
            gpv4=3.30*2;
            break;
            case "B":
            gpv4=3.00*2;
            break;
            case "B-":
            gpv4=2.70*2;
            break;
            case "C+":
            gpv4=2.30*2;
            break;
            case "C":
            gpv4=2.00*2;
            break;
            case "C-":
            gpv4=1.70*2;
            break;
            case "D+":
            gpv4=1.30*2;
            break;
            case "D":
            gpv4=1.00*2;
            break;
            case "E":
            gpv4=0;
            break;
            default :
            gpv4=0;
        }

        switch(grade5){
            case "A+":
            gpv5=4.00*3;
            break;
            case "A":
            gpv5=4.00*3;
            break;
            case "A-":
            gpv5=3.70*3;
            break;
            case "B+":
            gpv5=3.30*3;
            break;
            case "B":
            gpv5=3.00*3;
            break;
            case "B-":
            gpv5=2.70*3;
            break;
            case "C+":
            gpv5=2.30*3;
            break;
            case "C":
            gpv5=2.00*3;
            break;
            case "C-":
            gpv5=1.70*3;
            break;
            case "D+":
            gpv5=1.30*3;
            break;
            case "D":
            gpv5=1.00*3;
            break;
            case "E":
            gpv5=0;
            break;
            default :
            gpv5=0;
        }

        switch(grade6){
            case "A+":
            gpv6=4.00*3;
            break;
            case "A":
            gpv6=4.00*3;
            break;
            case "A-":
            gpv6=3.70*3;
            break;
            case "B+":
            gpv6=3.30*3;
            break;
            case "B":
            gpv6=3.00*3;
            break;
            case "B-":
            gpv6=2.70*3;
            break;
            case "C+":
            gpv6=2.30*3;
            break;
            case "C":
            gpv6=2.00*3;
            break;
            case "C-":
            gpv6=1.70*3;
            break;
            case "D+":
            gpv6=1.30*3;
            break;
            case "D":
            gpv6=1.00*3;
            break;
            case "E":
            gpv6=0;
            break;
            default :
            gpv6=0;
        }

        switch(grade7){
            case "A+":
            gpv7=4.00*2;
            break;
            case "A":
            gpv7=4.00*2;
            break;
            case "A-":
            gpv7=3.70*2;
            break;
            case "B+":
            gpv7=3.30*2;
            break;
            case "B":
            gpv7=3.00*2;
            break;
            case "B-":
            gpv7=2.70*2;
            break;
            case "C+":
            gpv7=2.30*2;
            break;
            case "C":
            gpv7=2.00*2;
            break;
            case "C-":
            gpv7=1.70*2;
            break;
            case "D+":
            gpv7=1.30*2;
            break;
            case "D":
            gpv7=1.00*2;
            break;
            case "E":
            gpv7=0;
            break;
            default :
            gpv7=0;
        }

        switch(grade8){
            case "A+":
            gpv8=4.00*2;
            break;
            case "A":
            gpv8=4.00*2;
            break;
            case "A-":
            gpv8=3.70*2;
            break;
            case "B+":
            gpv8=3.30*2;
            break;
            case "B":
            gpv8=3.00*2;
            break;
            case "B-":
            gpv8=2.70*2;
            break;
            case "C+":
            gpv8=2.30*2;
            break;
            case "C":
            gpv8=2.00*2;
            break;
            case "C-":
            gpv8=1.70*2;
            break;
            case "D+":
            gpv8=1.30*2;
            break;
            case "D":
            gpv8=1.00*2;
            break;
            case "E":
            gpv8=0;
            break;
            default :
            gpv8=0;
        }

        
        String s=(String)v1.getSelectedItem();
        if(s.equals("Select your optional subject")){
            JOptionPane.showMessageDialog(this,"Select a optional subject and Calculate Semester GPA!");
        }

        else{
            res=(gpv1+gpv2+gpv3+gpv4+gpv5+gpv6+gpv7+gpv8)/18;
            res=Math.round(res*100.0)/100.0;           
            s1gpa.setText(Double.toString(res));
            
            
        }

    }//GEN-LAST:event_btn1ActionPerformed

    private void g6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g6ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g4ActionPerformed

    private void g2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_g2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
       Workbook workbook = new HSSFWorkbook();
        Sheet sheet1=workbook.createSheet("Sem6 Gpa");
        //Sheet sheet2=workbook.createSheet("calculate");
        sheet1.setColumnWidth(0,15000);
        
        Row row0=sheet1.createRow(0);
        Cell cell0=row0.createCell(0);
        cell0.setCellValue("Subjects");
        
        
        Row row1=sheet1.createRow(2);
        Cell cell1=row1.createCell(0);
        cell1.setCellValue("CST329-2  Web Application Development-II");
        Cell cellA1=row1.createCell(1);
        cellA1.setCellValue((g1.getSelectedItem()).toString());
        
      
        
        
        Row row2=sheet1.createRow(3);
        Cell cell2=row2.createCell(0);
        cell2.setCellValue("CST363-2  Computer Systems Architecture");
        Cell cellA2=row2.createCell(1);
        cellA2.setCellValue((g2.getSelectedItem()).toString());
        
        
        
        Row row3=sheet1.createRow(4);
        Cell cell3=row3.createCell(0);
        cell3.setCellValue("CST395-2  Social, Ethical and Professional Issues in Computing");
        Cell cellA3=row3.createCell(1);
        cellA3.setCellValue((g3.getSelectedItem()).toString());
        
         Row row4=sheet1.createRow(5);
        Cell cell4=row4.createCell(0);
        cell4.setCellValue("CST345-2  Software Quality Assurance");
        Cell cellA4=row4.createCell(1);
        cellA4.setCellValue((g4.getSelectedItem()).toString());
        
        Row row5=sheet1.createRow(6);
        Cell cell5=row5.createCell(0);
        cell5.setCellValue("CST382-3  Digital Image Processing");
        Cell cellA5=row5.createCell(1);
        cellA5.setCellValue((g5.getSelectedItem()).toString());
        
        Row row6=sheet1.createRow(7);
        Cell cell6=row6.createCell(0);
        cell6.setCellValue("CST365-3  Systems Level Programming");
        Cell cellA6=row6.createCell(1);
        cellA6.setCellValue((g6.getSelectedItem()).toString());
        
        Row row7=sheet1.createRow(8);
        Cell cell7=row7.createCell(0);
        cell7.setCellValue("CST394-2  Research Methodology and Scientific Writing");
        Cell cellA7=row7.createCell(1);
        cellA7.setCellValue((g7.getSelectedItem()).toString());
        
         Row row8=sheet1.createRow(9);
        Cell cell8=row8.createCell(0);
        cell8.setCellValue(v1.getSelectedItem().toString());
        Cell cellA8=row8.createCell(1);
        cellA8.setCellValue((g8.getSelectedItem()).toString());
        
        
        
        Row row10=sheet1.createRow(11);
        Cell cell10=row10.createCell(0);
        cell10.setCellValue("Sem 6 GPA Value");
        Cell cellA10=row10.createCell(1);
        cellA10.setCellValue(s1gpa.getText());
        
        
        
        try{
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fc.showSaveDialog(this);
            String path="";
            if(result == JFileChooser.APPROVE_OPTION){
                path=fc.getCurrentDirectory().getAbsolutePath();
            }
            int response=JOptionPane.showConfirmDialog(this,"Your file location: "+path+"\n Confirm saving...","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(response == JOptionPane.YES_OPTION){
                FileOutputStream output = new FileOutputStream(path +"\\"+ "sem6.xls");
                JOptionPane.showMessageDialog(null,"Sem 6 GPA Details saved successfully on " + path);
                workbook.write(output);
                output.close();
            }
            
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn3;
    private javax.swing.JComboBox<String> g1;
    private javax.swing.JComboBox<String> g2;
    private javax.swing.JComboBox<String> g3;
    private javax.swing.JComboBox<String> g4;
    private javax.swing.JComboBox<String> g5;
    private javax.swing.JComboBox<String> g6;
    private javax.swing.JComboBox<String> g7;
    private javax.swing.JComboBox<String> g8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel s1gpa;
    private javax.swing.JComboBox<String> v1;
    // End of variables declaration//GEN-END:variables
}
