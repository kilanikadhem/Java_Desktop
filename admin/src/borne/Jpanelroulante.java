/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borne;

import JDBC.Connect;
import java.awt.Graphics;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;

/**
 *
 * @author kadhem
 */
public class Jpanelroulante extends javax.swing.JPanel {
    ResultSet rs=null;
    ResultSet rs2=null;
    PreparedStatement ps=null;
    String scrol=null;
    public int x,y;
    public Jpanelroulante() throws SQLException, IOException {
        initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void myInitComponents() throws SQLException, IOException {
        Connection con=Connect.conDB();
        
       String sql="SELECT titreAR_actualite FROM `actualite`";
        ps=con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            
              String titreAR=rs.getString("titreAR_actualite");
              scrol=scrol+titreAR;
    }
        while(true){
            while (x<1000){
                x++;
                repaint();
            
            }
        
        
        }
    }
public void paint(Graphics g){
    g.drawString(scrol,1000,600);
    g.fillRect(0, 0, 400, 300);
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}