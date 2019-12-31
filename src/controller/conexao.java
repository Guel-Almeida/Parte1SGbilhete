/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this templ
ate file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Jey
 */
public class conexao {
    private Connection conexao;
    
    public conexao () throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String conectar="jdbc:sqlserver://MIGUEL\\SQLEXPRESS:1433;databaseName=Angof";
        conexao = DriverManager.getConnection(conectar,"Miguel","1234");
    }
    public Connection getconexao(){
        return conexao;
    }
}

