package Section4_FundamentosJava_Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        // Métodos para aumentar los valores de una variable de manera corta
        System.out.println("a = " + a);
        a += 1; // a = a  + 1;
        System.out.println("(a += 1) = " + a);

        a += 3; // a = a  + 3;
        System.out.println("(a += 3) = " + a);

        a -= 2; // a = a  - 2;
        System.out.println("(a -= 2) = " + a);

        a *= 2; // a = a  * 2;
        System.out.println("(a *= 2) = " + a);

        a /= 2; // a = a  / 2;
        System.out.println("(a /= 2) = " + a);
    }
}
