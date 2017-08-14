/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

import cnMySQL.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudUsuario {
      public void insertarUsuario(Usuario to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String usu = "insert into usuario(id,nombre,paterno, materno, telefono, usuario, clave, tipo) values"
                            + "(?,?,?,?,?,?,?,?)";
        PreparedStatement query = connection.prepareStatement(usu);
        query.setInt(1, to.getId());
        query.setString(2, to.getNombre());
        query.setString(3, to.getPaterno());
        query.setString (4, to.getMaterno());
        query.setInt (5, to.getTelefono());
        query.setString (6, to.getUsuario());
        query.setString(7, to.getClave());
        query.setString(8,to.getTipo());
        query.execute();
     }
    
     public void modificarUsuario(Usuario to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String cate = "update usuario set nombre = ?, paterno = ?, materno = ?, telefono = ?, usuario = ?, clave = ?, tipo = ?" + "where id = ? ";
        PreparedStatement query = connection.prepareStatement(cate);
       
        query.setString(1, to.getNombre());
        query.setString(2, to.getPaterno());
        query.setString (3, to.getMaterno());
        query.setInt (4, to.getTelefono());
        query.setString (5, to.getUsuario());
        query.setString(6, to.getClave());
        query.setString(7,to.getTipo());
         query.setInt(8, to.getId());
        query.execute(); 
    }
    
     public void borrarUsuario(Usuario to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String operacion = "delete from usuario where id = ? ";
        PreparedStatement query = connection.prepareStatement(operacion);
        query.setInt(1, to.getId());
        query.execute(); 
    }
     
     public ResultSet cargarUsuario(String a) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query2 = connection.prepareStatement("select * from usuario WHERE nombre LIKE '%"+a+"%'");
        ResultSet rs = query2.executeQuery();
        return rs;
    }
    
}
