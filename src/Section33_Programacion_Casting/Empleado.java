package Section33_Programacion_Casting;

public class Empleado {
    protected final String nombre;
    protected final double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    protected String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", sueldo: $" + this.sueldo;
    }
}
