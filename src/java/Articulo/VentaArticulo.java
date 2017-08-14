/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulo;

import cnMySQL.cnMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import cnMySQL.cnMySQL;
import java.sql.Statement;
/**
 *
 * @author joel
 */
public class VentaArticulo {
    public void venderArticulo(int id,int can) throws Exception{
        //Conexion cc= new Conexion();
       Connection cn= cnMySQL.getInstance().getConnection();;
       String cap="";
       int desfinal;
       String consul="SELECT * FROM articulo WHERE  id_articulo='"+id+"'";
        try {
            Statement st= cn.createStatement();
            ResultSet rs= st.executeQuery(consul);
            while(rs.next())
            {
                cap= rs.getString(4);
            }
            
            
        } catch (Exception e) {
        }
        int fin = Integer.parseInt(cap);
        desfinal = fin-can;
        String modi="UPDATE articulo SET stock='"+desfinal+"' WHERE id_articulo = '"+id+"'";
        try {
            PreparedStatement pst = cn.prepareStatement(modi);
            pst.executeUpdate();
        } catch (Exception e) {
        }
    }
}
