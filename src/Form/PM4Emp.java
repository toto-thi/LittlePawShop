/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toto
 */
public class PM4Emp extends javax.swing.JFrame {

    Connection c = DB.DBConnect.getConnection();
    PreparedStatement psm;
    ResultSet rs = null;
    DefaultTableModel model;
    ArrayList<String> Cid;
    String sql = "";
    public PM4Emp() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        cbCat();
        showDate();
        showTime();

        Font f = new Font("Saysettha OT", Font.PLAIN, 12);
        tbShowProduct.getTableHeader().setFont(f);

        model = (DefaultTableModel) tbShowProduct.getModel();
        showProduct("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbShowDate = new javax.swing.JLabel();
        lbShowTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbShowProduct = new javax.swing.JTable();
        lbProPic = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbCate = new javax.swing.JComboBox<>();
        btnAddImg = new javax.swing.JButton();
        btnAddProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtStockQty = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dog_paw_75px.png"))); // NOI18N
        jLabel1.setText("​ຈັດ​ການ​ສິນ​ຄ້າ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 400, 80));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 88, 88));

        jLabel9.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel9.setText("ວັນ​ທີ:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 40, 40, 30));

        jLabel10.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel10.setText("ເວ​ລາ:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 80, 40, 30));

        lbShowDate.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(lbShowDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 40, 80, 30));

        lbShowTime.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(lbShowTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 80, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-11, -12, 1410, 140));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/product_40px.png"))); // NOI18N
        jLabel2.setText("ລາຍ​ການ​ສິນ​ຄ້າ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 240, 43));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel3.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, 808, -1));

        tbShowProduct.setBackground(new java.awt.Color(255, 255, 102));
        tbShowProduct.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tbShowProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ລະ​ຫັດ​ສິນ​ຄ້າ", "ຊື່່ສິນ​ຄ້າ", "ລາ​ຄາ", "ຈຳນວນໃນຄັງ", "ປະ​ເພດ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbShowProduct.setSelectionBackground(new java.awt.Color(0, 255, 153));
        tbShowProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbShowProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbShowProduct);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 37, -1, 470));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 62, 830, 520));

        lbProPic.setText(" ");
        lbProPic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel2.add(lbProPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 60, 225, 225));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ລະ​ຫັດ​ສິນ​ຄ້າ:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 90, 30));

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ຊື່​ສິນ​ຄ້າ:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, -1, 31));

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ລາ​ຄາ:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 420, 70, 20));

        txtProductID.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 340, 350, -1));

        txtProductName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 350, -1));

        txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, 350, -1));

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("ປະ​ເພດ​ສິນ​ຄ້າ:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 90, 24));

        cbCate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cbCate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCateItemStateChanged(evt);
            }
        });
        cbCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCateActionPerformed(evt);
            }
        });
        jPanel2.add(cbCate, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 500, 182, -1));

        btnAddImg.setBackground(new java.awt.Color(0, 255, 255));
        btnAddImg.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnAddImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/picture_35px.png"))); // NOI18N
        btnAddImg.setText("ເພີ່ມ​ຮູບ​ພາບ");
        btnAddImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImgActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 290, 150, 40));

        btnAddProduct.setBackground(new java.awt.Color(0, 255, 255));
        btnAddProduct.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_add_25px.png"))); // NOI18N
        btnAddProduct.setText("ເພີ່ມ​");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, 100, 40));

        btnBack.setBackground(new java.awt.Color(0, 255, 255));
        btnBack.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnBack.setText("ກັບ​ຄືນ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 530, 100, 40));

        btnImport.setBackground(new java.awt.Color(0, 255, 255));
        btnImport.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnImport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/import_25px.png"))); // NOI18N
        btnImport.setText("ນຳ​ເຂົ້າ");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });
        jPanel2.add(btnImport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 530, -1, 40));

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ຈຳ​ນວນ​ສິນ​ຄ້າ​ໃນ​ຄັງ:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, -1, 30));

        txtStockQty.setEditable(false);
        txtStockQty.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jPanel2.add(txtStockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 350, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 124, 1390, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void cbCat() {
        try {
            sql = "select * from tb_category";

            cbCate.removeAllItems();
            Cid = new ArrayList<String>();
            rs = c.createStatement().executeQuery(sql);

            while (rs.next()) {
                cbCate.addItem(rs.getString("CName"));
                Cid.add(rs.getString("CId"));
            }
            cbCate.addItem("Custom Category");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        showProduct(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    ImageIcon icon1, icon2;
    BufferedImage bm = null;
    Image im;
    String path = "";
    byte[] pic = null;
    private void tbShowProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbShowProductMouseClicked

        try {
            int idx = tbShowProduct.getSelectedRow();

            String stridx = tbShowProduct.getValueAt(idx, 0).toString();
            sql = "select tb_product.ProdImg from tb_product where PId=?";
            psm = c.prepareStatement(sql);
            psm.setString(1, stridx);
            rs = psm.executeQuery();
            if (rs.next()) {
                pic = rs.getBytes("ProdImg");
                ImageIcon ico4 = new ImageIcon(pic);
                Image im2 = ico4.getImage().getScaledInstance(lbProPic.getWidth(),
                    lbProPic.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon ico5 = new ImageIcon(im2);
                lbProPic.setIcon(ico5);
            }
            rs.close();

            txtProductID.setText(tbShowProduct.getValueAt(idx, 0).toString());
            txtProductName.setText(tbShowProduct.getValueAt(idx, 1).toString());

            txtPrice.setText(tbShowProduct.getValueAt(idx, 2).toString());
            txtStockQty.setText(tbShowProduct.getValueAt(idx, 3).toString());
            cbCate.setSelectedItem(tbShowProduct.getValueAt(idx, 4).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbShowProductMouseClicked

    public void showProduct(String search) {
        try {
            model.getDataVector().removeAllElements();
            if (search.equals("")) {

                sql = "SELECT DISTINCT tb_product.PId, tb_product.PName, tb_category.CName, "
                        + "tb_product.PPrice, tb_product.StockQty FROM tb_product "
                        + "INNER JOIN tb_category ON tb_product.CId = tb_category.CId "
                        + "LEFT JOIN tb_import ON tb_product.PId = tb_import.ProId";
            } else {
                sql = "SELECT DISTINCT tb_product.PId, tb_product.PName, tb_category.CName,"
                        + " tb_product.PPrice, tb_product.StockQty FROM tb_product "
                        + "INNER JOIN tb_category ON tb_product.CId = tb_category.CId "
                        + "LEFT JOIN tb_import ON tb_product.PId = tb_import.ProId"
                        + " where PId Like '%" + txtSearch.getText() + "%' or "
                        + "PName Like '%" + txtSearch.getText() + "%' or "
                        + "CName Like '%" + txtSearch.getText() + "%' or "
                        + "PPrice Like '%" + txtSearch.getText() + "%' or "
                        + "StockQty Like '%" + txtSearch.getText() + "%'";
            }

            rs = c.createStatement().executeQuery(sql);

            while (rs.next()) {
                String[] data = {rs.getString("PId"),
                    rs.getString("PName"),
                    rs.getString("PPrice"),
                    rs.getString("StockQty"),
                    rs.getString("CName")};

                model.addRow(data);
            }
            rs.close();
            tbShowProduct.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void cbCateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCateItemStateChanged

    }//GEN-LAST:event_cbCateItemStateChanged

    private void cbCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCateActionPerformed
        if (cbCate.getSelectedItem().equals("Custom Category")) {
            AddCategory ac = new AddCategory(this, true);
            //ac.pm = this;
            ac.show();
        }
    }//GEN-LAST:event_cbCateActionPerformed

    
    private void btnAddImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImgActionPerformed
        try {
            JFileChooser fs = new JFileChooser();

            int r = fs.showOpenDialog(null);

            if (r == 0) {
                path = fs.getSelectedFile().getAbsolutePath();
                icon1 = new ImageIcon(path);
                im = icon1.getImage();
                bm = new BufferedImage(lbProPic.getWidth(), lbProPic.getHeight(), Image.SCALE_SMOOTH);
                bm.createGraphics().drawImage(im, 0, 0, lbProPic.getWidth(), lbProPic.getHeight(), null);
                icon2 = new ImageIcon(bm);

                lbProPic.setIcon(icon2);
            } else if (r == 1) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddImgActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        try {
            sql = "insert into tb_product values(?,?,?,?,?,0)";

            psm = c.prepareStatement(sql);
            psm.setInt(1, Integer.parseInt(txtProductID.getText().toString()));
            psm.setString(2, txtProductName.getText());

            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ImageIO.write(bm, "jpg", out);
            byte[] pic = out.toByteArray();
            psm.setBytes(3, pic);

            psm.setInt(4, Integer.parseInt(txtPrice.getText().toString()));

            psm.setInt(5, Integer.parseInt(Cid.get(cbCate.getSelectedIndex())));

            if (psm.executeUpdate() != -1) {

                JOptionPane.showMessageDialog(this, "Added Product!", "Done!", JOptionPane.INFORMATION_MESSAGE);
                showProduct("");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        Import im = new Import(this, true);
        if (!txtProductID.getText().equals("")) {
            im.txtProductID.setText(txtProductID.getText());
            im.txtPN.setText(txtProductName.getText());
            im.pm4 = this;
            im.btnDelete.setEnabled(false); 
            im.show();           
        }
    }//GEN-LAST:event_btnImportActionPerformed

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
            java.util.logging.Logger.getLogger(PM4Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PM4Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PM4Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PM4Emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PM4Emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImg;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnImport;
    private javax.swing.JComboBox<String> cbCate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProPic;
    private javax.swing.JLabel lbShowDate;
    private javax.swing.JLabel lbShowTime;
    private javax.swing.JTable tbShowProduct;
    private javax.swing.JTextField txtPrice;
    public javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStockQty;
    // End of variables declaration//GEN-END:variables
}
