package Section9_FundamentosJava_Constructores;

public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 3;
        aritmetica.b = 2;
        aritmetica.sumar();

        var resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado usando retorno = " + resultado);

        resultado = aritmetica.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultado);

        System.out.println("--------------- Constructor con argumentos ---------------");
        Aritmetica a1 = new Aritmetica();
        System.out.println("a1 -> a: " + a1.a);
        System.out.println("a1 -> b: " + a1.b);

        System.out.println();
        Aritmetica a2 = new Aritmetica(5, 8);
        System.out.println("a2 -> a: " + a2.a);
        System.out.println("a2 -> b: " + a2.b);
    }
}
