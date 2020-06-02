/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.PRdb;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ACER
 */
public class prNewEmployee extends javax.swing.JFrame {

    String newpath;
    int ID1;
    double pS, pE;

    /**
     * Creates new form TMemployee
     */
    public prNewEmployee() {
        initComponents();
        setIconImage((new ImageIcon(getClass().getResource("/Pictures/wallet_64.png")).getImage()));
        setExtendedState(Frame.MAXIMIZED_BOTH);
        sPhoto.setIcon((new ImageIcon(getClass().getResource("/Pictures/unknown-person1.jpg"))));
        txtGDate.setVisible(false);
        txtGTime.setVisible(false);
        txtEmpID.setVisible(false);
        txtSUser.setVisible(false);
        txtETH.setVisible(false);
        txtSTH.setVisible(false);
        Save.setEnabled(true);
        Edit.setEnabled(false);
        Delete.setEnabled(false);
        autoGTime();
        autoGen();
    }

    public void autoGen() {
        try {
            Statement s = (Statement) PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT MAX(idEmployee) FROM employee");
            while (rs.next()) {
                ID1 = rs.getInt("MAX(idEmployee)");
                ID1++;
            }
            txtEmployeeID.setText(ID1 + "");
            txtJoinDate.setText(txtGDate.getText());
            Save.setEnabled(true);
            Edit.setEnabled(false);
            Delete.setEnabled(false);
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
            txtGDate.setText(year + "-" + (month + 1) + "-" + date1);
            txtGTime.setText(hour + ":" + min + ":" + second);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void autoCalAge() throws SQLException, Exception {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String s1 = sdf.format(d);
        String currentDate = s1;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date bDay = bDateChooser.getDate();
        try {
            Statement s = PRdb.getConnection().createStatement();
            Calendar cal1 = new GregorianCalendar();
            Calendar cal2 = new GregorianCalendar();
            int age = 0;
            int factor = 0;
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(dateFormat.format(bDay));
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(currentDate);
            cal1.setTime(date1);
            cal2.setTime(date2);
            if (cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {
                factor = -1;
            }
            age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;
            if (age >= 19) {
                txtAge.setText("Age : " + String.valueOf(age) + " Years");
            } else {
                txtAge.setText("Age : " + String.valueOf(age) + " Years");
            }
        } catch (ParseException e) {
            System.out.println(e);
        }
    }

    public void emailvali(String Email) {
        Pattern p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z]{2,}){1}$)");
        Matcher m = p.matcher(txtEmail.getText());
        boolean b = m.matches();
        if (b == true) {
            txtEmail.setForeground(Color.black);
        } else {
            txtEmail.setForeground(Color.red);
        }
    }

