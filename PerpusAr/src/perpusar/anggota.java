/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpusar;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
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
public class anggota extends javax.swing.JFrame {
 public Connection con;
    public Statement stat;
    public ResultSet rs;
    public String sql = "";
    public String date = "";
    String filename=null;
byte[] person_image=null;
koneksi koneksi=new koneksi();
JasperReport jasperreport;
    JasperPrint jasperprint;
    JasperDesign jasperdesign;
    Map<String, Object> param = new HashMap<>();
    
    /**
     * Creates new form 
     */
    public anggota() {
        initComponents();
        setLocationRelativeTo(null);
        koneksi db = new koneksi();
        db.getConnection();
        con = db.con;
        stat = db.stat;
        tampilkan_data();
        
        
       
    }
    
    private ImageIcon format = null;{
}

    anggota(String userakses) {
    
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
        na = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        al = new javax.swing.JTextField();
        hp = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tgl = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        image = new javax.swing.JButton();
        foto = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(na, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 340, 30));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 340, 30));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 340, 30));

        al.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alActionPerformed(evt);
            }
        });
        jPanel1.add(al, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 340, 30));

        hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpActionPerformed(evt);
            }
        });
        jPanel1.add(hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 340, 30));
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 340, 30));

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 340, 30));

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, -1));

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 480, 90));

        tgl.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tglPropertyChange(evt);
            }
        });
        jPanel1.add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 340, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM ANGGOTA PERPUSTAKAAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jButton1.setText("CLEAR");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Anggota");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Anggota");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status Anggota");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Tanggal Pembuatan ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nomor HP");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("E-MAIL");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        image.setText("Select Image");
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, -1, -1));
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 240, 160));

        jButton2.setText("CETAK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/photo-1529007196863-d07650a3f0ea.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        
        try {
            sql = "insert into anggota values ('"
            + id.getText() + "','"
            + na.getText() + "','"
            + status.getText() + "','"
            + al.getText() + "','"
            +    date    + "','"
            + hp.getText() + "','"
            + gen.getText()+ "','"
            + mail.getText()+ "','"
            + foto.getText()+"')";
            
              
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Data "+ na.getText()+" Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data "+ na.getText()+" Tidak Berhasil Disimpan"+e);
        }

        na.setText("");
        id.setText("");
        status.setText("");
        al.setText("");
        tgl.setDate(null);
        hp.setText("");
        gen.setText("");
        mail.setText("");
     foto.setIcon(format);
     foto.setText("");

        tampilkan_data();
    }//GEN-LAST:event_addActionPerformed

    private void tglPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tglPropertyChange
        // TODO add your handling code here:
          if (tgl.getDate() != null) {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            date = String.valueOf(format.format(tgl.getDate()));
        }
    }//GEN-LAST:event_tglPropertyChange

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
             
            
        try {
            sql="update anggota set id_anggota='"+id.getText()
                    +"',nama='"+na.getText()
                    +"',status='"+status.getText()
                    +"',alamat='"+al.getText()
                    +"',tpid='"+date
                    +"',no_hp='"+hp.getText()
                    +"',gender='"+gen.getText()
                    +"',email='"+mail.getText()+"'";
            stat = con.createStatement();
            stat.execute(sql);
            JOptionPane.showMessageDialog(null, "Data " + na.getText() + "" + " Telah Di Edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data " + na.getText() + "" + " Belum Di Edit"+e);
        }

        na.setText("");

       tgl.setDate(null);

        id.setText("");

        status.setText("");

        al.setText("");

        hp.setText("");
        
        gen.setText("");
  
        mail.setText("");
        
       
              tampilkan_data();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        try {
            sql = "delete from anggota where id_anggota='" + id.getText() + "'";
            stat = con.createStatement();
            stat.executeUpdate(sql);
            stat.close();
            JOptionPane.showMessageDialog(null, "Data " + id.getText() + "" + " Telah Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data " +id.getText() + "" + " Belum Dihapus");
        }
        
        na.setText("");

        tgl.setDate(null);

        status.setText("");

        al.setText("");

        hp.setText("");

        gen.setText("");
   
        mail.setText("");
         
   tampilkan_data();
    }//GEN-LAST:event_deleteActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        // TODO add your handling code here:
