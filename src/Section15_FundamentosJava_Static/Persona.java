package Section15_FundamentosJava_Static;

public class Persona {
    // Atributos del objeto
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;


    // Constructores del objeto
    public Persona(String nombre) {
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;

        this.nombre = nombre;
    }


    // Gets, Sets y toString del objeto
    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
}
