package Section2_FundamentosJava_Variables;

public class Variables {
    public static void main(String[] args) {
        // Definimos la variable
        int miVariableEntera = 10;
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("============ MODIFICAMOS ==================");

        // Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("--------------------------------------------");

        String miVariableCadena = "Saludos";
        System.out.println("miVariableCadena = " + miVariableCadena);
        System.out.println("============ MODIFICAMOS ==================");

        miVariableCadena = "Adios";
        System.out.println("miVariableCadena = " + miVariableCadena);
        System.out.println("--------------------------------------------");

        // var = Inferencia de tipos en Java
        var miVarEntera2 = 15;
        System.out.println("miVarEntera2 = " + miVarEntera2);

        var miVariableCadena2 = "Un String con Var";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("--------------------------------------------");

        // opción de declaración de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
    }
}
