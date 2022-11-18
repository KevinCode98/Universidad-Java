package Section21_FundamentosJava_Matrices;

public class Persona {
    private final String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
