package Section5_FundamentosJava_SentenciaDeControl;

import java.util.Scanner;

public class EstructuraIfElse {
    public static void main(String[] args) {
        var condicion = false;

        if (condicion) {
            System.out.println("Condición verdadera.");
        } else {
            System.out.println("Condición falsa.");
        }


        // Ejercicio con if-else
        var numero = 5;
        var numeroTexto = "Número desconocido.";

        if (numero == 1) {
            System.out.println("Número uno.");
        } else if (numero == 2) {
            System.out.println("Número dos.");
        } else if (numero == 3) {
            System.out.println("Número tres.");
        } else if (numero == 4) {
            System.out.println("Número cuatro.");
        } else {
            System.out.println("Número no encontrado.");
        }

        // Saber la estación del año
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa el mes: ");
        var mes = Integer.parseInt(s.nextLine());

        var estacion = "Estación desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otonio";
        }

        System.out.println("Estación = " + estacion);
    }
}
