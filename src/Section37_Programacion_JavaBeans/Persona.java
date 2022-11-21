package Section37_Programacion_JavaBeans;

import java.io.Serializable;

// Siempre debe de implementar la interfaz "Serializable"
public class Persona implements Serializable {
    // Las variables deben de ser privadas
    private String nombre;
    private String apellido;

    // Es obligatorio generar el constructor vacio para que pueda ser utilizado sin saber los parámetros
    public Persona(){
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Se deben generar los Gets y Sets del objeto y deben ser públicos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // No es obligatorio - Pero se pueden generar los métodos toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
