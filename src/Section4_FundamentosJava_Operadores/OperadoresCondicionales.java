package Section4_FundamentosJava_Operadores;

public class OperadoresCondicionales {
    public static void main(String[] args) {
        var valor = -1;
        var valorMinimo = 0;
        var valorMaximo = 10;


        System.out.println("Operador: && -> Saber si el valor " + valor + " se encuentra en el rango (" + valorMinimo + " a "
                + valorMaximo + "):");
        var resultado = (valor >= valorMinimo && valor <= valorMaximo);
        if (resultado) System.out.println("\tEl valor se encuentra en el rango");
        else System.out.println("\tEl valor no se encuentra en el rango");


        var vacaciones = false;
        var diaDescanso = true;
        System.out.println("\nOperador: || -> Saber si el padre puede asistir al juego de su hijo. " +
                "\nDia de descanso: " + diaDescanso +
                "\nVacaciones: " + vacaciones);

        resultado = vacaciones || diaDescanso;
        if (resultado) System.out.println("El padre puede asistir al juego del hijo.");
        else System.out.println("El padre no puede asistir al juego del hijo.");
    }
}
