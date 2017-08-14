
package usuario;


public class Usuario {
    
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private int telefono;
    private String usuario;
    private String clave;
    private String tipo;

    public Usuario(int id, String nombre, String paterno, String materno, int telefono, String usuario, String clave, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.telefono = telefono;
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
