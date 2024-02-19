package Almacen;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private final LocalDate fechaVencimiento;

    public ProductoPerecedero(String codigo, String nombre, String descripcion, double valorUnitario, int cantidad,
            LocalDate fechaVencimiento) {
        super(codigo, nombre, descripcion, valorUnitario, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    } 

}

