/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ClienteModel;

/**
 *
 * @author Jey
 */
public class ClienteControler {
    private boolean s;
    public boolean gravar(String nome, int Cell,String Pais,String Cidade,String rua,String data,int a,int cellu) throws SQLException, ClassNotFoundException{
        
        ClienteModel cli = new ClienteModel();
        cli.setNome(nome);
        cli.setCelular(Cell);
        cli.setPais(Pais);
        cli.setCidade(Cidade);
        cli.setRua(rua);
        cli.setData(data); 
        if(a==1){ 
            s = cli.cadastrar();
        }else if(a==2){
            s=cli.actualizar(cellu);
        }
       
             
       return s;
    }
    public ClienteModel seleciona(int cel) throws SQLException, ClassNotFoundException{
    
    ClienteModel cl = new ClienteModel(); 
    ResultSet rs = cl.pesquisar(cel);
    while(rs.next()){
            cl.setNome(rs.getString("nome"));
            cl.setCelular(rs.getInt("celular"));
            cl.setPais(rs.getString("pais"));
            cl.setCidade(rs.getString("cidade"));
            cl.setRua(rs.getString("rua"));
            cl.setData(rs.getString("datanascimento"));
        }
        return cl;
    }
    
    public boolean Apagar(int cel) throws ClassNotFoundException, SQLException{
         ClienteModel cl = new ClienteModel(); 
         return cl.delete(cel);
      }
    
}
