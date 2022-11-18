package Section22_FundamentosJava_DisenioClases.mx.com.gm.test;

import Section22_FundamentosJava_DisenioClases.mx.com.gm.ventas.Orden;
import Section22_FundamentosJava_DisenioClases.mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalón", 100.00);
        Producto producto3 = new Producto("Chamarra", 120.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostarOrden();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto3);
        orden2.mostarOrden();
    }
}
