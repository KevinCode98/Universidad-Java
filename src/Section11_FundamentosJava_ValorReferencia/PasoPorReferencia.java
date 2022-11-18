package Section11_FundamentosJava_ValorReferencia;

import Section7_FundamentosJava_CreacionClases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValores(persona1); // Se envió la dirección de memoria del objeto
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }

    public static void cambiarValores(Persona persona) {
        persona.nombre = "Karla"; // Se modifica el atributo del mismo objeto
    }
}