//        JFileChooser chooser = new JFileChooser();
//chooser.showOpenDialog(null);
//File f= chooser.getSelectedFile();
//        filename = f.getAbsolutePath();
//        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),Image.SCALE_SMOOTH ));
//        foto.setIcon(imageicon);


JFileChooser chooser = new JFileChooser();
chooser.showOpenDialog(null);
File f= chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),Image.SCALE_SMOOTH ));
foto.setText(filename);
foto.setIcon(imageicon);

        try {
        File image= new File (filename);
        FileInputStream fis= new FileInputStream(image);
        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        byte[] buf = new byte [1024];
        for(int readNum; (readNum=fis.read(buf)) !=-1;){
            
        bos.write(buf, 0, readNum);     
            Icon ImageIcon = null;
             
        }
          person_image=bos.toByteArray();
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_imageActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int tabel=jTable1.getSelectedRow();
        String id_anggota=jTable1.getValueAt(tabel, 0).toString();
        String namaa=jTable1.getValueAt(tabel, 1).toString();
        String statuss=jTable1.getValueAt(tabel, 2).toString();

        String alamatt=jTable1.getValueAt(tabel, 3).toString();
        
        String hpp=jTable1.getValueAt(tabel, 5).toString();
        String gender=jTable1.getValueAt(tabel, 6).toString();
        String email=jTable1.getValueAt(tabel, 7).toString();
       
        
        
        try {
            String s =(String)jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4);
            SimpleDateFormat f = new SimpleDateFormat("yyyy-M-dd");
            java.util.Date d = f.parse(s);
            tgl.setDate(d);
            
        String gambar=(String) jTable1.getValueAt(jTable1.getSelectedRow(), 8);
        foto.setText(gambar);

        ImageIcon icon = new ImageIcon(gambar);
        foto.setIcon(icon);
            
            
        } catch (Exception e) {

        }

        na.setText(namaa);
        id.setText(id_anggota);
        status.setText(statuss);
        al.setText(alamatt);
        hp.setText(hpp);
        gen.setText(gender);
        mail.setText(email);
        

        try {
            sql="Select * from anggota";
            rs=stat.executeQuery(sql);
            while (rs.next()) {

                na.setText(rs.getString(namaa));
                id.setText(rs.getString(id_anggota));
                status.setText(rs.getString(statuss));
                al.setText(rs.getString(alamatt));
                hp.setText(rs.getString(hpp));
                gen.setText(rs.getString(gender));
                mail.setText(rs.getString(email));

            }
        }
        catch (Exception x) {

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_hpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
            File file = new File 
                    ("src/report/LaporanAnggotaAll.jrxml");
            jasperdesign = JRXmlLoader.load(file);
            param.clear();
            jasperreport=JasperCompileManager.compileReport(jasperdesign);
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
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(anggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new anggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField al;
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JLabel foto;
    private javax.swing.JTextField gen;
    private javax.swing.JTextField hp;
    private javax.swing.JTextField id;
    private javax.swing.JButton image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField mail;
    private javax.swing.JTextField na;
    private javax.swing.JTextField status;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables



    
    private void tampilkan_data() {
        DefaultTableModel tabelmapel = new DefaultTableModel();
        tabelmapel.addColumn("ID ANGGOTA");
        tabelmapel.addColumn("Nama Anggota");
        tabelmapel.addColumn("Status Anggota");
        tabelmapel.addColumn("Alamat");
        tabelmapel.addColumn("Tanggal Pembuatan ID");
        tabelmapel.addColumn("Nomor HP");
        tabelmapel.addColumn("Gender");
        tabelmapel.addColumn("E-Mail");
        try {
             sql = "select * from anggota";
            stat = con.createStatement();
            rs = stat.executeQuery(sql);
            while (rs.next()) {
                Object[] o =new Object[10];
                o[0] = rs.getString("id_anggota");
                o[1] = rs.getString("nama");
                o[2] = rs.getString("status");
                o[3] = rs.getString("alamat");
                o[4] = rs.getString("tpid");
                o[5] = rs.getString("no_hp");
                o[6] = rs.getString("gender");
                o[7] = rs.getString("email");
                
            
                tabelmapel.addRow(o);
                
            }
           jTable1.setModel(tabelmapel);
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage() );
        }
    }



}
