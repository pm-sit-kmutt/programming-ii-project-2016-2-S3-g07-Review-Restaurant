/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myreview;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import project_review.Restaurant;

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
//        List.setModel(new javax.swing.AbstractListModel<String>() {
//            String[] strings = { "PEEM", "dasdas", "sadasd", "asdas", "asdas", "asdasd" , "11111111111","assssssssssssssss" };
//           
//            public int getSize() { return strings.length; }
//            public String getElementAt(int i) { return strings[i] ; }
//        });
//        jScrollPane2.setViewportView(List);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        comboCate = new javax.swing.JComboBox<>();
        txtFldSearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        comboOrderBy = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Homepage");
        setResizable(false);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Myproject\\Picture\\Untitled-1.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(51, 102, 255));

        btnCreate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        btnCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        btnCreate.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Review Here");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        comboCate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboCate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categories", "Restaurant", "Buffet", "Desert", "Bakery", "Coffee" }));
        comboCate.setToolTipText("");
        comboCate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray));

        txtFldSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtFldSearch.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtFldSearch.setText("            Find");
        txtFldSearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray));
        txtFldSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFldSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFldSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFldSearchFocusLost(evt);
            }
        });
        txtFldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSearchActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(51, 51, 255));
        search.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        search.setText("OK");
        search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        search.setPreferredSize(new java.awt.Dimension(32, 32));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        comboOrderBy.setBackground(new java.awt.Color(51, 102, 255));
        comboOrderBy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ล่าสุด", "พยัญชนะ a-z", "คะแนนต่ำ-สูง", "คะแนนสูง-ต่ำ", "จำนวนรีวืวต่ำ-สูง", "จำนวนรีวิวสูง-ต่ำ" }));
        comboOrderBy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.lightGray));
        comboOrderBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrderByActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("จัดเรียงตาม :");
        jLabel3.setToolTipText("");

        btnShow.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShow.setText("SHOWTABLE");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnShow)
                        .addGap(82, 82, 82)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnShow))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        tableRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "ชื่อร้าน", "ประเภท", "ถนน"
            }
        ));
        jScrollPane1.setViewportView(tableRes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldSearchFocusGained
        if (txtFldSearch.getText().equalsIgnoreCase("            Find")) {
            txtFldSearch.setText("");
        } else {
        }
    }//GEN-LAST:event_txtFldSearchFocusGained

    private void txtFldSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFldSearchFocusLost
        if (txtFldSearch.getText().equalsIgnoreCase("")) {
            txtFldSearch.setText("            Find");
        }

    }//GEN-LAST:event_txtFldSearchFocusLost

    private void txtFldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldSearchActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void comboOrderByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrderByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrderByActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        CreateResGUI newres = new CreateResGUI();
        newres.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        try {
            showTable();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnShowActionPerformed
    private void ListActionPerformed(java.awt.event.ActionEvent evt) {
        CreateResGUI aas = new CreateResGUI();
        aas.setVisible(true);
    }

    private void showTable() throws SQLException, ClassNotFoundException {
        
        tableRes.setModel(new DefaultTableModel());
        DefaultTableModel model = (DefaultTableModel) tableRes.getModel();
        model.addColumn("res_id");
//        model.addColumn("username");
        model.addColumn("resName");
        model.addColumn("resType");
        model.addColumn("road");
//        model.addColumn("province");
//        model.addColumn("resAdd");
//        model.addColumn("resTel");
//        model.addColumn("resTime");
        Connection cont = null;

//            ResultSet rs = null;
        String nameS = txtFldSearch.getText();
        ResultSet rs = Restaurant.findStoreResult(nameS);

        int row = 0;
        if (rs == null) {
            System.out.println("!ResultSet is null");
        }
        while (rs != null && rs.next()) {
            model.addRow(new Object[0]);
            model.setValueAt(rs.getString("res_id"), row, 0);
//            model.setValueAt(rs.getString("username"), row, 1);
//            model.setValueAt(rs.getString("resName"), row, 2);
            model.setValueAt(rs.getString("resName"), row, 1);
            model.setValueAt(rs.getString("resType"), row, 2);
            model.setValueAt(rs.getString("road"), row, 3);
            model.setValueAt(rs.getString("province"), row, 4);
//            model.setValueAt(rs.getString("resAdd"), row, 6);
//            model.setValueAt(rs.getString("resTel"), row, 7);
//            model.setValueAt(rs.getString("resTime"), row, 8);
            row++;
        }

    }

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {

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
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnShow;
    private javax.swing.JComboBox<String> comboCate;
    private javax.swing.JComboBox<String> comboOrderBy;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTable tableRes;
    private javax.swing.JTextField txtFldSearch;
    // End of variables declaration//GEN-END:variables
}
