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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
public class prSalary extends javax.swing.JFrame {

    int ID1, idDsg, vDB, idU;
    String lMS, s2, DsgT;
    double nPay, bS, al, cL, fA, sA, tl, ln, wp, tx, sC, lN, lA, fl, lr, tErn, st, un, wl, fs, ag, hR, el, wt, nPD, nPR, nPT, tD, tErnS, gP, tDS, dPl, nSC, resultP, inc, mnt, ars, tAr, nWP;

    /**
     * Creates new form prEmployee
     */
    public prSalary() {
        initComponents();
        setIconImage((new ImageIcon(getClass().getResource("/Pictures/wallet_64.png")).getImage()));
        txtCUser.setVisible(false);
        txtSearchStatus.setText(null);
    }

    public void autoGen() {
        try {
            Statement s = (Statement) PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(idSalary) FROM salary");
            while (rs.next()) {
                ID1 = rs.getInt("MAX(idSalary)");
                ID1++;
            }
//            txtEmployeeID.setText(ID1 + "");
//            Save.setEnabled(true);
//            Edit.setEnabled(false);
//            Delete.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void autoGTime() {
        try {
            Calendar cal1 = new GregorianCalendar();
            int second = cal1.get(Calendar.SECOND);
            int min = cal1.get(Calendar.MINUTE);
            int hour = cal1.get(Calendar.HOUR);

            int year = cal1.get(Calendar.YEAR);
            int month = cal1.get(Calendar.MONTH);
            int date1 = cal1.get(Calendar.DAY_OF_MONTH);
//            txtGDate.setText(year + "-" + (month + 1) + "-" + date1);
//            txtGTime.setText(hour + ":" + min + ":" + second);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void autoDate() {
        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM salary WHERE idEmployee='" + txtEmployeeNo.getText() + "'");
            if (rs.last()) {
                lMS = rs.getString("month");
                SimpleDateFormat dt = new SimpleDateFormat("yyyy MMMMM");
                Date d = dt.parse(lMS);
                Calendar cale = Calendar.getInstance();
                cale.setTime(d);
                cale.add(Calendar.MONTH, 1); // minus number would decrement the days
                txtMonth.setText(dt.format(cale.getTime()));
            } else {
                Date d = new Date();
                SimpleDateFormat cDate = new SimpleDateFormat("yyyy MMMMM");
                s2 = cDate.format(d);
                txtMonth.setText(s2);
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
                    dPl = rsDB1.getDouble("percentage");
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
                ResultSet rs = s.executeQuery("SELECT sCat FROM designation WHERE idDesignation='" + txtDID.getText() + "'");
//            while (rs.next()) {
                if (rs.next()) {
                    DsgT = rs.getString("sCat");
                    if (DsgT.equals("Special")) {
                        bS = Double.parseDouble(txtBSalary.getText());
                        vDB = 1;
                        autoLoadSS();
                        txtCLiving.setText(dPl + "");
                        vDB = 2;
                        autoLoadSS();
                        txtAllowanceP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtAllowance.setText(resultP + "");
                        vDB = 3;
                        autoLoadSS();
                        txtSAllowance.setText(dPl + "");
                        txtSAllowance.setEditable(true);
                        vDB = 4;
                        autoLoadSS();
                        txtFuelP.setText(dPl + "%");
                        txtFuel.setEditable(true);
                        vDB = 5;
                        autoLoadSS();
                        txtLAllowanceP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtLAllowance.setText(resultP + "");
                        vDB = 6;
                        autoLoadSS();
                        txtLAN.setText(dPl + "");
                        txtLAN.setEditable(true);
                        vDB = 7;
                        autoLoadSS();
                        txtTelephone.setText(dPl + "");
                        txtTelephone.setEditable(true);
                        vDB = 8;
                        autoLoadSS();
                        txtStamp.setText(dPl + "");
                        vDB = 9;
                        autoLoadSS();
                        txtUnion.setText(dPl + "");
                        vDB = 10;
                        autoLoadSS();
                        txtWelfare.setText(dPl + "");
                        vDB = 11;
                        autoLoadSS();
                        txtWOPP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtWOP.setText(resultP + "");
                        vDB = 12;
                        autoLoadSS();
                        txtAgrahara.setText(dPl + "");
                        vDB = 13;
                        autoLoadSS();
                        txtTaxP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtTax.setText(resultP + "");
                        vDB = 14;
                        autoLoadSS();
                        txtSClub.setText(dPl + "");
                    } else {
                        bS = Double.parseDouble(txtBSalary.getText());
                        vDB = 1;
                        autoLoadSS();
                        txtCLiving.setText(dPl + "");
                        vDB = 2;
                        autoLoadSS();
                        txtAllowanceP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtAllowance.setText(resultP + "");
                        vDB = 3;
                        autoLoadSS();
                        txtSAllowance.setText(dPl + "");
                        txtSAllowance.setEditable(true);
                        txtFuelP.setText(null);
                        txtLAllowanceP.setText(null);
//                        txtFuelP.setText(dPl + "%");
//                        txtLAllowanceP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtLAllowance.setText("0" + "");
                        txtLAllowance.setEditable(false);
                        txtLAN.setText("0" + "");
                        txtLAN.setEditable(false);
                        txtTelephone.setText("0" + "");
                        txtTelephone.setEditable(false);
                        vDB = 8;
                        autoLoadSS();
                        txtStamp.setText(dPl + "");
                        vDB = 9;
                        autoLoadSS();
                        txtUnion.setText(dPl + "");
                        vDB = 10;
                        autoLoadSS();
                        txtWelfare.setText(dPl + "");
                        vDB = 11;
                        autoLoadSS();
                        txtWOPP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtWOP.setText(resultP + "");
                        vDB = 12;
                        autoLoadSS();
                        txtAgrahara.setText(dPl + "");
                        vDB = 13;
                        autoLoadSS();
                        txtTaxP.setText(dPl + "%");
                        resultP = bS * dPl / 100;
                        txtTax.setText(resultP + "");
                        vDB = 14;
                        autoLoadSS();
                        txtSClub.setText(dPl + "");
                    }
                }
//                bS = Double.parseDouble(txtBSalary.getText());
//                vDB = 1;
//                autoLoadSS();
//                txtCLiving.setText(dPl+"");
//                vDB = 2;
//                autoLoadSS();
//                txtAllowanceP.setText(dPl+"%");
//                resultP=bS*dPl/100;
//                txtAllowance.setText(resultP+"");
//                vDB = 3;
//                autoLoadSS();
//                txtSAllowance.setText(dPl+"");
//                vDB = 4;
//                autoLoadSS();
//                txtFuelP.setText(dPl+"%");
//                vDB = 5;
//                autoLoadSS();
//                txtLAllowanceP.setText(dPl+"%");
//                resultP=bS*dPl/100;
//                txtLAllowance.setText(resultP+"");
//                vDB = 6;
//                autoLoadSS();
//                txtLAN.setText(dPl+"");
//                vDB = 7;
//                autoLoadSS();
//                txtTelephone.setText(dPl+"");
//                vDB = 8;
//                autoLoadSS();
//                txtStamp.setText(dPl+"");
//                vDB = 9;
//                autoLoadSS();
//                txtUnion.setText(dPl+"");
//                vDB = 10;
//                autoLoadSS();
//                txtWelfare.setText(dPl+"");
//                vDB = 11;
//                autoLoadSS();
//                txtWOPP.setText(dPl+"%");
//                resultP=bS*dPl/100;
//                txtWOP.setText(resultP+"");
//                vDB = 12;
//                autoLoadSS();
//                txtAgrahara.setText(dPl+"");
//                vDB = 13;
//                autoLoadSS();
//                txtTaxP.setText(dPl+"%");
//                resultP=bS*dPl/100;
//                txtTax.setText(resultP+"");
//                vDB = 14;
//                autoLoadSS();
//                txtSClub.setText(dPl+"");
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cal() {
        try {
//            bS = Double.parseDouble(txtBSalary.getText());
            cL = Double.parseDouble(txtCLiving.getText());
            al = Double.parseDouble(txtAllowance.getText());
            sA = Double.parseDouble(txtSAllowance.getText());
            fl = Double.parseDouble(txtFuel.getText());
            lA = Double.parseDouble(txtLAllowance.getText());
            ln = Double.parseDouble(txtLAN.getText());
            tl = Double.parseDouble(txtTelephone.getText());
            tAr = Double.parseDouble(txtAreas.getText());

            st = Double.parseDouble(txtStamp.getText());
            un = Double.parseDouble(txtUnion.getText());
            wl = Double.parseDouble(txtWelfare.getText());
            fs = Double.parseDouble(txtFestival.getText());
            wp = Double.parseDouble(txtWOP.getText());
            ag = Double.parseDouble(txtAgrahara.getText());
            tx = Double.parseDouble(txtTax.getText());
            sC = Double.parseDouble(txtSClub.getText());
            lN = Double.parseDouble(txtLoan.getText());
            hR = Double.parseDouble(txtHRent.getText());
            el = Double.parseDouble(txtElectricity.getText());
            wt = Double.parseDouble(txtWater.getText());
            nPD = Double.parseDouble(txtNPDays.getText());
            nPR = Double.parseDouble(txtNPRate.getText());
            tErn = (double) (bS + cL + al + sA + tAr);
            txtTotalE.setText(String.valueOf(tErn) + "0");
            txtTESummary.setText(String.valueOf(tErn) + "0");
            gP = (double) (fl + lA + ln + tl + tErn);
            txtGrossPay.setText(String.valueOf(gP) + "0");
            nPT = (double) (nPD * nPR);
            txtNPTotal.setText(String.valueOf(nPT) + "0");
            tD = (double) (st + un + wl + fs + wp + ag + tx + sC + lN + hR + el + wt + nPT);
            txtTotalDeduction.setText(String.valueOf(tD) + "0");
            txtTDSummary.setText(String.valueOf(tD) + "0");
            nPay = (double) (gP - tD);
            txtNetPay.setText(String.valueOf(nPay) + "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            txtNPRate.setText("0");
            txtNPTotal.setText("0");
            txtIncrement.setText("0");
            txtMonthA.setText("0");
            txtMonthAS.setText("");
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
        txtMonth = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JLabel();
        txtBank = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEName = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
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
        txtAllowanceP = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtIncrement = new javax.swing.JTextField();
        txtMonthA = new javax.swing.JTextField();
        txtAreas = new javax.swing.JTextField();
        txtMonthAS = new javax.swing.JLabel();
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
        txtLAllowanceP = new javax.swing.JLabel();
        txtFuelP = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        txtNPRate = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtNPTotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTotalDeduction = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtWOP = new javax.swing.JTextField();
        txtWOPP = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        txtTaxP = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtSClub = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtLoan = new javax.swing.JTextField();
        txtCUser = new javax.swing.JLabel();
        txtDID = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtTESummary = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtGrossPay = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTDSummary = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtNetPay = new javax.swing.JTextField();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Salary - Payroll System");
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Employee No     :");

        txtEmployeeNo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEmployeeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNoActionPerformed(evt);
            }
        });

        txtMonth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMonth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtMonth.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Account No            :");

        txtAccountNo.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtAccountNo.setBorder(new javax.swing.border.MatteBorder(null));

        txtBank.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtBank.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Employee Name   :");

        txtEName.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        txtEName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEName.setBorder(new javax.swing.border.MatteBorder(null));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/search_16.png"))); // NOI18N
        Search.setBorderPainted(false);
        Search.setContentAreaFilled(false);
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearchStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        txtAllowanceP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtAllowanceP.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Areas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel33.setText("Increment");

        jLabel34.setText("Month");

        jLabel35.setText("Areas");

        txtIncrement.setEditable(false);
        txtIncrement.setText("0");

        txtMonthA.setText("0");
        txtMonthA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMonthAKeyReleased(evt);
            }
        });

        txtAreas.setEditable(false);
        txtAreas.setText("0");

        txtMonthAS.setBorder(new javax.swing.border.MatteBorder(null));

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
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAreas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txtIncrement, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonthA, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonthAS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtMonthA, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonthAS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabel28.setText("Special Allowance");

        txtSAllowance.setText("0");
        txtSAllowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSAllowanceKeyReleased(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel29.setText("Telephone");

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

        txtFuel.setText("0");
        txtFuel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFuelKeyReleased(evt);
            }
        });

        jLabel32.setText("LAN/RETAT");

        txtLAN.setText("0");
        txtLAN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLANKeyReleased(evt);
            }
        });

        txtLAllowanceP.setBorder(new javax.swing.border.MatteBorder(null));

        txtFuelP.setBorder(new javax.swing.border.MatteBorder(null));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLAllowanceP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuelP, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtLAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLAllowanceP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuelP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalE, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSAllowance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtCLiving, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAllowance, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAllowanceP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAllowanceP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        txtWater.setText("0");
        txtWater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWaterKeyReleased(evt);
            }
        });

        txtHRent.setText("0");
        txtHRent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHRentKeyReleased(evt);
            }
        });

        jLabel14.setText("Electricity");

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
                .addComponent(txtElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHRent, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtElectricity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWater, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NoPay Deduction Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jLabel15.setText("No Pay Days");

        txtNPDays.setText("0");
        txtNPDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNPDaysKeyReleased(evt);
            }
        });

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("No Pay Rate");

        txtNPRate.setText("0");
        txtNPRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNPRateKeyReleased(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
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
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNPDays)
                    .addComponent(txtNPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNPRate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNPDays, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNPRate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNPTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        txtWOPP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtWOPP.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel25.setText("Tax");

        txtTax.setText("0");
        txtTax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTaxKeyReleased(evt);
            }
        });

        txtTaxP.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Sports Club");

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

        txtDID.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotalDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTaxP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUnion)
                                    .addComponent(txtFestival, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtWOP, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(txtSClub))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWOPP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtWOP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWOPP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTaxP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSClub, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalDeduction, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtDID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCUser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel19.setText("Total Earnings");

        txtTESummary.setEditable(false);
        txtTESummary.setText("0");

        jLabel20.setText("Gross Pay");

        txtGrossPay.setText("0");

        jLabel21.setText("Total Deduction");

        txtTDSummary.setEditable(false);
        txtTDSummary.setText("0");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Net Pay");

        txtNetPay.setEditable(false);
        txtNetPay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNetPay.setText("0");

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Save.png"))); // NOI18N
        Save.setBorderPainted(false);
        Save.setContentAreaFilled(false);
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTDSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTESummary, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNetPay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGrossPay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(0, 20, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(869, 769));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        try {
            autoGen();
            autoGTime();
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsU = s.executeQuery("select idSUser from suser where userName='" + txtCUser.getText() + "'");
            if (rsU.next()) {
                idU = rsU.getInt("idSUser");
            }
            s.executeUpdate("INSERT INTO salary VALUES('" + ID1 + "','" + txtMonth.getText() + "','" + txtBSalary.getText() + "','" + txtAllowance.getText() + "','" + txtCLiving.getText() + "','" + txtSAllowance.getText() + "','" + txtTelephone.getText() + "','" + txtLAllowance.getText() + "','" + txtFuel.getText() + "','" + txtLAN.getText() + "','" + txtAreas.getText() + "','" + txtStamp.getText() + "','" + txtUnion.getText() + "','" + txtWelfare.getText() + "','" + txtFestival.getText() + "','" + txtAgrahara.getText() + "','" + txtWOP.getText() + "','" + txtTax.getText() + "','" + txtSClub.getText() + "','" + txtLoan.getText() + "','" + txtHRent.getText() + "','" + txtElectricity.getText() + "','" + txtWater.getText() + "','" + txtNPDays.getText() + "','" + txtNPTotal.getText() + "','" + txtTESummary.getText() + "','" + txtGrossPay.getText() + "','" + txtTDSummary.getText() + "','" + txtNetPay.getText() + "','" + txtEmployeeNo.getText() + "','" + idU + "')");
//            s.executeUpdate("UPDATE loan SET tPaid='" + txtPassword.getText() + "' WHERE idEmplo='" + txtSUID.getText() + "'");
//                    Save.setEnabled(true);
                    File foi = new File(new File("").getAbsolutePath() + "/iReports");
            String reportSource = foi.getAbsolutePath() + "/" + "prSalarySlip.jrxml";
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("month", "Pay Slip for the month of "+txtMonth.getText());
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
            File foo = new File(new File("").getAbsolutePath() + "/Documents");
            JasperExportManager.exportReportToPdfFile(jasperPrint, foo.getAbsolutePath() + "/" + txtEmployeeNo.getText() + txtMonth.getText() + ".pdf");
            JasperPrintManager.printReport(jasperPrint, true);
            JOptionPane.showMessageDialog(null, "New Salary Set Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Saved1.png")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        try {
            clear();
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT*FROM employee WHERE idEmployee='" + txtEmployeeNo.getText() + "'");
//            while (rs.next()) {
            if (rs.next()) {
                txtEName.setText(rs.getString("name"));
                txtAccountNo.setText(rs.getString("acntNo"));
                txtBank.setText(rs.getString("bank"));
                idDsg = rs.getInt("idDesignation");
                txtDID.setText(String.valueOf(idDsg));
                txtSearchStatus.setText(null);
//                salaryP();
//            }
                ResultSet rsBS = s.executeQuery("SELECT*FROM designation WHERE idDesignation='" + idDsg + "'");
                while (rsBS.next()) {
                    txtBSalary.setText(rsBS.getString("bSalary"));
//                salaryP();
//                txtAccountNo.setText(rsBS.getString("acntNo"));
//                txtBank.setText(rsBS.getString("bank"));
                }
                ResultSet rsL = s.executeQuery("SELECT*FROM loan WHERE idEmployee='" + txtEmployeeNo.getText() + "' && status='" + "Active" + "'");
                while (rsL.next()) {
                    if (rsL.getString("bank").equals("FestivalAdvance")) {
                        txtFestival.setText(rsL.getString("mInstalment"));
//                txtLoan.setText("0");
                    } else {
                        txtLoan.setText(rsL.getString("mInstalment"));
//                txtFestival.setText("0");
                    }
                }
//                }else{
//                txtLoan.setText("0");
//                txtFestival.setText("0");
//            }
                ResultSet rsA = s.executeQuery("SELECT*FROM areas WHERE idEmployee='" + txtEmployeeNo.getText() + "'");
                if (rsA.next()) {
                    txtIncrement.setText(rsA.getString("increment"));
                    txtMonthAS.setText(rsA.getString("month"));
                }
                autoDate();
                salaryP();
            } else {
                txtSearchStatus.setText("Not Found ! Please check this EmployeeNo !");
                txtSearchStatus.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void txtBSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBSalaryKeyReleased

        cal();
    }//GEN-LAST:event_txtBSalaryKeyReleased

    private void txtAllowanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAllowanceKeyReleased

        cal();
    }//GEN-LAST:event_txtAllowanceKeyReleased

    private void txtCLivingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCLivingKeyReleased

        cal();
    }//GEN-LAST:event_txtCLivingKeyReleased

    private void txtStampKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStampKeyReleased

        cal();
    }//GEN-LAST:event_txtStampKeyReleased

    private void txtUnionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnionKeyReleased

        cal();
    }//GEN-LAST:event_txtUnionKeyReleased

    private void txtWelfareKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWelfareKeyReleased

        try {
            if (txtWelfare.getText().isEmpty()) {
                txtWelfare.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtWelfareKeyReleased

    private void txtFestivalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFestivalKeyReleased

        cal();
    }//GEN-LAST:event_txtFestivalKeyReleased

    private void txtAgraharaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgraharaKeyReleased

        cal();
    }//GEN-LAST:event_txtAgraharaKeyReleased

    private void txtHRentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHRentKeyReleased

        try {
            if (txtHRent.getText().isEmpty()) {
                txtHRent.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtHRentKeyReleased

    private void txtElectricityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtElectricityKeyReleased

        try {
            if (txtElectricity.getText().isEmpty()) {
                txtElectricity.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtElectricityKeyReleased

    private void txtWaterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWaterKeyReleased

        try {
            if (txtWater.getText().isEmpty()) {
                txtWater.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtWaterKeyReleased

    private void txtNPDaysKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPDaysKeyReleased

        try {
            if (txtNPDays.getText().isEmpty()) {
                txtNPDays.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtNPDaysKeyReleased

    private void txtNPRateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNPRateKeyReleased

        try {
            if (txtNPRate.getText().isEmpty()) {
                txtNPRate.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtNPRateKeyReleased

    private void txtWOPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWOPKeyReleased

        cal();
    }//GEN-LAST:event_txtWOPKeyReleased

    private void txtEmployeeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNoActionPerformed

        Search.doClick();
    }//GEN-LAST:event_txtEmployeeNoActionPerformed

    private void txtTaxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaxKeyReleased

        cal();
    }//GEN-LAST:event_txtTaxKeyReleased

    private void txtSClubKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSClubKeyReleased

        try {
            if (txtSClub.getText().isEmpty()) {
                txtSClub.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSClubKeyReleased

    private void txtLoanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoanKeyReleased

        cal();
    }//GEN-LAST:event_txtLoanKeyReleased

    private void txtSAllowanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSAllowanceKeyReleased

        try {
            if (txtSAllowance.getText().isEmpty()) {
                txtSAllowance.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSAllowanceKeyReleased

    private void txtTelephoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyReleased

        try {
            if (txtTelephone.getText().isEmpty()) {
                txtTelephone.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtTelephoneKeyReleased

    private void txtLANKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLANKeyReleased

        try {
            if (txtLAN.getText().isEmpty()) {
                txtLAN.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtLANKeyReleased

    private void txtMonthAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonthAKeyReleased

        try {
            if (txtMonthA.getText().isEmpty()) {
                txtMonthA.setText("0");
                inc = Double.parseDouble(txtIncrement.getText());
                mnt = Double.parseDouble(txtMonthA.getText());
                ars = (inc * mnt) + (inc * mnt * 20 / 100);
                txtAreas.setText(String.valueOf(ars));
                bS = Double.parseDouble(txtBSalary.getText());
                vDB = 11;
                autoLoadSS();
                resultP = bS * dPl / 100;
                nWP = (inc * mnt * dPl / 100) + resultP;
                txtWOP.setText(nWP + "");
                cal();
            } else {
                inc = Double.parseDouble(txtIncrement.getText());
                mnt = Double.parseDouble(txtMonthA.getText());
                ars = (inc * mnt) + (inc * mnt * 20 / 100);
                txtAreas.setText(String.valueOf(ars));
                bS = Double.parseDouble(txtBSalary.getText());
                vDB = 11;
                autoLoadSS();
                resultP = bS * dPl / 100;
                nWP = (inc * mnt * dPl / 100) + resultP;
                txtWOP.setText(nWP + "");
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtMonthAKeyReleased

    private void txtFuelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFuelKeyReleased

        try {
            if (txtFuel.getText().isEmpty()) {
                txtFuel.setText("0");
                cal();
            } else {
                cal();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtFuelKeyReleased

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
            java.util.logging.Logger.getLogger(prSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JButton Search;
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
    private javax.swing.JLabel txtAllowanceP;
    private javax.swing.JTextField txtAreas;
    private javax.swing.JTextField txtBSalary;
    private javax.swing.JLabel txtBank;
    private javax.swing.JTextField txtCLiving;
    public static javax.swing.JLabel txtCUser;
    private javax.swing.JLabel txtDID;
    private javax.swing.JLabel txtEName;
    private javax.swing.JTextField txtElectricity;
    private javax.swing.JTextField txtEmployeeNo;
    private javax.swing.JTextField txtFestival;
    private javax.swing.JTextField txtFuel;
    private javax.swing.JLabel txtFuelP;
    private javax.swing.JTextField txtGrossPay;
    private javax.swing.JTextField txtHRent;
    private javax.swing.JTextField txtIncrement;
    private javax.swing.JTextField txtLAN;
    private javax.swing.JTextField txtLAllowance;
    private javax.swing.JLabel txtLAllowanceP;
    private javax.swing.JTextField txtLoan;
    private javax.swing.JLabel txtMonth;
    private javax.swing.JTextField txtMonthA;
    private javax.swing.JLabel txtMonthAS;
    private javax.swing.JTextField txtNPDays;
    private javax.swing.JTextField txtNPRate;
    private javax.swing.JTextField txtNPTotal;
    private javax.swing.JTextField txtNetPay;
    private javax.swing.JTextField txtSAllowance;
    private javax.swing.JTextField txtSClub;
    private javax.swing.JLabel txtSearchStatus;
    private javax.swing.JTextField txtStamp;
    private javax.swing.JTextField txtTDSummary;
    private javax.swing.JTextField txtTESummary;
    private javax.swing.JTextField txtTax;
    private javax.swing.JLabel txtTaxP;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtTotalDeduction;
    private javax.swing.JTextField txtTotalE;
    private javax.swing.JTextField txtUnion;
    private javax.swing.JTextField txtWOP;
    private javax.swing.JLabel txtWOPP;
    private javax.swing.JTextField txtWater;
    private javax.swing.JTextField txtWelfare;
    // End of variables declaration//GEN-END:variables
}
