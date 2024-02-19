package Almacen;
import java.time.LocalDate;

public class PersonaNatural extends Cliente {
    private final String email;
    private final LocalDate fechaNacimiento;

    public PersonaNatural(String nombre, String apellidos, String identificacion, String direccion, String telefono,
            String email, LocalDate fechaNacimiento) {
        super(nombre, apellidos, identificacion, direccion, telefono);
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    } 
    
}
