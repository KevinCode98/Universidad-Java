package Section4_FundamentosJava_Operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var c = true;
        var d = !c;

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Incremento
        // 1. Pre incremento (símbolo antes de la variable)

        System.out.println("\nIncremento -> Pre incremento");
        var e = 3;
        var f = ++e; // Primero se incrementa la variable y después se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        // 2. Pos incremento(símbolo después de la variable)
        System.out.println("\nIncremento -> Pos incremento");
        var g = 3;
        var h = g++; // Primero se utiliza el valor y después se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        // Decremento
        // 1. Pre decremento (símbolo antes de la variable)
        System.out.println("\nDecremento -> Pre decremento");
        var i = 2;
        var j = --i; // Primero se decrementa la variable y después se usa su valor
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // 2. Pos decremento(símbolo después de la variable)
        System.out.println("\nDecremento -> Pos decremento");
        var k = 4;
        var l = k--; // Primero se utiliza el valor y después se decrementa
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
