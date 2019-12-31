/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Festa;
import model.Produto;

/**
 *
 * @author Jey
 */
public class ProdutoControler {

   /* private static Produto Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
  
  Produto prd;
   
    public boolean salvar(Festa festa, String tipo,int qtd,float preco) throws ClassNotFoundException, SQLException{
        
        prd = new Produto(festa,tipo,qtd,preco);
        return prd.cadastrar();
    }
    
    //busca os nomes para exibir na comboBox
    public static ResultSet listaFesta () throws ClassNotFoundException, SQLException{
        Festa f = new Festa();
        return  f.selecionar();
       }  
    
    
    public static Festa ConvertnoId (String n) throws ClassNotFoundException, SQLException{
         Festa fa = new Festa();
         ResultSet rs = fa.selecionarId(n);
         
         while(rs.next()){
           //  JOptionPane.showMessageDialog(null, rs.getInt("idFesta"));
             fa.setIdFesta(rs.getInt("idFesta"));
            // System.out.println(fa.getIdFesta());
         }
                
         return fa;
    
    }
   public static Festa s(){
     return new Festa();
    }
}
