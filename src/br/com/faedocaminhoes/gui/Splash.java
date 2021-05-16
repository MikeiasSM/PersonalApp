/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faedocaminhoes.gui;

import br.com.faedocaminhoes.connection.ConnectionFactory;
import br.com.faedocaminhoes.uteis.JPaneError;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JRootPane;
import javax.swing.UIManager;

/**
 *
 * @author Mikeias
 */
public final class Splash extends javax.swing.JDialog {
    // Define uma Thread para simular rodando
    Thread roda;
    EntityManager em;
    /**
     * Creates new form Splash
     * @param parent
     * @param modal
     */
    public Splash(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        UIManager.put("ProgressBar.background", new Color(255, 255, 255));
        UIManager.put("ProgressBar.foreground", new Color(84, 197, 248));
        UIManager.put("ProgressBar.selectionBackground",  new Color(12, 69, 159));
        UIManager.put("ProgressBar.selectionForeground", new Color(84, 197, 248));
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        
        exProgressBar();
         
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
        jLabel4 = new javax.swing.JLabel();
        progBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 69, 159));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/faedocaminhoes/icons/Iniciando.gif"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 728, 454));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        progBar.setBackground(new java.awt.Color(255, 255, 255));
        progBar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        progBar.setForeground(new java.awt.Color(77, 171, 196));
        getContentPane().add(progBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 730, 28));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Splash dialog = new Splash(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progBar;
    // End of variables declaration//GEN-END:variables
  
    
    public void exProgressBar(){
        progBar.setMinimum(0);
        // Define o valor final da Barra de Progresso   
        progBar.setMaximum(50);
        // Mostra o valor na barra
        progBar.setStringPainted(true); 
        // Insere a barra
        // Cria um botão para iniciar o processo
        // Ao acionar o botão
        // Inicia o valor da Barra
        progBar.setValue(progBar.getMinimum());
        // Inicia o processo
        if (roda == null) {
          roda = new roda();
          roda.start(); 
        }

        this.addWindowListener(
          new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
        });
    }
  
    class roda extends Thread { 
        public void run() {
        int i = 0;
        while (i <= 100) { 
            // fill the menu bar 
            progBar.setValue(i + 10); 
            try {
                // delay the thread
                Thread.sleep(100);
                initEntityManager();
            } catch (InterruptedException ex) {
                Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
            }
            i += 17; 
        } 
        dispose();
        roda = null; 
    }     
  }
    private void initEntityManager(){
        try{
            if(em == null){
                em = new ConnectionFactory().getConection();
            }
        }catch(Exception e){
            JPaneError.showErrorDialog(this, "Erro ao iniciar o serviço.", e);
        }
    }
}
