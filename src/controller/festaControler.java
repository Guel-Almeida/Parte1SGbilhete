/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import model.Festa;
import model.tipoUsuarioModel;

/**
 *
 * @author Jey
 */
public class festaControler {
    
     public static boolean salvarFesta(String titulo,String descricao,String cidade,String Rua,String salao,String data,String hora ) throws ClassNotFoundException, SQLException{
        Festa fes = new Festa();
        
        fes.setTitulo(titulo);
        fes.setDescricao(descricao);
        fes.setCidade(cidade);
        fes.setRua(Rua);
        fes.setSalao(salao);
        fes.setData(data);
        fes.setHora(hora);
        
        return fes.cadastrar();
    }
    
}