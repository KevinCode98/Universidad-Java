package Section28_Programacion_AutoboxingUnboxing;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        /*
        CLase Envolventes de tipos primitivos
            -> int - Integer
            -> long - Long
            -> float - Float
            -> double - Double
            -> boolean - Boolean
            -> byte - Byte
            -> char - Character
            -> short - Short
        */

        int entero = 10;
        Integer enteroObject = 10; // Autoboxing
        System.out.println("entero = " + entero);
        System.out.println("enteroObject = " + enteroObject.doubleValue());

        int entero2 = enteroObject; // Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
