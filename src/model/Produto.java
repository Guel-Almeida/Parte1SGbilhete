/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jey
 */
public class Produto {
    
    private int idFesta;
    private String tipo;
    private int qdt;
    private float preco;
    private Festa festa;

        public Produto(){}
    public Produto(Festa festa,String tipo, int qdt, float preco ) {
        this.tipo = tipo;
        this.qdt = qdt;
        this.preco = preco;
        this.festa = festa;
    }

    public Festa getfesta() {
        return festa;
    }

    public void setfesta(Festa festa) {
        this.festa = festa;
    }

    public int getIdFesta() {
        return idFesta;
    }

    public void setIdFesta(int idFesta) {
        this.idFesta = idFesta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQdt() {
        return qdt;
    }

    public void setQdt(int qdt) {
        this.qdt = qdt;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    public boolean cadastrar() throws ClassNotFoundException, SQLException{
         conexao con = new conexao();
         String sql = "Insert into produto Values (?,?,?,?,?)";
         PreparedStatement ps = con.getconexao().prepareStatement(sql);
         ps.setInt(1, festa.getIdFesta());
         ps.setString(2, this.getTipo());
         ps.setInt(3, this.getQdt());
         ps.setFloat(4, this.getPreco());
         ps.setInt(5, this.getQdt());
         
            if(ps.executeUpdate()>0)
               return true;
                 else
                    return false;
                    
   }
    
}
