package Almacen;

/**
 * Creacion de clase
 *
 **/

public class Producto {
    private final String codigo;
    private final String nombre;
    private final String descripcion;
    private final double valorUnitario;
    private final int cantidad;

    /*
     * Para las clases es necesario recurrir a un constructor
     */
    public Producto (String codigo, String nombre, String descripcion, double valorUnitario, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorUnitario = valorUnitario;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getValorUnitario() {
        return valorUnitario;
    }
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo.equals(producto.codigo);
    }

}
