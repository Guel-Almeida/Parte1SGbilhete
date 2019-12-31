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
public class ClienteModel {
    
    private String nome;
    private int celular;
    private String pais;
    private String cidade;
    private String rua;
    private String data;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    
            this.nome = nome;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        
            this.celular = celular;
       }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
       
            this.pais = pais;
       
     
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        
            this.cidade = cidade;
      
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        
            this.rua = rua;
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
      
            this.data = data;
       }
    
    public boolean cadastrar() throws ClassNotFoundException, SQLException{
    
        conexao con = new conexao(); //INSTANCIAMOS (CRIAMOS OBJECTO) A CLASS CONEXAO
        String Sql = "INSERT INTO tbclientes values (?,?,?,?,?,?)";// STRING PARA A INSERCAO NA TABELA TBCLIENTE
        PreparedStatement ps = con.getconexao().prepareStatement(Sql); //PREPARAMOS A QUERY PARA INSERIR NA TABELA
        ps.setString(1, this.getNome()); //ATRIBUIMOS O TRIBUTO NA PRIMEIRA ?
        ps.setInt(2, this.getCelular());//ATRIBUIMOS O TRIBUTO NA SEGUNDA ?
        ps.setString(3, this.getPais());
        ps.setString(4, this.getCidade());
        ps.setString(5, this.getRua());
        ps.setString(6, this.getData());
        
        return ps.executeUpdate()>0; //EXECUTAMOS A QUERY E RETORNA TRUE SE CADASTRAR E FALSO SE NAO CADASTRAR
        
    
    }
    
    public ResultSet pesquisar(int n) throws SQLException, ClassNotFoundException{
        conexao con = new conexao();
        String Sql="SELECT nome,celular,pais,cidade,rua,datanascimento from tbclientes where celular=?";
        PreparedStatement ps = con.getconexao().prepareStatement(Sql);
        ps.setInt(1, n);
        return ps.executeQuery();
        
    }
    public boolean delete(int v) throws ClassNotFoundException, SQLException{
        conexao con = new conexao();
         String sql = " Delete from tbclientes where celular=?";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
         ps.setInt(1, v);
         return ps.executeUpdate()>0;
    }
    
    public boolean actualizar(int v) throws ClassNotFoundException, SQLException{
        conexao con = new conexao();
         String sql = " update tbclientes set nome=?,celular =?,pais=?,cidade=?,rua=?,datanascimento=? where celular=?";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
        ps.setString(1, this.getNome());
        ps.setInt(2, this.getCelular());
        ps.setString(3, this.getPais());
        ps.setString(4, this.getCidade());
        ps.setString(5, this.getRua());
        ps.setString(6, this.getData());
        ps.setInt(7, v);
         return ps.executeUpdate()>0;
    }
    
}
