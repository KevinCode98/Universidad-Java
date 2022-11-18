package Section29_Programacion_ModificadoresAcceso.test;

import Section29_Programacion_ModificadoresAcceso.Paquete1.Clase1;
import Section29_Programacion_ModificadoresAcceso.Paquete1.Clase2;
import Section29_Programacion_ModificadoresAcceso.Paquete1.ClaseHijaPrivada;
import Section29_Programacion_ModificadoresAcceso.Paquete2.ClaseHijaProtected;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        System.out.println("---------------------------------");

        // Clase2 clase2 = new Clase2(); -> Al ser protected no permite ser creado
        Clase2 clase2 = new Clase2("xD");
        // System.out.println("clase2 = " + clase2.atributoPublico); -> Marca error al ser un atributo protected
        // clase2.metodoPublico(); -> Marca error al ser un método protected
        System.out.println("---------------------------------");

        ClaseHijaProtected claseHija = new ClaseHijaProtected();
        System.out.println("claseHija = " + claseHija);


        System.out.println("---------------------------------");

        ClaseHijaPrivada claseHijaPrivada = new ClaseHijaPrivada();
        claseHijaPrivada.setAtributoPrivado("Cambio del atributo privado.");
        System.out.println("claseHijaPrivada.getAtributoPrivado() = " + claseHijaPrivada.getAtributoPrivado());
    }
}
