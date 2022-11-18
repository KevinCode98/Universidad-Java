package Section23_FundamentosJava_FinalCurso.com.mg.mundopc;

public final class Orden {
    private static final int MAX_COMPUTADORAS = 10;
    private static int contadorOrdenes = 0;
    private final int idOrden;
    private int contadorComputadoras;
    private final Computadora[] computadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras++] = computadora;
            System.out.println("Se agrego una nueva computadora: " + computadora.getNombre());
        } else {
            System.out.println("Se han agregado el limite de computadoras " + MAX_COMPUTADORAS);
        }
    }

    public void mostarOrden() {
        System.out.println("-------------------------------------");
        System.out.println("Número de orden - " + this.idOrden);
        System.out.println("Lista de Orden: ");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println("(" + computadoras[i].getIdComputadora() + ") - Producto " + (i + 1) + ": \n"
                    + computadoras[i]);
        }
    }
}