    public void digitValidation(java.awt.event.KeyEvent evt) {
        try {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
            } else {
                evt.consume();
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

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        Browse = new javax.swing.JButton();
        txtEmployeeID = new javax.swing.JTextField();
        txtEName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MaleRadioButton = new javax.swing.JRadioButton();
        FemaleRadioButton = new javax.swing.JRadioButton();
        txtNIC = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPAddress = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTAddress = new javax.swing.JTextField();
        bDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBank = new javax.swing.JTextField();
        txtAccountNo = new javax.swing.JTextField();
        sPhoto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        txtSearchStatus = new javax.swing.JLabel();
        txtEmpID = new javax.swing.JLabel();
        txtETH = new javax.swing.JLabel();
        txtSTH = new javax.swing.JLabel();
        txtGDate = new javax.swing.JLabel();
        txtGTime = new javax.swing.JLabel();
        txtSUser = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        EDesignationComboBox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtJoinDate = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        AppoinmentDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtODetails = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Registration - Payroll System");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N

        Browse.setText("Browse");
        Browse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        jLabel1.setText("Employee Name");

        jLabel2.setText("Date of Birth");

        jLabel3.setText("Gender");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("NIC");

        jLabel5.setText("Permanent Address");

        jLabel6.setText("Mobile");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telephone");

        jLabel8.setText("Email");

        buttonGroup1.add(MaleRadioButton);
        MaleRadioButton.setText("Male");
        MaleRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleRadioButtonActionPerformed(evt);
            }
        });

        txtNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNICKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("v");

        txtMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyTyped(evt);
            }
        });

        txtTelephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelephoneKeyTyped(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtAge.setEditable(false);
        txtAge.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel13.setText("Employee No");

        jLabel11.setText("Temporary Address");

        jLabel16.setText("Bank");

        jLabel17.setText("Account no");

        sPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(txtEName)
                    .addComponent(txtPAddress)
                    .addComponent(txtTAddress)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBank)
                            .addComponent(txtAccountNo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(bDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FemaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBank, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee No", "Employee Name", "Designation"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EmployeeTableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(EmployeeTable);

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search Employee No");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        txtSearchStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSearchStatus.setBorder(new javax.swing.border.MatteBorder(null));

        txtEmpID.setBorder(new javax.swing.border.MatteBorder(null));

        txtETH.setBorder(new javax.swing.border.MatteBorder(null));

        txtSTH.setBorder(new javax.swing.border.MatteBorder(null));

        txtGDate.setBorder(new javax.swing.border.MatteBorder(null));

        txtGTime.setBorder(new javax.swing.border.MatteBorder(null));

        txtSUser.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtSUser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtETH, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSTH, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGDate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGTime, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSUser, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtETH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSTH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Designation");

        EDesignationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Designation" }));
        EDesignationComboBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                EDesignationComboBoxAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel15.setText("Join Date");

        txtJoinDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Save.setText("Save");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jLabel10.setText("Appoinment Date");

        jLabel12.setText("Other Details");

        txtODetails.setColumns(20);
        txtODetails.setRows(5);
        jScrollPane1.setViewportView(txtODetails);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtJoinDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(AppoinmentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EDesignationComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EDesignationComboBox)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(txtJoinDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AppoinmentDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1090, 778));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed

        try {
            jFileChooser1.showOpenDialog(this);
            File f = jFileChooser1.getSelectedFile();
            writeImage(ImageIO.read(f));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void MaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleRadioButtonActionPerformed

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date bDate = bDateChooser.getDate();
            DateFormat dateFormat1 = new SimpleDateFormat("yy");
            String s2 = sdf.format(bDate);
            String bD = s2;
            try {
                Calendar cal1 = new GregorianCalendar();
                Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(bD);
                cal1.setTime(date3);
//                txtNIC.setText(dateFormat1.format(bDate) + cal1.get(Calendar.DAY_OF_YEAR));
                txtNIC.setText(dateFormat1.format(bDate));
                txtNIC.grabFocus();
                autoCalAge();
            } catch (ParseException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_MaleRadioButtonActionPerformed

    private void FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleRadioButtonActionPerformed

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            Date bDate = bDateChooser.getDate();
            DateFormat dateFormat1 = new SimpleDateFormat("yy");
            String s2 = sdf.format(bDate);
            String bD = s2;
            try {
                Calendar cal1 = new GregorianCalendar();
                Date date3 = new SimpleDateFormat("yyyy-MM-dd").parse(bD);
                cal1.setTime(date3);
                int a = cal1.get(Calendar.DAY_OF_YEAR);
                int result;
                result = (500 + a);
//                txtNIC.setText(dateFormat1.format(bDate) + result);
                txtNIC.setText(dateFormat1.format(bDate));
                txtNIC.grabFocus();
                autoCalAge();
            } catch (ParseException e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_FemaleRadioButtonActionPerformed

    private void txtNICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNICKeyTyped

        try {
            char c = evt.getKeyChar();
            if (Character.isDigit(c)) {
                if (txtNIC.getCaretPosition() < 9) {
                    txtNIC.setForeground(Color.red);
                    if (txtNIC.getCaretPosition() == 8) {
                        txtNIC.setForeground(Color.black);
                    } else {
                    }
                } else if (txtNIC.getCaretPosition() < 9) {
                } else {
                    evt.consume();
                }
            } else {
                evt.consume();
                if (Character.isLetter(c)) {
                } else {
                    txtNIC.setForeground(Color.red);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtNICKeyTyped

    private void txtMobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyTyped

        try {
            digitValidation(evt);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtMobileNoKeyTyped

    private void txtTelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelephoneKeyTyped

        try {
            digitValidation(evt);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtTelephoneKeyTyped

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        //        Next.doClick();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased

        emailvali(txtEmail.getText());
    }//GEN-LAST:event_txtEmailKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

        try {
            int idDsg = 0;
            String gender;
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String bDate = sdf1.format(bDateChooser.getDate());
            String aDate = sdf1.format(AppoinmentDateChooser.getDate());
            if (MaleRadioButton.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsDsg = s.executeQuery("select idDesignation from designation where dName='" + EDesignationComboBox.getSelectedItem() + "'");
            if (rsDsg.next()) {
                idDsg = rsDsg.getInt("idDesignation");
            }
            ResultSet rs = s.executeQuery("SELECT*FROM employee WHERE name LIKE '%" + txtEName.getText() + "%'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "This EmployeeName is already exists.", null, 0, new ImageIcon(getClass().getResource("/Pictures/Warning.png")));
                txtEName.setForeground(Color.red);
                txtEName.grabFocus();
            } else {
                Pattern p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z]{2,}){1}$)");
                Matcher m = p.matcher(txtEmail.getText());
                boolean b = m.matches();
                if (b == true) {
//                    autoGen();
                    autoGTime();
                    s.executeUpdate("INSERT INTO employee VALUES('" + txtEmployeeID.getText() + "','" + txtEName.getText() + "','" + bDate + "','" + gender + "','" + txtNIC.getText() + "v" + "','" + txtPAddress.getText() + "','" + txtTAddress.getText() + "','" + txtMobileNo.getText() + "','" + txtTelephone.getText() + "','" + txtEmail.getText() + "','" + txtAccountNo.getText() + "','" + txtBank.getText() + "','" + txtJoinDate.getText() + "','"+aDate+"','"+txtODetails.getText()+"','" + idDsg + "')");
//                    Save.setEnabled(true);
                    JOptionPane.showMessageDialog(null, "Registration Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Saved1.png")));
                    EmployeeTableAncestorAdded(null);
                    Clear.doClick();
//                    ResultSet rsCP = s.executeQuery("SELECT*FROM employee");
//                    if(txtSUser.getText().equals("DefaultUser")){
////                        new TMpEdit().setVisible(true);
////                        TMpEdit.txtUName.setText(txtEName.getText());
////                        TMpEdit.txtCSUser.setText(txtSUser.getText());
//                        this.dispose();
//                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalied Email Address  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/WrongEmail1.png")));
                    txtEmail.setText(null);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed

        try {
            int idDsg = 0;
            String gender;
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            String bDate = sdf1.format(bDateChooser.getDate());
            String aDate = sdf1.format(AppoinmentDateChooser.getDate());
            if (MaleRadioButton.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsDsg = s.executeQuery("select idDesignation from designation where dName='" + EDesignationComboBox.getSelectedItem() + "'");
            if (rsDsg.next()) {
                idDsg = rsDsg.getInt("idDesignation");
            }
            Pattern p = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z]{2,}){1}$)");
            Matcher m = p.matcher(txtEmail.getText());
            boolean b = m.matches();
            if (b == true) {
                s.executeUpdate("UPDATE employee SET name='" + txtEName.getText() + "',bDate='" + bDate + "',gender='" + gender + "',nic='" + txtNIC.getText() + "v" + "',pAddress='" + txtPAddress.getText() + "',tAddress='" + txtTAddress.getText() + "',mobile='" + txtMobileNo.getText() + "',telephone='" + txtTelephone.getText() + "',email='" + txtEmail.getText() + "', acntNo='" + txtAccountNo.getText() + "', bank='" + txtBank.getText() + "', idDesignation='" + idDsg + "', aDate='"+aDate+"', oDetails='"+txtODetails.getText()+"' WHERE idEmployee='" + txtEmployeeID.getText() + "'");
                JOptionPane.showMessageDialog(null, "Update Successfully  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/Updated1.png")));
                EmployeeTableAncestorAdded(null);
                Clear.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "Invalied Email Address  !", null, 0, new ImageIcon(getClass().getResource("/Pictures/WrongEmail1.png")));
                txtEmail.setText(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EditActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed

        EmployeeTableAncestorAdded(null);
        EDesignationComboBoxAncestorAdded(null);
        sPhoto.setIcon((new ImageIcon(getClass().getResource("/Pictures/unknown-person1.jpg"))));
        txtEName.setText(null);
        bDateChooser.setDate(null);
        txtAge.setText(null);
        txtNIC.setText(null);
        txtPAddress.setText(null);
        txtTAddress.setText(null);
        txtMobileNo.setText(null);
        txtTelephone.setText(null);
        txtEmail.setText(null);
        txtBank.setText(null);
        txtAccountNo.setText(null);
        txtJoinDate.setText(null);
        jLabel14.setText("v");
        autoGen();
        Save.setEnabled(true);
        Edit.setEnabled(false);
        Delete.setEnabled(false);
    }//GEN-LAST:event_ClearActionPerformed

    private void EDesignationComboBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EDesignationComboBoxAncestorAdded

        try {
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rs = s.executeQuery("SELECT dName FROM designation");
            Vector v = new Vector();
            while (rs.next()) {
                EDesignationComboBox.addItem(rs.getString("dName"));
                v.add(rs.getString(("dName")));
            }
            EDesignationComboBox.setModel(new DefaultComboBoxModel(v));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EDesignationComboBoxAncestorAdded

    private void EmployeeTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_EmployeeTableAncestorAdded

        try {
            DefaultTableModel dtm = (DefaultTableModel) EmployeeTable.getModel();
            dtm.setRowCount(0);
            Statement s = PRdb.getConnection().createStatement();
            ResultSet rsSTL = s.executeQuery("SELECT e.`idEmployee`,e.`name`,d.`dName` FROM employee e,designation d WHERE e.`idDesignation`=d.`idDesignation`");
            while (rsSTL.next()) {
                Vector v = new Vector();
                v.add(rsSTL.getString("idEmployee"));
                v.add(rsSTL.getString("name"));
                v.add(rsSTL.getString("dName"));
                dtm.addRow(v);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EmployeeTableAncestorAdded

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked

        try {
            String Gender;
            Statement s = PRdb.getConnection().createStatement();
            int i = EmployeeTable.getSelectedRow();
            String empID = (String) EmployeeTable.getValueAt(i, 0);
            String eName = (String) EmployeeTable.getValueAt(i, 1);
            String dsg = (String) EmployeeTable.getValueAt(i, 2);
            txtEmployeeID.setText(empID);
            txtEName.setText(eName);
            EDesignationComboBox.setSelectedItem(dsg);
            ResultSet rs = s.executeQuery("SELECT * FROM employee WHERE idEmployee='" + empID + "'");
            if (rs.next()) {
                Gender = rs.getString("gender");
                if (Gender.equals("Male")) {
                    MaleRadioButton.setSelected(true);
                } else {
                    FemaleRadioButton.setSelected(true);
                }
                bDateChooser.setDate(rs.getDate("bDate"));
                txtNIC.setText(rs.getString("nic"));
                txtPAddress.setText(rs.getString("pAddress"));
                txtTAddress.setText(rs.getString("tAddress"));
                txtMobileNo.setText(rs.getString("mobile"));
                txtTelephone.setText(rs.getString("telephone"));
                txtEmail.setText(rs.getString("email"));
                txtAccountNo.setText(rs.getString("acntNo"));
                txtBank.setText(rs.getString("bank"));
                txtJoinDate.setText(rs.getString("jDate"));
                AppoinmentDateChooser.setDate(rs.getDate("aDate"));
                txtODetails.setText(rs.getString("oDetails"));
                displayImage(empID);
                autoCalAge();
                jLabel14.setText(null);
            }
            Save.setEnabled(false);
            Edit.setEnabled(true);
            Delete.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        try {
            DefaultTableModel dtm = (DefaultTableModel) EmployeeTable.getModel();
            if (!txtSearch.getText().isEmpty()) {
                Statement s = PRdb.getConnection().createStatement();
                ResultSet rs = s.executeQuery("SELECT e.`idEmployee`,e.`name`,d.`dName` FROM employee e,designation d WHERE e.`idDesignation`=d.`idDesignation` && e.idEmployee LIKE '%" + txtSearch.getText() + "%'");
//                ResultSet rs = s.executeQuery("SELECT*FROM employee WHERE idEmployee LIKE '%" + txtSearch.getText() + "%'");
                dtm.setRowCount(0);
                while (rs.next()) {
                    Vector v = new Vector();
                    v.add(rs.getString("idEmployee"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("dName"));
                    dtm.addRow(v);
                    txtSearchStatus.setForeground(Color.black);
                    txtSearchStatus.setText(String.valueOf(EmployeeTable.getRowCount()) + " Result");
                }
                if (dtm.getRowCount() <= 0) {
                    txtSearchStatus.setText("Not Found");
                    txtSearchStatus.setForeground(Color.red);
                    EmployeeTableAncestorAdded(null);
                }
            } else {
                EmployeeTableAncestorAdded(null);
                txtSearchStatus.setText(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed

        try {
            Statement s = PRdb.getConnection().createStatement();
            s.executeUpdate("DELETE FROM employee WHERE idEmployee='" + txtEmployeeID.getText() + "'");
            EmployeeTableAncestorAdded(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained

        if ("Search Employee No".equals(txtSearch.getText())) {
            txtSearch.setText("");
            txtSearch.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost

        if ("".equals(txtSearch.getText())) {
            txtSearch.setText("Search Employee No");
            txtSearch.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtSearchFocusLost

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
            java.util.logging.Logger.getLogger(prNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prNewEmployee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AppoinmentDateChooser;
    private javax.swing.JButton Browse;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JComboBox EDesignationComboBox;
    public static javax.swing.JButton Edit;
    private javax.swing.JTable EmployeeTable;
    public static javax.swing.JRadioButton FemaleRadioButton;
    public static javax.swing.JRadioButton MaleRadioButton;
    public static javax.swing.JButton Save;
    private com.toedter.calendar.JDateChooser bDateChooser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JLabel sPhoto;
    private javax.swing.JTextField txtAccountNo;
    public static javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBank;
    public static javax.swing.JTextField txtEName;
    private javax.swing.JLabel txtETH;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JLabel txtEmpID;
    public static javax.swing.JTextField txtEmployeeID;
    private javax.swing.JLabel txtGDate;
    private javax.swing.JLabel txtGTime;
    private javax.swing.JLabel txtJoinDate;
    public static javax.swing.JTextField txtMobileNo;
    public static javax.swing.JTextField txtNIC;
    private javax.swing.JTextArea txtODetails;
    public static javax.swing.JTextField txtPAddress;
    private javax.swing.JLabel txtSTH;
    public static javax.swing.JLabel txtSUser;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtSearchStatus;
    public static javax.swing.JTextField txtTAddress;
    public static javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables

    private void writeImage(BufferedImage imgg) throws Exception {
        File f = new File(new File("").getAbsolutePath() + "/Photos\\EmployeePhotos");
        f = new File(f.getAbsolutePath() + "/" + txtEmployeeID.getText() + ".jpg");
        System.out.println("" + f.getAbsolutePath());
        ImageIO.write(imgg, "jpg", f);
        displayImage(f);
    }

    public static void displayImage(File f) throws Exception {
        Image img = ImageIO.read(f);
        img = img.getScaledInstance(sPhoto.getWidth(), sPhoto.getHeight(), Image.SCALE_SMOOTH);
        sPhoto.setIcon(new ImageIcon(img));
    }

    public static void displayImage(String ID) throws Exception {
        File f = new File(new File("").getAbsolutePath() + "/Photos\\EmployeePhotos");
        f = new File(f.getAbsolutePath() + "/" + ID + ".jpg");
        if (f.exists()) {
            Image img = ImageIO.read(f);
            img = img.getScaledInstance(sPhoto.getWidth(), sPhoto.getHeight(), Image.SCALE_SMOOTH);
            sPhoto.setIcon(new ImageIcon(img));
        } else {
            sPhoto.setIcon((new ImageIcon("src/Pictures/unknown-person1.jpg")));
        }
    }
}
