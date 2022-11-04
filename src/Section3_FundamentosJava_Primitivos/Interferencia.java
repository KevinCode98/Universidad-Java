package Section3_FundamentosJava_Primitivos;

public class Interferencia {
    public static void main(String[] args) {
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numeroDoble = 10.0;
        System.out.println("numeroDoble = " + numeroDoble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
