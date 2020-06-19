/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toto
 */
public class AddSupplier extends javax.swing.JDialog {

    Connection c = DB.DBConnect.getConnection();
    public Import ip;
    String sql = "";
    ResultSet rs = null;
    PreparedStatement psm;
    DefaultTableModel model;
    public AddSupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
         Font f = new Font("Saysettha OT", Font.PLAIN, 12);
        tbSupp.getTableHeader().setFont(f);
        
        model = (DefaultTableModel) tbSupp.getModel();
        
        showTableSupplier();

    }

    public void showTableSupplier(){
        try {
            int rowidx = tbSupp.getRowCount()-1;
            
            while(rowidx>-1){
                model.removeRow(rowidx--);
            }
            
            sql = "select * from tb_supplier";
            
            rs = c.createStatement().executeQuery(sql);
            
            while(rs.next()){
                String [] data = {rs.getString("SId"),
                                  rs.getString("SName"),
                                  rs.getString("SContact")};
                model.addRow(data);
            }
            rs.close();
            tbSupp.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSupID = new javax.swing.JTextField();
        txtSupName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSupp = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel1.setText("ລະ​ຫັດ​ຜູ້້​ສະ​ຫນອງ​ສິນ​ຄ້າ:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 86, -1, 30));

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel2.setText("ຊື່​ຜູ້​ສະ​ຫນອງ​ສິນ​ຄ້າ:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 110, 30));

        txtSupID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        getContentPane().add(txtSupID, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 87, 250, 30));

        txtSupName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        getContentPane().add(txtSupName, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 137, 250, 30));

        btnAdd.setBackground(new java.awt.Color(51, 255, 255));
        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 60, 30));

        btnDel.setBackground(new java.awt.Color(51, 255, 255));
        btnDel.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnDel.setText("ລຶບ");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 280, 60, 30));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel3.setText("ຕິດ​ຕໍ່ຜູ້​ຜະ​ລິດ:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 90, 30));

        txtContact.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        getContentPane().add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 178, 250, 88));

        tbSupp.setBackground(new java.awt.Color(255, 255, 102));
        tbSupp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tbSupp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ລະ​ຫັດ​ຜູ້​ຜະ​ລຶດ", "​ຊື່​ຜູ້​ຜະ​ລິດ", "ຕິດ​ຕໍ່​ຜູ້​ຜະ​ລິດ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSupp.setSelectionBackground(new java.awt.Color(51, 255, 0));
        tbSupp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSuppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSupp);
        if (tbSupp.getColumnModel().getColumnCount() > 0) {
            tbSupp.getColumnModel().getColumn(0).setMinWidth(85);
            tbSupp.getColumnModel().getColumn(0).setPreferredWidth(85);
            tbSupp.getColumnModel().getColumn(0).setMaxWidth(85);
            tbSupp.getColumnModel().getColumn(1).setMinWidth(100);
            tbSupp.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbSupp.getColumnModel().getColumn(1).setMaxWidth(100);
            tbSupp.getColumnModel().getColumn(2).setMinWidth(150);
            tbSupp.getColumnModel().getColumn(2).setPreferredWidth(150);
            tbSupp.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 87, 347, 228));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 840, 360));

        setSize(new java.awt.Dimension(833, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbSuppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSuppMouseClicked
        try {
            int idx = tbSupp.getSelectedRow();
            txtSupID.setText(tbSupp.getValueAt(idx, 0).toString());
            txtSupName.setText(tbSupp.getValueAt(idx, 1).toString());
            txtContact.setText(tbSupp.getValueAt(idx, 2).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_tbSuppMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            sql = "insert into tb_supplier values(?,?,?)";
            
            psm = c.prepareStatement(sql);
            psm.setInt(1, Integer.parseInt(txtSupID.getText().toString()));
            psm.setString(2, txtSupName.getText());
            psm.setString(3, txtContact.getText());
            
            if(psm.executeUpdate() != -1){
                JOptionPane.showMessageDialog(this, "Added!", "Action", JOptionPane.INFORMATION_MESSAGE);
                ip.cbSup();
                showTableSupplier();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        try {
            int rowclick = tbSupp.getSelectedRow();
            
            if(rowclick != -1){
                if(JOptionPane.showConfirmDialog(this, "Do you want to delete this category?", "Warning!: Action required",
                                                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
                    sql = "delete from tb_category where CId=?";
                    
                    psm = c.prepareStatement(sql);
                    psm.setInt(1, Integer.parseInt(model.getValueAt(rowclick, 0).toString()) );
                    
                    if(psm.executeUpdate() != -1){
                        JOptionPane.showMessageDialog(this, "Deleted this Category!", "Done!" ,JOptionPane.INFORMATION_MESSAGE);
                       // pm.cbSup();
                        showTableSupplier();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
                   
        }
    }//GEN-LAST:event_btnDelActionPerformed

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
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddSupplier dialog = new AddSupplier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSupp;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtSupID;
    private javax.swing.JTextField txtSupName;
    // End of variables declaration//GEN-END:variables
}
