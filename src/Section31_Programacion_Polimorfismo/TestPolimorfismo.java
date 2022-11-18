package Section31_Programacion_Polimorfismo;

public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5_000.0);
        imprimir(empleado);

        empleado = new Gerente("Karla", 10_000.0, "Desarrollo");
        imprimir(empleado);
    }

    public static void imprimir(Empleado empleado) {
        System.out.println("empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
    }
}
