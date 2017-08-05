
package Articulo;


public class Articulo {
    private int id_articulo;
    private String codigo;
    private String nombre;
    private int stock;
    private float costo;
    private float venta;
    private float utilidad;
    private String categoria;

    public Articulo(int id_articulo, String codigo, String nombre, int stock, float costo, float venta, float utilidad, String categoria) {
        this.id_articulo = id_articulo;
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.costo = costo;
        this.venta = venta;
        this.utilidad = utilidad;
        this.categoria = categoria;
    }

    public int getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getVenta() {
        return venta;
    }

    public void setVenta(float venta) {
        this.venta = venta;
    }

    public float getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }   
}
