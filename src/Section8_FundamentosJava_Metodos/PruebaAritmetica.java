package Section8_FundamentosJava_Metodos;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 5;

        aritmetica.sumar();
        aritmetica.a = 20;
        aritmetica.b = 8;
        System.out.println("Suma con retorno = " + aritmetica.sumarConRetorno());
        System.out.println("Suma con argumentos = " + aritmetica.sumarConArgumentos(5, 8));
    }
}
