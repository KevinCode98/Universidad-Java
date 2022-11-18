package Section29_Programacion_ModificadoresAcceso.Paquete2;

import Section29_Programacion_ModificadoresAcceso.Paquete1.Clase2;

public class ClaseHijaProtected extends Clase2 {
    public ClaseHijaProtected() {
        super();
        this.atributoProtected = "Modificación atributo protected.";
        System.out.println("atributoProtected = " + atributoProtected);
        this.metodoProtected();
    }
}
