/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpusar;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author Administrator
 */
public class FormPengembalian extends javax.swing.JFrame {
public String tglpin="";
public String deadline="";
public String tglbalik="";


public Connection con;
    public Statement stat;
    public ResultSet rs;
    public String sql = "";
    
      public String kodebarang="";
    Integer  total, jumlahtelat, tagihan;
    /**
     * Creates new form FormPengembalian
     */
    public FormPengembalian() {
        initComponents();
                    setLocationRelativeTo(null);
        koneksi db = new koneksi();
        db.getConnection();
        con = db.con;
        stat = db.stat;
        tampilkan_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tglpinjam = new com.toedter.calendar.JDateChooser();
        dead = new com.toedter.calendar.JDateChooser();
        idbuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        balik = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        denda = new javax.swing.JTextField();
        lamapinjam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idpinjam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        terlambat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        idanggota = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID PINJAM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel2.setText("TGL PINJAM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setText("TGL KEMBALI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel4.setText("DENDA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel5.setText("LAMA PINJAM");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        tglpinjam.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglpinjamPropertyChange(evt);
            }
        });
        getContentPane().add(tglpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 340, 30));

        dead.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                deadPropertyChange(evt);
            }
        });
        getContentPane().add(dead, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 340, 30));

        idbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbukuActionPerformed(evt);
            }
        });
        getContentPane().add(idbuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 340, 30));

        jLabel6.setText("DEADLINE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        balik.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                balikPropertyChange(evt);
            }
        });
        getContentPane().add(balik, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 340, 30));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 740, 100));
        getContentPane().add(denda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 340, 30));
        getContentPane().add(lamapinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 60, 30));

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 70, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("HARI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 40, 30));

        jLabel8.setText("ID BUKU");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        idpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpinjamActionPerformed(evt);
            }
        });
        getContentPane().add(idpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 340, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("HARI");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 40, 30));

        terlambat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terlambatActionPerformed(evt);
            }
        });
        getContentPane().add(terlambat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 60, 30));

        jLabel10.setText("TELAT");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 80, 40));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 70, 40));

        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 70, 40));

        jLabel12.setText("ID ANGGOTA");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        idanggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idanggotaActionPerformed(evt);
            }
        });
        getContentPane().add(idanggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 340, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("FORM PENGEMBALIAN BUKU");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tglpinjamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglpinjamPropertyChange

        // TODO add your handling code here:
        if (tglpinjam.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tglpin = String.valueOf(format.format(tglpinjam.getDate()));
        }
    }//GEN-LAST:event_tglpinjamPropertyChange

    private void deadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_deadPropertyChange
        // TODO add your handling code here:
        if (dead.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            deadline = String.valueOf(format.format(dead.getDate()));
    }//GEN-LAST:event_deadPropertyChange
    }
    private void idbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbukuActionPerformed

    private void balikPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_balikPropertyChange
           if (balik.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tglbalik = String.valueOf(format.format(balik.getDate()));
    }  
    }//GEN-LAST:event_balikPropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date tanggalpinjam = format.parse(tglpin);
    Date tanggalbalik = format.parse(tglbalik);
    Date jatuhtempo = format.parse(deadline);
    
    long tanggalpinjam1 = tanggalpinjam.getTime();
    long tanggalbalik1 = tanggalbalik.getTime();
    long jatuhtempo1 = jatuhtempo.getTime();
    
    long selisih1 = tanggalbalik1 - tanggalpinjam1;
    long lama = selisih1 / (24 * 60 * 60 * 1000);
    
    long selisih2 = tanggalbalik1 - jatuhtempo1;
    long telat = selisih2 / (24 * 60 * 60 * 1000);
    
    lamapinjam.setText(Long.toString(lama) + "");
    terlambat.setText(Long.toString(telat) + "");
    
    
    jumlahtelat = Integer.parseInt(terlambat.getText());
    tagihan= 500;
    total = tagihan*jumlahtelat;
    
    Double disk = 0.0;
    denda.setText(String.valueOf(total));
    
       
 } catch (Exception e) {
    System.out.println("" + e.getMessage());
}
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpinjamActionPerformed

    private void terlambatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terlambatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terlambatActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          try {
            sql = "insert into pengembalian values ('"
            + idpinjam.getText() + "','"
            + idbuku.getText() + "','"
            + idanggota.getText() + "','"
            +    tglpin    + "','"
            +    tglbalik    + "','"
            +    deadline    + "','" 
            + lamapinjam.getText() + "','"
            + terlambat.getText() + "','"
            + denda.getText() +"')";
              
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Data "+ idpinjam.getText()+" Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data "+ idpinjam.getText()+" Tidak Berhasil Disimpan"+e);
        }

        idpinjam.setText("");
        idbuku.setText("");
        tglpinjam.setDate(null);
        balik.setDate(null);
        dead.setDate(null);
        lamapinjam.setText("");
        terlambat.setText("");
        denda.setText("");
        
        tampilkan_data();
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int tabel=jTable1.getSelectedRow();
        String klikidpinjam=jTable1.getValueAt(tabel, 0).toString();
        String klikidbuku=jTable1.getValueAt(tabel, 1).toString();
        String klikidanggota=jTable1.getValueAt(tabel, 2).toString();
        String kliklamapinjam=jTable1.getValueAt(tabel, 6).toString();
       String klikterlambat=jTable1.getValueAt(tabel, 7).toString();
       String klikdenda=jTable1.getValueAt(tabel, 8).toString();
  
      
         try {
            String tanggalpinjam =(String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3);
            String tanggalkembali =(String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4);
            String deadline =(String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5);
            SimpleDateFormat f = new SimpleDateFormat("yyyy-M-dd");
            java.util.Date a = f.parse(tanggalpinjam);
            java.util.Date b = f.parse(tanggalkembali);
            java.util.Date c = f.parse(deadline);
            tglpinjam.setDate(a);
            balik.setDate(b);
            dead.setDate(c);
            
        } catch (Exception e) {

        }
        
        idpinjam.setText(klikidpinjam);
        idbuku.setText(klikidbuku);
        lamapinjam.setText(kliklamapinjam);
        terlambat.setText(klikterlambat);
        denda.setText(klikdenda);
      idanggota.setText(klikidanggota);
    
        
        try {
          sql="Select * from pengembalian";
               rs=stat.executeQuery(sql);
            while (rs.next()) {
         
                
                
          idpinjam.setText(rs.getString(klikidpinjam));
        idbuku.setText(rs.getString(klikidbuku));
        lamapinjam.setText(rs.getString(kliklamapinjam));
        terlambat.setText(rs.getString(klikterlambat));
        denda.setText(rs.getString(klikdenda));
           idanggota.setText(rs.getString(klikidanggota));
          
         
            }
        }
        catch (Exception x) {
             
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          
            
        try {
            sql="update pengembalian set id_pinjam='"+idpinjam.getText()
                    +"',id_buku='"+idbuku.getText()
                    +"',id_anggota='"+idanggota.getText()
                    +"',tanggalpinjam='"+tglpin
                    +"',tanggalkembali='"+tglbalik
                    +"',deadline='"+deadline
                    +"',lamapinjam='"+lamapinjam.getText()
                    +"',terlambat='"+terlambat.getText()
                    +"',denda='"+denda.getText()+"'";
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Data " + idbuku.getText() + "" + " Telah Di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data " + idbuku.getText() + "" + " Belum Di Edit"+e);
        }

        idpinjam.setText("");

        tglpinjam.setDate(null);
        balik.setDate(null);
        dead.setDate(null);
        
        lamapinjam.setText("");

        terlambat.setText("");

        denda.setText("");

        idbuku.setText("");
        
    
        
       
              tampilkan_data();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idanggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idanggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idanggotaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
            sql = "delete from pengembalian where id_pinjam='" + idpinjam.getText() + "'";
            stat = con.createStatement();
            stat.executeUpdate(sql);
            stat.close();
            JOptionPane.showMessageDialog(null, "Data " +  idpinjam.getText() + "" + " Telah Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data " + idpinjam.getText() + "" + " Belum Dihapus");
        }
        
         idpinjam.setText("");

        idanggota.setText("");
        
         idbuku.setText("");
     
        tglpinjam.setDate(null);
        balik.setDate(null);
        dead.setDate(null);

        lamapinjam.setText("");
        terlambat.setText("");
        denda.setText("");
        
        
        tampilkan_data();
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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser balik;
    private com.toedter.calendar.JDateChooser dead;
    private javax.swing.JTextField denda;
    private javax.swing.JTextField idanggota;
    private javax.swing.JTextField idbuku;
    private javax.swing.JTextField idpinjam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lamapinjam;
    private javax.swing.JTextField terlambat;
    private com.toedter.calendar.JDateChooser tglpinjam;
    // End of variables declaration//GEN-END:variables

     private void tampilkan_data() {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID PINJAM");
        tabelmapel.addColumn("ID BUKU");
        tabelmapel.addColumn("ID ANGGOTA");
        tabelmapel.addColumn("TGL PINJAM");
        tabelmapel.addColumn("TGL KEMBALI");
        tabelmapel.addColumn("DEADLINE");
        tabelmapel.addColumn("LAMA PIJAM");
        tabelmapel.addColumn("TERLAMBAT");
        tabelmapel.addColumn("DENDA");
      
     
        try {
             sql = "select * from pengembalian";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[9];
                o[0] = rs.getString("id_pinjam");
                o[1] = rs.getString("id_buku");
                o[2] = rs.getString("id_anggota");
                o[3] = rs.getString("tanggalpinjam");
                o[4] = rs.getString("tanggalkembali");
                o[5] = rs.getString("deadline");
                o[6] = rs.getString("lamapinjam");
                o[7] = rs.getString("terlambat");
                o[8] = rs.getString("denda");
               
             
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }

  
    
    
     }

     
     
     
}