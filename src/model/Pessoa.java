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
 * @author Jey
 */
abstract public class Pessoa {
    protected int id;
    protected String Nome;
    protected int telefone;
    protected String data;
    protected String pais;
    protected String Cidade;
    protected String rua;
public Pessoa(){}
    public Pessoa(String Nome, int telefone, String data, String pais, String Cidade, String rua) throws ClassNotFoundException, SQLException {
        
        this.Nome = Nome;
        this.telefone = telefone;
        this.data = data;
        this.pais = pais;
        this.Cidade = Cidade;
        this.rua = rua;
        //chamar o metodo cadastrar
     //   this.cadastrar();
        //chamar o metodo que retorna jhjh.kjg,jgj,
    }

    public Pessoa(int id, String Nome) {
        this.id = id;
        this.Nome = Nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    
   //fazer um metodo que cadastra e outro que retorna o ultimo item cadastrado 
    public ResultSet selecioneP() throws SQLException, ClassNotFoundException{
       
    conexao con = new conexao();
       String sql = "select idPessoa from pessoa Where nome=? and telefone=? Order by idPessoa desc ";
        PreparedStatement ps = con.getconexao().prepareStatement(sql);
        ps.setString(1, this.getNome());
        ps.setInt(2, this.getTelefone());
       return ps.executeQuery(); 
    }
   
    public boolean cadastrarP() throws ClassNotFoundException, SQLException{
      conexao con = new conexao();
       String sql = "Insert into pessoa Values (?,?,?,?,?,?)";
        PreparedStatement ps = con.getconexao().prepareStatement(sql);
        ps.setString(1, this.getNome());
        ps.setInt(2, this.getTelefone());
        ps.setString(3, this.getData());
        ps.setString(4, this.getPais());
        ps.setString(5, this.getCidade());
        ps.setString(6, this.getRua());
        if(ps.executeUpdate()>0){
            return true;
        }
        else {
            return false;
       } 
    }
    
}
