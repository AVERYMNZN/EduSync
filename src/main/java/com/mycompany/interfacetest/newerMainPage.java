/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfacetest;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.CardLayout;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class newerMainPage extends javax.swing.JFrame {
    
    Connection studentConn;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    CardLayout mainpageCardLayout;
    
    int studentAttendanceGrade;
    
    public newerMainPage() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("avery.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));
        FlatLightLaf.setup();
        
        studentConn = InterfaceTest.studentConn();
        
        initComponents();
        mainpageCardLayout = (CardLayout)(cardPanel.getLayout());
    }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        backgroundPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cardPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        studentsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsCardStudentsTable = new javax.swing.JTable();
        studentsCardStudentsSearchField = new javax.swing.JTextField();
        studentsCardSearchButton = new javax.swing.JButton();
        studentsCardSectionsCombobox = new javax.swing.JComboBox<>();
        fetchNewDataButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        roundedPanel1 = new CustomizedElements.RoundedPanel();
        studentsCardStudentsNameLabel = new javax.swing.JLabel();
        studentsCardStudentsNumberLabel = new javax.swing.JLabel();
        avatarBorder2 = new CustomizedElements.AvatarBorder();
        studentsCardStudentsSectionLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        studentsMonthlyAttendanceGauge = new CustomizedElements.GaugeChart();
        studentsOverallAttendanceGauge = new CustomizedElements.GaugeChart();
        jLabel1 = new javax.swing.JLabel();
        sidePanel = new CustomizedElements.GradientPanel();
        dashboardButtonLabel = new CustomizedElements.CustomizedButton();
        studentsButtonLabel = new CustomizedElements.CustomizedButton();
        sectionsButtonLabel = new CustomizedElements.CustomizedButton();
        attendanceButtonLabel = new CustomizedElements.CustomizedButton();
        avatarBorder1 = new CustomizedElements.AvatarBorder();

        jScrollPane1.setViewportView(jTextPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(35, 35, 48));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cardPanel.setLayout(new java.awt.CardLayout());

        dashboardPanel.setBackground(new java.awt.Color(35, 35, 48));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jButton1)
                .addGap(75, 75, 75)
                .addComponent(jButton2)
                .addContainerGap(601, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardPanelLayout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(208, 208, 208))
        );

        cardPanel.add(dashboardPanel, "dashboardCard");

        studentsPanel.setBackground(new java.awt.Color(35, 35, 48));

        studentsCardStudentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Student Number", "Grade Level"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    studentsCardStudentsTable.setGridColor(new java.awt.Color(35, 35, 48));
    studentsCardStudentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            studentsCardStudentsTableMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(studentsCardStudentsTable);
    studentsCardStudentsTable.getAccessibleContext().setAccessibleName("");

    studentsCardSearchButton.setText("Search");
    studentsCardSearchButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            studentsCardSearchButtonActionPerformed(evt);
        }
    });

    studentsCardSectionsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Section", "ICT 12 A", "ICT 12 B", "ICT 12 C", "ICT_12D" }));

    fetchNewDataButton.setText("Fetch Data");
    fetchNewDataButton.setToolTipText("");
    fetchNewDataButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            fetchNewDataButtonActionPerformed(evt);
        }
    });

    jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

    roundedPanel1.setBackground(new java.awt.Color(119, 119, 176));
    roundedPanel1.setRoundBottomLeft(55);
    roundedPanel1.setRoundBottomRight(55);
    roundedPanel1.setRoundTopLeft(55);
    roundedPanel1.setRoundTopRight(55);

    studentsCardStudentsNameLabel.setFont(new java.awt.Font("Comfortaa", 1, 20)); // NOI18N
    studentsCardStudentsNameLabel.setForeground(new java.awt.Color(51, 51, 51));
    studentsCardStudentsNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    studentsCardStudentsNameLabel.setText("Avery Manzon");

    studentsCardStudentsNumberLabel.setFont(new java.awt.Font("Comfortaa Light", 0, 14)); // NOI18N
    studentsCardStudentsNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
    studentsCardStudentsNumberLabel.setText("05-00-3542");

    avatarBorder2.setBorderSize(2);
    avatarBorder2.setBorderSpace(2);
    avatarBorder2.setGradientColor1(new java.awt.Color(0, 0, 0));
    avatarBorder2.setGradientColor2(new java.awt.Color(0, 0, 0));
    avatarBorder2.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/savesta.jpg"))); // NOI18N

    studentsCardStudentsSectionLabel.setFont(new java.awt.Font("Comfortaa Light", 0, 12)); // NOI18N
    studentsCardStudentsSectionLabel.setForeground(new java.awt.Color(51, 51, 51));
    studentsCardStudentsSectionLabel.setText("ICT-12D");

    jLabel4.setFont(new java.awt.Font("Comfortaa", 1, 13)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 0, 0));
    jLabel4.setText("Monthly Attendance");

    studentsMonthlyAttendanceGauge.setForeground(new java.awt.Color(51, 51, 51));
    studentsMonthlyAttendanceGauge.setColor1(new java.awt.Color(51, 51, 51));
    studentsMonthlyAttendanceGauge.setColor2(new java.awt.Color(78, 78, 186));
    studentsMonthlyAttendanceGauge.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    studentsMonthlyAttendanceGauge.setGaugeSize(10);
    studentsMonthlyAttendanceGauge.setValue(70);

    studentsOverallAttendanceGauge.setBackground(new java.awt.Color(69, 69, 211));
    studentsOverallAttendanceGauge.setForeground(new java.awt.Color(51, 51, 51));
    studentsOverallAttendanceGauge.setColor1(new java.awt.Color(51, 51, 51));
    studentsOverallAttendanceGauge.setColor2(new java.awt.Color(78, 78, 186));
    studentsOverallAttendanceGauge.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    studentsOverallAttendanceGauge.setGaugeSize(10);
    studentsOverallAttendanceGauge.setValue(70);

    jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 12)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("Overall Grade");

    javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
    roundedPanel1.setLayout(roundedPanel1Layout);
    roundedPanel1Layout.setHorizontalGroup(
        roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(roundedPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator3)
                .addGroup(roundedPanel1Layout.createSequentialGroup()
                    .addComponent(avatarBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(roundedPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(studentsCardStudentsSectionLabel)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(roundedPanel1Layout.createSequentialGroup()
                            .addComponent(studentsCardStudentsNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentsCardStudentsNumberLabel)
                            .addGap(9, 9, 9)))))
            .addContainerGap())
        .addGroup(roundedPanel1Layout.createSequentialGroup()
            .addGap(81, 81, 81)
            .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundedPanel1Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(studentsMonthlyAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addComponent(studentsOverallAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(roundedPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(49, 49, 49)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(108, Short.MAX_VALUE))
    );
    roundedPanel1Layout.setVerticalGroup(
        roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(roundedPanel1Layout.createSequentialGroup()
            .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(roundedPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentsCardStudentsNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentsCardStudentsNameLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentsCardStudentsSectionLabel))
                .addGroup(roundedPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(avatarBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(roundedPanel1Layout.createSequentialGroup()
                    .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(studentsMonthlyAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(studentsOverallAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(25, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
    studentsPanel.setLayout(studentsPanelLayout);
    studentsPanelLayout.setHorizontalGroup(
        studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(studentsPanelLayout.createSequentialGroup()
                    .addComponent(studentsCardSectionsCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(fetchNewDataButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(studentsCardStudentsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(studentsCardSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(15, 15, 15))
    );
    studentsPanelLayout.setVerticalGroup(
        studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentsPanelLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentsCardStudentsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentsCardSearchButton)
                    .addComponent(fetchNewDataButton)
                    .addComponent(studentsCardSectionsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    cardPanel.add(studentsPanel, "studentsCard");

    sidePanel.setBackground(new java.awt.Color(30, 30, 41));
    sidePanel.setColorGradient(new java.awt.Color(30, 30, 41));
    sidePanel.setRadius(15);

    dashboardButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    dashboardButtonLabel.setForeground(new java.awt.Color(217, 217, 217));
    dashboardButtonLabel.setText("Dashboard");
    dashboardButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    dashboardButtonLabel.setShadowColor(new java.awt.Color(60, 60, 133));
    dashboardButtonLabel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dashboardButtonLabelActionPerformed(evt);
        }
    });
    sidePanel.add(dashboardButtonLabel);
    dashboardButtonLabel.setBounds(0, 200, 240, 61);

    studentsButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    studentsButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
    studentsButtonLabel.setText("Students");
    studentsButtonLabel.setToolTipText("");
    studentsButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    studentsButtonLabel.setShadowColor(new java.awt.Color(60, 60, 133));
    studentsButtonLabel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            studentsButtonLabelActionPerformed(evt);
        }
    });
    sidePanel.add(studentsButtonLabel);
    studentsButtonLabel.setBounds(0, 270, 240, 61);

    sectionsButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    sectionsButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
    sectionsButtonLabel.setText("Sections");
    sectionsButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    sectionsButtonLabel.setShadowColor(new java.awt.Color(60, 60, 133));
    sidePanel.add(sectionsButtonLabel);
    sectionsButtonLabel.setBounds(0, 340, 240, 61);

    attendanceButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    attendanceButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
    attendanceButtonLabel.setText("Attendance");
    attendanceButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    attendanceButtonLabel.setShadowColor(new java.awt.Color(60, 60, 133));
    sidePanel.add(attendanceButtonLabel);
    attendanceButtonLabel.setBounds(0, 410, 240, 61);

    avatarBorder1.setGradientColor1(new java.awt.Color(159, 198, 216));
    avatarBorder1.setGradientColor2(new java.awt.Color(87, 38, 114));
    avatarBorder1.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/StockAvatar.jpg"))); // NOI18N
    sidePanel.add(avatarBorder1);
    avatarBorder1.setBounds(40, 20, 170, 150);

    javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
    backgroundPanel.setLayout(backgroundPanelLayout);
    backgroundPanelLayout.setHorizontalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(backgroundPanelLayout.createSequentialGroup()
            .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE))
    );
    backgroundPanelLayout.setVerticalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jSeparator1)
        .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentsButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsButtonLabelActionPerformed
        // TODO add your handling code here:
        mainpageCardLayout.show(cardPanel, "studentsCard");
    }//GEN-LAST:event_studentsButtonLabelActionPerformed

    private void dashboardButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonLabelActionPerformed
        // TODO add your handling code here:
        mainpageCardLayout.show(cardPanel, "dashboardCard");
    }//GEN-LAST:event_dashboardButtonLabelActionPerformed

    private void fetchNewDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchNewDataButtonActionPerformed
        // TODO add your handling code here:
        String selectedSection = (String) studentsCardSectionsCombobox.getSelectedItem();

        if("ICT 12 A".equals(selectedSection)) {
//            System.out.println("Hello A");
            try {
                String sqlQuery = "SELECT * FROM ICT_12A";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if("ICT 12 B".equals(selectedSection)) {
//            System.out.println("Hello B");
            try {
                String sqlQuery = "SELECT * FROM ICT_12B";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if("ICT 12 C".equals(selectedSection)) {
//            System.out.println("Hello C");
            try {
                String sqlQuery = "SELECT * FROM ICT_12C";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));

                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        else if ("ICT_12D".equals(selectedSection)) {
//            System.out.println("Hello D");
            try {
                String sqlQuery = "SELECT * FROM ICT_12D";
                st = studentConn.createStatement();
                rs = st.executeQuery(sqlQuery);

                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
                studentsTableModel.setRowCount(0);

                while (rs.next()) {
                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));
                    
                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                    studentsTableModel.addRow(studentTbData);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        //        try {
            //            String sqlQuery = "SELECT * FROM ICT_12D";
            //            st = studentConn.createStatement();
            //            rs = st.executeQuery(sqlQuery);
            //
            //            DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
            //            studentsTableModel.setRowCount(0);
            //
            //            while (rs.next()) {
                //                String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
                //                String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
                //                String studentNumber = String.valueOf(rs.getString("Student_Number"));
                //                String studentGradeLevel = String.valueOf(rs.getString("Grade_Level"));
                //
                //                String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
                //                studentsTableModel.addRow(studentTbData);
                //            }
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(null, e);
            //        }
    }//GEN-LAST:event_fetchNewDataButtonActionPerformed

    private void studentsCardSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsCardSearchButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ob = (DefaultTableModel) studentsCardStudentsTable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        studentsCardStudentsTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(studentsCardStudentsSearchField.getText()));
    }//GEN-LAST:event_studentsCardSearchButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SwingUtilities.invokeLater(()-> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(FlatLaftest.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SwingUtilities.invokeLater(()-> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(FlatLaftest.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void studentsCardStudentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsCardStudentsTableMouseClicked
        // TODO add your handling code here:
        int index = studentsCardStudentsTable.getSelectedRow();
        TableModel  tableModel = studentsCardStudentsTable.getModel();
        String firstNameValue = (String) tableModel.getValueAt(index, 0);
        String lastNameValue = (String) tableModel.getValueAt(index, 1);
        String studentNumberValue = (String) tableModel.getValueAt(index, 2);
        String gradeLevelValue = (String) tableModel.getValueAt(index, 3);
        String studentComboBoxSelection = (String) studentsCardSectionsCombobox.getSelectedItem();
        
        studentsCardStudentsNameLabel.setText(firstNameValue+" "+lastNameValue);
        studentsCardStudentsNumberLabel.setText(studentNumberValue);
        studentsCardStudentsSectionLabel.setText(gradeLevelValue);
        
        try {
            String sqlQuery = "SELECT Monthly_Attendance_Grade, Overall_Attendance_Grade from " +studentComboBoxSelection+" where Student_Number = ?";
            pst = studentConn.prepareStatement(sqlQuery);
            pst.setString(1, studentNumberValue);
            rs = pst.executeQuery();
            if(rs.next()){
                int finalMonthlyAttendanceGrade = rs.getInt("Monthly_Attendance_Grade");
                int  finalOverallAttendanceGrade = rs.getInt("Overall_Attendance_Grade");
                System.out.println(finalMonthlyAttendanceGrade);
                studentsMonthlyAttendanceGauge.setValueWithAnimation(finalMonthlyAttendanceGrade);
                studentsOverallAttendanceGauge.setValueWithAnimation(finalOverallAttendanceGrade);
            } else{
                System.out.println("no");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_studentsCardStudentsTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newerMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomizedElements.CustomizedButton attendanceButtonLabel;
    private CustomizedElements.AvatarBorder avatarBorder1;
    private CustomizedElements.AvatarBorder avatarBorder2;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel cardPanel;
    private CustomizedElements.CustomizedButton dashboardButtonLabel;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JButton fetchNewDataButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    private CustomizedElements.RoundedPanel roundedPanel1;
    private CustomizedElements.CustomizedButton sectionsButtonLabel;
    private CustomizedElements.GradientPanel sidePanel;
    private CustomizedElements.CustomizedButton studentsButtonLabel;
    private javax.swing.JButton studentsCardSearchButton;
    private javax.swing.JComboBox<String> studentsCardSectionsCombobox;
    private javax.swing.JLabel studentsCardStudentsNameLabel;
    private javax.swing.JLabel studentsCardStudentsNumberLabel;
    private javax.swing.JTextField studentsCardStudentsSearchField;
    private javax.swing.JLabel studentsCardStudentsSectionLabel;
    private javax.swing.JTable studentsCardStudentsTable;
    private CustomizedElements.GaugeChart studentsMonthlyAttendanceGauge;
    private CustomizedElements.GaugeChart studentsOverallAttendanceGauge;
    private javax.swing.JPanel studentsPanel;
    // End of variables declaration//GEN-END:variables
}
