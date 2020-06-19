/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Toto
 */
public class Shopping extends javax.swing.JFrame {

    Connection c = DB.DBConnect.getConnection();
    DefaultTableModel model, model1;
    ResultSet rs = null;
    PreparedStatement psm;
    String sql = "";
    //public Home1 h1;

    public Shopping() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        Font f = new Font("Saysettha OT", Font.PLAIN, 12);
        tbShowProduct.getTableHeader().setFont(f);
        tbSale.getTableHeader().setFont(f);

        model = (DefaultTableModel) tbShowProduct.getModel();
        model1 = (DefaultTableModel) tbSale.getModel();

        showProduct("");

    }

    public void showProduct(String search) {
        try {
            model.getDataVector().removeAllElements();
            if (search.equals("")) {

                sql = "SELECT tb_product.PId, tb_product.PName, tb_category.CName, "
                        + "tb_product.PPrice,tb_product.StockQty "
                        + "FROM tb_product INNER  JOIN tb_category ON tb_product.CId = tb_category.CId WHERE StockQty>0";
            } else {
                sql = "SELECT tb_product.PId, tb_product.PName, tb_category.CName, "
                        + "tb_product.PPrice,tb_product.StockQty "
                        + "FROM tb_product INNER  JOIN tb_category ON tb_product.CId = tb_category.CId  "
                        + " where  StockQty>0 and ( PId Like '%" + txtSearch.getText() + "%' or "
                        + "PName Like '%" + txtSearch.getText() + "%' or "
                        + "CName Like '%" + txtSearch.getText() + "%' or "
                        + "PPrice Like '%" + txtSearch.getText() + "%')";
            }
            rs = c.createStatement().executeQuery(sql);

            while (rs.next()) {
                String[] data = {rs.getString("PId"),
                    rs.getString("PName"),
                    rs.getString("PPrice"),
                    rs.getString("CName"),
                    rs.getString("StockQty")};

                model.addRow(data);
            }
            rs.close();
            tbShowProduct.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbShowProduct = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnNW = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbBN = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbPName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        SpQty = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        lbStockQty = new javax.swing.JLabel();
        lbPrice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbImg = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbSale = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        txtRM = new javax.swing.JTextField();
        txtChanged = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/shopping_cart_75px.png"))); // NOI18N
        jLabel1.setText("Shopping Cart");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 12, 250, 79));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 120));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbShowProduct.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        tbShowProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ລະ​ຫັດ​ສິນ​ຄ້າ", "ຊື່່ສິນ​ຄ້າ", "ລາ​ຄາ", "ປະ​ເພດ", "ຈຳນວນທີ່ເຫຼືອໃນສາງ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbShowProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbShowProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbShowProduct);
        if (tbShowProduct.getColumnModel().getColumnCount() > 0) {
            tbShowProduct.getColumnModel().getColumn(0).setMinWidth(75);
            tbShowProduct.getColumnModel().getColumn(0).setPreferredWidth(75);
            tbShowProduct.getColumnModel().getColumn(0).setMaxWidth(75);
            tbShowProduct.getColumnModel().getColumn(1).setMinWidth(125);
            tbShowProduct.getColumnModel().getColumn(1).setPreferredWidth(125);
            tbShowProduct.getColumnModel().getColumn(1).setMaxWidth(125);
            tbShowProduct.getColumnModel().getColumn(2).setMinWidth(75);
            tbShowProduct.getColumnModel().getColumn(2).setPreferredWidth(75);
            tbShowProduct.getColumnModel().getColumn(2).setMaxWidth(75);
            tbShowProduct.getColumnModel().getColumn(3).setMinWidth(100);
            tbShowProduct.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbShowProduct.getColumnModel().getColumn(3).setMaxWidth(100);
            tbShowProduct.getColumnModel().getColumn(4).setMinWidth(115);
            tbShowProduct.getColumnModel().getColumn(4).setPreferredWidth(115);
            tbShowProduct.getColumnModel().getColumn(4).setMaxWidth(115);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 490, 460));

        txtSearch.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 490, -1));

        btnNW.setBackground(new java.awt.Color(0, 255, 255));
        btnNW.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnNW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bill_15px.png"))); // NOI18N
        btnNW.setText("ເປີດ​ບິນ​ໃໝ່");
        btnNW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNWActionPerformed(evt);
            }
        });
        jPanel2.add(btnNW, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 30));

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel4.setText("ເລກ​ທີ​ໃບ​ບິນ:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 80, 30));

        lbBN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbBN.setText("-");
        jPanel2.add(lbBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 530, 570));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPName.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        lbPName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lbPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 263, 29));

        btnAdd.setBackground(new java.awt.Color(0, 255, 255));
        btnAdd.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buy_25px.png"))); // NOI18N
        btnAdd.setText("ເພີ່ມ");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 90, 50));

        SpQty.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        SpQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 0, 0));
        SpQty.setEnabled(false);
        SpQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpQtyStateChanged(evt);
            }
        });
        SpQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SpQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SpQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SpQtyKeyTyped(evt);
            }
        });
        jPanel3.add(SpQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 80, 30));

        jLabel2.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel2.setText("ຈຳ​ນວນ:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        lbStockQty.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbStockQty.setText("/0");
        jPanel3.add(lbStockQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 40, 30));

        lbPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lbPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(lbPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 70, 30));

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel5.setText("ລາ​ຄາ:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 30));

        lbImg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        jPanel3.add(lbImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 200, 200));

        btnBack.setBackground(new java.awt.Color(0, 255, 255));
        btnBack.setFont(new java.awt.Font("Saysettha OT", 0, 24)); // NOI18N
        btnBack.setText("ກັບ​ຄືນ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 280, 60));

        jLabel10.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel10.setText("ກີບ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 310, 690));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbSale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ລຳ​ດັບ", "ລະ​ຫັດສິນ​ຄ້າ", "​ຊື່​ສິນ​ຄ້າ", "ຈຳ​ນວນ", "​ລາ​ຄາ", "ລວມ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbSale);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 400));

        btnRemove.setBackground(new java.awt.Color(0, 255, 255));
        btnRemove.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/clear_symbol_25px.png"))); // NOI18N
        btnRemove.setText("ລຶບ​ອອກ");
        btnRemove.setEnabled(false);
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel4.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 120, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 520, 460));

        jPanel6.setBackground(new java.awt.Color(255, 153, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel6.setText("ລາ​ຄາ​ລວມ:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 30));

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel7.setText("ເງີນ​ທີ່​ໄດ້​ຮັບ:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 20));

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel8.setText("ເງີນ​ທອນ:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 60, 20));

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTotalPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel6.add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 240, -1));

        txtRM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtRM.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRMKeyTyped(evt);
            }
        });
        jPanel6.add(txtRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 241, -1));

        txtChanged.setEditable(false);
        txtChanged.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtChanged.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtChanged.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtChangedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtChangedKeyReleased(evt);
            }
        });
        jPanel6.add(txtChanged, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 241, -1));

        btnSave.setBackground(new java.awt.Color(0, 255, 255));
        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/checkmark_40px.png"))); // NOI18N
        btnSave.setText("ຊຳ​ລະ​ບິນ");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel6.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, 520, 230));

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1410, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbShowProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbShowProductMouseClicked

        try {
            if ("-".equals(lbBN.getText())) {
                btnAdd.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Please create a new bill!", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                return;

            }
            btnAdd.setEnabled(true);

            int idx = tbShowProduct.getSelectedRow();
            if (idx != -1) {

                String stridx = tbShowProduct.getValueAt(idx, 0).toString();
                sql = "select tb_product.ProdImg from tb_product where PId=?";
                psm = c.prepareStatement(sql);
                psm.setString(1, stridx);
                rs = psm.executeQuery();
                if (rs.next()) {
                    byte[] pic = rs.getBytes("ProdImg");
                    ImageIcon ico4 = new ImageIcon(pic);
                    Image im2 = ico4.getImage().getScaledInstance(lbImg.getWidth(),
                            lbImg.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon ico5 = new ImageIcon(im2);
                    lbImg.setIcon(ico5);
                }
                rs.close();

                lbPName.setText(tbShowProduct.getValueAt(idx, 1).toString());
                lbPrice.setText(tbShowProduct.getValueAt(idx, 2).toString());
                SpQty.setValue(1);
                SpinnerNumberModel modelSp
                        = new SpinnerNumberModel(1, 1, Integer.parseInt(tbShowProduct.getValueAt(idx, 4).toString()), 1);
                SpQty.setModel(modelSp);
                SpQty.setEnabled(true);
                lbStockQty.setText("/" + tbShowProduct.getValueAt(idx, 4).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_tbShowProductMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        showProduct(txtSearch.getText());
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnNWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNWActionPerformed
        try {
            int sellid = 0;
            sql = "select MAX(SellId) as SellId from tb_sale ";

            rs = c.createStatement().executeQuery(sql);

            while (rs.next()) {
                sellid = rs.getInt(1);
            }

            lbBN.setBackground(Color.magenta);
            lbBN.setOpaque(true);

            //    }
            lbBN.setText("" + (sellid + 1));
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnNWActionPerformed
    public void addItem() {

        try {
            int qty = Integer.parseInt(SpQty.getValue().toString());
            int p_row = tbShowProduct.getSelectedRow();
            int s_row_count = tbSale.getRowCount();
            int price = Integer.parseInt(lbPrice.getText());
            int old_qty = 0;
            if (p_row != -1) {
                if (qty > 0) {
                    for (int i = 0; i < s_row_count; i++) {
                        if (tbShowProduct.getValueAt(p_row, 0).toString().equals(tbSale.getValueAt(i, 1).toString())) {
                            old_qty = Integer.parseInt(tbSale.getValueAt(i, 3).toString());
                            tbSale.setValueAt(qty + old_qty, i, 3);
                            tbSale.setValueAt((qty + old_qty) * price, i, 5);
                            SumTotal();
                            return;
                        }
                    }
                    model1.addRow(new Object[]{s_row_count + 1, tbShowProduct.getValueAt(p_row, 0), lbPName.getText(), qty, price, price * qty});
                }
                SumTotal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtRM.setText("0");
        txtChanged.setText("0");
        //txtDiscount.setEnabled(true);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addItem();
        btnBack.setEnabled(false);
        SpQty.setValue(1);
    }//GEN-LAST:event_btnAddActionPerformed

    public int SumTotal() {
        int sum = 0;

        try {
            int s_row_count = tbSale.getRowCount();

            for (int i = 0; i < s_row_count; i++) {
                sum += Integer.parseInt(tbSale.getValueAt(i, 5).toString());
            }
            if (sum == 0) {
                btnRemove.setEnabled(false);
                btnSave.setEnabled(false);
                btnBack.setEnabled(true);
            } else {
                btnRemove.setEnabled(true);
                btnSave.setEnabled(true);
                btnBack.setEnabled(false);
            }
            txtTotalPrice.setText("" + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sum;
    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            btnBack.setEnabled(true);
            int row = tbSale.getSelectedRow();

            model1.removeRow(row);
            SumTotal();
            txtRM.setText("0");
            txtChanged.setText("0");
            lbImg.setIcon(null);
            lbPrice.setText("");
            lbPName.setText("");
            SpQty.setValue(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtRMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRMKeyReleased

    }//GEN-LAST:event_txtRMKeyReleased

    private void txtRMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRMKeyPressed
        try {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                int RM = Integer.parseInt(txtRM.getText());
                int price = Integer.parseInt(txtTotalPrice.getText());
                if (RM < price) {
                    JOptionPane.showMessageDialog(null, "Not enough money", "Warning!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int change = Integer.parseInt(txtRM.getText()) - SumTotal();

                    txtChanged.setText(change + "");
                    txtChanged.requestFocus();
                    txtChanged.selectAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtRMKeyPressed

    public void pay() {
        try {

            if (Integer.parseInt(txtRM.getText()) <= 0) {
                JOptionPane.showMessageDialog(null, "Input Money!!", "Action require!", JOptionPane.INFORMATION_MESSAGE);
                txtRM.selectAll();
                txtRM.requestFocus();
                return;
            }
            int s_row_count = tbSale.getRowCount();
            int s_qty = 0;
            sql = "insert into tb_sale values(?,Now(),?,?,?,?)";

            psm = c.prepareStatement(sql);
            psm.setInt(1, Integer.parseInt(lbBN.getText()));
            psm.setInt(2, Integer.parseInt(txtTotalPrice.getText()));
            psm.setInt(3, Integer.parseInt(txtRM.getText()));
            psm.setInt(4, Integer.parseInt(txtChanged.getText()));
            psm.setInt(5, User.EmpId);

            if (psm.executeUpdate() != -1) {
                for (int i = 0; i < s_row_count; i++) {

                    sql = "insert into tb_sale_detail values(?,?,?,?,?)";
                    s_qty = Integer.parseInt(tbSale.getValueAt(i, 3).toString());
                    psm = c.prepareStatement(sql);
                    psm.setInt(1, Integer.parseInt(lbBN.getText()));
                    psm.setInt(2, s_qty);
                    psm.setInt(3, Integer.parseInt(tbSale.getValueAt(i, 4).toString()));
                    psm.setInt(4, Integer.parseInt(tbSale.getValueAt(i, 5).toString()));
                    psm.setInt(5, Integer.parseInt(tbSale.getValueAt(i, 1).toString()));
                    psm.executeUpdate();

                    sql = "UPDATE tb_product SET StockQty=(StockQty-?) where PId=?";
                    psm = c.prepareStatement(sql);
                    psm.setInt(1, s_qty);
                    psm.setInt(2, Integer.parseInt(tbSale.getValueAt(i, 1).toString()));
                    psm.executeUpdate();

                }

                JOptionPane.showMessageDialog(this, "PAID", "Action", JOptionPane.INFORMATION_MESSAGE);
                showProduct("");
                this.setCursor(Cursor.WAIT_CURSOR);
                Invoice();
                int rowidx = tbSale.getRowCount() - 1;

                while (rowidx > -1) {
                    model1.removeRow(rowidx--);
                }
                txtRM.setText("0");
                txtChanged.setText("0");
                txtTotalPrice.setText("0");
                lbImg.setIcon(null);
                lbPrice.setText("");
                lbPName.setText("");
                SpQty.setEnabled(false);
                lbStockQty.setText("/0");
                btnAdd.setEnabled(false);
                btnRemove.setEnabled(false);
                btnSave.setEnabled(false);
                lbBN.setOpaque(false);
                lbBN.setText("-");
                btnAdd.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        pay();
        btnBack.setEnabled(true);

    }//GEN-LAST:event_btnSaveActionPerformed

    public void Invoice() {
        try {
            sql = "SELECT\n"
                    + "     invoice.`DateSell` AS invoice_DateSell,\n"
                    + "     invoice.`SellId` AS invoice_SellId,\n"
                    + "     invoice.`PName` AS invoice_PName,\n"
                    + "     invoice.`Qty` AS invoice_Qty,\n"
                    + "     invoice.`Price` AS invoice_Price,\n"
                    + "     invoice.`total` AS invoice_total,\n"
                    + "     invoice.`Total_Price` AS invoice_Total_Price,\n"
                    + "     invoice.`Received_Money` AS invoice_Received_Money,\n"
                    + "     invoice.`Changed` AS invoice_Changed\n"
                    + "FROM\n"
                    + "     `invoice` invoice\n"
                    + "WHERE\n"
                    + "	SellId = $P{Invoice}";

            int para = Integer.parseInt(lbBN.getText());

            //load report location
            FileInputStream fis = new FileInputStream("D:\\NetBeans Project\\LittlePawsShop\\src\\Form\\Invoice.jrxml");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);

            //set parameters
            Map map = new HashMap();
            map.put("Invoice", para);

            //compile report
            JasperReport jasperReport = (JasperReport) JasperCompileManager.compileReport(bufferedInputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, c);

            //view report to UI
            JasperViewer.viewReport(jasperPrint, false);
            this.setCursor(Cursor.DEFAULT_CURSOR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void SpQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SpQtyKeyPressed

    }//GEN-LAST:event_SpQtyKeyPressed

    private void txtChangedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChangedKeyReleased

    }//GEN-LAST:event_txtChangedKeyReleased

    private void txtChangedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtChangedKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pay();
        }
    }//GEN-LAST:event_txtChangedKeyPressed

    private void SpQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SpQtyKeyReleased


    }//GEN-LAST:event_SpQtyKeyReleased

    private void SpQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpQtyStateChanged

    }//GEN-LAST:event_SpQtyStateChanged

    private void SpQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SpQtyKeyTyped

    }//GEN-LAST:event_SpQtyKeyTyped

    private void txtRMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRMKeyTyped
        // TODO add your handling code here:
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtRMKeyTyped

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
            java.util.logging.Logger.getLogger(Shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shopping.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shopping().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SpQty;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNW;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbBN;
    private javax.swing.JLabel lbImg;
    private javax.swing.JLabel lbPName;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbStockQty;
    private javax.swing.JTable tbSale;
    private javax.swing.JTable tbShowProduct;
    private javax.swing.JTextField txtChanged;
    private javax.swing.JTextField txtRM;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables

    private InputStream FileInputStream(File file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JasperDesign JRXmlLoader(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JasperPrint JasperFillManager(JasperReport jr, HashMap para, Connection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
