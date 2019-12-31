/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.UsuarioController;
import controller.tipoUsuarioControler;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.tipoUsuarioModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;


/**
 *
 * @author Jey
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroUsuario
     */
    public CadastroUsuario() {
        initComponents();
         ResultSet rs = null;
        try {
            rs = tipoUsuarioControler.listarop();
            comboOp.removeAllItems();
            while(rs.next()){
              // .setTipo(rs.getString("tipo")); 
              //comboOp.addItem(rs.getInt("idUsuario"));
                comboOp.addItem(rs.getString("tipo"));
            }
            //
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtPais = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboOp = new javax.swing.JComboBox<>();
        btnlimpar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        txtpesquisa = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setClosable(true);
        setTitle("Usuario");
        setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 51));

        jLabel1.setText("Nome");

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Telefone");

        jLabel3.setText("País");

        txtTelefone.setEnabled(false);

        jLabel4.setText("Cidade");

        jLabel5.setText("Rua");

        TxtPais.setEnabled(false);

        txtCidade.setEnabled(false);

        txtRua.setEnabled(false);

        jLabel7.setText("Senha");

        txtSenha.setText("jPasswordField1");
        txtSenha.setEnabled(false);

        jLabel6.setText("Login");

        txtLogin.setEnabled(false);

        jButton1.setText("Salvar");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jButton3.setText("Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnlimpar.setText("Limpar");
        btnlimpar.setEnabled(false);
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(txtLogin)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(txtTelefone)
                                .addComponent(TxtPais)
                                .addComponent(txtCidade)
                                .addComponent(txtRua)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpar))
                    .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboOp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(btnlimpar))
                .addContainerGap())
        );

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbTitulo.setText("Formulario de Usuario");

        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed
    private void abilitaDesabilita(boolean a1, boolean a2,boolean a3, boolean a4,boolean a5, boolean a6,boolean a7, boolean a8,boolean a9, boolean a10,boolean a11, boolean a12){
        txtpesquisa.setEnabled(a1);
        txtNome.setEnabled(a2);
        txtTelefone.setEnabled(a3);
        TxtPais.setEnabled(a4);
        txtCidade.setEnabled(a5);
        txtRua.setEnabled(a6);
        txtLogin.setEnabled(a7);
        txtSenha.setEnabled(a8);
        jButton3.setEnabled(a9);
        jButton1.setEnabled(a10);
        btnEliminar.setEnabled(a11);
        btnlimpar.setEnabled(a12);
}
    private boolean valida(){
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Digite o nome");
            return false;   
        }else if(txtTelefone.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Digite o Telefone");
            return false;   
        }else if(TxtPais.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Digite o pais");
            return false;   
        }else if(txtCidade.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Digite a Cidade");
            return false;   
        }else if(txtRua.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Digite a Rua");
            return false;   
        }else if(txtLogin.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Digite o Login");
            return false;   
        }else if(txtSenha.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Digite a senha");
            return false;   
        }else{
        return true;
        }
    }
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     /*
        ResultSet rs = null;
        try {
            rs = tipoUsuarioControler.listarop();
            comboOp.removeAllItems();
            while(rs.next()){
              // .setTipo(rs.getString("tipo"));
                comboOp.addItem(rs.getString("tipo"));
            }
            //
        } catch (SQLException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
       */
        abilitaDesabilita(false, true, true, true, true, true, true, true, false, true, false, true);
        limpar();
     
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UsuarioController usu = new UsuarioController();
      
        tipoUsuarioModel t = UsuarioController.M(); // o metodo UsuarioController.M() retorna o new tipoUsuarioModel
        
        t.setTipo(comboOp.getSelectedItem().toString());
        switch (t.getTipo()) {
            case "admin":
                t.setId(5);
                break;
            case "organizador":
                t.setId(6);
                break;
            default:
                t.setId(7);
                break;
        }
            //JOptionPane.showMessageDialog(null,"Statu" + t.getId());
       
            if(valida()){
            try {
            
            boolean SalvarUsuario = usu.SalvarUsuario(t, "2019-11-11", comboOp.getSelectedItem().toString(), txtNome.getText(),Integer.parseInt(txtTelefone.getText()) , TxtPais.getText(), txtCidade.getText(), txtRua.getText(), txtLogin.getText(), txtSenha.getText());
            if(SalvarUsuario){
                JOptionPane.showMessageDialog(null,"Usuario Cadastrado"); limpar();
               // abilitaDesabilita(true, isIcon, isIcon, isIcon, isIcon, isIcon, isIcon, isIcon, isIcon, isIcon, isIcon, isIcon);
            }else{
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            }else{
            
            }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        // TODO add your handling code here:
       limpar();
        abilitaDesabilita(true, false, false, false, false, false, false, false, true, false, false, false);
    }//GEN-LAST:event_btnlimparActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if(txtpesquisa.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Digite o Id que Pretende Pesquisar");
            }else{
                UsuarioController us = new UsuarioController();
                
                try {
                    Usuario buscar = us.Buscar(Integer.parseInt(txtpesquisa.getText()));
                    txtNome.setText(buscar.getNome());
                    txtTelefone.setText(String.valueOf(buscar.getTelefone()));
                    TxtPais.setText(buscar.getPais());
                    txtCidade.setText(buscar.getCidade());
                    txtRua.setText(buscar.getRua());
                    txtLogin.setText(buscar.getLogin());
                    txtSenha.setText(buscar.getSenha());
                    TxtPais.setText(buscar.getPais());
                    abilitaDesabilita(true, false, false, false, false, false, false, false, false, false, true, false);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        UsuarioController n = new UsuarioController();
        if(txtpesquisa.getText().equals("")){
        
        }else{
            try {
                boolean v = n.eliminar(Integer.valueOf(txtpesquisa.getText()));
                if(v){
                JOptionPane.showMessageDialog(null,"Eliminado");
                limpar();
                    abilitaDesabilita(true, false, false, false, false, false, false, false, true, false, false, true);
                }else{
                    JOptionPane.showMessageDialog(null,"Erro ao Eliminar");
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void limpar(){
    txtNome.setText("");
    txtTelefone.setText("");
    TxtPais.setText("");
    txtCidade.setText("");
    txtRua.setText("");
    txtLogin.setText("");
    txtSenha.setText("");
    txtpesquisa.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtPais;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JComboBox<String> comboOp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtpesquisa;
    // End of variables declaration//GEN-END:variables
}
