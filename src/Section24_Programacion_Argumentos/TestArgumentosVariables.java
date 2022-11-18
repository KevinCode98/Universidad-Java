package Section24_Programacion_Argumentos;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(10, 20, 30, 40, 50, 60);
        imprimirNumeros(1, 2, 3);
        variosParametros("Juan", 8, 9, 10);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento " + i + " = " + numeros[i]);
        }
        System.out.println("-----------------------");
    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
}
