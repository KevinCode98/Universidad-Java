package Section2_FundamentosJava_Variables.Tarea1;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Proporciona el titulo: ");
        String titulo = s.nextLine();
        System.out.print("Proporciona el autor: ");
        String autor = s.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);
    }
}
