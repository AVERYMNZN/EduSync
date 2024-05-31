package com.mycompany.interfacetest;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.springframework.boot.SpringApplication;
import raven.alerts.MessageAlerts;
import raven.popup.GlassPanePopup;
import raven.popup.component.PopupCallbackAction;
import raven.popup.component.PopupController;

public class newerMainPage extends javax.swing.JFrame {

    Connection studentConn;
    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public static String studentsCardEmailRecepient;
    public static String studentsCardEmailSubject;
    public static String studentsCardEmailContent;
    
    CardLayout mainpageCardLayout;
    
    
    public newerMainPage() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("avery.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));
        FlatDarkLaf.setup();
        
        studentConn = InterfaceTest.studentConn();
        
        setIconImage();
        initComponents();
        mainpageCardLayout = (CardLayout)(cardPanel.getLayout());
        mainpageCardLayout.show(cardPanel, "attendanceCard");
        GlassPanePopup.install(this);
        
        studentsCardStudentsTable.getTableHeader().setBackground(new Color(119,119,176));
;    }
    
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/loginIcons/EduSync-Logo.png")));
    }

    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        backgroundPanel = new javax.swing.JPanel();
        cardPanel = new javax.swing.JPanel();
        attendancePanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        roundedPanel1 = new CustomizedElements.RoundedPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        avatarBorder1 = new CustomizedElements.AvatarBorder();
        roundedPanel2 = new CustomizedElements.RoundedPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        avatarBorder2 = new CustomizedElements.AvatarBorder();
        roundedPanel3 = new CustomizedElements.RoundedPanel();
        roundedPanel5 = new CustomizedElements.RoundedPanel();
        avatarBorder4 = new CustomizedElements.AvatarBorder();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        roundedPanel4 = new CustomizedElements.RoundedPanel();
        avatarBorder3 = new CustomizedElements.AvatarBorder();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roundedPanel7 = new CustomizedElements.RoundedPanel();
        avatarBorder6 = new CustomizedElements.AvatarBorder();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        roundedPanel6 = new CustomizedElements.RoundedPanel();
        avatarBorder5 = new CustomizedElements.AvatarBorder();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roundedPanel8 = new CustomizedElements.RoundedPanel();
        gaugeChart1 = new CustomizedElements.GaugeChart();
        gaugeChart2 = new CustomizedElements.GaugeChart();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        studentsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsCardStudentsTable = new javax.swing.JTable();
        studentsCardStudentsSearchField = new javax.swing.JTextField();
        studentsCardStudentsCombobox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        studentsCardStudentsInfoPanel = new CustomizedElements.RoundedPanel();
        studentsCardStudentsNameLabel = new javax.swing.JLabel();
        studentsCardStudentsNumberLabel = new javax.swing.JLabel();
        studentsAvatarBorder = new CustomizedElements.AvatarBorder();
        studentsCardStudentsSectionLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        studentsMonthlyAttendanceGauge = new CustomizedElements.GaugeChart();
        studentsOverallAttendanceGauge = new CustomizedElements.GaugeChart();
        jLabel1 = new javax.swing.JLabel();
        studentsCardSendEmailPanel = new CustomizedElements.RoundedPanel();
        studentsCardRecipientTextField = new CustomizedElements.LoginCustomTextfield();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        studentsCardSubjectTextField = new CustomizedElements.LoginCustomTextfield();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentsCardEmailContentField = new javax.swing.JTextArea();
        studentsCardSendEmailButton = new CustomizedElements.CustomizedButton();
        customizedButton1 = new CustomizedElements.CustomizedButton();
        customizedButton3 = new CustomizedElements.CustomizedButton();
        sidePanel = new CustomizedElements.GradientPanel();
        dashboardButtonLabel = new CustomizedElements.CustomizedButton();
        studentsButtonLabel = new CustomizedElements.CustomizedButton();
        sectionsButtonLabel = new CustomizedElements.CustomizedButton();
        attendanceButtonLabel = new CustomizedElements.CustomizedButton();
        teacherAvatarBorder = new CustomizedElements.AvatarBorder();
        jButton3 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSync");
        setResizable(false);

        backgroundPanel.setBackground(new java.awt.Color(35, 35, 48));

        cardPanel.setLayout(new java.awt.CardLayout());

        attendancePanel.setBackground(new java.awt.Color(35, 35, 48));

        javax.swing.GroupLayout attendancePanelLayout = new javax.swing.GroupLayout(attendancePanel);
        attendancePanel.setLayout(attendancePanelLayout);
        attendancePanelLayout.setHorizontalGroup(
            attendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1064, Short.MAX_VALUE)
        );
        attendancePanelLayout.setVerticalGroup(
            attendancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        cardPanel.add(attendancePanel, "attendanceCard");

        dashboardPanel.setBackground(new java.awt.Color(35, 35, 48));

        roundedPanel1.setBackground(new java.awt.Color(119, 119, 176));
        roundedPanel1.setRoundBottomLeft(55);
        roundedPanel1.setRoundBottomRight(55);
        roundedPanel1.setRoundTopLeft(55);
        roundedPanel1.setRoundTopRight(55);

        jLabel3.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel3.setText("Total Female");

        jLabel5.setFont(new java.awt.Font("Comfortaa", 1, 48)); // NOI18N
        jLabel5.setText("500");

        avatarBorder1.setBorderSize(0);
        avatarBorder1.setGradientColor1(new java.awt.Color(119, 119, 176));
        avatarBorder1.setGradientColor2(new java.awt.Color(87, 38, 114));
        avatarBorder1.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/GirlStudentIcon.png"))); // NOI18N

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(avatarBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        roundedPanel2.setBackground(new java.awt.Color(119, 119, 176));
        roundedPanel2.setRoundBottomLeft(55);
        roundedPanel2.setRoundBottomRight(55);
        roundedPanel2.setRoundTopLeft(55);
        roundedPanel2.setRoundTopRight(55);

        jLabel7.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
        jLabel7.setText("Total Male");

        jLabel8.setFont(new java.awt.Font("Comfortaa", 1, 48)); // NOI18N
        jLabel8.setText("500");

        avatarBorder2.setBorderSize(0);
        avatarBorder2.setGradientColor1(new java.awt.Color(119, 119, 176));
        avatarBorder2.setGradientColor2(new java.awt.Color(87, 38, 114));
        avatarBorder2.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/StudentIcon.png"))); // NOI18N

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(avatarBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGap(15, 15, 15))
        );

        roundedPanel3.setBackground(new java.awt.Color(119, 119, 176));
        roundedPanel3.setRoundBottomLeft(55);
        roundedPanel3.setRoundBottomRight(55);
        roundedPanel3.setRoundTopLeft(55);
        roundedPanel3.setRoundTopRight(55);

        roundedPanel5.setBackground(new java.awt.Color(87, 38, 114));
        roundedPanel5.setRoundBottomLeft(55);
        roundedPanel5.setRoundBottomRight(55);
        roundedPanel5.setRoundTopLeft(55);
        roundedPanel5.setRoundTopRight(55);

        avatarBorder4.setBorderSize(0);
        avatarBorder4.setGradientColor1(new java.awt.Color(119, 119, 176));
        avatarBorder4.setGradientColor2(new java.awt.Color(87, 38, 114));
        avatarBorder4.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/GirlStudentIcon.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel13.setText("Student B. Student");

        jLabel14.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel14.setText("96%");

        jLabel15.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel15.setText("ABC-12D");

        javax.swing.GroupLayout roundedPanel5Layout = new javax.swing.GroupLayout(roundedPanel5);
        roundedPanel5.setLayout(roundedPanel5Layout);
        roundedPanel5Layout.setHorizontalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatarBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addGroup(roundedPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel15)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundedPanel5Layout.setVerticalGroup(
            roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel5Layout.createSequentialGroup()
                .addGroup(roundedPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel15))
                    .addGroup(roundedPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avatarBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jSeparator4.setForeground(new java.awt.Color(87, 38, 114));

        jLabel16.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(87, 38, 114));
        jLabel16.setText("Most Improved in Attendance");

        roundedPanel4.setBackground(new java.awt.Color(87, 38, 114));
        roundedPanel4.setRoundBottomLeft(55);
        roundedPanel4.setRoundBottomRight(55);
        roundedPanel4.setRoundTopLeft(55);
        roundedPanel4.setRoundTopRight(55);

        avatarBorder3.setBorderSize(0);
        avatarBorder3.setGradientColor1(new java.awt.Color(119, 119, 176));
        avatarBorder3.setGradientColor2(new java.awt.Color(87, 38, 114));
        avatarBorder3.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/StudentIcon.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel10.setText("Student A. Student");

        jLabel11.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel11.setText("100%");

        jLabel12.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel12.setText("ICT-12D");

        javax.swing.GroupLayout roundedPanel4Layout = new javax.swing.GroupLayout(roundedPanel4);
        roundedPanel4.setLayout(roundedPanel4Layout);
        roundedPanel4Layout.setHorizontalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(avatarBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(roundedPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        roundedPanel4Layout.setVerticalGroup(
            roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel4Layout.createSequentialGroup()
                .addGroup(roundedPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jLabel12))
                    .addGroup(roundedPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(avatarBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        roundedPanel7.setBackground(new java.awt.Color(87, 38, 114));
        roundedPanel7.setRoundBottomLeft(55);
        roundedPanel7.setRoundBottomRight(55);
        roundedPanel7.setRoundTopLeft(55);
        roundedPanel7.setRoundTopRight(55);

        avatarBorder6.setBorderSize(0);
        avatarBorder6.setGradientColor1(new java.awt.Color(119, 119, 176));
        avatarBorder6.setGradientColor2(new java.awt.Color(87, 38, 114));
        avatarBorder6.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/sectionsSidePanelIcon.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel20.setText("100%");

        jLabel21.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel21.setText("ABC-12D");

        javax.swing.GroupLayout roundedPanel7Layout = new javax.swing.GroupLayout(roundedPanel7);
        roundedPanel7.setLayout(roundedPanel7Layout);
        roundedPanel7Layout.setHorizontalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(avatarBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(roundedPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        roundedPanel7Layout.setVerticalGroup(
            roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundedPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarBorder6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        roundedPanel6.setBackground(new java.awt.Color(87, 38, 114));
        roundedPanel6.setRoundBottomLeft(55);
        roundedPanel6.setRoundBottomRight(55);
        roundedPanel6.setRoundTopLeft(55);
        roundedPanel6.setRoundTopRight(55);

        avatarBorder5.setBorderSize(0);
        avatarBorder5.setGradientColor1(new java.awt.Color(119, 119, 176));
        avatarBorder5.setGradientColor2(new java.awt.Color(87, 38, 114));
        avatarBorder5.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/sectionsSidePanelIcon.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Comfortaa", 1, 36)); // NOI18N
        jLabel18.setText("100%");

        jLabel19.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel19.setText("ICT-12D");

        javax.swing.GroupLayout roundedPanel6Layout = new javax.swing.GroupLayout(roundedPanel6);
        roundedPanel6.setLayout(roundedPanel6Layout);
        roundedPanel6Layout.setHorizontalGroup(
            roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(avatarBorder5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(roundedPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel19)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        roundedPanel6Layout.setVerticalGroup(
            roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundedPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarBorder5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel22.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(87, 38, 114));
        jLabel22.setText("Best in Attendance");

        jLabel17.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(87, 38, 114));
        jLabel17.setText("Best in Attendance");

        jLabel9.setFont(new java.awt.Font("Comfortaa", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 38, 114));
        jLabel9.setText("Most Improved in Attendance");

        jLabel23.setFont(new java.awt.Font("Anton", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(87, 38, 114));
        jLabel23.setText("SECTIONS");

        jLabel6.setFont(new java.awt.Font("Anton", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(87, 38, 114));
        jLabel6.setText("STUDENT");

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)))
                .addGap(27, 27, 27)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(roundedPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundedPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(roundedPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17)))
                        .addGap(31, 31, 31)
                        .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(roundedPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel23))
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22))
                .addGap(11, 11, 11)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(5, 5, 5)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundedPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel9))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        roundedPanel8.setBackground(new java.awt.Color(119, 119, 176));
        roundedPanel8.setRoundBottomLeft(55);
        roundedPanel8.setRoundBottomRight(55);
        roundedPanel8.setRoundTopLeft(55);
        roundedPanel8.setRoundTopRight(55);

        gaugeChart1.setColor1(new java.awt.Color(51, 51, 51));
        gaugeChart1.setColor2(new java.awt.Color(78, 78, 186));
        gaugeChart1.setValue(10);

        gaugeChart2.setColor1(new java.awt.Color(51, 51, 51));
        gaugeChart2.setColor2(new java.awt.Color(78, 78, 186));
        gaugeChart2.setValue(90);

        jLabel24.setFont(new java.awt.Font("Anton", 0, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(87, 38, 114));
        jLabel24.setText("Attendance");

        jLabel26.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(87, 38, 114));
        jLabel26.setText("Present");

        jLabel25.setFont(new java.awt.Font("Comfortaa", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(87, 38, 114));
        jLabel25.setText("Absent");

        javax.swing.GroupLayout roundedPanel8Layout = new javax.swing.GroupLayout(roundedPanel8);
        roundedPanel8.setLayout(roundedPanel8Layout);
        roundedPanel8Layout.setHorizontalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel8Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel8Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(87, 87, 87))
        );
        roundedPanel8Layout.setVerticalGroup(
            roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundedPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gaugeChart1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gaugeChart2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanelLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(roundedPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundedPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        cardPanel.add(dashboardPanel, "dashboardCard");

        studentsPanel.setBackground(new java.awt.Color(35, 35, 48));

        studentsCardStudentsTable.setBackground(new java.awt.Color(119, 119, 176));
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
    studentsCardStudentsTable.setSelectionBackground(new java.awt.Color(87, 38, 114));
    studentsCardStudentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            studentsCardStudentsTableMouseClicked(evt);
        }
    });
    jScrollPane2.setViewportView(studentsCardStudentsTable);
    studentsCardStudentsTable.getAccessibleContext().setAccessibleName("");

    studentsCardStudentsSearchField.setSelectionColor(new java.awt.Color(87, 38, 114));

    studentsCardStudentsCombobox.setBackground(new java.awt.Color(87, 38, 114));
    studentsCardStudentsCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Section", "ICT 12 A", "ICT 12 B", "ICT 12 C", "ICT_12D" }));

    jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

    studentsCardStudentsInfoPanel.setBackground(new java.awt.Color(119, 119, 176));
    studentsCardStudentsInfoPanel.setRoundBottomLeft(55);
    studentsCardStudentsInfoPanel.setRoundBottomRight(55);
    studentsCardStudentsInfoPanel.setRoundTopLeft(55);
    studentsCardStudentsInfoPanel.setRoundTopRight(55);

    studentsCardStudentsNameLabel.setFont(new java.awt.Font("Comfortaa", 1, 20)); // NOI18N
    studentsCardStudentsNameLabel.setForeground(new java.awt.Color(51, 51, 51));
    studentsCardStudentsNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    studentsCardStudentsNameLabel.setText("Avery Manzon");

    studentsCardStudentsNumberLabel.setFont(new java.awt.Font("Comfortaa Light", 0, 14)); // NOI18N
    studentsCardStudentsNumberLabel.setForeground(new java.awt.Color(51, 51, 51));
    studentsCardStudentsNumberLabel.setText("05-00-3542");

    studentsAvatarBorder.setBorderSize(2);
    studentsAvatarBorder.setBorderSpace(2);
    studentsAvatarBorder.setGradientColor1(new java.awt.Color(0, 0, 0));
    studentsAvatarBorder.setGradientColor2(new java.awt.Color(0, 0, 0));
    studentsAvatarBorder.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/StudentIcon.png"))); // NOI18N

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

    javax.swing.GroupLayout studentsCardStudentsInfoPanelLayout = new javax.swing.GroupLayout(studentsCardStudentsInfoPanel);
    studentsCardStudentsInfoPanel.setLayout(studentsCardStudentsInfoPanelLayout);
    studentsCardStudentsInfoPanelLayout.setHorizontalGroup(
        studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator3)
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addComponent(studentsAvatarBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(studentsCardStudentsSectionLabel)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                            .addComponent(studentsCardStudentsNameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studentsCardStudentsNumberLabel)
                            .addGap(9, 9, 9)))))
            .addContainerGap())
        .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
            .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(studentsMonthlyAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel4)))
            .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(studentsOverallAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 59, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(75, 75, 75))))
    );
    studentsCardStudentsInfoPanelLayout.setVerticalGroup(
        studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
            .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentsCardStudentsNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studentsCardStudentsNameLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentsCardStudentsSectionLabel))
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(studentsAvatarBorder, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(studentsCardStudentsInfoPanelLayout.createSequentialGroup()
                    .addGroup(studentsCardStudentsInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(studentsMonthlyAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(studentsOverallAttendanceGauge, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(25, Short.MAX_VALUE))
    );

    studentsCardSendEmailPanel.setBackground(new java.awt.Color(119, 119, 176));
    studentsCardSendEmailPanel.setRoundBottomLeft(55);
    studentsCardSendEmailPanel.setRoundBottomRight(55);
    studentsCardSendEmailPanel.setRoundTopLeft(55);
    studentsCardSendEmailPanel.setRoundTopRight(55);

    studentsCardRecipientTextField.setBackground(new java.awt.Color(119, 119, 176));
    studentsCardRecipientTextField.setForeground(new java.awt.Color(87, 38, 114));
    studentsCardRecipientTextField.setCaretColor(new java.awt.Color(216, 199, 216));
    studentsCardRecipientTextField.setLabelText("Recipient");
    studentsCardRecipientTextField.setLineColor(new java.awt.Color(87, 38, 114));
    studentsCardRecipientTextField.setSelectionColor(new java.awt.Color(158, 109, 182));

    jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(204, 204, 204));
    jLabel2.setText("Send Email");

    studentsCardSubjectTextField.setBackground(new java.awt.Color(119, 119, 176));
    studentsCardSubjectTextField.setForeground(new java.awt.Color(87, 38, 114));
    studentsCardSubjectTextField.setCaretColor(new java.awt.Color(216, 199, 216));
    studentsCardSubjectTextField.setLabelText("Subject");
    studentsCardSubjectTextField.setLineColor(new java.awt.Color(87, 38, 114));
    studentsCardSubjectTextField.setSelectionColor(new java.awt.Color(158, 109, 182));

    studentsCardEmailContentField.setBackground(new java.awt.Color(87, 38, 114));
    studentsCardEmailContentField.setColumns(20);
    studentsCardEmailContentField.setForeground(new java.awt.Color(204, 204, 204));
    studentsCardEmailContentField.setRows(5);
    studentsCardEmailContentField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 195, 227)));
    studentsCardEmailContentField.setCaretColor(new java.awt.Color(216, 199, 216));
    studentsCardEmailContentField.setSelectionColor(new java.awt.Color(119, 119, 176));
    jScrollPane3.setViewportView(studentsCardEmailContentField);

    studentsCardSendEmailButton.setBackground(new java.awt.Color(87, 38, 114));
    studentsCardSendEmailButton.setForeground(new java.awt.Color(204, 204, 204));
    studentsCardSendEmailButton.setText("Send Email");
    studentsCardSendEmailButton.setShadowColor(new java.awt.Color(87, 38, 114));
    studentsCardSendEmailButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            studentsCardSendEmailButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout studentsCardSendEmailPanelLayout = new javax.swing.GroupLayout(studentsCardSendEmailPanel);
    studentsCardSendEmailPanel.setLayout(studentsCardSendEmailPanelLayout);
    studentsCardSendEmailPanelLayout.setHorizontalGroup(
        studentsCardSendEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
            .addGroup(studentsCardSendEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(studentsCardSendEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(studentsCardSendEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3)
                                .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
                                    .addComponent(studentsCardRecipientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(studentsCardSubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 12, Short.MAX_VALUE))))
                .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
            .addGap(145, 145, 145)
            .addComponent(studentsCardSendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    studentsCardSendEmailPanelLayout.setVerticalGroup(
        studentsCardSendEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentsCardSendEmailPanelLayout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(studentsCardSendEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(studentsCardRecipientTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(studentsCardSubjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(studentsCardSendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    customizedButton1.setBackground(new java.awt.Color(87, 38, 114));
    customizedButton1.setForeground(new java.awt.Color(217, 217, 217));
    customizedButton1.setText("Fetch data");
    customizedButton1.setShadowColor(new java.awt.Color(87, 38, 114));
    customizedButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            customizedButton1ActionPerformed(evt);
        }
    });

    customizedButton3.setBackground(new java.awt.Color(87, 38, 114));
    customizedButton3.setForeground(new java.awt.Color(217, 217, 217));
    customizedButton3.setText("Search");
    customizedButton3.setPreferredSize(new java.awt.Dimension(81, 41));
    customizedButton3.setShadowColor(new java.awt.Color(87, 38, 114));
    customizedButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            customizedButton3ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout studentsPanelLayout = new javax.swing.GroupLayout(studentsPanel);
    studentsPanel.setLayout(studentsPanelLayout);
    studentsPanelLayout.setHorizontalGroup(
        studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentsPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentsCardStudentsInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(studentsCardSendEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(studentsPanelLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(studentsCardStudentsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(customizedButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(studentsCardStudentsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(customizedButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGap(18, 18, 18))
    );
    studentsPanelLayout.setVerticalGroup(
        studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(studentsPanelLayout.createSequentialGroup()
            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(studentsPanelLayout.createSequentialGroup()
                    .addContainerGap(27, Short.MAX_VALUE)
                    .addComponent(studentsCardStudentsInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(studentsCardSendEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(studentsPanelLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(customizedButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(studentsPanelLayout.createSequentialGroup()
                            .addGroup(studentsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentsCardStudentsCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentsCardStudentsSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(customizedButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
    dashboardButtonLabel.setShadowColor(new java.awt.Color(87, 38, 114));
    dashboardButtonLabel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            dashboardButtonLabelActionPerformed(evt);
        }
    });
    sidePanel.add(dashboardButtonLabel);
    dashboardButtonLabel.setBounds(10, 200, 240, 61);

    studentsButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    studentsButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
    studentsButtonLabel.setText("Students");
    studentsButtonLabel.setToolTipText("");
    studentsButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    studentsButtonLabel.setShadowColor(new java.awt.Color(87, 38, 114));
    studentsButtonLabel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            studentsButtonLabelActionPerformed(evt);
        }
    });
    sidePanel.add(studentsButtonLabel);
    studentsButtonLabel.setBounds(10, 270, 240, 61);

    sectionsButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    sectionsButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
    sectionsButtonLabel.setText("Sections");
    sectionsButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    sectionsButtonLabel.setShadowColor(new java.awt.Color(87, 38, 114));
    sidePanel.add(sectionsButtonLabel);
    sectionsButtonLabel.setBounds(10, 340, 240, 61);

    attendanceButtonLabel.setBackground(new java.awt.Color(87, 38, 114));
    attendanceButtonLabel.setForeground(new java.awt.Color(204, 204, 204));
    attendanceButtonLabel.setText("Attendance");
    attendanceButtonLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
    attendanceButtonLabel.setShadowColor(new java.awt.Color(87, 38, 114));
    attendanceButtonLabel.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            attendanceButtonLabelActionPerformed(evt);
        }
    });
    sidePanel.add(attendanceButtonLabel);
    attendanceButtonLabel.setBounds(10, 410, 240, 61);

    teacherAvatarBorder.setGradientColor1(new java.awt.Color(159, 198, 216));
    teacherAvatarBorder.setGradientColor2(new java.awt.Color(87, 38, 114));
    teacherAvatarBorder.setImage(new javax.swing.ImageIcon(getClass().getResource("/mainPageIcons/TeacherIcon.png"))); // NOI18N
    sidePanel.add(teacherAvatarBorder);
    teacherAvatarBorder.setBounds(40, 20, 170, 150);

    jButton3.setBackground(new java.awt.Color(87, 38, 114));
    jButton3.setForeground(new java.awt.Color(204, 204, 204));
    jButton3.setText("Log Out");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });
    sidePanel.add(jButton3);
    jButton3.setBounds(30, 710, 190, 24);

    javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
    backgroundPanel.setLayout(backgroundPanelLayout);
    backgroundPanelLayout.setHorizontalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(backgroundPanelLayout.createSequentialGroup()
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15))
    );
    backgroundPanelLayout.setVerticalGroup(
        backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void studentsCardStudentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsCardStudentsTableMouseClicked
        // TODO add your handling code here:
        int index = studentsCardStudentsTable.getSelectedRow();
        TableModel  tableModel = studentsCardStudentsTable.getModel();
        String firstNameValue = (String) tableModel.getValueAt(index, 0);
        String lastNameValue = (String) tableModel.getValueAt(index, 1);
        String studentNumberValue = (String) tableModel.getValueAt(index, 2);
        String gradeLevelValue = (String) tableModel.getValueAt(index, 3);
        String studentComboBoxSelection = (String) studentsCardStudentsCombobox.getSelectedItem();
        
        studentsCardStudentsNameLabel.setText(firstNameValue+" "+lastNameValue);
        studentsCardStudentsNumberLabel.setText(studentNumberValue);
        studentsCardStudentsSectionLabel.setText(gradeLevelValue);
        
        try {
            String sqlQuery = "SELECT Monthly_Attendance_Grade, Overall_Attendance_Grade, Gender, Guardian_Email from " +studentComboBoxSelection+" where Student_Number = ?";
            pst = studentConn.prepareStatement(sqlQuery);
            pst.setString(1, studentNumberValue);
            rs = pst.executeQuery();
            if(rs.next()){
                int finalMonthlyAttendanceGrade = rs.getInt("Monthly_Attendance_Grade");
                int  finalOverallAttendanceGrade = rs.getInt("Overall_Attendance_Grade");
                String studentGender = rs.getString("Gender");
                String guardianEmail = rs.getString("Guardian_Email");
                if ("Female".equals(studentGender)) {
                    studentsAvatarBorder.setImage(new ImageIcon(getClass().getResource("/mainPageIcons/GirlStudentIcon.png")));
                } else if ("Male".equals(studentGender)) {
                    studentsAvatarBorder.setImage(new ImageIcon(getClass().getResource("/mainPageIcons/StudentIcon.png")));
                }
                System.out.println(finalMonthlyAttendanceGrade);
                studentsCardRecipientTextField.setText(guardianEmail);
                studentsMonthlyAttendanceGauge.setValueWithAnimation(finalMonthlyAttendanceGrade);
                studentsOverallAttendanceGauge.setValueWithAnimation(finalOverallAttendanceGrade);
            } else{
                System.out.println("no");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_studentsCardStudentsTableMouseClicked

    private void studentsCardSendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsCardSendEmailButtonActionPerformed
        studentsCardEmailRecepient = studentsCardRecipientTextField.getText();
        studentsCardEmailSubject = studentsCardSubjectTextField.getText();
        studentsCardEmailContent = studentsCardEmailContentField.getText();
        MessageAlerts.getInstance().showMessage("Confirm Email", "This email will be sent to the email specified. Are you sure you want to continue?", MessageAlerts.MessageType.DEFAULT, MessageAlerts.OK_CANCEL_OPTION, new PopupCallbackAction() {
            @Override
            public void action(PopupController pc, int i) {
                if (i==MessageAlerts.OK_OPTION) {
                    System.out.println("OK pressed");
                    SpringApplication.run(SpringEmailApplication.class, new String [0]);
                }
            }
        });
    }//GEN-LAST:event_studentsCardSendEmailButtonActionPerformed

    private void customizedButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customizedButton3ActionPerformed
        DefaultTableModel ob = (DefaultTableModel) studentsCardStudentsTable.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        studentsCardStudentsTable.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(studentsCardStudentsSearchField.getText()));
    }//GEN-LAST:event_customizedButton3ActionPerformed

    private void customizedButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customizedButton1ActionPerformed
        String selectedSection = (String) studentsCardStudentsCombobox.getSelectedItem();
        
        if ("ICT_12D".equals(selectedSection)) {
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

//        if("ICT 12 A".equals(selectedSection)) {
////            System.out.println("Hello A");
//            try {
//                String sqlQuery = "SELECT * FROM ICT_12A";
//                st = studentConn.createStatement();
//                rs = st.executeQuery(sqlQuery);
//
//                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
//                studentsTableModel.setRowCount(0);
//
//                while (rs.next()) {
//                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
//                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
//                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
//                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));
//
//                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
//                    studentsTableModel.addRow(studentTbData);
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//        else if("ICT 12 B".equals(selectedSection)) {
////            System.out.println("Hello B");
//            try {
//                String sqlQuery = "SELECT * FROM ICT_12B";
//                st = studentConn.createStatement();
//                rs = st.executeQuery(sqlQuery);
//
//                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
//                studentsTableModel.setRowCount(0);
//
//                while (rs.next()) {
//                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
//                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
//                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
//                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));
//
//                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
//                    studentsTableModel.addRow(studentTbData);
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//        else if("ICT 12 C".equals(selectedSection)) {
////            System.out.println("Hello C");
//            try {
//                String sqlQuery = "SELECT * FROM ICT_12C";
//                st = studentConn.createStatement();
//                rs = st.executeQuery(sqlQuery);
//
//                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
//                studentsTableModel.setRowCount(0);
//
//                while (rs.next()) {
//                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
//                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
//                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
//                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));
//
//                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
//                    studentsTableModel.addRow(studentTbData);
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
//        }
//        else if ("ICT_12D".equals(selectedSection)) {
////            System.out.println("Hello D");
//            try {
//                String sqlQuery = "SELECT * FROM ICT_12D";
//                st = studentConn.createStatement();
//                rs = st.executeQuery(sqlQuery);
//
//                DefaultTableModel studentsTableModel = (DefaultTableModel)studentsCardStudentsTable.getModel();
//                studentsTableModel.setRowCount(0);
//
//                while (rs.next()) {
//                    String studentFirstName = String.valueOf(rs.getString("Student_First_Name"));
//                    String studentLastName = String.valueOf(rs.getString("Student_Last_Name"));
//                    String studentNumber = String.valueOf(rs.getString("Student_Number"));
//                    String studentGradeLevel = String.valueOf(rs.getString("Grade_and_Section"));
//                    
//                    String studentTbData[] = {studentFirstName, studentLastName, studentNumber, studentGradeLevel};
//                    studentsTableModel.addRow(studentTbData);
//                }
//            } catch (SQLException e) {
//                JOptionPane.showMessageDialog(null, e);
//            }
        }
    }//GEN-LAST:event_customizedButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        newLoginPage backToLogin = new newLoginPage();
        backToLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dashboardButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonLabelActionPerformed
        mainpageCardLayout.show(cardPanel, "dashboardCard");
    }//GEN-LAST:event_dashboardButtonLabelActionPerformed

    private void attendanceButtonLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceButtonLabelActionPerformed
//        mainpageCardLayout.show(cardPanel, "attendanceCard");
          QRScanner qrAttendance = new QRScanner();
          qrAttendance.show();
          this.dispose();
    }//GEN-LAST:event_attendanceButtonLabelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newerMainPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private CustomizedElements.CustomizedButton attendanceButtonLabel;
    private javax.swing.JPanel attendancePanel;
    private CustomizedElements.AvatarBorder avatarBorder1;
    private CustomizedElements.AvatarBorder avatarBorder2;
    private CustomizedElements.AvatarBorder avatarBorder3;
    private CustomizedElements.AvatarBorder avatarBorder4;
    private CustomizedElements.AvatarBorder avatarBorder5;
    private CustomizedElements.AvatarBorder avatarBorder6;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel cardPanel;
    private CustomizedElements.CustomizedButton customizedButton1;
    private CustomizedElements.CustomizedButton customizedButton3;
    private CustomizedElements.CustomizedButton dashboardButtonLabel;
    private javax.swing.JPanel dashboardPanel;
    private CustomizedElements.GaugeChart gaugeChart1;
    private CustomizedElements.GaugeChart gaugeChart2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextPane jTextPane1;
    private CustomizedElements.RoundedPanel roundedPanel1;
    private CustomizedElements.RoundedPanel roundedPanel2;
    private CustomizedElements.RoundedPanel roundedPanel3;
    private CustomizedElements.RoundedPanel roundedPanel4;
    private CustomizedElements.RoundedPanel roundedPanel5;
    private CustomizedElements.RoundedPanel roundedPanel6;
    private CustomizedElements.RoundedPanel roundedPanel7;
    private CustomizedElements.RoundedPanel roundedPanel8;
    private CustomizedElements.CustomizedButton sectionsButtonLabel;
    private CustomizedElements.GradientPanel sidePanel;
    private CustomizedElements.AvatarBorder studentsAvatarBorder;
    private CustomizedElements.CustomizedButton studentsButtonLabel;
    private javax.swing.JTextArea studentsCardEmailContentField;
    private CustomizedElements.LoginCustomTextfield studentsCardRecipientTextField;
    private CustomizedElements.CustomizedButton studentsCardSendEmailButton;
    private CustomizedElements.RoundedPanel studentsCardSendEmailPanel;
    private javax.swing.JComboBox<String> studentsCardStudentsCombobox;
    private CustomizedElements.RoundedPanel studentsCardStudentsInfoPanel;
    private javax.swing.JLabel studentsCardStudentsNameLabel;
    private javax.swing.JLabel studentsCardStudentsNumberLabel;
    private javax.swing.JTextField studentsCardStudentsSearchField;
    private javax.swing.JLabel studentsCardStudentsSectionLabel;
    private javax.swing.JTable studentsCardStudentsTable;
    private CustomizedElements.LoginCustomTextfield studentsCardSubjectTextField;
    private CustomizedElements.GaugeChart studentsMonthlyAttendanceGauge;
    private CustomizedElements.GaugeChart studentsOverallAttendanceGauge;
    private javax.swing.JPanel studentsPanel;
    private CustomizedElements.AvatarBorder teacherAvatarBorder;
    // End of variables declaration//GEN-END:variables
}
