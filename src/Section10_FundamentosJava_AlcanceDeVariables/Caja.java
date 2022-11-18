package Section10_FundamentosJava_AlcanceDeVariables;

public class Caja {
    public int ancho;
    public int alto;
    public int profundo;

    public Caja() {
        System.out.println("Se inicializo el objeto vació.");
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
