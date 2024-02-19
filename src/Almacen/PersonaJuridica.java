package Almacen;

public class PersonaJuridica extends Cliente {
    private final String nit;

    public PersonaJuridica(String nombre, String apellidos, String identificacion, String direccion, String telefono,
            String nit) {
        super(nombre, apellidos, identificacion, direccion, telefono);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    } 
    
}