package Section15_FundamentosJava_Static;

public class PersonaPrueba {
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Kevin");
        Persona persona3 = new Persona("Luis");

        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);

        // this.contador = 0; Esto marca error al ser un método estático
        int contador = new PersonaPrueba().getContador();
        System.out.println("contador = " + contador);
    }

    public static void imprimir(Persona persona) {
        System.out.println("persona" + persona.getIdPersona() + " = " + persona);
    }

    public int getContador() {
        imprimir(new Persona("Carlos"));
        return ++this.contador;
    }
}
