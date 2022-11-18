package Section22_FundamentosJava_DisenioClases.mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private final Producto[] productos;
    private int contadorProductos;
    private static int contadoOrdenes = 0;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadoOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
            System.out.println("Se agrego el producto " + producto.getNombre() + " a la lista de productos");
        } else {
            System.out.println("Se ha superado  el máximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < contadorProductos; i++)
            total += productos[i].getPrecio();

        return total;
    }

    public void mostarOrden() {
        System.out.println("-------------------------------------");
        System.out.println("Número de orden - " + this.idOrden);
        System.out.println("Lista de Orden: ");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println("(" + productos[i].getIdProducto() + ") - Producto " + (i + 1) + " -> " + productos[i].getNombre() + ": $" + productos[i].getPrecio());
        }

        System.out.println("Total de la orden: $" + this.calcularTotal());
    }
}
