package Section3_FundamentosJava_Primitivos.Tarea2;

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        var nombre = s.nextLine();

        System.out.println("Proporciona el id:");
        var id = Integer.parseInt(s.nextLine());

        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(s.nextLine());

        System.out.println("Proporciona el envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean(s.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
