package Section14_FundamentosJava_Encapsulamiento;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 5_000.00, false);
        System.out.println("persona = " + persona); // Cuando tenemos el método toString se manda a llamar automáticamente

        persona.setNombre("Juan Carlos");
        System.out.println("persona nombre: " + persona.getNombre());
        System.out.println("persona sueldo: $" + persona.getSueldo());
        System.out.println("persona eliminado: " + persona.isEliminado());

        String s = persona.toString();
        System.out.println("persona formato toString() = " + s);

        // Error al ser atributos privados:
        // persona.nombre = "Juan carlos"
        // System.out.println("persona nombre: " + persona.nombre);
    }
}
