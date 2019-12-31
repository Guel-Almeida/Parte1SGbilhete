
package model;

import controller.conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author Jey
 */
public class tipoUsuarioModel {
    private int id;
    private String tipo;

     public tipoUsuarioModel() {
        
    }
    public tipoUsuarioModel(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   public boolean cadastrar() throws ClassNotFoundException, SQLException{
      conexao con = new conexao();
       String sql = "Insert into tipoUsuario Values (?)";
        PreparedStatement ps = con.getconexao().prepareStatement(sql);
        ps.setString(1, this.getTipo());
        if(ps.executeUpdate()>0){
            return true;
        }
        else {
            return false;
       } 
    }
   
   public ResultSet selecionar() throws ClassNotFoundException, SQLException{
             conexao con = new conexao();
       String sql = "select idUsuario, tipo from tipoUsuario";
       PreparedStatement ps = con.getconexao().prepareStatement(sql);
      // ResultSet rs =
       return ps.executeQuery();
       /*
       if(rs.next()){
           this.setId(rs.getInt("id"));
           this.setTipo(rs.getString("tipo"));
       }
       return true;
   }

*/
   }
}
