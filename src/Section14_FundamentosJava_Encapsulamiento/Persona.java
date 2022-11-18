package Section14_FundamentosJava_Encapsulamiento;

public class Persona {
    // Atributos del objeto
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    // Constructores del objeto
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    // Métodos con funcionalidad del objeto


    // Gets, Sets y toString del objeto
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", eliminado=" + eliminado +
                '}';
    }
}
