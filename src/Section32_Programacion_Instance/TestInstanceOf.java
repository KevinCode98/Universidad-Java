package Section32_Programacion_Instance;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5_000.0);
        determinarTipo(empleado);

        empleado = new Gerente("Karla", 10_000.0, "Desarrollo");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado == null)
            System.out.println("El objeto es Null");
        else if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente.");
            System.out.println(((Gerente) empleado).getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado.");
            System.out.println(empleado.obtenerDetalles());
        } else if (empleado instanceof Object)
            System.out.println("Es de tipo Object.");
    }
}
