/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import JDBC.Connect;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kadhem
 */
public class Jaffectation extends javax.swing.JFrame {

    /**
     * Creates new form Jaffectation
     */
    private DefaultTableModel dt; 
    ResultSet rs=null;
    ResultSet rs2=null;
    HashMap hm = new HashMap();
    HashMap hmg = new HashMap();
    PreparedStatement ps=null;
    PreparedStatement ps2=null;
    int ligne;
    public Jaffectation() throws SQLException {
        initComponents();
        myInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Num Guichet", "Service"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 100, 460, 160);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/finances2.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 10, 120, 73);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/fianances.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 80, 113, 143);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Recette des finances Av. Med. Mâarouf ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 20, 306, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("القباضـة الماليّـة شارع محمّد معروف بسوســة");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 40, 259, 15);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(170, 60, 410, 20);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/1458320500_Home01.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 10, 65, 41);

        jButton2.setText("Lister ");
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 270, 73, 23);

        jButton3.setText("Desactiver tous les Services");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 270, 200, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>());
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(130, 340, 160, 20);

        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(380, 340, 170, 20);

        jButton4.setText("Enregistrer");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(570, 340, 90, 23);

        jLabel1.setText("Guichet :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 334, 50, 30);

        jLabel3.setText("Service :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 340, 50, 20);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(40, 320, 10, 60);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(130, 320, 550, 10);
        getContentPane().add(jSeparator4);
        jSeparator4.setBounds(40, 380, 640, 10);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator5);
        jSeparator5.setBounds(680, 320, 10, 60);

        jLabel7.setText("Affectation");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 310, 90, 14);

        DateFormat dateFormat = new SimpleDateFormat("ddMMMyyyy",Locale.FRANCE);
        Calendar cal = Calendar.getInstance();
        String s=dateFormat.format(cal.getTime());
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText(s);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 400, 80, 14);

        jButton5.setText("Desactiver service");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(200, 270, 140, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JPrincipale p=new JPrincipale();

        p.getContentPane().setPreferredSize(new Dimension(650,400));
        p.pack();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            
            String stat=(String)jComboBox1.getSelectedItem();
            int stat2=Integer.parseInt((String)jComboBox2.getSelectedItem());
             java.sql.Date sqlStartDate = new java.sql.Date( new Date().getTime());
            Connection con=Connect.conDB();
            ps=con.prepareStatement("INSERT INTO `service_has_guichet`(id_service,id_guichet,date) VALUES (?,?,?)");
            ps.setInt(1,(int)hm.get(stat));
            ps.setInt(2,(int)hmg.get(stat2));
            ps.setDate(3,sqlStartDate);
            ps.executeUpdate();
            hm.clear();
            hmg.clear();
            jComboBox1.removeAllItems();
            jComboBox1.revalidate();
            jComboBox1.repaint();
            jComboBox2.removeAllItems();
            
             
            ps=con.prepareStatement("SELECT id_service,nomAR FROM `service` where NOT EXISTS (SELECT id_service FROM `service_has_guichet` where service.id_service=service_has_guichet.id_service )");
            rs = ps.executeQuery();
            while(rs.next()){
               int ida=rs.getInt("id_service");
               String titre=rs.getString("nomAR");
               System.out.println(titre);
               if (titre!=stat){
               hm.put(titre,ida);}
               }//To change body of generated methods, choose Tools | Templates.
              Set cles = hm.keySet();
              Iterator it = cles.iterator();
              while (it.hasNext()){
              Object cle = it.next();
              //System.out.println((String)hm.get(cle));
             jComboBox1.addItem((String)cle);
              // tu peux typer plus finement ici
}
    
            jComboBox1.revalidate();
            jComboBox1.repaint();
      
             ps=con.prepareStatement("SELECT id_guichet,num_guichet FROM `guichet` where NOT EXISTS (SELECT id_guichet FROM `service_has_guichet` where guichet.id_guichet=service_has_guichet.id_guichet )");
             
             rs = ps.executeQuery();
             
              while(rs.next()){
               int ida=rs.getInt("id_guichet");
              int num=rs.getInt("num_guichet");
               hmg.put(num,ida);
               
               }//To change body of generated methods, choose Tools | Templates.
              Set clesg = hmg.keySet();
              Iterator itg = clesg.iterator();
              while (itg.hasNext()){
              Object cle = itg.next();
             
              jComboBox2.addItem(String.valueOf(cle));
              // tu peux typer plus finement ici
}
               dt.setRowCount(0);
               String Sql1 = "Select * From  service_has_guichet";
 
       ps=con.prepareStatement(Sql1);
      rs = ps.executeQuery();

        
        while(rs.next()){
               
                 int ids = rs.getInt("id_service");
                 int idg = rs.getInt("id_guichet");
                  String Sql2 = "Select nomAR From  service where id_service="+ids;
                  ps=con.prepareStatement(Sql2);
                  rs2= ps.executeQuery();
                  rs2.next();
                 String nom=rs2.getString("nomAR");
              Object[] stg = {idg,nom};
            dt.addRow(stg);
        }
        } catch (SQLException ex) {
            Logger.getLogger(Jaffectation.class.getName()).log(Level.SEVERE, null, ex);
        }
            jComboBox2.revalidate();
            jComboBox2.repaint();
            
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Connection con=Connect.conDB();
            ps=con.prepareStatement("DELETE FROM service_has_guichet ");
            ps.executeUpdate();
            dt.setRowCount(0);
        } catch (SQLException ex) {
            Logger.getLogger(Jaffectation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            int idgs= (int)dt.getValueAt(ligne, 0) ;
            
            String Sql = "DELETE FROM service_has_guichet WHERE id_guichet="+idgs;
            Connection con=Connect.conDB();
            ps=con.prepareStatement(Sql);
            ps.executeUpdate();
             dt.setRowCount(0);
               String Sql1 = "Select * From  service_has_guichet";
 
       ps=con.prepareStatement(Sql1);
      rs = ps.executeQuery();

        
        while(rs.next()){
               
                 int ids = rs.getInt("id_service");
                 int idg = rs.getInt("id_guichet");
                  String Sql2 = "Select nomAR From  service where id_service="+ids;
                  ps=con.prepareStatement(Sql2);
                  rs2= ps.executeQuery();
                  rs2.next();
                 String nom=rs2.getString("nomAR");
              Object[] stg = {idg,nom};
            dt.addRow(stg);}
        } catch (SQLException ex) {
            Logger.getLogger(Jaffectation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        ligne= jTable1.getSelectedRow();
        System.out.println(ligne);
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Jaffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jaffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jaffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jaffectation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Jaffectation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Jaffectation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void myInit() throws SQLException {
        String Sql = "SELECT id_service,nomAR FROM `service` where NOT EXISTS (SELECT id_service FROM `service_has_guichet` where service.id_service=service_has_guichet.id_service )";
       Connection con=Connect.conDB();
             ps=con.prepareStatement(Sql);
             
             rs = ps.executeQuery();
             
              while(rs.next()){
               int ida=rs.getInt("id_service");
               String titre=rs.getString("nomAR");
               hm.put(titre,ida);
               }//To change body of generated methods, choose Tools | Templates.
              Set cles = hm.keySet();
              Iterator it = cles.iterator();
              while (it.hasNext()){
              Object cle = it.next();
              //System.out.println((String)hm.get(cle));
              jComboBox1.addItem((String)cle);
              // tu peux typer plus finement ici
}
    
Sql = "SELECT id_guichet,num_guichet FROM `guichet` where NOT EXISTS (SELECT id_guichet FROM `service_has_guichet` where guichet.id_guichet=service_has_guichet.id_guichet )";
      
             ps=con.prepareStatement(Sql);
             
             rs = ps.executeQuery();
             
              while(rs.next()){
               int ida=rs.getInt("id_guichet");
               int num=rs.getInt("num_guichet");
               hmg.put(num,ida);
               
               }//To change body of generated methods, choose Tools | Templates.
              Set clesg = hmg.keySet();
              Iterator itg = clesg.iterator();
              while (itg.hasNext()){
              Object cle = itg.next();
              System.out.println(cle);
               jComboBox2.addItem(String.valueOf(cle));
              // tu peux typer plus finement ici
}
              dt = new DefaultTableModel();// dt c'est un variable pour stocké les element d'un tableau {ligne et colomn}
               dt.addColumn("Num Guichet");
               dt.addColumn("Service");
               jTable1.setModel(dt);
               
              String Sql1 = "Select * From  service_has_guichet";
 
       ps=con.prepareStatement(Sql1);
      rs = ps.executeQuery();

        
        while(rs.next()){
               
                 int ids = rs.getInt("id_service");
                 int idg = rs.getInt("id_guichet");
                  String Sql2 = "Select nomAR From  service where id_service="+ids;
                  ps=con.prepareStatement(Sql2);
                  rs2= ps.executeQuery();
                  rs2.next();
                 String nom=rs2.getString("nomAR");
              Object[] stg = {idg,nom};
            dt.addRow(stg);
        }
    }//To change body of generated methods, choose Tools | Templates.
    }

