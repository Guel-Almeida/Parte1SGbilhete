/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.tipoUsuarioModel;

public class tipoUsuarioControler {
   
    public static boolean SalvarTipoUsuario(String tipo) throws ClassNotFoundException, SQLException{
        tipoUsuarioModel tipoUser = new tipoUsuarioModel();
        tipoUser.setTipo(tipo);
        return tipoUser.cadastrar();
    }
    
    public static ResultSet listarop () throws ClassNotFoundException, SQLException{
        tipoUsuarioModel tipoUser = new tipoUsuarioModel();
         return tipoUser.selecionar();
    }
}
