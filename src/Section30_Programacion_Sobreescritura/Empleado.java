package Section30_Programacion_Sobreescritura;

public class Empleado {
    protected final String nombre;
    protected final double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Nombre: " + this.nombre + ", sueldo: $" + this.sueldo;
    }
}
