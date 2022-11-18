package Section35_Programacion_ClasesAbstractas;

public abstract class FiguraGeometrica {
    public abstract void dibujar();

    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }


    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FiguraGeometrica{");
        sb.append("tipoFigura='").append(tipoFigura).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
