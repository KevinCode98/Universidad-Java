package Section23_FundamentosJava_FinalCurso.com.mg.mundopc;

public class DispositivoEntrada {
    // Atributos del objeto DispositivosEntrada
    private String tipoEntrada;
    private String marca;

    // Constructor del objeto DispositivoEntrada
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    // Gets, Sets y toString del objeto DispositivoEntrada
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DispositivoEntrada{");
        sb.append("tipoEntrada='").append(tipoEntrada).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
