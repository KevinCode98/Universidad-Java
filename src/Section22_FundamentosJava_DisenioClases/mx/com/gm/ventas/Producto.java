package Section22_FundamentosJava_DisenioClases.mx.com.gm.ventas;

public final class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos = 0;

    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder string = new StringBuilder("Producto{");
        string.append("idProducto=").append(idProducto);
        string.append(", nombre='").append(nombre).append('\'');
        string.append(", precio=").append(precio);
        string.append('}');
        return string.toString();
    }
}
