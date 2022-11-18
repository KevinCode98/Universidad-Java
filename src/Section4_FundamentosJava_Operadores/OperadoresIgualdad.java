package Section4_FundamentosJava_Operadores;

public class OperadoresIgualdad {
    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        System.out.println("\nOperador: ==  -> (" + a + " == " + b + ")");
        var c = (a == b); // == -> Este operador permite saber si los valores son iguales
        System.out.println("c = " + c);

        System.out.println("\nOperador: !=  -> (" + a + " != " + b + ")");
        var d = (a != b); // != -> Este operador permite saber si los valores son diferentes
        System.out.println("d = " + d);

        var cadena = "Hola";
        var cadena2 = "Hola";

        System.out.println("\nOperador de cadenas: ==  -> (" + cadena + " == " + cadena2 + ") -> Compara la referencias de objetos");
        var e = cadena == cadena2; //Compara la referencias de objetos
        System.out.println("e = " + e);

        System.out.println("\nOperador de cadenas: .equals  -> " + cadena + ".equals(" + cadena2 + ") -> Compara las cadenas");
        var f = cadena.equals(cadena2); //Compara las cadenas
        System.out.println("f = " + f);

        System.out.println("\n------- OPERADORES RELACIONALES -------");

        System.out.println("\nOperador: >=  -> (" + a + " >= " + b + ")");
        var g = (a >= b); // >= -> Mayor que > o el mayor igual >=
        System.out.println("g = " + g);

        System.out.println("\nSaber si el valor de '" + a + "' es par o impar: ");
        if (a % 2 == 0) System.out.println("El numero es par.");
        else System.out.println("El numero es impar.");

        var edad = 10;
        var adulto = 18;
        System.out.println("\nSaber si mayor o menor");
        if (edad >= adulto) System.out.println("Es un adulto de " + edad + " años");
        else System.out.println("Es menor de edad de " + edad + " años");
    }
}
