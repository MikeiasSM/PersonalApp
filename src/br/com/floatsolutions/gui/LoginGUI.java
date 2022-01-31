/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floatsolutions.gui;

import br.com.floatsolutions.model.Empresa;
import br.com.floatsolutions.model.Usuario;
import br.com.floatsolutions.model.service.EmpresaService;
import br.com.floatsolutions.model.service.UsuarioService;
import br.com.floatsolutions.uteis.Base64Crypt;
import br.com.floatsolutions.uteis.JOptionPaneError;
import br.com.floatsolutions.uteis.UpperCase;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikeias
 */
public final class LoginGUI extends javax.swing.JDialog{

    private Usuario usuario;
    private Empresa empresa;
    private UsuarioService usuarioService;
    private EmpresaService empresaService;
    /**
     * Creates new form Login
     */
    public LoginGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public LoginGUI(java.awt.Frame parent, boolean modal, UsuarioService usuarioService, EmpresaService empresaService) {
        super(parent, modal);
        initComponents();
        setUsuarioService(usuarioService);
        setEmpresaService(empresaService);
        
        initComp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        paneLogin = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new keeptoo.KButton();
        btnSair = new keeptoo.KButton();
        cbEmpresa = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(65, 65, 65));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pane.setBackground(new java.awt.Color(45, 46, 46));
        pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneLogin.setkBorderRadius(0);
        paneLogin.setkEndColor(new java.awt.Color(65, 65, 65));
        paneLogin.setkStartColor(new java.awt.Color(45, 46, 46));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/floatsolutions/icons/icons8_user_male_16px.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/floatsolutions/icons/icons8_password_16px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Login");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/floatsolutions/icons/icons8_building_16px.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtUser.setDocument(new UpperCase());
        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(33, 150, 243)));
        txtUser.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUser.setOpaque(false);

        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(33, 150, 243)));
        txtSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenha.setOpaque(false);

        btnEntrar.setBackground(new java.awt.Color(33, 150, 243));
        btnEntrar.setBorder(null);
        btnEntrar.setText("Entrar");
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setkAllowGradient(false);
        btnEntrar.setkAllowTab(false);
        btnEntrar.setkBackGroundColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkBorderRadius(0);
        btnEntrar.setkEndColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkHoverColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkHoverEndColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnEntrar.setkHoverStartColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkIndicatorColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkPressedColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkSelectedColor(new java.awt.Color(33, 150, 243));
        btnEntrar.setkStartColor(new java.awt.Color(33, 150, 243));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(33, 150, 243));
        btnSair.setBorder(null);
        btnSair.setText("Sair");
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSair.setkAllowGradient(false);
        btnSair.setkAllowTab(false);
        btnSair.setkBackGroundColor(new java.awt.Color(33, 150, 243));
        btnSair.setkBorderRadius(0);
        btnSair.setkEndColor(new java.awt.Color(33, 150, 243));
        btnSair.setkHoverColor(new java.awt.Color(33, 150, 243));
        btnSair.setkHoverEndColor(new java.awt.Color(33, 150, 243));
        btnSair.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSair.setkHoverStartColor(new java.awt.Color(33, 150, 243));
        btnSair.setkIndicatorColor(new java.awt.Color(33, 150, 243));
        btnSair.setkPressedColor(new java.awt.Color(33, 150, 243));
        btnSair.setkSelectedColor(new java.awt.Color(33, 150, 243));
        btnSair.setkStartColor(new java.awt.Color(33, 150, 243));
        btnSair.setMargin(new java.awt.Insets(2, 10, 2, 10));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneLoginLayout = new javax.swing.GroupLayout(paneLogin);
        paneLogin.setLayout(paneLoginLayout);
        paneLoginLayout.setHorizontalGroup(
            paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        paneLoginLayout.setVerticalGroup(
            paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        paneLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbEmpresa, jLabel7});

        pane.add(paneLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 300, 454));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/floatsolutions/icons/login-img.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 728, 454));

        getContentPane().add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1028, 454));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if(verifyComps()){
            execute();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginGUI dialog = new LoginGUI(new javax.swing.JFrame(), true);
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
    private keeptoo.KButton btnEntrar;
    private keeptoo.KButton btnSair;
    private javax.swing.JComboBox<Object> cbEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pane;
    private keeptoo.KGradientPanel paneLogin;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    public EmpresaService setEmpresaService(EmpresaService empresaService){
        return this.empresaService = empresaService;
    }
    
    public UsuarioService setUsuarioService(UsuarioService usuarioService){
        return this.usuarioService = usuarioService;
    }
    
    private void execute(){
        try {
            popEmpresa();
            setUsuario(validaUsuario());
            setEmpresa();
            this.dispose();
        } catch(NullPointerException e){
            e.printStackTrace();
        } catch(NoResultException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            JOptionPaneError.showErrorDialog(this, "Erro não catalogado!\nEncerrando aplicação.", e);
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            JOptionPaneError.showErrorDialog(this, "Erro não catalogado!\nEncerrando aplicação.", e);
            e.printStackTrace();
            System.exit(0);
        }
    }
    private void initComp(){
        txtUser.setDocument(new UpperCase());       
        try{
            popEmpresa();
        }catch(IllegalArgumentException e){
            System.exit(0);
        }
        
        txtUser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (verifyComps()) {
                        execute();
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        
        txtSenha.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (verifyComps()) {
                        execute();
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
        cbEmpresa.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (verifyComps()) {
                        execute();
                    }
                }
            }
            @Override
            public void keyReleased(KeyEvent e) {}
        });
    }
    
    private Usuario validaUsuario() {
        if (usuarioService == null) {
            throw new IllegalArgumentException("UsuarioService was null");
        }
        String senha = new String(txtSenha.getPassword()).trim();
        String senhaencode = Base64Crypt.encoder(senha);

        usuario = usuarioService.verifieldUser(txtUser.getText().trim(), senhaencode);

        if (txtUser.getText().trim().equals(usuario.getNome()) && senhaencode.equals(usuario.getSenha1())) {
            return usuario;
        } else {
            JOptionPane.showMessageDialog(this, "Usuario ou senha não coincidem!", "Next Software ₢", JOptionPane.INFORMATION_MESSAGE);
            txtUser.requestFocus();
        }

        return null;

    }
    
    private void setUsuario(Usuario usuario){
        if(usuario != null){
            this.usuario = usuario;
        }else{
            JOptionPane.showMessageDialog(this, "Usuario was null", "Next Software ₢", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void setEmpresa(){
        if(cbEmpresa.getSelectedItem() != null){
            this.empresa = (Empresa) cbEmpresa.getSelectedItem();
        }else{
            JOptionPane.showMessageDialog(this, "Empresa was null", "Next Software ₢", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public Empresa getEmpresa(){
        return empresa;
    }
    
    private boolean verifyComps(){
        String err = "";
        
        if(txtUser.getText().length() == 0 || txtUser.getText().isEmpty()){
            err += "Informe um usuário!\n";
        }
        if(txtSenha.getPassword().length == 0 || txtSenha.getText().isEmpty()){
            err += "Informe uma senha!\n";
        }
        
        if(err.length() <= 0){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, err, "Next Software ₢", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    private void popEmpresa(){
        if (empresaService == null) {
            throw new IllegalArgumentException("EmpresaService was null");
        }
        cbEmpresa.removeAllItems();
        for(Empresa e : empresaService.findAll()){
            cbEmpresa.addItem(e);
        }
    }    
}