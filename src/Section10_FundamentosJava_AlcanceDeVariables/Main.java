package Section10_FundamentosJava_AlcanceDeVariables;

public class Main {
    public static void main(String[] args) {
        // Variables locales
        var a = 10;
        var b = 2;
        miMetodo();

        Aritmetica a1 = new Aritmetica(); // new Aritmetica() → Esta se ira a la memoria heap
        System.out.println("--------------- Constructor con argumentos ---------------");
        System.out.println("a1 -> a: " + a1.a);
        System.out.println("a1 -> b: " + a1.b);

        System.out.println();
        Aritmetica a2 = new Aritmetica(5, 8);
        System.out.println("a2 -> a: " + a2.a);
        System.out.println("a2 -> b: " + a2.b);

        a1 = null; // Esto elimina el objeto y se elimina del heap por el Recolector de basura.


        // Memoria stack = Solo se guarda la referencia del objeto (dirección de memoria) → Variables locales
        // Memoria heap = Guarda los valores que se tiene dentro del objeto → variables tipo object
    }

    public static void miMetodo() {
        //La variable 'a' está fuera del alcance donde fue definida
        // a = 10;
        System.out.println("Otro método");
    }
}
