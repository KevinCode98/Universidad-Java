package Section3_FundamentosJava_Primitivos;

public class TipoChar {
    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u07A4';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 126;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '%';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        System.out.println("--------------------------------------\n");

        // Utilizando valores var
        var miCaracterVar = 'a';
        System.out.println("miCaracterVar = " + miCaracterVar);

        var varCharVar = '\u07A4';
        System.out.println("varCharVar = " + varCharVar);

        var varCharDecimalVar = 126;
        System.out.println("varCharDecimalVar = " + varCharDecimalVar);

        var varCharSimboloVar = '%';
        System.out.println("varCharSimboloVar = " + varCharSimboloVar);

        System.out.println("--------------------------------------\n");

        // Casting de Char a Int
        int variableEnteraSimbolo = '~';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra a = " + letra);

        letra = 'A';
        System.out.println("letra A = " + letra);
    }
}
