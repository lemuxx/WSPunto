
package Articulo;



import cnMySQL.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CrudArticulo {
    
    public void insertarArticulo(Articulo to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String arti = "insert into articulo(id_articulo, codigo, nombre, stock, costo, venta, utilidad, categoria) values"
                            + "(?,?,?,?,?,?,?,?)";
        PreparedStatement query = connection.prepareStatement(arti);
        query.setInt(1, to.getId_articulo());
        query.setString(2, to.getCodigo());
        query.setString(3, to.getNombre());
        query.setInt(4, to.getStock());
        query.setFloat(5, to.getCosto());
        query.setFloat(6, to.getVenta());
        query.setFloat(7, to.getUtilidad());
        query.setString(8, to.getCategoria());
        query.execute();
    }
    
    public void modificarArticulo(Articulo to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String art = "update articulo set codigo = ?, nombre = ?, stock = ?, costo = ?, venta = ?, utilidad = ?, categoria = ?" + "where id_articulo = ? ";
        PreparedStatement query = connection.prepareStatement(art);
        query.setString(1, to.getCodigo());
        query.setString(2, to.getNombre());
        query.setInt(3, to.getStock());
        query.setFloat(4, to.getCosto());
        query.setFloat(5, to.getVenta());
        query.setFloat(6, to.getUtilidad());
        query.setString(7, to.getCategoria());
        query.setInt(8, to.getId_articulo());
        query.execute();  
    }
    
    public void borrarArticulo(Articulo to) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        String art = "delete from articulo where id_articulo = ? ";
        PreparedStatement query = connection.prepareStatement(art);
        query.setInt(1, to.getId_articulo());
        query.execute(); 
    }
    
    public ResultSet cargarArticulo(String a) throws Exception{
        Connection connection = cnMySQL.getInstance().getConnection();
        PreparedStatement query2 = connection.prepareStatement("select * from articulo WHERE nombre LIKE '%"+a+"%'");
        ResultSet rs = query2.executeQuery();
        return rs;
    }
    
}
