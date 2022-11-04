package Section2_FundamentosJava_Variables;

import java.util.Scanner;

public class LeerScanner {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.print("Escribe tu nombre: ");
        var usuario = consola.nextLine();

        System.out.print("Escriba el titulo: ");
        var titulo = consola.nextLine();

        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
