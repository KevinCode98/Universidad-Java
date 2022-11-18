package Section13_FundamentosJava_This;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona.apellido = " + persona.apellido);
    }
}

class Persona {
    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        // super(); llamada al constructor de la clase padre (object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona en el constructor usando this = " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir {

    public Imprimir() {
        super(); // El constructor de la clase object (padre) para reservar memoria
    }

    public void imprimir(Persona persona) {
        System.out.println("Persona desde imprimir: " + persona);
        System.out.println("Impresión de el objeto actual (this): " + this);
    }
}
