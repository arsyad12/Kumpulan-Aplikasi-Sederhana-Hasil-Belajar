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
public class LaporanDataPinjam extends javax.swing.JFrame {
     public Connection con;
    public Statement stat;
    public ResultSet rs;
    public String sql = "";
    koneksi koneksi=new koneksi();
JasperReport jasperreport;
    JasperPrint jasperprint;
    JasperDesign jasperdesign;
    Map<String, Object> parameter = new HashMap<>();
    

    /** Creates new form LaporanDataBuku */
    public LaporanDataPinjam() {
         initComponents();
              
        setLocationRelativeTo(null);
        koneksi db = new koneksi();
        db.getConnection();
        con = db.con;
        stat = db.stat;
        tampilkan_data();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 530, 100));

        jButton1.setText("PRINT");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jButton2.setText("CETAK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jButton5.setText("CANCEL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel1.setText("ID BUKU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 240, 30));

        jButton3.setText("CARI MAMANG");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID PEMINJAM");
        tabelmapel.addColumn("ID BUKU");
        tabelmapel.addColumn("NAMA BUKU");
        tabelmapel.addColumn("TGL PINJAM");
        tabelmapel.addColumn("TGL KEMBALI");
        tabelmapel.addColumn("PETUGAS");
      
     
        try {
          sql = "select * from pinjam where idpinjam='"+id.getText()+"'";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[6];
                o[0] = rs.getString("idpinjam");
                o[1] = rs.getString("idbuku");
                o[2] = rs.getString("namabuku");
                o[3] = rs.getString("tglpinjam");
                o[4] = rs.getString("tglkembali");
                o[5] = rs.getString("petugas");
               
             
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }

  
    
     

        
        
        
        
        
        
       

  
    
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try{
                String a =id.getText();
                HashMap param = new HashMap();
                param.put("pinjam",a);
                        
            File file = new File("src/report/LaporanPinjam.jrxml");
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
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LaporanDataPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaporanDataPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaporanDataPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaporanDataPinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaporanDataPinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
       private void tampilkan_data() {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID PEMINJAM");
        tabelmapel.addColumn("ID BUKU");
        tabelmapel.addColumn("NAMA BUKU");
        tabelmapel.addColumn("TGL PINJAM");
        tabelmapel.addColumn("TGL KEMBALI");
        tabelmapel.addColumn("PETUGAS");
      
     
        try {
             sql = "select * from pinjam";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[6];
                o[0] = rs.getString("idpinjam");
                o[1] = rs.getString("idbuku");
                o[2] = rs.getString("namabuku");
                o[3] = rs.getString("tglpinjam");
                o[4] = rs.getString("tglkembali");
                o[5] = rs.getString("petugas");
               
             
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }

  
    
     }

    
     
    
}
