package modelo;

public class Usuario {
    private String usuario;
    private String clave;
    private char permiso;
    private String nombre;

    public Usuario() {
    }

    public Usuario(String usuario, String clave, char permiso, String nombre) {
        this.usuario = usuario;
        this.clave = clave;
        this.permiso = permiso;
        this.nombre = nombre;
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

    public char getPermiso() {
        return permiso;
    }

    public void setPermiso(char permiso) {
        this.permiso = permiso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
