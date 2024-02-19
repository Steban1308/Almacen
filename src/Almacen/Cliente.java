package Almacen;

public class Cliente {
    private final String nombre;
    private final String apellidos;
    private final String identificacion;
    private final String direccion; 
    private final String telefono;
    
    public Cliente(String nombre, String apellidos, String identificacion, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String setNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String setIdentificacion() {
        return identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return identificacion.equals(cliente.identificacion);
    }

    
}

