package Section6_FundamentosJava_Ciclos;

public class PalabrasReservadasCiclos {
    public static void main(String[] args) {

        System.out.println("----------- continue -----------");
        // La palabra continue permite pasar a la siguiente sentencia del ciclo
        for (var contador = 1; contador < 10; contador++) {
            if (contador % 2 == 0) continue; // Ir a la siguiente iteración
            System.out.println("contador = " + contador);
        }


        System.out.println("----------- break -----------");
        // La palabra break rompe el ciclo
        for (var contador = 1; contador < 10; contador++) {
            if (contador % 5 == 0) break; // termina el ciclo
            System.out.println("contador = " + contador);
        }


        System.out.println("----------- etiquetas -----------");
        // Uso de Etiquetas para ciclos
        inicio:
        for (var contador = 0; contador < 10; contador++) {
            if (contador % 2 == 0) continue inicio; // Ir a la linea de código de la etiqueta
            System.out.println("contador = " + contador);
        }

        // Las etiquetas pueden ir a una sección específica de nuestro código
        // estas son utilizadas después de las palabras brake o continue.
    }
}
