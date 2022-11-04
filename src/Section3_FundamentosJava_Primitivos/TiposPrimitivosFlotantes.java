package Section3_FundamentosJava_Primitivos;

public class TiposPrimitivosFlotantes {
    public static void main(String[] args) {
        /*
            Esto es un comentario de varias lineas

            Tipos primitivos flotantes:
                - float: 32 bits
                - double: 64 bits
         */

        float numeroFloat = 10F; // Rango = 1.4x10^-45 a 3.4028235x10^38
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo del float: " + Float.MAX_VALUE);

        // Como hacer casting un valor de float cuando hace overflow =
        float valueOverFlowFloat = (float) 3.4028236E38D;
        System.out.println("valueOverFlowFloat = " + valueOverFlowFloat);
        System.out.println("--------------------------------------\n");


        double numeroDouble = 20_60.120_70; // Rango = 1.4x10^-45 a 3.4028235x10^38
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo del double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo del double: " + Double.MAX_VALUE);

        // Como hacer casting un valor de double cuando hace overflow =
        double valueOverFlowDouble = 1.7976931348623158E308D;
        System.out.println("valueOverFlowDouble = " + valueOverFlowDouble);
        System.out.println("--------------------------------------\n");
    }
}
