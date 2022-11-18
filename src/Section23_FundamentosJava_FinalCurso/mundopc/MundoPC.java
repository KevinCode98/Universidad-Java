package Section23_FundamentosJava_FinalCurso.mundopc;

import Section23_FundamentosJava_FinalCurso.com.mg.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Asus", 24.7);
        Monitor monitor2 = new Monitor("Apple", 32.0);
        Teclado teclado1 = new Teclado("USB", "Logitech");
        Teclado teclado2 = new Teclado("Bluetooth", "Apple");
        Raton raton1 = new Raton("USB", "HyperX");
        Raton raton2 = new Raton("Bluetooth", "Apple");
        Computadora computadora1 = new Computadora("DELL Gamer 2000", monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora("Apple Studio", monitor2, teclado2, raton2);

        Orden orden = new Orden();
        orden.agregarComputadora(computadora2);
        orden.agregarComputadora(computadora1);

        orden.mostarOrden();
    }
}
