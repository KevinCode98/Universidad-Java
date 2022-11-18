package Section25_Programacion_Enumeraciones;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 3: " + Dias.MIERCOLES);
        indicarDiaSemana(Dias.MIERCOLES);
        System.out.println("-----------------------------------");

        System.out.println("Continente no. 4: " + Continentes.AMERICA);
        System.out.println("\tNo. paises del 4to continente: " + Continentes.AMERICA.getPaises());

        System.out.println("Continente no. 1: " + Continentes.AFRICA);
        System.out.println("\tNo. paises del 1er continente: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES -> System.out.println("Primer día de la semana.");
            case MARTES -> System.out.println("Segundo día de la semana.");
            case MIERCOLES -> System.out.println("Tercer día de la semana.");
            case JUEVES -> System.out.println("Cuarto día de la semana.");
            case VIERNES -> System.out.println("Quinto día de la semana.");
            case SABADO -> System.out.println("Sexto día de la semana.");
            case DOMINGO -> System.out.println("Séptimo día de la semana.");
            default -> System.out.println("Día no permitido.");
        }
    }
}
