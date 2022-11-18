package Section21_FundamentosJava_Matrices;

import java.util.Arrays;

public class TestMatrices {
    public static void main(String[] args) {
        int[][] edades = new int[3][2];
        // Este arreglo cuenta con 3 filas
        // Este arreglo cuenta con 2 columnas
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        imprimir(edades);

        String[][] frutas = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora"}};
        // String[][] frutas = new String[3][2];
        imprimir(frutas);

        Persona[][] personas = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }


        System.out.println("--------------------------------------------");
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.println("matriz[" + filas + "][" + columnas + "] = " + matriz[filas][columnas]);
            }
        }
    }

    public static void imprimir(int matriz[][]) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }


        System.out.println("--------------------------------------------");
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.println("matriz[" + filas + "][" + columnas + "] = " + matriz[filas][columnas]);
            }
        }
    }

}
