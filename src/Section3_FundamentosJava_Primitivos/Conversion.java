package Section3_FundamentosJava_Primitivos;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        // Convertir un tipo String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("(edad + 1) = " + (edad + 1));

        var edadString = "20";
        System.out.println("(edadString + 1) = " + (edadString + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir valores
        Scanner s = new Scanner(System.in);

//        System.out.print("Proporciona tu edad: ");
//        edad = Integer.parseInt(s.nextLine());

        System.out.println("edad = " + edad);

        System.out.println("--------------------------------------\n");

        // Convertir un tipo int a un tipo String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        System.out.print("Proporciona un caracter: ");
        caracter = s.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
