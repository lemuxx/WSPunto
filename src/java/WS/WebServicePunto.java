
package WS;

import Articulo.Articulo;
import Articulo.CrudArticulo;
import Articulo.VentaArticulo;
import Categoria.Categoria;
import Categoria.CrudCategoria;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import usuario.CrudUsuario;
import usuario.Usuario;


@WebService(serviceName = "WebServicePunto")
public class WebServicePunto {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    //// Categoria
    
    @WebMethod(operationName = "insertarCategoria")
    public boolean insertarCategoria(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudCategoria db = new CrudCategoria();
        Type tipoObjeto = new TypeToken<List<Categoria>>() {
        }.getType();
        ArrayList<Categoria> cat = gson.fromJson(json, tipoObjeto);
        Categoria al = cat.get(0);
        try {
            db.insertarCategoria(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "modificarCategoria")
    public boolean modificarCategoria(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudCategoria db = new CrudCategoria();
        Type tipoObjeto = new TypeToken<List<Categoria>>() {
        }.getType();
        ArrayList<Categoria> cat = gson.fromJson(json, tipoObjeto);
        Categoria al = cat.get(0);
        try {
            db.modificarCategoria(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "borrarCategoria")
    public boolean borrarCategoria(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudCategoria db = new CrudCategoria();
        Type tipoObjeto = new TypeToken<List<Categoria>>() {
        }.getType();
        ArrayList<Categoria> cat = gson.fromJson(json, tipoObjeto);
        Categoria al = cat.get(0);
        try {
            db.borrarCategoria(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "cargarCategoria")
    public String cargarCategoria(String a) {
        Gson gson = new Gson();
        ResultSet rs;
        CrudCategoria db = new CrudCategoria();
        try {
            rs = db.cargarCategoria(a);
            ArrayList<Categoria> cat = new ArrayList();
            Categoria var_temp;
            while (rs.next()) {
                var_temp = new Categoria(parseInt(rs.getString(1)), rs.getString(2));
                cat.add(var_temp);
            }
            String formatoJSON = gson.toJson(cat);
            return formatoJSON;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
    
    //// Articulo
    
    @WebMethod(operationName = "insertarArticulo")
    public boolean insertarArticulo(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudArticulo db = new CrudArticulo();
        Type tipoObjeto = new TypeToken<List<Articulo>>() {
        }.getType();
        ArrayList<Articulo> art = gson.fromJson(json, tipoObjeto);
        Articulo al = art.get(0);
        try {
            db.insertarArticulo(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "modificarArticulo")
    public boolean modificarArticulo(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudArticulo db = new CrudArticulo();
        Type tipoObjeto = new TypeToken<List<Articulo>>() {
        }.getType();
        ArrayList<Articulo> art = gson.fromJson(json, tipoObjeto);
        Articulo al = art.get(0);
        try {
            db.modificarArticulo(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "borrarArticulo")
    public boolean borrarArticulo(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudArticulo db = new CrudArticulo();
        Type tipoObjeto = new TypeToken<List<Articulo>>() {
        }.getType();
        ArrayList<Articulo> art = gson.fromJson(json, tipoObjeto);
        Articulo al = art.get(0);
        try {
            db.borrarArticulo(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "cargarArticulo")
    public String cargarArticulo(String a) {
        Gson gson = new Gson();
        ResultSet rs;
        CrudArticulo db = new CrudArticulo();
        try {
            rs = db.cargarArticulo(a);
            ArrayList<Articulo> art = new ArrayList();
            Articulo var_temp;
            while (rs.next()) {
                var_temp = new Articulo(parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), parseInt(rs.getString(4)), parseFloat(rs.getString(5)), parseFloat(rs.getString(6)), parseFloat(rs.getString(7)) ,rs.getString(8));
                art.add(var_temp);
            }
            String formatoJSON = gson.toJson(art);
            return formatoJSON;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
    
    //// Usuario
    
    @WebMethod(operationName = "insertarUsuario")
    public boolean insertarUsuario(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudUsuario db = new CrudUsuario();
        Type tipoObjeto = new TypeToken<List<Usuario>>() {
        }.getType();
        ArrayList<Usuario> usu = gson.fromJson(json, tipoObjeto);
        Usuario al = usu.get(0);
        try {
            db.insertarUsuario(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    @WebMethod(operationName = "modificarUsuario")
    public boolean modificarUsuario(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudUsuario db = new CrudUsuario();
        Type tipoObjeto = new TypeToken<List<Usuario>>() {
        }.getType();
        ArrayList<Usuario> usu = gson.fromJson(json, tipoObjeto);
        Usuario al = usu.get(0);
        try {
            db.modificarUsuario(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    @WebMethod(operationName = "borrarUsuario")
    public boolean borrarUsuario(@WebParam(name = "json") String json) {
        Gson gson = new Gson();
        CrudUsuario db = new CrudUsuario();
        Type tipoObjeto = new TypeToken<List<Usuario>>() {
        }.getType();
        ArrayList<Usuario> usu = gson.fromJson(json, tipoObjeto);
        Usuario al = usu.get(0);
        try {
            db.borrarUsuario(al);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    @WebMethod(operationName = "cargarUsuario")
    public String cargarUsuario(String a) {
        Gson gson = new Gson();
        ResultSet rs;
        CrudUsuario db = new CrudUsuario();
        try {
            rs = db.cargarUsuario(a);
            ArrayList<Usuario> usu = new ArrayList();
            Usuario var_temp;
            while (rs.next()) {
                var_temp = new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), parseInt(rs.getString(5)),rs.getString(6), rs.getString(7) ,rs.getString(8));
                usu.add(var_temp);
            }
            String formatoJSON = gson.toJson(usu);
            return formatoJSON;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
    
    
    @WebMethod(operationName = "leerCodigo")
    public String leerCodigo(@WebParam(name = "codigo") String codigo) {
        Gson gson = new Gson();
        ResultSet rs;
        CrudArticulo db = new CrudArticulo();
        try {
            rs = db.leerCodigo(codigo);
            ArrayList<Articulo> art = new ArrayList();
            Articulo var_temp;
            while (rs.next()) {
                var_temp = new Articulo(parseInt(rs.getString(1)), rs.getString(2), rs.getString(3), parseInt(rs.getString(4)), parseFloat(rs.getString(5)), parseFloat(rs.getString(6)), parseFloat(rs.getString(7)) ,rs.getString(8));
                art.add(var_temp);
            }
            String formatoJSON = gson.toJson(art);
            return formatoJSON;
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "realizarVenta")
    public boolean realizarVenta(@WebParam(name = "id") int id, @WebParam(name = "can") int can) throws Exception {
        VentaArticulo va=new VentaArticulo();
        va.venderArticulo(id, can);
        return true;
    }

}
