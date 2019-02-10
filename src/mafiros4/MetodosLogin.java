/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafiros4;

import java.sql.Connection;
import views.login;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;
import mafiros4.Conexion;

/**
 *
 * @author Lisseth
 */
public class MetodosLogin {
    
    
    public boolean login(String usuario, String password)throws SQLException {
     try {
         Conexion conexion = new Conexion().obtener();
         
         ResultSet resultado = conexion.consultar("SELECT * FROM usuario WHERE nombre = '" + usuario + "' and clave = '" + password + "'" );
         resultado.last();
         if (resultado.getRow() > 0){
             // usuarioactual = new Usuario(resultado.getInt("idusuario"),usuario,resultado.getString("titular"),resultado.getString("identificacion"),resultado.getString("tipo_usuario"));
             Usuario usuarioactual = Usuario.getInstance();
             // System.out.println("ID: "+resultado.getString("idusuario"));
              usuarioactual.setIDUsuario(resultado.getInt("idUsuario"));
              usuarioactual.setIdTipoUsuario(resultado.getString("tipousuario"));
              usuarioactual.setIdentificacion(resultado.getString("clave"));
              usuarioactual.setNombreApellidos(resultado.getString("nombre"));                            
             // System.out.println(""+resultado.getString("titular"));
             return true;
        }
   } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
      return false;
   }
}