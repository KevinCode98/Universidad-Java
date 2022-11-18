package Section23_FundamentosJava_FinalCurso.com.mg.mundopc;

public final class Raton extends DispositivoEntrada {
    // Atributos del objeto Ratón
    private final int idRaton;
    private static int contadorRatones = 0;

    // Constructores del objeto Ratón
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    // Método toString del objeto Ratón
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(" descripcion=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
