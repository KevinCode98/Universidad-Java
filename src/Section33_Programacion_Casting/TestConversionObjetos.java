package Section33_Programacion_Casting;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado = new Escritor("Kevin", 5_000.0, TipoEscritura.CLASICO);

        // DownCasting → Pasar de un objeto padre a un objeto hijo
        System.out.println(empleado.obtenerDetalles());
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscritura().getDescripcion());

        // UpCasting → Pasar de un objeto hijo a un objeto padre
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
