package Section33_Programacion_Casting;

public class Escritor extends Empleado {
    private final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    protected String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipoEscritura: " + this.tipoEscritura.getDescripcion();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
}
