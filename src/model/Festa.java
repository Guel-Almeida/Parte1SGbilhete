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
 * @author Guel de Almeida
 */
public class Festa {
    
    private int idFesta;
    private String titulo;
    private String descricao;
    private String cidade;
    private String Rua;
    private String salao;
    private String data;
    private String hora;

    public int getIdFesta() {
        return idFesta;
    }

    public void setIdFesta(int idFesta) {
        this.idFesta = idFesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getSalao() {
        return salao;
    }

    public void setSalao(String salao) {
        this.salao = salao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
     public boolean cadastrar() throws ClassNotFoundException, SQLException{
      conexao con = new conexao();
       String sql = "Insert into festa Values (?,?,?,?,?,?,?)";
        PreparedStatement ps = con.getconexao().prepareStatement(sql);
        ps.setString(1, this.getTitulo());
        ps.setString(2, this.getDescricao());
        ps.setString(3, this.getCidade());
        ps.setString(4, this.getRua());
        ps.setString(5, this.getSalao());
        ps.setString(6, this.getData());
        ps.setString(7, this.getHora());
        
        if(ps.executeUpdate()>0)
            return true;
        else 
            return false;
       
    }
    
   public ResultSet selecionar() throws ClassNotFoundException, SQLException{
             conexao con = new conexao();
       String sql = "select idFesta, nome from festa";
       PreparedStatement ps = con.getconexao().prepareStatement(sql);
      // ResultSet rs =
       return ps.executeQuery();
   }
   
    public ResultSet selecionarId(String n) throws ClassNotFoundException, SQLException{
       conexao con = new conexao();
       String sql = "select idFesta from festa where nome=?";
       PreparedStatement ps = con.getconexao().prepareStatement(sql);
       ps.setString(1, n);
      // ResultSet rs =
       return ps.executeQuery();
   }
}
