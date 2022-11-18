package Section26_Programacion_Bloques;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static {
        // Este bloque solamente permite el acceso a variables estáticas.
        System.out.println("Ejecución del bloque estático.");
        ++Persona.contadorPersonas;
    }

    {
        System.out.println("Ejecución bloque no estático.");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecución del constructor.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
