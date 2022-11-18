package Section29_Programacion_ModificadoresAcceso.Paquete1;

public class TestModificadoresDefault {
    public static void main(String[] args) {
        ClaseHijaDefault claseHijaDefault = new ClaseHijaDefault();
        claseHijaDefault.atributoDefault = "Cambio desde la prueba.";
        System.out.println("claseHijaDefault.atributoDefault = " + claseHijaDefault.atributoDefault);
        claseHijaDefault.metodoDefault();
    }
}
