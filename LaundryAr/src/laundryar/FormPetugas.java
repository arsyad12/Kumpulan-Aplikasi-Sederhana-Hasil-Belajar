/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LaundryAr;
import java.text.SimpleDateFormat;
import java.sql.*;
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
 * @author Administrator
 */
public class FormPetugas extends javax.swing.JFrame {
public String tgltugs="";

 public Connection con;
    public Statement stat;
    public ResultSet rs;
    public String sql = "";
    koneksi koneksi=new koneksi();
JasperReport jasperreport;
    JasperPrint jasperprint;
    JasperDesign jasperdesign;
    Map<String, Object> param = new HashMap<>();
    /**
     * Creates new form FormPinjam
     */
    public FormPetugas() {
        initComponents();
              setLocationRelativeTo(null);
        koneksi db = new koneksi();
        db.getConnection();
        con = db.con;
        stat = db.stat;
        tampilkan_data();
        idauto();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idpetugas = new javax.swing.JTextField();
        namapetugas = new javax.swing.JTextField();
        spesialis = new javax.swing.JTextField();
        jam = new javax.swing.JTextField();
        tgltugas = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        alamat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nomorhp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID PETUGAS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA PETUGAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JAM KERJA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TANGGAL TUGAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SPESIALIS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel1.add(idpetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 340, 30));
        jPanel1.add(namapetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 340, 30));
        jPanel1.add(spesialis, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 340, 30));
        jPanel1.add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 340, 30));

        tgltugas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgltugasPropertyChange(evt);
            }
        });
        jPanel1.add(tgltugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 340, 30));

        jLabel7.setFont(new java.awt.Font("Kristen ITC", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("FORM PETUGAS LAUNDRY AR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 330, 60));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));

        jButton4.setText("CLEAR");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 490, 100));
        jPanel1.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 340, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ALAMAT");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 340, 30));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMAIL");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jPanel1.add(nomorhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 340, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("NOMOR HP");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 340, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("STATUS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hero-product-pages.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tgltugasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgltugasPropertyChange

        // TODO add your handling code here:
        if (tgltugas.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            tgltugs = String.valueOf(format.format(tgltugas.getDate()));
        }

    }//GEN-LAST:event_tgltugasPropertyChange
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
             
        try {
            sql = "insert into petugas values ('"
           + idpetugas.getText() + "','"
           + namapetugas.getText() + "','"
           +    tgltugs    + "','"
           +    jam.getText()    + "','" 
           +    spesialis.getText()    + "','" 
           +    alamat.getText()    + "','" 
           +    email.getText()    + "','" 
           +    nomorhp.getText()    + "','" 
           + status.getText()+"')";
              
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Data "+ idpetugas.getText()+" Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data "+ idpetugas.getText()+" Tidak Berhasil Disimpan"+e);
        }

        idpetugas.setText("");
        namapetugas.setText("");
        tgltugas.setDate(null);
        jam.setText("");
        spesialis.setText("");
       alamat.setText("");
     email.setText("");
     nomorhp.setText("");
     status.setText("");
      tampilkan_data();
      idauto();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int tabel=jTable1.getSelectedRow();
        String idpetugass=jTable1.getValueAt(tabel, 0).toString();
        String namapetugass=jTable1.getValueAt(tabel, 1).toString();
        String jamm=jTable1.getValueAt(tabel, 3).toString();
        String spesialiss=jTable1.getValueAt(tabel, 4).toString();
        String alamatt=jTable1.getValueAt(tabel, 5).toString();
        String emaill=jTable1.getValueAt(tabel, 6).toString();
        String nomorhpp=jTable1.getValueAt(tabel, 7).toString();
        String statuss=jTable1.getValueAt(tabel, 8).toString();
         try {
            String s =(String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2);
          
            SimpleDateFormat f = new SimpleDateFormat("yyyy-M-dd");
            java.util.Date d = f.parse(s);
            tgltugas.setDate(d);
            
        } catch (Exception e) {

        }
     idpetugas.setText(idpetugass);
     namapetugas.setText(namapetugass);   
     jam.setText(jamm);
     spesialis.setText(spesialiss);
     alamat.setText(alamatt);
     email.setText(emaill);
     nomorhp.setText(nomorhpp);
     status.setText(statuss);
      
    
        
        try {
          sql="Select * from buku";
               rs=stat.executeQuery(sql);
            while (rs.next()) {
         
     idpetugas.setText(rs.getString(idpetugass));
     namapetugas.setText(rs.getString(namapetugass));   
     jam.setText(rs.getString(jamm));
     spesialis.setText(rs.getString(spesialiss));
     alamat.setText(rs.getString(alamatt));
     email.setText(rs.getString(emaill));
     nomorhp.setText(rs.getString(nomorhpp));
     status.setText(rs.getString(statuss));
       
                
         
        
          
         
            }
        }
        catch (Exception x) {
             
        }
                                  
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       try {
            sql="update petugas set nama_petugas='"+namapetugas.getText()
                    +"',tgl_tugas='"+tgltugs               
                    +"',jam_kerja='"+jam.getText()
                    +"',spesialis='"+spesialis.getText()
                    +"',alamat='"+alamat.getText()
                    +"',email='"+email.getText()
                    +"',no_hp='"+nomorhp.getText()
                    +"'where id_petugas='"+idpetugas.getText()+"'";
            
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Data " + idpetugas.getText() + "" + " Telah Di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data " + idpetugas.getText() + "" + " Belum Di Edit"+e);
        }

          idpetugas.setText("");
        namapetugas.setText("");
        tgltugas.setDate(null);
        jam.setText("");
        spesialis.setText("");
       alamat.setText("");
     email.setText("");
     nomorhp.setText("");
     status.setText("");
        
        tampilkan_data();
        idauto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      try {
            sql = "delete from petugas where id_petugas='" + idpetugas.getText() + "'";
            stat = con.createStatement();
            stat.executeUpdate(sql);
            stat.close();
            JOptionPane.showMessageDialog(null, "Data " + idpetugas.getText() + "" + " Telah Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data " +idpetugas.getText() + "" + " Belum Dihapus");
        }
        
         idpetugas.setText("");
        namapetugas.setText("");
        tgltugas.setDate(null);
        jam.setText("");
        spesialis.setText("");
       alamat.setText("");
     email.setText("");
     nomorhp.setText("");
     status.setText("");
        idauto();
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
            java.util.logging.Logger.getLogger(FormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPetugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPetugas().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField email;
    private javax.swing.JTextField idpetugas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jam;
    private javax.swing.JTextField namapetugas;
    private javax.swing.JTextField nomorhp;
    private javax.swing.JTextField spesialis;
    private javax.swing.JTextField status;
    private com.toedter.calendar.JDateChooser tgltugas;
    // End of variables declaration//GEN-END:variables

 private void tampilkan_data() {
      DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID Petugas");
        tabelmapel.addColumn("Nama Petugas");
        tabelmapel.addColumn("Tanggal Tugas");
        tabelmapel.addColumn("Jam Kerja");
        tabelmapel.addColumn("Spesialis");
        tabelmapel.addColumn("Alamat");
        tabelmapel.addColumn("Email");
        tabelmapel.addColumn("Nomor HP");
        tabelmapel.addColumn("Status");
        try {
             sql = "select * from petugas";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[10];
                o[0] = rs.getString("id_petugas");
                o[1] = rs.getString("nama_petugas");
                o[2] = rs.getString("tgl_tugas");
                o[3] = rs.getString("jam_kerja");
                o[4] = rs.getString("spesialis");
                o[5] = rs.getString("alamat");
                o[6] = rs.getString("email");
                o[7] = rs.getString("no_hp");
                o[8] = rs.getString("status");
                tabelmapel.addRow(o);

            }
            jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    
     
 }

private void idauto(){
           try{
    
    String sql="select right (id_petugas,2) as id_petugas from petugas";
    Statement stat=con.createStatement();
    ResultSet rs=stat.executeQuery(sql);
    if(rs.first()==false){
       
    }else{ 
        rs.last(); 
        int no=rs.getInt(1)+1;
        String cno=String.valueOf(no);
        int pjg_cno=cno.length();
        for(int i=0;i<2-pjg_cno;i++){
         
    
}
        
    idpetugas.setText("SP00"+cno);
        
    }
}catch(Exception e ){
}
}

}



