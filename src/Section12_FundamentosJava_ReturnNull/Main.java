package Section12_FundamentosJava_ReturnNull;

import Section7_FundamentosJava_CreacionClases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Pedro";
        System.out.println("persona1 nombre = " + persona1.nombre);

        System.out.println("\n------------ Cambio por método ------------");
        Persona personaReferencia = cambioValor(persona1);
        System.out.println("personaReferencia cambio nombre = " + personaReferencia.nombre);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);

        System.out.println("\n------------ Cambio por referencia ------------");
        personaReferencia.nombre = "Luis";
        System.out.println("personaReferencia cambio nombre = " + personaReferencia.nombre);
        System.out.println("persona1 cambio nombre = " + persona1.nombre);
    }

    public static Persona cambioValor(Persona persona) {
        if (persona.nombre != null) {
            persona.nombre = "Karla";
            return persona;
        } else {
            persona.nombre = "Desconocido";
            return persona;
        }
    }
}
