package Almacen;

public class ProductoRefrigerado extends Producto {
    private final String codigoAprobacion;
    private final String temperatura;

    public ProductoRefrigerado(String codigo, String nombre, String descripcion, double valorUnitario, int cantidad,
            String codigoAprobacion, String temperatura) {
        super(codigo, nombre, descripcion, valorUnitario, cantidad);
        this.codigoAprobacion = codigoAprobacion;
        this.temperatura = temperatura;
    }

    public String getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public String getTemperatura() {
        return temperatura;
    }     
}