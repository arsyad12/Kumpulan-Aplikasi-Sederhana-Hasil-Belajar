/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laundryar;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRClassLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author lenovo
 */
public class LaporanDataClient extends javax.swing.JFrame {
     public Connection con;
    public Statement stat;
    public ResultSet rs;
    public String tglawal = "";
      public String tglakhir = "";
        public String sql = "";
    koneksi koneksi=new koneksi();
JasperReport jasperreport;
    JasperPrint jasperprint;
    JasperDesign jasperdesign;
    Map<String, Object> parameter = new HashMap<>();
    

    /** Creates new form LaporanDataBuku */
    public LaporanDataClient() {
         initComponents();
              
        setLocationRelativeTo(null);
        koneksi db = new koneksi();
        db.getConnection();
        con = db.con;
        stat = db.stat;
        tampilkan_data();
         tampilkan_data2();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        idpetugas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tgl2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        tglkedua = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tglpertama = new com.toedter.calendar.JDateChooser();
        tgl1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("FIND NAME OF EMPLOYE WITH ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        idpetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpetugasActionPerformed(evt);
            }
        });
        jPanel1.add(idpetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 560, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 750, 100));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID PETUGAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jButton6.setText("CANCEL");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 110, 30));

        jButton4.setText("PRINT");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 110, 30));

        jButton7.setText("CETAK");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 120, 30));

        jLabel6.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FIND NAME OF EMPLOYE WITH DATE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));
        jPanel1.add(tgl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 240, 30));

        jButton8.setText("CARI");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 460, -1, 30));

        jButton9.setText("CARI");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, -1, 30));

        tglkedua.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglkeduaPropertyChange(evt);
            }
        });
        jPanel1.add(tglkedua, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 240, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal Akhir");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal Akhir");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, -1, -1));

        tglpertama.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglpertamaPropertyChange(evt);
            }
        });
        jPanel1.add(tglpertama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 500, 220, 30));

        tgl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgl1ActionPerformed(evt);
            }
        });
        jPanel1.add(tgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 220, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tanggal Awal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal Awal");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 540, 730, 100));

        jButton3.setText("CARI MAMANG");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idpetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpetugasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            String a =idpetugas.getText();
            HashMap param = new HashMap();
            param.put("clientid",a);

            File file = new File("src/report/LaporanClientID.jrxml");
            System.out.print(1);
            jasperdesign = JRXmlLoader.load(file);
            parameter.clear();
            System.out.print(2);

            jasperreport=JasperCompileManager.compileReport(jasperdesign);
            System.out.print(3);

            jasperprint=JasperFillManager.fillReport(jasperreport, param, koneksi.getConnection());
            JasperViewer.viewReport(jasperprint,false);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try{
            String a =tgl1.getText();
            String b =tgl2.getText();

            HashMap hash = new HashMap();
            hash.put("tgl1", a);
            hash.put("tgl2", b);

            File file = new File("src/report/LaporanClientTgl.jrxml");

            jasperdesign = JRXmlLoader.load(file);

            jasperreport=JasperCompileManager.compileReport(jasperdesign);
            jasperprint=JasperFillManager.fillReport(jasperreport, hash, koneksi.getConnection());
            JasperViewer.viewReport(jasperprint,false);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try{

            if (tglpertama.getDate() != null) {
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                tglawal = String.valueOf(format.format(tglpertama.getDate()));
            }

            if (tglkedua.getDate() != null) {
                String pattern = "yyyy-MM-dd";
                SimpleDateFormat format = new SimpleDateFormat(pattern);
                tglakhir = String.valueOf(format.format(tglkedua.getDate()));
            }

            HashMap hash = new HashMap();
            hash.put("tgl1", tglawal);
            hash.put("tgl2",tglakhir);

            File file = new File("src/report/LaporanClientTgl.jrxml");

            jasperdesign = JRXmlLoader.load(file);

            jasperreport=JasperCompileManager.compileReport(jasperdesign);
            jasperprint=JasperFillManager.fillReport(jasperreport, hash, koneksi.getConnection());
            JasperViewer.viewReport(jasperprint,false);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void tglkeduaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglkeduaPropertyChange

        // TODO add your handling code here:
        if (tglpertama.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tglawal = String.valueOf(format.format(tglpertama.getDate()));
        }
    }//GEN-LAST:event_tglkeduaPropertyChange

    private void tglpertamaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglpertamaPropertyChange
        // TODO add your handling code here:
        if (tglkedua.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tglakhir = String.valueOf(format.format(tglkedua.getDate()));
        }
    }//GEN-LAST:event_tglpertamaPropertyChange

    private void tgl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgl1ActionPerformed

    }//GEN-LAST:event_tgl1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

     DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID Client");
        tabelmapel.addColumn("Nama Client");
        tabelmapel.addColumn("Status Client");
        tabelmapel.addColumn("Alamat Client");
        tabelmapel.addColumn("Tanggal Pembuatan ID");
        tabelmapel.addColumn("Nomor HP");
        tabelmapel.addColumn("Gender");
        tabelmapel.addColumn("E-Mail");
        tabelmapel.addColumn("FOTO");
        try {
             sql = "select * from client";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[10];
                o[0] = rs.getString("id_client");
                o[1] = rs.getString("nama_client");
                o[2] = rs.getString("status");
                o[3] = rs.getString("alamat");
                o[4] = rs.getString("tpid");
                o[5] = rs.getString("no_hp");
                o[6] = rs.getString("gender");
                o[7] = rs.getString("email");
                o[8] = rs.getString("foto");
                
            
                tabelmapel.addRow(o);
                
            
            }
            jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(LaporanDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanDataClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaporanDataClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idpetugas;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField tgl1;
    private javax.swing.JTextField tgl2;
    private com.toedter.calendar.JDateChooser tglkedua;
    private com.toedter.calendar.JDateChooser tglpertama;
    // End of variables declaration//GEN-END:variables

    
      private void tampilkan_data() {
        
     DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID Client");
        tabelmapel.addColumn("Nama Client");
        tabelmapel.addColumn("Status Client");
        tabelmapel.addColumn("Alamat Client");
        tabelmapel.addColumn("Tanggal Pembuatan ID");
        tabelmapel.addColumn("Nomor HP");
        tabelmapel.addColumn("Gender");
        tabelmapel.addColumn("E-Mail");
        tabelmapel.addColumn("FOTO");
        try {
             sql = "select * from client";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[10];
                o[0] = rs.getString("id_client");
                o[1] = rs.getString("nama_client");
                o[2] = rs.getString("status");
                o[3] = rs.getString("alamat");
                o[4] = rs.getString("tpid");
                o[5] = rs.getString("no_hp");
                o[6] = rs.getString("gender");
                o[7] = rs.getString("email");
                o[8] = rs.getString("foto");
                
            
                tabelmapel.addRow(o);
                
            
            }
            jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    
     
      }  

    private void tampilkan_data2() {
        
     DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID Client");
        tabelmapel.addColumn("Nama Client");
        tabelmapel.addColumn("Status Client");
        tabelmapel.addColumn("Alamat Client");
        tabelmapel.addColumn("Tanggal Pembuatan ID");
        tabelmapel.addColumn("Nomor HP");
        tabelmapel.addColumn("Gender");
        tabelmapel.addColumn("E-Mail");
        tabelmapel.addColumn("FOTO");
        try {
             sql = "select * from client";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[10];
                o[0] = rs.getString("id_client");
                o[1] = rs.getString("nama_client");
                o[2] = rs.getString("status");
                o[3] = rs.getString("alamat");
                o[4] = rs.getString("tpid");
                o[5] = rs.getString("no_hp");
                o[6] = rs.getString("gender");
                o[7] = rs.getString("email");
                o[8] = rs.getString("foto");
                
            
                tabelmapel.addRow(o);
                
            
            }
            jTable2.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    
     
      }  

}
