package Section20_FundamentosJava_Arreglos;

public class TestArreglos {
    public static void main(String[] args) {
        int[] edades = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);
        // edades[3] = 5; Esto marca error porque pasa la cantidad de elementos que tiene el arreglo

        for (int i = 0; i < edades.length; i++) {
            System.out.println("ciclo for -> edades[" + i + "] = " + edades[i]);
        }

        String[] frutas = {"Naranjas", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
    }
}
