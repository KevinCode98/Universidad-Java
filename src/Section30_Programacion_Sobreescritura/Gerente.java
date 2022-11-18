package Section30_Programacion_Sobreescritura;

public final class Gerente extends Empleado {
    private final String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
}
