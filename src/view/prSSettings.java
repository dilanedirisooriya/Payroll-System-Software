/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.PRdb;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
// * @author ACER
 */
public class prSSettings extends javax.swing.JFrame {

    int idD, vDB;
    String dPl;

    /**
     * Creates new form prSystemSettings
     */
    public prSSettings() {
        initComponents();
        setIconImage((new ImageIcon(getClass().getResource("/Pictures/wallet_64.png")).getImage()));
        autoLoadSS();
        salaryP();
        txtDID.setVisible(false);
        EditD.setEnabled(false);
    }

    public void autoGenD() {
        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsPID = s.executeQuery("SELECT MAX(idDesignation) FROM designation");
            while (rsPID.next()) {
                idD = rsPID.getInt("MAX(idDesignation)");
                idD++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void autoLoadSS() {
        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsDB = s.executeQuery("SELECT * FROM ssettings");
            if (rsDB.last()) {
                ResultSet rsDB1 = s.executeQuery("SELECT * FROM ssettings WHERE idSSettings='" + vDB + "'");
                while (rsDB1.next()) {
                    dPl = rsDB1.getString("percentage");
                }
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void salaryP() {
        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsNB = s.executeQuery("SELECT*FROM ssettings");
            if (rsNB.last()) {
                vDB = 1;
                autoLoadSS();
                txtCLivingP.setText(dPl);
                vDB = 2;
                autoLoadSS();
                txtAllowanceP.setText(dPl);
                vDB = 3;
                autoLoadSS();
                txtSAllowance.setText(dPl);
                vDB = 4;
                autoLoadSS();
                txtFuel.setText(dPl);
                vDB = 5;
                autoLoadSS();
                txtLAllowanceP.setText(dPl);
                vDB = 6;
                autoLoadSS();
                txtLan.setText(dPl);
                vDB = 7;
                autoLoadSS();
                txtTelephone.setText(dPl);
                vDB = 8;
                autoLoadSS();
                txtStampP.setText(dPl);
                vDB = 9;
                autoLoadSS();
                txtUnionP.setText(dPl);
                vDB = 10;
                autoLoadSS();
                txtWelfareP.setText(dPl);
                vDB = 11;
                autoLoadSS();
                txtWOPP.setText(dPl);
                vDB = 12;
                autoLoadSS();
                txtAgraharaP.setText(dPl);
                vDB = 13;
                autoLoadSS();
                txtTax.setText(dPl);
                vDB = 14;
                autoLoadSS();
                txtSClub.setText(dPl);
//
//                calRs();
//                cal100p();
            } else {
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 1 + "','" + "Cost of Living" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 2 + "','" + "Allowance" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 3 + "','" + "Special Allowance" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 4 + "','" + "Fuel" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 5 + "','" + "Lecturer Allowance" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 6 + "','" + "LAN" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 7 + "','" + "Telephone" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 8 + "','" + "Stamp" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 9 + "','" + "Union" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 10 + "','" + "Welfare" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 11 + "','" + "W&OP" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 12 + "','" + "Agrahara" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 13 + "','" + "Tax" + "','" + 0 + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 14 + "','" + "Sports Club" + "','" + 0 + "')");
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
        jLabel1 = new javax.swing.JLabel();
        txtDesignation = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBSalary = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DesignationTable = new javax.swing.JTable();
        CreateD = new javax.swing.JButton();
        EditD = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        STypeComboBox = new javax.swing.JComboBox<String>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAllowanceP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCLivingP = new javax.swing.JTextField();
        txtSAllowance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLAllowanceP = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFuel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtStampP = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtWelfareP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtUnionP = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtAgraharaP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtWOPP = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        txtDID = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtSClub = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("System Settings Payroll System");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Designation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setText("Designation");

        jLabel2.setText("Basic Salary");

        DesignationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Designation", "Basic Salary", "Salary Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DesignationTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DesignationTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        DesignationTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DesignationTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(DesignationTable);
        if (DesignationTable.getColumnModel().getColumnCount() > 0) {
            DesignationTable.getColumnModel().getColumn(0).setMinWidth(40);
            DesignationTable.getColumnModel().getColumn(0).setPreferredWidth(45);
            DesignationTable.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        CreateD.setText("Create");
        CreateD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CreateD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateDActionPerformed(evt);
            }
        });

        EditD.setText("Edit");
        EditD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditDActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel22.setText("Salary Type");

        STypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Salary Type", "Special", "Normal" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDesignation)
                            .addComponent(txtBSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(STypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreateD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EditD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDesignation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CreateD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EditD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(STypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary Settings", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Earning", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel3.setText("Allowance    :");

        jLabel4.setText("Cost of Living       : Rs.");

        jLabel6.setText("%");

        jLabel5.setText("Special Allowance : Rs.");

        jLabel7.setText("Lecturer Allowance:");

        jLabel8.setText("%");

        jLabel10.setText("Fuel             :");

        jLabel12.setText("%");

        jLabel14.setText("LAN/RETAT : Rs.");

        jLabel15.setText("Telephone            : Rs.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCLivingP, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtSAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtLAllowanceP)
                    .addComponent(txtTelephone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtAllowanceP, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(txtFuel)
                    .addComponent(txtLan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCLivingP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAllowanceP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSAllowance)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLAllowanceP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deduction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel9.setText("Stamp      : Rs.");

        jLabel11.setText("Welfare   : Rs.");

        jLabel13.setText("Union : Rs.");

        jLabel17.setText("Agrahara : Rs.");

        jLabel19.setText("W&OP");

        jLabel20.setText("%");

        Update.setText("Update");
        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        txtDID.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel16.setText("Tax");

        jLabel21.setText("%");

        jLabel18.setText("SportsClub: Rs.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSClub, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                        .addGap(178, 178, 178)
                        .addComponent(txtDID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWelfareP)
                                    .addComponent(txtStampP)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAgraharaP)))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTax))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnionP))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWOPP)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUnionP, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStampP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWelfareP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWOPP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgraharaP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSClub, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(972, 470));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateDActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT*FROM designation WHERE dName='" + txtDesignation.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "This Designation is already exists.", null, 0, new ImageIcon(getClass().getResource("/Pictures/Warning.png")));
                txtDesignation.grabFocus();
            } else {
                autoGenD();
                s.executeUpdate("INSERT INTO designation VALUES('" + idD + "','" + txtDesignation.getText() + "','" + txtBSalary.getText() + "','"+STypeComboBox.getSelectedItem()+"')");
                DesignationTableAncestorAdded(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CreateDActionPerformed

    private void DesignationTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DesignationTableAncestorAdded

        try {
            DefaultTableModel dtm = (DefaultTableModel) DesignationTable.getModel();
            dtm.setRowCount(0);
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsSTL = s.executeQuery("SELECT*FROM designation ORDER BY idDesignation");
            while (rsSTL.next()) {
                Vector v = new Vector();
                v.add(rsSTL.getString("idDesignation"));
                v.add(rsSTL.getString("dName"));
                v.add(rsSTL.getString("bSalary"));
                v.add(rsSTL.getString("sCat"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DesignationTableAncestorAdded

    private void DesignationTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DesignationTableMouseClicked

        try {
            Statement s = PRdb.getConnection().createStatement();
            int i = DesignationTable.getSelectedRow();
            String dsgID = (String) DesignationTable.getValueAt(i, 0);
            String dN = (String) DesignationTable.getValueAt(i, 1);
            String bS = (String) DesignationTable.getValueAt(i, 2);
            String sT = (String) DesignationTable.getValueAt(i, 3);
            txtDID.setText(dsgID);
            txtDesignation.setText(dN);
            txtBSalary.setText(bS);
            STypeComboBox.setSelectedItem(sT);
            CreateD.setEnabled(false);
            EditD.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DesignationTableMouseClicked

    private void EditDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditDActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            s.executeUpdate("UPDATE designation SET dName='" + txtDesignation.getText() + "',bSalary='" + txtBSalary.getText() + "',sCat='"+STypeComboBox.getSelectedItem()+"' WHERE idDesignation='" + txtDID.getText() + "'");
            JOptionPane.showMessageDialog(null, "Updated Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Updated1.png")));
            DesignationTableAncestorAdded(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditDActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT*FROM ssettings");
            if (rs.last()) {
                s.executeUpdate("UPDATE ssettings SET sType='" + "Cost of Living" + "',percentage='" + txtCLivingP.getText() + "' WHERE idSSettings='" + 1 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Allowance" + "',percentage='" + txtAllowanceP.getText() + "' WHERE idSSettings='" + 2 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Special Allowance" + "',percentage='" + txtSAllowance.getText() + "' WHERE idSSettings='" + 3 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Fuel" + "',percentage='" + txtFuel.getText() + "' WHERE idSSettings='" + 4 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Lecturer Allowance" + "',percentage='" + txtLAllowanceP.getText() + "' WHERE idSSettings='" + 5 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "LAN" + "',percentage='" + txtLan.getText() + "' WHERE idSSettings='" + 6 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Telephone" + "',percentage='" + txtTelephone.getText() + "' WHERE idSSettings='" + 7 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Stamp" + "',percentage='" + txtStampP.getText() + "' WHERE idSSettings='" + 8 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Union" + "',percentage='" + txtUnionP.getText() + "' WHERE idSSettings='" + 9 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Welfare" + "',percentage='" + txtWelfareP.getText() + "' WHERE idSSettings='" + 10 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "W&OP" + "',percentage='" + txtWOPP.getText() + "' WHERE idSSettings='" + 11 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Agrahara" + "',percentage='" + txtAgraharaP.getText() + "' WHERE idSSettings='" + 12 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Tax" + "',percentage='" + txtTax.getText() + "' WHERE idSSettings='" + 13 + "'");
                s.executeUpdate("UPDATE ssettings SET sType='" + "Sports Club" + "',percentage='" + txtSClub.getText() + "' WHERE idSSettings='" + 14 + "'");
                JOptionPane.showMessageDialog(null, "Updated Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Updated1.png")));
            } else {
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 1 + "','" + "Cost of Living" + "','" + txtCLivingP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 2 + "','" + "Allowance" + "','" + txtAllowanceP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 3 + "','" + "Special Allowance" + "','" + txtSAllowance.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 4 + "','" + "Fuel" + "','" + txtFuel.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 5 + "','" + "Lecturer Allowance" + "','" + txtLAllowanceP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 6 + "','" + "LAN" + "','" + txtLan.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 7 + "','" + "Telephone" + "','" + txtTelephone.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 8 + "','" + "Stamp" + "','" + txtStampP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 9 + "','" + "Union" + "','" + txtUnionP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 10 + "','" + "Welfare" + "','" + txtWelfareP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 11 + "','" + "W&OP" + "','" + txtWOPP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 12 + "','" + "Agrahara" + "','" + txtAgraharaP.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 13 + "','" + "Tax" + "','" + txtTax.getText() + "')");
                s.executeUpdate("INSERT INTO ssettings VALUES('" + 14 + "','" + "Sports Club" + "','" + txtSClub.getText() + "')");
                JOptionPane.showMessageDialog(null, "Save Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Saved1.png")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        try {
            txtDesignation.setText(null);
            txtBSalary.setText(null);
            CreateD.setEnabled(true);
            EditD.setEnabled(false);
            DesignationTableAncestorAdded(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ClearActionPerformed

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
            java.util.logging.Logger.getLogger(prSSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prSSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prSSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prSSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prSSettings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton CreateD;
    private javax.swing.JTable DesignationTable;
    private javax.swing.JButton EditD;
    private javax.swing.JComboBox<String> STypeComboBox;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JTextField txtAgraharaP;
    private javax.swing.JTextField txtAllowanceP;
    private javax.swing.JTextField txtBSalary;
    private javax.swing.JTextField txtCLivingP;
    private javax.swing.JLabel txtDID;
    private javax.swing.JTextField txtDesignation;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JTextField txtLAllowanceP;
    private javax.swing.JTextField txtLan;
    private javax.swing.JTextField txtSAllowance;
    private javax.swing.JTextField txtSClub;
    private javax.swing.JTextField txtStampP;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtUnionP;
    private javax.swing.JTextField txtWOPP;
    private javax.swing.JTextField txtWelfareP;
    // End of variables declaration//GEN-END:variables
}
