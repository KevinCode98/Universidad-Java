package Section29_Programacion_ModificadoresAcceso.Paquete1;

// Si es default o package es una clase que solamente puede ser accedida desde el mismo paquete
class Clase3 {
    String atributoDefault = "Valor atributo default";

    Clase3() {
        System.out.println("Constructor default.");
    }

    void metodoDefault() {
        System.out.println("Método default.");
    }
}
