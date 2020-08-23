/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;




/**
 *
 * @author Arzi Al Hafiz
 */
public class koneksi {
public Connection con;
public Statement stat;
public ResultSet rs;
public String sql="";

public Connection getConnection(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/dbperpus","root","");
        //JOptionPane.showMessageDialog(null, "Koneksi OK");
    } catch (Exception e) {
        //JOptionPane.showMessageDialog(null, "Koneksi Gagal");
    }
    return con;
}
}

    



    

/**
 *
 * @author lenovo
 */

