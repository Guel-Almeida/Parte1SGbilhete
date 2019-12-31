
package controller;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import model.tipoUsuarioModel;


public class UsuarioController {
 Usuario User;
 public boolean SalvarUsuario(tipoUsuarioModel tip ,String data,String o,String nome,int numero,String pais,String cidade,String rua,String Login,String Senha) throws ClassNotFoundException, SQLException{
 
          /*    tipoUsuarioModel tipo = new tipoUsuarioModel();
                tipo.setTipo(o);
                if(tipo.getTipo().equals("admin")){
                tipo.setId(1);
                }else if(tipo.getTipo().equals("Operativo")){
                tipo.setId(2);
                }else{
                tipo.setId(3);
                }*/
  
        User= new Usuario(Login,Senha,tip,nome,numero,data,pais,cidade,rua);
        User.cadastrarP(); 
       
        boolean listarP = listarP();
        if(listarP){// JOptionPane.showMessageDialog(null,"ok");
        return User.cadastrar();}else
        {//JOptionPane.showMessageDialog(null,"no");
        return false;}
       // 
    }
    
   public  boolean listarP () throws ClassNotFoundException, SQLException{
    //  Usuario User = new Usuario();
         ResultSet rs = User.selecioneP();
         while(rs.next()){
             User.setId(rs.getInt("idPessoa"));
        }   
         return true;
    }
     
     
    public static tipoUsuarioModel M(){
           return  new tipoUsuarioModel();
           
    }
    
    public Usuario Buscar(int val) throws ClassNotFoundException, SQLException{
        Usuario use = new Usuario();
        ResultSet rs = use.selecionaU(val);
    
        while (rs.next()) {
            use.setNome(rs.getString("nome"));
            use.setTelefone(rs.getInt("telefone"));
            use.setData(rs.getString("datanascimento"));
            use.setPais(rs.getString("pais"));
            use.setCidade(rs.getString("cidade"));
            use.setRua(rs.getString("rua"));
            use.setLogin(rs.getString("nomelogin"));
            use.setSenha(rs.getString("senha"));
           
        }
         return use;
    }
    public boolean eliminar(int v) throws ClassNotFoundException, SQLException{
        Usuario us = new Usuario();
      return  us.delete(v);
    }
}
