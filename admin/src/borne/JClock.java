/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package borne;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author kadhem
 */
public class JClock extends javax.swing.JPanel implements Runnable {
     Thread runner;
    /**
     * Creates new form JClock
     */
    public JClock() {
        initComponents();
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }
     public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { }
        }
    }
      public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D)comp;
        Font type = new Font("Arial",Font.BOLD,34);
        comp2D.setFont(type);
        comp2D.setColor(getBackground());
        comp2D.fillRect(0, 0, getSize().width, getSize().height);
        String day = new java.util.Date().toString();
        //time = day.getTime();
        comp2D.setColor(Color.gray);
        comp2D.drawString(day, 5, 25);
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
