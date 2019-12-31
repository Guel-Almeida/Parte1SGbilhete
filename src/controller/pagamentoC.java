/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Jey
 */
public class pagamentoC {
    conexao con;
    public boolean incluir (model.pagamento pg) throws ClassNotFoundException, SQLException{
        
        con = new conexao();
        String i = "Insert into tipoPagamento Values (?)";
        PreparedStatement ps = con.getconexao().prepareStatement(i);
        ps.setString(1, pg.getPagamento());
        if(ps.executeUpdate()>0){
            return true;}
        else {
            return false;
             } 
    }
}
