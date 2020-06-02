/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.PRdb;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author ACER
 */
public class prSalaryHistory extends javax.swing.JFrame {

    double nPay, bS, al, cL, fA, sA, tl, ln, wp, tx, sC, lN, lA, fl, lr, tErn, st, un, wl, fs, ag, hR, el, wt, nPD, nPR, nPT, tD, tErnS, gP, tDS, dPl, nSC, resultP, inc, mnt, ars, tAr;

    /**
     * Creates new form prEmployee
     */
    public prSalaryHistory() {
        initComponents();
        setIconImage((new ImageIcon(getClass().getResource("/Pictures/wallet_64.png")).getImage()));
        MonthComboBox.setEnabled(false);
    }

//    public void cal() {
//        try {
////            bS = Double.parseDouble(txtBSalary.getText());
//            cL = Double.parseDouble(txtCLiving.getText());
//            al = Double.parseDouble(txtAllowance.getText());
//            sA = Double.parseDouble(txtSAllowance.getText());
//            fl = Double.parseDouble(txtFuel.getText());
//            lA = Double.parseDouble(txtLAllowance.getText());
//            ln = Double.parseDouble(txtLAN.getText());
//            tl = Double.parseDouble(txtTelephone.getText());
//            
//            st = Double.parseDouble(txtStamp.getText());
////            tErn = Double.parseDouble(txtTotalE.getText());
//            un = Double.parseDouble(txtUnion.getText());
//            wl = Double.parseDouble(txtWelfare.getText());
//            wp = Double.parseDouble(txtWOP.getText());
//            ag = Double.parseDouble(txtAgrahara.getText());
//            tx = Double.parseDouble(txtTax.getText());
//            sC = Double.parseDouble(txtSClub.getText());
//            lN = Double.parseDouble(txtLoan.getText());
//            hR = Double.parseDouble(txtHRent.getText());
//            el = Double.parseDouble(txtElectricity.getText());
//            wt = Double.parseDouble(txtWater.getText());
//            nPD = Double.parseDouble(txtNPDays.getText());
////            nPR = Double.parseDouble(txtNPRate.getText());
//            nSC = Double.parseDouble(txtNPTotal.getText());
//            tAr = Double.parseDouble(txtAreas.getText());
////            tErnS = Double.parseDouble(txtTESummary.getText());
//            gP = Double.parseDouble(txtGrossPay.getText());
////            tDS = Double.parseDouble(txtTDSummary.getText());
//            tErn = (double) (bS + cL + al + sA + fl + lA + ln + tl + tAr);
//            txtTotalE.setText(String.valueOf(tErn) + "0");
//            txtTESummary.setText(String.valueOf(tErn) + "0");
//            nPT = (double) (nPD * nPR);
//            txtNPTotal.setText(String.valueOf(nPT) + "0");
//            tD = (double) (st + un + wl + wp + ag + tx + sC + lN + hR + el + wt + nSC + nPT);
//            txtTotalDeduction.setText(String.valueOf(tD) + "0");
//            txtTDSummary.setText(String.valueOf(tD) + "0");
//            nPay = (double) (tErn - tD);
//            txtNetPay.setText(String.valueOf(nPay) + "0");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public void clear() {
        try {
            txtBSalary.setText("0");
            txtCLiving.setText("0");
            txtAllowance.setText("0");
            txtSAllowance.setText("0");
            txtFuel.setText("0");
            txtLAllowance.setText("0");
            txtLAN.setText("0");
            txtTelephone.setText("0");
            txtStamp.setText("0");
            txtUnion.setText("0");
            txtWelfare.setText("0");
            txtFestival.setText("0");
            txtWOP.setText("0");
            txtAgrahara.setText("0");
            txtTax.setText("0");
            txtSClub.setText("0");
            txtLoan.setText("0");
            txtHRent.setText("0");
            txtElectricity.setText("0");
            txtWater.setText("0");
            txtNPDays.setText("0");
//            txtNPRate.setText("0");
            txtNPTotal.setText("0");
            txtIncrement.setText("0");
            txtMonthA.setText("0");
            txtAreas.setText("0");
            txtTotalE.setText("0");
            txtTotalDeduction.setText("0");
            txtTESummary.setText("0");
            txtTDSummary.setText("0");
            txtGrossPay.setText("0");
            txtNetPay.setText("0");
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
        txtEmployeeNo = new javax.swing.JTextField();
        MonthComboBox = new javax.swing.JComboBox<String>();
        YearComboBox = new javax.swing.JComboBox<String>();
        jLabel23 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JLabel();
        txtBank = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEName = new javax.swing.JLabel();
        txtSearchStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBSalary = new javax.swing.JTextField();
        txtAllowance = new javax.swing.JTextField();
        txtCLiving = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotalE = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtIncrement = new javax.swing.JTextField();
        txtMonthA = new javax.swing.JTextField();
        txtAreas = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtSAllowance = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtTelephone = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtLAllowance = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtFuel = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtLAN = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAgrahara = new javax.swing.JTextField();
        txtWelfare = new javax.swing.JTextField();
        txtStamp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtUnion = new javax.swing.JTextField();
        txtFestival = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtWater = new javax.swing.JTextField();
        txtHRent = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtElectricity = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtNPDays = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNPTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTotalDeduction = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtWOP = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtSClub = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtLoan = new javax.swing.JTextField();
        txtCUser = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtTESummary = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtGrossPay = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTDSummary = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNetPay = new javax.swing.JTextField();
        Print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salary History - Payroll System");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Employee No");

        txtEmployeeNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        MonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MonthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthComboBoxActionPerformed(evt);
            }
        });

        YearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Year", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        YearComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearComboBoxActionPerformed(evt);
            }
        });

        jLabel23.setText("Account No");

        txtAccountNo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtAccountNo.setBorder(new javax.swing.border.MatteBorder(null));

        txtBank.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtBank.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel24.setText("Employee Name");

        txtEName.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txtEName.setBorder(new javax.swing.border.MatteBorder(null));

        txtSearchStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchStatus.setForeground(new java.awt.Color(255, 0, 0));
        txtSearchStatus.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtEName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtSearchStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtAccountNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Earning Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("Basic Salary");

        jLabel3.setText("Allowance");

        jLabel4.setText("Cost of Living");

        txtBSalary.setEditable(false);
        txtBSalary.setText("0");
        txtBSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBSalaryKeyReleased(evt);
            }
        });

        txtAllowance.setEditable(false);
        txtAllowance.setText("0");
        txtAllowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAllowanceKeyReleased(evt);
            }
        });

        txtCLiving.setEditable(false);
        txtCLiving.setText("0");
        txtCLiving.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCLivingKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Sub Total");

        txtTotalE.setEditable(false);
        txtTotalE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTotalE.setText("0");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Areas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel33.setText("Increment");

        jLabel34.setText("Month");

        jLabel35.setText("Areas");

        txtIncrement.setEditable(false);
        txtIncrement.setText("0");

        txtMonthA.setEditable(false);
        txtMonthA.setText("0");
        txtMonthA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMonthAKeyReleased(evt);
            }
        });

        txtAreas.setEditable(false);
        txtAreas.setText("0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIncrement, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(txtMonthA)
                    .addComponent(txtAreas))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIncrement, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonthA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel28.setText("Special Allowance");

        txtSAllowance.setEditable(false);
        txtSAllowance.setText("0");
        txtSAllowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSAllowanceKeyReleased(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setText("Telephone");

        txtTelephone.setEditable(false);
        txtTelephone.setText("0");
        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyReleased(evt);
            }
        });

        jLabel30.setText("Lec.Allowance");

        txtLAllowance.setEditable(false);
        txtLAllowance.setText("0");

        jLabel31.setText("Fuel");

        txtFuel.setEditable(false);
        txtFuel.setText("0");

        jLabel32.setText("LAN/RETAT");

        txtLAN.setEditable(false);
        txtLAN.setText("0");
        txtLAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLANKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(txtTelephone)
                    .addComponent(txtFuel)
                    .addComponent(txtLAN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLAN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBSalary, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSAllowance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCLiving, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAllowance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalE, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCLiving, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deduction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel7.setText("Stamp");

        jLabel8.setText("Welfare");

        jLabel9.setText("Agrahara");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Union");

        txtAgrahara.setEditable(false);
        txtAgrahara.setText("0");
        txtAgrahara.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgraharaKeyReleased(evt);
            }
        });

        txtWelfare.setEditable(false);
        txtWelfare.setText("0");
        txtWelfare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWelfareKeyReleased(evt);
            }
        });

        txtStamp.setEditable(false);
        txtStamp.setText("0");
        txtStamp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStampKeyReleased(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Festival");

        txtUnion.setEditable(false);
        txtUnion.setText("0");
        txtUnion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnionKeyReleased(evt);
            }
        });

        txtFestival.setEditable(false);
        txtFestival.setText("0");
        txtFestival.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFestivalKeyReleased(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("House Rent");

        jLabel13.setText("Water");

        txtWater.setEditable(false);
        txtWater.setText("0");
        txtWater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWaterKeyReleased(evt);
            }
        });

        txtHRent.setEditable(false);
        txtHRent.setText("0");
        txtHRent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHRentKeyReleased(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Electricity");

        txtElectricity.setEditable(false);
        txtElectricity.setText("0");
        txtElectricity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtElectricityKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWater, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(txtHRent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHRent, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtElectricity)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWater, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NoPay Deduction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel15.setText("No Pay Days");

        txtNPDays.setEditable(false);
        txtNPDays.setText("0");
        txtNPDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNPDaysKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Total Amount");

        txtNPTotal.setEditable(false);
        txtNPTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNPTotal.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNPDays, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNPDays, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Total Deduction");

        txtTotalDeduction.setEditable(false);
        txtTotalDeduction.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTotalDeduction.setText("0");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("W&OP");

        txtWOP.setEditable(false);
        txtWOP.setText("0");
        txtWOP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWOPKeyReleased(evt);
            }
        });

        jLabel25.setText("Tax");

        txtTax.setEditable(false);
        txtTax.setText("0");
        txtTax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTaxKeyReleased(evt);
            }
        });

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Sports Club");

        txtSClub.setEditable(false);
        txtSClub.setText("0");
        txtSClub.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSClubKeyReleased(evt);
            }
        });

        jLabel27.setText("Loan");

        txtLoan.setEditable(false);
        txtLoan.setText("0");
        txtLoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLoanKeyReleased(evt);
            }
        });

        txtCUser.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLoan, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTax))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtWelfare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtStamp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAgrahara))))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUnion)
                                    .addComponent(txtFestival, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWOP)
                                    .addComponent(txtSClub, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStamp, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWelfare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUnion)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFestival, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAgrahara, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWOP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSClub)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel19.setText("Total Earnings");

        txtTESummary.setEditable(false);
        txtTESummary.setText("0");

        jLabel20.setText("Gross Pay");

        txtGrossPay.setEditable(false);
        txtGrossPay.setText("0");

        jLabel21.setText("Total Deduction");

        txtTDSummary.setEditable(false);
        txtTDSummary.setText("0");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Net Pay");

        txtNetPay.setEditable(false);
        txtNetPay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNetPay.setText("0");

        Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/print.png"))); // NOI18N
        Print.setBorderPainted(false);
        Print.setContentAreaFilled(false);
        Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintMouseClicked(evt);
            }
        });
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTDSummary, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(txtTESummary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNetPay)
                    .addComponent(txtGrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Print, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Print, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTESummary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTDSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(769, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MonthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthComboBoxActionPerformed

        try {
            clear();
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT*FROM employee WHERE idEmployee='" + txtEmployeeNo.getText() + "'");
//            while (rs.next()) {
            if (rs.next()) {
                txtEName.setText(rs.getString("name"));
                txtAccountNo.setText(rs.getString("acntNo"));
                txtBank.setText(rs.getString("bank"));
//                idDsg = rs.getInt("idDesignation");
                txtSearchStatus.setText(null);
//                salaryP();
//            }
//            ResultSet rsBS = s.executeQuery("SELECT*FROM designation WHERE idDesignation='" + idDsg + "'");
//            while (rsBS.next()) {
//                txtBSalary.setText(rsBS.getString("bSalary"));
//                salaryP();
////                txtAccountNo.setText(rsBS.getString("acntNo"));
////                txtBank.setText(rsBS.getString("bank"));
//            }
                ResultSet rsS = s.executeQuery("SELECT*FROM salary WHERE idEmployee='" + txtEmployeeNo.getText() + "' && month='" + YearComboBox.getSelectedItem() + " " + MonthComboBox.getSelectedItem() + "'");
//            while(rsS.next()){
                if (rsS.next()) {
                    txtBSalary.setText(rsS.getString("basic"));
                    txtAllowance.setText(rsS.getString("allowance"));
                    txtCLiving.setText(rsS.getString("cLiving"));
                    txtSAllowance.setText(rsS.getString("sAllowance"));
                    txtTelephone.setText(rsS.getString("tel"));
                    txtLAllowance.setText(rsS.getString("lAlowance"));
                    txtFuel.setText(rsS.getString("fuel"));
                    txtLAN.setText(rsS.getString("lanR"));
                    txtAreas.setText(rsS.getString("areas"));
                    txtStamp.setText(rsS.getString("stamp"));

                    txtUnion.setText(rsS.getString("union"));
                    txtWelfare.setText(rsS.getString("welfare"));
                    txtFestival.setText(rsS.getString("festival"));
                    txtAgrahara.setText(rsS.getString("agrahara"));
                    txtWOP.setText(rsS.getString("wop"));
                    txtTax.setText(rsS.getString("tax"));
                    txtSClub.setText(rsS.getString("sClub"));
                    txtLoan.setText(rsS.getString("loan"));
                    txtHRent.setText(rsS.getString("hRent"));
                    txtElectricity.setText(rsS.getString("electricity"));
                    txtWater.setText(rsS.getString("water"));
                    txtNPDays.setText(rsS.getString("noPayDays"));
                    txtNPTotal.setText(rsS.getString("noPayTotal"));

                    txtTotalE.setText(rsS.getString("tEarning"));
                    txtTESummary.setText(rsS.getString("tEarning"));
                    txtGrossPay.setText(rsS.getString("tGross"));
                    txtTotalDeduction.setText(rsS.getString("tDeduction"));
                    txtTDSummary.setText(rsS.getString("tDeduction"));
                    txtNetPay.setText(rsS.getString("nPay"));
//                cal();
                } else {
                    txtSearchStatus.setText("Salary details not found on " + YearComboBox.getSelectedItem() + " " + MonthComboBox.getSelectedItem() + " !");
//                txtFestival.setText("0");
                }
//            }
//                }else{
//                txtLoan.setText("0");
//                txtFestival.setText("0");
//            }
//            ResultSet rsA = s.executeQuery("SELECT*FROM areas WHERE idEmployee='" + txtEmployeeNo.getText() + "'");
//            if (rsA.next()) {
//                txtIncrement.setText(rsA.getString("increment"));
//                txtMonthAS.setText(rsA.getString("month"));
//            }
//            autoDate();
            } else {
                txtSearchStatus.setText("Not Found ! Please check this EmployeeNo !");
                txtSearchStatus.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_MonthComboBoxActionPerformed

    private void YearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearComboBoxActionPerformed

        MonthComboBox.setEnabled(true);
    }//GEN-LAST:event_YearComboBoxActionPerformed

    private void txtBSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBSalaryKeyReleased

    }//GEN-LAST:event_txtBSalaryKeyReleased

    private void txtAllowanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAllowanceKeyReleased

    }//GEN-LAST:event_txtAllowanceKeyReleased

    private void txtCLivingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCLivingKeyReleased

    }//GEN-LAST:event_txtCLivingKeyReleased

    private void txtMonthAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonthAKeyReleased

    }//GEN-LAST:event_txtMonthAKeyReleased

    private void txtSAllowanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSAllowanceKeyReleased

    }//GEN-LAST:event_txtSAllowanceKeyReleased

    private void txtTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyReleased

    }//GEN-LAST:event_txtTelephoneKeyReleased

    private void txtLANKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLANKeyReleased

    }//GEN-LAST:event_txtLANKeyReleased

    private void txtAgraharaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgraharaKeyReleased

    }//GEN-LAST:event_txtAgraharaKeyReleased

    private void txtWelfareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWelfareKeyReleased

    }//GEN-LAST:event_txtWelfareKeyReleased

    private void txtStampKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStampKeyReleased

    }//GEN-LAST:event_txtStampKeyReleased

    private void txtUnionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnionKeyReleased

    }//GEN-LAST:event_txtUnionKeyReleased

    private void txtFestivalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFestivalKeyReleased

    }//GEN-LAST:event_txtFestivalKeyReleased

    private void txtWaterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWaterKeyReleased

    }//GEN-LAST:event_txtWaterKeyReleased

    private void txtHRentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHRentKeyReleased

    }//GEN-LAST:event_txtHRentKeyReleased

    private void txtElectricityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtElectricityKeyReleased

    }//GEN-LAST:event_txtElectricityKeyReleased

    private void txtNPDaysKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPDaysKeyReleased

    }//GEN-LAST:event_txtNPDaysKeyReleased

    private void txtWOPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWOPKeyReleased

    }//GEN-LAST:event_txtWOPKeyReleased

    private void txtTaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxKeyReleased

    }//GEN-LAST:event_txtTaxKeyReleased

    private void txtSClubKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSClubKeyReleased

    }//GEN-LAST:event_txtSClubKeyReleased

    private void txtLoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanKeyReleased

    }//GEN-LAST:event_txtLoanKeyReleased

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed

        try {
            File foi = new File(new File("").getAbsolutePath() + "/iReports");
            String reportSource = foi.getAbsolutePath() + "/" + "prSalarySlip.jrxml";
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("month", "Pay Slip for the month of "+MonthComboBox.getSelectedItem()+" "+YearComboBox.getSelectedItem());
            params.put("empNo", txtEmployeeNo.getText());
            params.put("empName", txtEName.getText());
            params.put("bAccNo", "Net salary is credited to A/C  "+txtAccountNo.getText());
            params.put("bank", txtBank.getText());
            params.put("basic", txtBSalary.getText());
            params.put("allowance", txtAllowance.getText());
            params.put("cLiving", txtCLiving.getText());
            params.put("tEarning", txtTESummary.getText());
            params.put("sAllowance", txtSAllowance.getText());
            params.put("tel", txtTelephone.getText());
            params.put("lAllowance", txtLAllowance.getText());
            params.put("fuel", txtFuel.getText());
            params.put("lan", txtLAN.getText());
            params.put("areas", txtAreas.getText());
            params.put("tGross", txtGrossPay.getText());
            params.put("stamp", txtStamp.getText());
            params.put("union", txtUnion.getText());
            params.put("welfare", txtWelfare.getText());
            params.put("festival", txtFestival.getText());
            params.put("agrahara", txtAgrahara.getText());
            params.put("wop", txtWOP.getText());
            params.put("tax", txtTax.getText());
            params.put("sClub", txtSClub.getText());
            params.put("loan", txtLoan.getText());
            params.put("hRent", txtHRent.getText());
            params.put("electricity", txtElectricity.getText());
            params.put("water", txtWater.getText());
            params.put("noPay", txtNPTotal.getText());
            params.put("tDeduction", txtTDSummary.getText());
            params.put("netPay", txtNetPay.getText());
            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());
            //            File foo = new File(new File("").getAbsolutePath() + "/Documents");
            //            JasperExportManager.exportReportToPdfFile(jasperPrint, foo.getAbsolutePath() + "/" + txtEmployeeNo.getText() + YearComboBox.getSelectedItem() + MonthComboBox.getSelectedItem() + ".pdf");
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintActionPerformed

    private void PrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintMouseClicked
        // TODO add your handling code here:
        try {
            File foi = new File(new File("").getAbsolutePath() + "/iReports");
            String reportSource = foi.getAbsolutePath() + "/" + "prSalarySlip.jrxml";
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("month", "Pay Slip for the month of "+MonthComboBox.getSelectedItem()+" "+YearComboBox.getSelectedItem());
            params.put("empNo", txtEmployeeNo.getText());
            params.put("empName", txtEName.getText());
            params.put("bAccNo", "Net salary is credited to A/C  "+txtAccountNo.getText());
            params.put("bank", txtBank.getText());
            params.put("basic", txtBSalary.getText());
            params.put("allowance", txtAllowance.getText());
            params.put("cLiving", txtCLiving.getText());
            params.put("tEarning", txtTESummary.getText());
            params.put("sAllowance", txtSAllowance.getText());
            params.put("tel", txtTelephone.getText());
            params.put("lAllowance", txtLAllowance.getText());
            params.put("fuel", txtFuel.getText());
            params.put("lan", txtLAN.getText());
            params.put("areas", txtAreas.getText());
            params.put("tGross", txtGrossPay.getText());
            params.put("stamp", txtStamp.getText());
            params.put("union", txtUnion.getText());
            params.put("welfare", txtWelfare.getText());
            params.put("festival", txtFestival.getText());
            params.put("agrahara", txtAgrahara.getText());
            params.put("wop", txtWOP.getText());
            params.put("tax", txtTax.getText());
            params.put("sClub", txtSClub.getText());
            params.put("loan", txtLoan.getText());
            params.put("hRent", txtHRent.getText());
            params.put("electricity", txtElectricity.getText());
            params.put("water", txtWater.getText());
            params.put("noPay", txtNPTotal.getText());
            params.put("tDeduction", txtTDSummary.getText());
            params.put("netPay", txtNetPay.getText());
            JasperReport jasperReport = JasperCompileManager.compileReport(reportSource);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JREmptyDataSource());
            //            File foo = new File(new File("").getAbsolutePath() + "/Documents");
            //            JasperExportManager.exportReportToPdfFile(jasperPrint, foo.getAbsolutePath() + "/" + txtEmployeeNo.getText() + YearComboBox.getSelectedItem() + MonthComboBox.getSelectedItem() + ".pdf");
            JasperPrintManager.printReport(jasperPrint, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_PrintMouseClicked
/**/
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
            java.util.logging.Logger.getLogger(prSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prSalaryHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prSalaryHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MonthComboBox;
    private javax.swing.JButton Print;
    private javax.swing.JComboBox<String> YearComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel txtAccountNo;
    private javax.swing.JTextField txtAgrahara;
    private javax.swing.JTextField txtAllowance;
    private javax.swing.JTextField txtAreas;
    private javax.swing.JTextField txtBSalary;
    private javax.swing.JLabel txtBank;
    private javax.swing.JTextField txtCLiving;
    public static javax.swing.JLabel txtCUser;
    private javax.swing.JLabel txtEName;
    private javax.swing.JTextField txtElectricity;
    private javax.swing.JTextField txtEmployeeNo;
    private javax.swing.JTextField txtFestival;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JTextField txtGrossPay;
    private javax.swing.JTextField txtHRent;
    private javax.swing.JTextField txtIncrement;
    private javax.swing.JTextField txtLAN;
    private javax.swing.JTextField txtLAllowance;
    private javax.swing.JTextField txtLoan;
    private javax.swing.JTextField txtMonthA;
    private javax.swing.JTextField txtNPDays;
    private javax.swing.JTextField txtNPTotal;
    private javax.swing.JTextField txtNetPay;
    private javax.swing.JTextField txtSAllowance;
    private javax.swing.JTextField txtSClub;
    private javax.swing.JLabel txtSearchStatus;
    private javax.swing.JTextField txtStamp;
    private javax.swing.JTextField txtTDSummary;
    private javax.swing.JTextField txtTESummary;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTotalDeduction;
    private javax.swing.JTextField txtTotalE;
    private javax.swing.JTextField txtUnion;
    private javax.swing.JTextField txtWOP;
    private javax.swing.JTextField txtWater;
    private javax.swing.JTextField txtWelfare;
    // End of variables declaration//GEN-END:variables
}
