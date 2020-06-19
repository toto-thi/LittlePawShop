/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Toto
 */
public class Home1 extends javax.swing.JFrame {

    Connection c = DB.DBConnect.getConnection();
    public Home1() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        showDate();
        showTime();
        showUser();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbShowDate = new javax.swing.JLabel();
        lbShowTime = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnManageEmployee = new javax.swing.JButton();
        btnManageProduct = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnShopping = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 204));
        jLabel1.setFont(new java.awt.Font("Saysettha OT", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ລະ​ບົບ​ຈັດການຮ້ານ Little Paws'");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 515, 61));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel3.setText(" ວັນ​ທີ:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 40, 20));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel4.setText(" ເວ​ລາ:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 60, 50, 20));

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel5.setText("  ສະ​ຖາ​ນະ​ຜູ້​ໃຊ້:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 90, 100, 20));

        lbShowDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(lbShowDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 100, 20));

        lbShowTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(lbShowTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 60, 100, 20));

        lbUser.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jPanel1.add(lbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 90, 100, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HomeLogo.png"))); // NOI18N
        jLabel6.setText("Logo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 130));

        btnLogOut.setBackground(new java.awt.Color(255, 51, 51));
        btnLogOut.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnLogOut.setText("ອອກ​ຈາກ​ລະ​ບົບ");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 110, 120, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/information_15px.png"))); // NOI18N
        jButton1.setText("ຊວ່ຍ​ເຫລືອ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 110, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1390, 140));

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Saysettha OT", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Welcome.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 590));
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 220, 580));

        jPanel3.setBackground(new java.awt.Color(0, 255, 102));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2));

        btnManageEmployee.setBackground(new java.awt.Color(0, 255, 204));
        btnManageEmployee.setFont(new java.awt.Font("Saysettha OT", 1, 24)); // NOI18N
        btnManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/people_100px.png"))); // NOI18N
        btnManageEmployee.setText("ຈັດ​ການ​ຂໍ້​ມູນ​ພະ​ນັກ​ງານ");
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(btnManageEmployee);

        btnManageProduct.setBackground(new java.awt.Color(0, 255, 204));
        btnManageProduct.setFont(new java.awt.Font("Saysettha OT", 1, 24)); // NOI18N
        btnManageProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/used_product_125px.png"))); // NOI18N
        btnManageProduct.setText("ຈັດ​ການ​ລາຍ​ການ​ສິນ​ຄ້າ");
        btnManageProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductActionPerformed(evt);
            }
        });
        jPanel3.add(btnManageProduct);

        btnReport.setBackground(new java.awt.Color(0, 255, 204));
        btnReport.setFont(new java.awt.Font("Saysettha OT", 1, 24)); // NOI18N
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/business_report_100px.png"))); // NOI18N
        btnReport.setText("ລາຍ​ງານ");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel3.add(btnReport);

        btnShopping.setBackground(new java.awt.Color(0, 255, 204));
        btnShopping.setFont(new java.awt.Font("Saysettha OT", 1, 24)); // NOI18N
        btnShopping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add_shopping_cart_127px.png"))); // NOI18N
        btnShopping.setText("ຊ​ອ໋ບ​ປີ໋ງ");
        btnShopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShoppingActionPerformed(evt);
            }
        });
        jPanel3.add(btnShopping);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 1150, 580));

        jPanel6.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1380, 860));

        setSize(new java.awt.Dimension(1390, 785));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void showTime(){
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date Time = new Date();
                SimpleDateFormat timeformat = new SimpleDateFormat("hh:mm:ss");
                lbShowTime.setText(timeformat.format(Time));
            }
        }).start();
    }
    public void showDate(){
        Date date = new Date();
        SimpleDateFormat timeformat = new SimpleDateFormat("dd/MM/yyyy");
        lbShowDate.setText(timeformat.format(date));
    }
    public void showUser(){     
        lbUser.setText(User.Account);    
    }
    
    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
 
        Report rp = new Report(this, true);
        rp.setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        EmpManage e1 = new EmpManage();
        e1.show();
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnManageProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductActionPerformed
        ProductManage pm = new ProductManage();
        pm.show();
    }//GEN-LAST:event_btnManageProductActionPerformed

    private void btnShoppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShoppingActionPerformed
       Shopping sp = new Shopping();
       sp.show();
    }//GEN-LAST:event_btnShoppingActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        Login lg = new Login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Help_Contact hc = new Help_Contact(this, true);
        hc.show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Home1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnManageProduct;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnShopping;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbShowDate;
    private javax.swing.JLabel lbShowTime;
    private javax.swing.JLabel lbUser;
    // End of variables declaration//GEN-END:variables
}
