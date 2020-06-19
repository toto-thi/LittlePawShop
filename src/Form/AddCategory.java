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


public class AddCategory extends javax.swing.JDialog {

    Connection c = DB.DBConnect.getConnection();
    PreparedStatement psm;
    String sql = "";
    public ProductManage pm;
    ResultSet rs = null;
    DefaultTableModel model;
    
    public AddCategory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Font f = new Font("Saysettha OT", Font.PLAIN, 12);
        tbCate.getTableHeader().setFont(f);
        
        model = (DefaultTableModel) tbCate.getModel();
        showTableCategory();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCId = new javax.swing.JTextField();
        txtCName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCate = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel1.setText("ລະ​ຫັດ​ປະ​ເພດ:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 74, -1, 30));

        txtCId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtCId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtCId, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 73, 139, 30));

        txtCName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        getContentPane().add(txtCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 127, 139, 30));

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel2.setText("ຊື່​ປະ​ເພດ:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        btnAdd.setBackground(new java.awt.Color(0, 255, 204));
        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnAdd.setText("ເພີ່​ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        btnDelete.setBackground(new java.awt.Color(0, 255, 204));
        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnDelete.setText("ລຶບ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        tbCate.setBackground(new java.awt.Color(255, 255, 102));
        tbCate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tbCate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ລະ​ຫັດ​ປະ​ເພດ", "ຊື່​ປະ​ເພດ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCate.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tbCate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCate);
        if (tbCate.getColumnModel().getColumnCount() > 0) {
            tbCate.getColumnModel().getColumn(0).setMinWidth(85);
            tbCate.getColumnModel().getColumn(0).setPreferredWidth(85);
            tbCate.getColumnModel().getColumn(0).setMaxWidth(85);
            tbCate.getColumnModel().getColumn(1).setMinWidth(150);
            tbCate.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbCate.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 231, 200));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 570, 320));

        setSize(new java.awt.Dimension(571, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            sql = "insert into tb_category values(?,?)";
            
            psm = c.prepareStatement(sql);
            psm.setInt(1, Integer.parseInt(txtCId.getText().toString()));
            psm.setString(2, txtCName.getText());
            
            if(psm.executeUpdate() != -1){
                JOptionPane.showMessageDialog(this, "Done!", "Action",JOptionPane.INFORMATION_MESSAGE);
                pm.cbCat();
                showTableCategory();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    public void showTableCategory(){
        try {
            int rowidx = tbCate.getRowCount()-1;
            
            while(rowidx>-1){
                model.removeRow(rowidx--);
            }
            sql = "select * from tb_category";
            
            rs = c.createStatement().executeQuery(sql);
            
            while(rs.next()){
                String [] data = {rs.getString("CId"),rs.getString("CName")};
                
                model.addRow(data);
            }
            rs.close();
            tbCate.setModel(model);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void txtCIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIdActionPerformed

    private void tbCateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCateMouseClicked
        try {
            int idx = tbCate.getSelectedRow();
            txtCId.setText(tbCate.getValueAt(idx, 0).toString());
            txtCName.setText(tbCate.getValueAt(idx, 1).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_tbCateMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            int rowclick = tbCate.getSelectedRow();
            
            if(rowclick != -1){
                if(JOptionPane.showConfirmDialog(this, "Do you want to delete this category?", "Warning!: Action required",
                                                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0){
                    sql = "delete from tb_category where CId=?";
                    
                    psm = c.prepareStatement(sql);
                    psm.setInt(1, Integer.parseInt(model.getValueAt(rowclick, 0).toString()) );
                    
                    if(psm.executeUpdate() != -1){
                        JOptionPane.showMessageDialog(this, "Deleted this Category!", "Done!" ,JOptionPane.INFORMATION_MESSAGE);
                        pm.cbCat();
                        showTableCategory();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
                   
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCategory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddCategory dialog = new AddCategory(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbCate;
    private javax.swing.JTextField txtCId;
    private javax.swing.JTextField txtCName;
    // End of variables declaration//GEN-END:variables

}
