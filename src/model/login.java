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

/**
 *
 * @author Jey
 */
public class login {
    
    private String nome;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
     public ResultSet found(String nome,String senha) throws ClassNotFoundException, SQLException{
        conexao con = new conexao();
         String sql = "select nome,senha from usuario where nome=? and senha=?";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
         ps.setString(1, this.getNome());
         ps.setString(2, this.getSenha());
         return ps.executeQuery();
        }
}
