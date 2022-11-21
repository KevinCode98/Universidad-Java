package Section38_Programacion_Excepciones;

public class OperacionExcepcion extends RuntimeException {
    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
