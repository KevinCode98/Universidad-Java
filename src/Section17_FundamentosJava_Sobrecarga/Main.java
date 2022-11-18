package Section17_FundamentosJava_Sobrecarga;

public class Main {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(10,20);
        System.out.println("resultado sumar(int,int) = " + resultado);

        var resultadoDouble = Operaciones.sumar(10.30, 20.50);
        System.out.println("resultado sumar(double,double) = " + resultadoDouble);
    }
}
