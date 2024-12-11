/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cocolux;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        mainfunc();
    }

    private void mainfunc(){
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        IconUtil.setMenuIcon(jMenu2, "src\\main\\java\\Image\\house.png", 24, 24);
        IconUtil.setMenuIcon(jMenu3, "src\\main\\java\\Image\\checklist.png", 24, 24);
        IconUtil.setMenuIcon(jMenu1, "src\\main\\java\\Image\\pencil.png", 24, 24);
        IconUtil.setMenuIcon(jMenu4, "src\\main\\java\\Image\\loupe.png", 24, 24);
        IconUtil.setMenuIcon(jMenu5, "src\\main\\java\\Image\\analysis.png", 24, 24);
        
        IconUtil.setMenuItemIcon(jMenuItem1, "src\\main\\java\\Image\\people.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem2, "src\\main\\java\\Image\\loyalty.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem3, "src\\main\\java\\Image\\manufacture.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem4, "src\\main\\java\\Image\\test.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem5, "src\\main\\java\\Image\\information.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem6, "src\\main\\java\\Image\\receipt.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem7, "src\\main\\java\\Image\\insertion.png", 24, 24);
        
        IconUtil.setMenuItemIcon(jMenuItem8, "src\\main\\java\\Image\\top-three.png", 24, 24);
        IconUtil.setMenuItemIcon(jMenuItem9, "src\\main\\java\\Image\\salary.png", 24, 24);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelBackground("src\\main\\java\\Image\\1685958186188-gioi-thieu2.jpeg");
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        jMenu2.setText("Quản lý");

        jMenuItem1.setText("Hồ sơ nhân viên");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Thưởng phạt");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Thông tin nhà cung cấp");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Danh mục sản phẩm");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Thông tin sản phẩm");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Lập hóa đơn");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("Lập phiếu nhập");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Chấm công");
        jMenuBar1.add(jMenu3);

        jMenu1.setText("Tính lương");
        jMenuBar1.add(jMenu1);

        jMenu4.setText("Tìm kiếm sản phẩm");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Thống kê");

        jMenuItem8.setText("Sản phẩm bán chạy");
        jMenuItem8.setToolTipText("");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Doanh thu");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
