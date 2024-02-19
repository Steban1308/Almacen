package Almacen;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Almacen {
    private final String nombre;
    private final String descripcion;
    private final Collection<Cliente> clientes;
    private final Collection<Producto> productos;

    public Almacen(String nombre, String descripcion,Collection<Cliente> clientes, Collection<Producto> productos ) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clientes = new ArrayList<>(clientes);
        this.productos = new ArrayList<>(productos);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente obtenerClientePorIdentificacion(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }   
        return null; // Si no se encuentra el cliente
    }

    // Método de búsqueda de clientes por nombre
    public List<Cliente> buscarClientesPorNombre(String nombre) {
        List<Cliente> resultados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(cliente);
            }
        } 
       return resultados;
    }


    public void eliminarCliente(String identificacion) {
        clientes.removeIf(cliente -> cliente.getIdentificacion().equals(identificacion));
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return new ArrayList<>(clientes);
    }

    // Métodos CRUD para Productos

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto obtenerProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }   
        return null; // Si no se encuentra el producto
    }

    // Método de búsqueda de productos por nombre
    public List<Producto> buscarProductosPorNombre(String nombre) {
        List<Producto> resultados = new ArrayList<>();
        for(Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(producto);
            }
        }
        return resultados;
    }

    
}

