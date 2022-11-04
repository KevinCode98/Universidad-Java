package Section3_FundamentosJava_Primitivos;

public class TiposPrimitivosEnteros {
    public static void main(String[] args) {
        /*
            Esto es un comentario de varias lineas

            Tipos primitivos enteros:
                - Byte: 8 bits
                - Short: 16 bits
                - Int: 32 bits
                - Long:  64 bits
         */

        byte numeroByte = 10; // Rango = -128 a 127
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);

        // Como hacer casting un valor de byte cuando hace overflow =
        byte valueOverFlowByte = (byte) 129;
        System.out.println("valueOverFlowByte = " + valueOverFlowByte);
        System.out.println("--------------------------------------\n");

        short numeroShort = 3000; // Rango = -32,768 a 32,767
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);

        // Como hacer casting un valor de short cuando hace overflow =
        short valueOverFlowShort = (short) 32768;
        System.out.println("valueOverFlowShort = " + valueOverFlowShort);
        System.out.println("--------------------------------------\n");

        int numeroInt = 40_000; // -2x10^31 a 2x10^31 - 1
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);

        // Como hacer casting un valor de int cuando hace overflow =
        int valueOverFlowInt = (int) 2147483648L;
        System.out.println("valueOverFlowInt = " + valueOverFlowInt);
        System.out.println("--------------------------------------\n");

        long numeroLong = 40_000_000; // -2x10^63 a 2x10^63 - 1
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);

        // Como hacer casting un valor de long cuando hace overflow =
        long valueOverFlowLong = (long) 9223372036854775808D;
        System.out.println("valueOverFlowLong = " + valueOverFlowLong);
        System.out.println("--------------------------------------\n");
    }
}
