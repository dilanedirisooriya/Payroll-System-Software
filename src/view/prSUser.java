/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.PRdb;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class prSUser extends javax.swing.JFrame {

    int idU, idEmp;

    /**
     * Creates new form prSUser
     */
    public prSUser() {
        initComponents();
        setIconImage((new ImageIcon(getClass().getResource("/Pictures/wallet_64.png")).getImage()));
        txtSUID.setVisible(false);
        EditAccess.setEnabled(false);
        RemoveAccess.setEnabled(false);
    }

    public void autoGenU() {
        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsPID = s.executeQuery("SELECT MAX(idSUser) FROM suser");
            while (rsPID.next()) {
                idU = rsPID.getInt("MAX(idSUser)");
                idU++;
            }
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SUserTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UTypeComboBox = new javax.swing.JComboBox<String>();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        ENameComboBox = new javax.swing.JComboBox<String>();
        EditAccess = new javax.swing.JButton();
        CreateAccess = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        txtSUID = new javax.swing.JLabel();
        RemoveAccess = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Settings - Payroll System");

        SUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Employee Name", "User Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SUserTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                SUserTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        SUserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SUserTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SUserTable);
        if (SUserTable.getColumnModel().getColumnCount() > 0) {
            SUserTable.getColumnModel().getColumn(0).setMinWidth(40);
            SUserTable.getColumnModel().getColumn(0).setPreferredWidth(45);
            SUserTable.getColumnModel().getColumn(0).setMaxWidth(50);
            SUserTable.getColumnModel().getColumn(2).setMinWidth(180);
            SUserTable.getColumnModel().getColumn(2).setPreferredWidth(190);
            SUserTable.getColumnModel().getColumn(2).setMaxWidth(200);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Control", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setText("Employee Name");

        jLabel2.setText("User Type");

        UTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select User Type" }));
        UTypeComboBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UTypeComboBoxAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        UTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UTypeComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        ENameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Employee" }));
        ENameComboBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ENameComboBoxAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        EditAccess.setText("Edit Access");
        EditAccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditAccessActionPerformed(evt);
            }
        });

        CreateAccess.setText("Create Access");
        CreateAccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccessActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        txtSUID.setBorder(new javax.swing.border.MatteBorder(null));

        RemoveAccess.setText("Remove Access");
        RemoveAccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveAccessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(txtSUID, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RemoveAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(CreateAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EditAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ENameComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UTypeComboBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CreateAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSUID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EditAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(RemoveAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(698, 453));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SUserTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_SUserTableAncestorAdded

        try {
            DefaultTableModel dtm = (DefaultTableModel) SUserTable.getModel();
            dtm.setRowCount(0);
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT e.`name`,su.`idSUser`,su.`type` FROM employee e,suser su WHERE e.`idEmployee`=su.`idEmployee`");
//            ResultSet rs = s.executeQuery("SELECT * FROM suser ORDER BY idSUser");
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("idSUser"));
                v.add(rs.getString("name"));
                v.add(rs.getString("type"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SUserTableAncestorAdded

    private void ENameComboBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ENameComboBoxAncestorAdded

        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT name FROM employee");
            Vector v = new Vector();
            while (rs.next()) {
                ENameComboBox.addItem(rs.getString("name"));
                v.add(rs.getString(("name")));
            }
            ENameComboBox.setModel(new DefaultComboBoxModel(v));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ENameComboBoxAncestorAdded

    private void UTypeComboBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UTypeComboBoxAncestorAdded

        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT type FROM usertype");
            Vector v = new Vector();
            while (rs.next()) {
                UTypeComboBox.addItem(rs.getString("type"));
                v.add(rs.getString(("type")));
            }
            UTypeComboBox.setModel(new DefaultComboBoxModel(v));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_UTypeComboBoxAncestorAdded

    private void UTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UTypeComboBoxActionPerformed

        txtPassword.grabFocus();
    }//GEN-LAST:event_UTypeComboBoxActionPerformed

    private void SUserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SUserTableMouseClicked

        try {
            Statement s = PRdb.getConnection().createStatement();
            int i = SUserTable.getSelectedRow();
            String suID = (String) SUserTable.getValueAt(i, 0);
            String eN = (String) SUserTable.getValueAt(i, 1);
            String uT = (String) SUserTable.getValueAt(i, 2);
            txtSUID.setText(suID);
            ENameComboBox.setSelectedItem(eN);
            UTypeComboBox.setSelectedItem(uT);
            ENameComboBox.setEnabled(false);
            txtPassword.setEnabled(false);
            CreateAccess.setEnabled(false);
            EditAccess.setEnabled(true);
            RemoveAccess.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SUserTableMouseClicked

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        try {
            txtPassword.setText(null);
            ENameComboBox.setEnabled(true);
            txtPassword.setEnabled(true);
            CreateAccess.setEnabled(true);
            EditAccess.setEnabled(false);
            RemoveAccess.setEnabled(false);
            SUserTableAncestorAdded(null);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ClearActionPerformed

    private void EditAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditAccessActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            s.executeUpdate("UPDATE suser SET password='" + txtPassword.getText() + "',type='" + UTypeComboBox.getSelectedItem() + "' WHERE idSUser='" + txtSUID.getText() + "'");
            JOptionPane.showMessageDialog(null, "Updated Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Updated1.png")));
            SUserTableAncestorAdded(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditAccessActionPerformed

    private void RemoveAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveAccessActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            s.executeUpdate("DELETE FROM suser WHERE idSUser='" + txtSUID.getText() + "'");
            Clear.doClick();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_RemoveAccessActionPerformed

    private void CreateAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccessActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsEmp = s.executeQuery("select idEmployee from employee where name='" + ENameComboBox.getSelectedItem() + "'");
            if (rsEmp.next()) {
                idEmp = rsEmp.getInt("idEmployee");
            }
            autoGenU();
            s.executeUpdate("INSERT INTO suser VALUES('" + idU + "','" + ENameComboBox.getSelectedItem() + "','" + txtPassword.getText() + "','" + UTypeComboBox.getSelectedItem() + "','" + idEmp + "')");
            SUserTableAncestorAdded(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CreateAccessActionPerformed

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
            java.util.logging.Logger.getLogger(prSUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prSUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prSUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prSUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prSUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton CreateAccess;
    private javax.swing.JComboBox<String> ENameComboBox;
    private javax.swing.JButton EditAccess;
    private javax.swing.JButton RemoveAccess;
    private javax.swing.JTable SUserTable;
    private javax.swing.JComboBox<String> UTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtSUID;
    // End of variables declaration//GEN-END:variables
}
