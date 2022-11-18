package Section23_FundamentosJava_FinalCurso.com.mg.mundopc;

public final class Teclado extends DispositivoEntrada {
    // Atributos del objeto Teclado
    private final int idTeclado;
    private static int contadorTeclado = 0;

    // Constructor del objeto Teclado
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    // Método toString del objeto Teclado
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(" descripcion=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
