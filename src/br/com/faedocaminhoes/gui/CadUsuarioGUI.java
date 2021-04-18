/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.faedocaminhoes.gui;

import br.com.faedocaminhoes.gui.tablemodel.UserTableModel;
import br.com.faedocaminhoes.gui.tablemodel.renderer.UserTableRenderer;
import br.com.faedocaminhoes.model.Usuario;
import br.com.faedocaminhoes.model.service.UserService;
import br.com.faedocaminhoes.uteis.Base64Crypt;
import br.com.faedocaminhoes.uteis.ParseInteger;
import br.com.faedocaminhoes.uteis.UpperCase;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mikeias
 */
public class CadUsuarioGUI extends javax.swing.JDialog {

    private Usuario user;
    private UserService service;
    private final UserTableModel tableModel = new UserTableModel();
    /**
     * Creates new form CadUsuario
     */
    public CadUsuarioGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public CadUsuarioGUI(java.awt.Frame parent, boolean modal, UserService userService) {
        super(parent, modal);
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        dtaCadastro = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtSenha2 = new javax.swing.JPasswordField();
        txtSenha1 = new javax.swing.JPasswordField();
        btnMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuarios");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Usuario");

        jLabel2.setText("Informe a senha");

        jLabel3.setText("Comfirme a senha");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCod.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCod.setEnabled(false);

        jLabel4.setText("Codigo");

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Usuario", "Data Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUser);

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        dtaCadastro.setDateFormatString("dd/MM/yyyy");
        dtaCadastro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel5.setText("Dta. Cadastramento");

        txtSenha2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtSenha1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(291, 291, 291)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSenha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtSenha2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMostrar)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245)
                        .addComponent(dtaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnDelete)
                    .addComponent(btnCancelar)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        if(txtSenha1.getEchoChar() == '*' && txtSenha2.getEchoChar() == '*'){
            txtSenha1.setEchoChar((char) 0);
            txtSenha2.setEchoChar((char) 0);
        }else{
            txtSenha1.setEchoChar('*');
            txtSenha2.setEchoChar('*');
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        if(verifyComp()){
            if(txtSenha1.getText().equals(txtSenha2.getText())){
                save();
            }else{
                JOptionPane.showMessageDialog(this, "As senhas não coincidem!", "Nextsoft", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if(verifyComp()){
            if(txtSenha1.getText().equals(txtSenha2.getText())){
                save();
            }else{
                JOptionPane.showMessageDialog(this, "As senhas não coincidem!", "Nextsoft", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        erasedComponents();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(CadUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadUsuarioGUI dialog = new CadUsuarioGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSair;
    private com.toedter.calendar.JDateChooser dtaCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtCod;
    private javax.swing.JPasswordField txtSenha1;
    private javax.swing.JPasswordField txtSenha2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public UserService setUsuarioService(UserService service){
        return this.service = service;
    }
    
    private void setModel(){
        tableUser.setModel(tableModel);   
        tableUser.setDefaultRenderer(Object.class, new UserTableRenderer());
        tableUser.getColumnModel().getColumn(0).setPreferredWidth(50); //CODIGO
        tableUser.getColumnModel().getColumn(1).setPreferredWidth(300); //NOME
        tableUser.getColumnModel().getColumn(2).setPreferredWidth(200); //DATA CADASTRO
    } 
    
    private void initComp(){
        setModel();
        findAll();
        Calendar c = Calendar.getInstance();
        dtaCadastro.setCalendar(c);
        txtUsuario.setDocument(new UpperCase());
        txtUsuario.requestFocus();
    }
    
    private void completeData(){
        user = new Usuario();
        
        String senha1 = new String(txtSenha1.getPassword()).trim();
        String senha2 = new String(txtSenha2.getPassword()).trim();
        
        String senha1crip = Base64Crypt.encoder(senha1);
        String senha2crip = Base64Crypt.encoder(senha2);
        
        user.setId(ParseInteger.tryParseToInt(txtCod.getText()));
        user.setNome(txtUsuario.getText());
        user.setSenha1(senha1crip);
        user.setSenha2(senha2crip);
        
        Calendar cad = dtaCadastro.getCalendar();
        Date input = cad.getTime();
        LocalDate dtaCadastramento = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        user.setDataCad(dtaCadastramento);
    }
    
    private void erasedComponents() {
        txtCod.setText("");
        txtUsuario.setText("");
        txtSenha1.setText("");
        txtSenha2.setText("");
        Calendar c = Calendar.getInstance();
        dtaCadastro.setCalendar(c);
    }
    
    public void save(){
        completeData();
        if(service == null){
            JOptionPane.showMessageDialog(this, "UserService was null", "Error", JOptionPane.ERROR_MESSAGE);
        }
        service.insertOrUpdate(user);
        erasedComponents();
        findAll();
    }
    
    public void delete(){
        completeData();
        if(service == null){
            JOptionPane.showMessageDialog(this, "UserService was null", "Error", JOptionPane.ERROR_MESSAGE);
        }
        service.delete(user);
        erasedComponents();
        findAll();
        btnDelete.setEnabled(false);
    }
    
    public void findAll(){
        if(service == null){
            JOptionPane.showMessageDialog(this, "UserService was null", "Error", JOptionPane.ERROR_MESSAGE);
        }
        List<Usuario> list = service.findAll();
        
        if(!list.isEmpty()){
            tableModel.removeAll();
            for(Usuario u: service.findAll()){
                tableModel.addRow(u); 
            }            
        }else{
            throw new IllegalAccessError("List was null");
        }
    }
    
    private void findWithParameter(String pParam){
        if(service == null){
            JOptionPane.showMessageDialog(this, "ProviderService was null", "Error", JOptionPane.ERROR_MESSAGE);
        }
        List<Usuario> list = service.findByName(pParam);        
        if(list.isEmpty()){
            findAll();
        }else{
            tableModel.removeAll();
            for(Usuario p : list){
                tableModel.addRow(p);
            }  
        }        
    }
    
    private void getTable(){
        user = new Usuario();
        if(tableUser.getSelectedRow() != -1){
            user = tableModel.getObject(tableUser.getSelectedRow());
            txtCod.setText(user.getId().toString());
            txtUsuario.setText(user.getNome());
            txtSenha1.setText(user.getSenha1());
            txtSenha2.setText(user.getSenha2());
            dtaCadastro.setDateFormatString(user.getDataCad().toString());
            btnDelete.setEnabled(true);
        }
    }

    public Usuario getObject(){
        return user;
    }
    
    public boolean verifyComp(){
        String err = "";
        
        if(txtUsuario.getText().equals("") || txtUsuario.getText().length() == 0){
            err += "User is requery! \n";
        }
        if(txtSenha1.getText().equals("") || txtSenha1.getText().length() == 0){
            err += "É nescessario informar a senha! \n";
        }
        if(txtSenha2.getText().equals("") || txtSenha2.getText().length() == 0){
            err += "É nescessario comfirmar a senha! \n";
        }
                
        if(err.length() == 0){
            return true;
        }else{
            JOptionPane.showMessageDialog(this, err,"Nextsoft", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    

    
}