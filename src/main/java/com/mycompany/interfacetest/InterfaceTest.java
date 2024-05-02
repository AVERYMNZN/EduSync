/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacetest;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class InterfaceTest {

    public static Connection loginConn() {
        try {
            String url = "jdbc:ucanaccess://src/main/resources/database/EduSync-DB1.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public static Connection studentConn() {
        try {
            String url = "jdbc:ucanaccess://src/main/resources/database/EduSync-DB1.accdb";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    public static void main(String[] args) {
        newLoginPage login = new newLoginPage();
        login.setVisible(true);
        
    }
}
