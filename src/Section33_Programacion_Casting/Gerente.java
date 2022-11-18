package Section33_Programacion_Casting;

public final class Gerente extends Empleado {
    private final String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    protected String obtenerDetalles() {
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}
