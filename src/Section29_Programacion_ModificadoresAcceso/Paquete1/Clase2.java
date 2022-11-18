package Section29_Programacion_ModificadoresAcceso.Paquete1;

public class Clase2 {
    protected String atributoProtected = "Valor atributo protected";

    protected Clase2() {
        System.out.println("Constructor protected.");
    }

    public Clase2(String string) {
        this();
        System.out.println("Constructor public.");
    }

    protected void metodoProtected() {
        System.out.println("Método protected");
    }
}
