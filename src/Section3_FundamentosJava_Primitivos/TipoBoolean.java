package Section3_FundamentosJava_Primitivos;

public class TipoBoolean {
    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera.");
        } else {
            System.out.println("La bandera es falsa.");
        }

        System.out.println("--------------------------------------\n");

        var edad = 10;
        if (edad >= 18) {
            System.out.println("Es adulto.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
}
