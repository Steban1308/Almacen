package Almacen;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto {
    private final LocalDate fechaEnvasado;
    private final int pesoEnvase; 
    private final Pais tipoPais; 


    public ProductoEnvasado(String codigo, String nombre, String descripcion, double valorUnitario, int cantidad,
            LocalDate fechaEnvasado, int pesoEnvase, Pais tipoPais) {
        super(codigo, nombre, descripcion, valorUnitario, cantidad);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.tipoPais = tipoPais;
    }


    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }


    public int getPesoEnvase() {
        return pesoEnvase;
    }


    public Pais getTipoPais() {
        return tipoPais;
    }
  
}
