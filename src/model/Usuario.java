/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guel
 */
public class Usuario extends Pessoa {
    
    private int idUsuario;
    private String login;
    private  String senha;
    private tipoUsuarioModel tipousuario;
    
    public Usuario(String login, String senha, tipoUsuarioModel tipousuario, String Nome, int telefone, String data, String pais, String Cidade, String rua) throws ClassNotFoundException, SQLException {
        super(Nome, telefone, data, pais, Cidade, rua);
        this.login = login;
        this.senha = senha;
        this.tipousuario = tipousuario;
        
    }

    public Usuario() {
        
    }

    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public tipoUsuarioModel getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(tipoUsuarioModel tipousuario) {
        this.tipousuario = tipousuario;
    }
    
    
    public boolean cadastrar() throws ClassNotFoundException, SQLException{
         conexao con = new conexao();
         String sql = "Insert into usuario Values (?,?,?,?)";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
         ps.setString(1, this.getSenha());
         ps.setString(2, this.getLogin());
         ps.setInt(3, this.getId());
         ps.setInt(4, tipousuario.getId());
               if(ps.executeUpdate()>0){
                return true;
                }else{
                   return false;
                } 
   }
    public ResultSet selecionaU(int ident) throws ClassNotFoundException, SQLException{
        conexao con = new conexao();
         String sql = "select nome,telefone,datanascimento,pais,cidade,rua,senha,nomelogin from usuario inner join pessoa on pessoa.idpessoa = usuario.idpessoa where idUsuario=?";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
         ps.setInt(1, ident);
         return ps.executeQuery();
        }
    
    public boolean delete(int v) throws ClassNotFoundException, SQLException{
        conexao con = new conexao();
         String sql = " Delete from usuario where idUsuario=?";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
         ps.setInt(1, v);
         return ps.executeUpdate()>0;
    }
}
