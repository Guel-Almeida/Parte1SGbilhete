/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.login;

/**
 *
 * @author Jey
 */
public class ControlerLogin {
    int c=0;
     public int Logar (String n,String s) throws ClassNotFoundException, SQLException{
         
         login log = new login();
         log.setNome(n);
         log.setSenha(s);
         ResultSet rs = log.found(n, s);
         while (rs.next()){
             c = c+1;
             
         }
         
         return c;
      
        
       }  
    
    
    
}
