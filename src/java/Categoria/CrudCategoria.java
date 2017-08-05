
package Categoria;

import cnMySQL.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CrudCategoria {
    
    public void insertarCategoria(Categoria to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String cate = "insert into categoria(id,categoria) values"
                            + "(?,?)";
        PreparedStatement query = connection.prepareStatement(cate);
        query.setInt(1, to.getId());
        query.setString(2, to.getCategoria());
        query.execute();
    }
    
     public void modificarCategoria(Categoria to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String cate = "update categoria set nombre = ?" + "where id = ? ";
        PreparedStatement query = connection.prepareStatement(cate);
        query.setString(1, to.getCategoria());
        query.setInt(2, to.getId());
        query.execute();  
    }
    
     public void borrarCategoria(Categoria to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String operacion = "delete from categoria where id = ? ";
        PreparedStatement query = connection.prepareStatement(operacion);
        query.setInt(1, to.getId());
        query.execute(); 
    }
     
     public ResultSet cargarCategoria() throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query2 = connection.prepareStatement("select * from categoria");
        ResultSet rs = query2.executeQuery();
        return rs;
    }
    
}
