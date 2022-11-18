package Section35_Programacion_ClasesAbstractas;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se imprime un " + this.getClass().getSimpleName());
    }
}
