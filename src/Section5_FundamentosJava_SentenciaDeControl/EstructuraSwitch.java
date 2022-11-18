package Section5_FundamentosJava_SentenciaDeControl;

import java.util.Scanner;

public class EstructuraSwitch {
    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Valor desconocido.";

        switch (numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
                break;
        }
        System.out.println("numeroTexto = " + numeroTexto);


        // Saber la estación del año
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa el mes: ");
        int mes = Integer.parseInt(s.nextLine());

        var estacion = "Estación desconocida";
        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
        }
        System.out.println("Estación = " + estacion);
    }
}
