/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import vistas.Menu;

public class Index extends javax.swing.JFrame {
    public Index() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        jbar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setText("Continuar");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jbar.setBackground(new java.awt.Color(0, 204, 204));
        jbar.setForeground(new java.awt.Color(0, 102, 102));
        jbar.setBorderPainted(false);
        jbar.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbar, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(b1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jbar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 450, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
     Avanzando avanzando = new Avanzando();
     avanzando.setBar(jbar);
     Thread hilo = new Thread(avanzando);
     hilo.start();
     Menu men = new Menu ();
     men.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_b1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jbar;
    // End of variables declaration//GEN-END:variables
}

class Avanzando implements Runnable
{
    JProgressBar bar;
    
    static int num_bar = 1;
    
    @Override
    public void run() 
    {
        for (int i = 1; i <= 100; i++)
        {      
            try 
            {
                Thread.sleep(100);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(Avanzando.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.getBar().setValue(i);
            
            if (this.getBar().getValue() == 100)
            {
                JOptionPane.showMessageDialog(new Index(), "Se han cargado los componentes al 100%");
                Menu men = new Menu();
                men.setVisible(true);
                            }                        
        }        
        num_bar++;
    }

    public void setBar(JProgressBar bar)
    {
        this.bar = bar;
    }
    
    public JProgressBar getBar()
    {
        return bar;
    }  
    public static void main(String[] args) {
        new Index().setVisible(true);
    }
}