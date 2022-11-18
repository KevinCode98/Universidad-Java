package Section4_FundamentosJava_Operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        var a = 3;
        var b = 3;

        System.out.println("Operador: TERNARIO -> (" + a + " > " + b + ")? true : false;");
        var resultado = (a > b) ? true : false; // >= -> Mayor que > o el mayor igual >=
        System.out.println("resultado = " + resultado);

        System.out.println("\n----------- PAR O IMPAR -----------");
        var numero = 8;
        System.out.println("Operador: TERNARIO -> (" + numero + " % 2 == 0) ? \"Es un numero par.\" : \"Es un numero impar.\";");
        var resultadoNumero = (numero % 2 == 0) ? "Es un numero par." : "Es un numero impar.";
        System.out.println("resultadoNumero = " + resultadoNumero);
    }
}
